/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.linkedin.restli.internal.server.response;


import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.template.FieldDef;
import com.linkedin.r2.message.rest.RestRequest;
import com.linkedin.restli.common.ActionResponse;
import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.internal.server.RoutingResult;
import com.linkedin.restli.server.ActionResult;
import com.linkedin.restli.server.RestLiResponseData;
import com.linkedin.restli.server.RestLiServiceException;

import java.net.HttpCookie;
import java.util.List;
import java.util.Map;


public class ActionResponseBuilder implements RestLiResponseBuilder<RestLiResponseData<ActionResponseEnvelope>>
{

  @Override
  public PartialRestResponse buildResponse(RoutingResult routingResult,
                                           RestLiResponseData<ActionResponseEnvelope> responseData)
  {
    return new PartialRestResponse.Builder().status(responseData.getResponseEnvelope().getStatus())
                                            .entity(responseData.getResponseEnvelope().getRecord())
                                            .headers(responseData.getHeaders())
                                            .cookies(responseData.getCookies())
                                            .build();
  }

  @Override
  public RestLiResponseData<ActionResponseEnvelope> buildRestLiResponseData(RestRequest request,
                                                    RoutingResult routingResult,
                                                    Object result,
                                                    Map<String, String> headers,
                                                    List<HttpCookie> cookies)
  {
    final Object value;
    final HttpStatus status;
    if (result instanceof ActionResult)
    {
      final ActionResult<?> actionResult = (ActionResult<?>) result;
      value = actionResult.getValue();
      status = actionResult.getStatus();
      if (status == null)
      {
        throw new RestLiServiceException(HttpStatus.S_500_INTERNAL_SERVER_ERROR,
            "Unexpected null encountered. Null HttpStatus inside of an ActionResult returned by the resource method: "
                + routingResult.getResourceMethod());
      }
    }
    else
    {
      value = result;
      status = HttpStatus.S_200_OK;
    }
    RecordDataSchema actionReturnRecordDataSchema = routingResult.getResourceMethod().getActionReturnRecordDataSchema();
    @SuppressWarnings("unchecked")
    FieldDef<Object> actionReturnFieldDef =
        (FieldDef<Object>) routingResult.getResourceMethod().getActionReturnFieldDef();
    final ActionResponse<?> actionResponse =
        new ActionResponse<>(value, actionReturnFieldDef, actionReturnRecordDataSchema);

    return new RestLiResponseDataImpl<>(new ActionResponseEnvelope(status, actionResponse), headers, cookies);
  }
}
