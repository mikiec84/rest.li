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

package com.linkedin.d2.balancer.properties;


import com.linkedin.r2.transport.http.client.HttpClientFactory;


/**
 * This is the centralized source for keys that are used by Properties Map.
 *
 * @author Oby Sumampouw (osumampouw@linkedin.com)
 */
public class PropertyKeys
{
  //old to be deprecated constants. Use new constants instead.
  //used by transport client creation
  public static final String OLD_CLUSTER_GET_TIMEOUT = HttpClientFactory.OLD_GET_TIMEOUT_KEY;
  public static final String OLD_CLUSTER_REQUEST_TIMEOUT = HttpClientFactory.OLD_REQUEST_TIMEOUT_KEY;
  public static final String OLD_CLUSTER_MAX_RESPONSE_SIZE = HttpClientFactory.OLD_MAX_RESPONSE_SIZE;
  public static final String OLD_CLUSTER_POOL_SIZE = HttpClientFactory.OLD_POOL_SIZE_KEY;
  public static final String OLD_CLUSTER_IDLE_TIMEOUT = HttpClientFactory.OLD_IDLE_TIMEOUT_KEY;
  public static final String OLD_CLUSTER_SHUTDOWN_TIMEOUT = HttpClientFactory.OLD_SHUTDOWN_TIMEOUT_KEY;
  public static final String OLD_CLUSTER_SSL_CONTEXT = HttpClientFactory.OLD_SSL_CONTEXT;
  public static final String OLD_CLUSTER_SSL_PARAMS = HttpClientFactory.OLD_SSL_PARAMS;
  //==========================================//
  //new constants
  //used by degrader properties
  public static final String DEGRADER_PROPERTIES = "degraderProperties";
  public static final String DEGRADER_NAME = "degrader.name";
  public static final String DEGRADER_LOG_ENABLED = "degrader.logEnabled";
  public static final String DEGRADER_LATENCY_TO_USE = "degrader.latencyToUse";
  public static final String DEGRADER_OVERRIDE_DROP_DATE = "degrader.overrideDropDate";
  public static final String DEGRADER_MAX_DROP_RATE = "degrader.maxDropRate";
  public static final String DEGRADER_MAX_DROP_DURATION = "degrader.maxDropDuration";
  public static final String DEGRADER_UP_STEP = "degrader.upStep";
  public static final String DEGRADER_DOWN_STEP = "degrader.downStep";
  public static final String DEGRADER_MIN_CALL_COUNT = "degrader.minCallCount";
  public static final String DEGRADER_HIGH_LATENCY = "degrader.highLatency";
  public static final String DEGRADER_LOW_LATENCY = "degrader.lowLatency";
  public static final String DEGRADER_HIGH_ERROR_RATE = "degrader.highErrorRate";
  public static final String DEGRADER_LOW_ERROR_RATE = "degrader.lowErrorRate";
  public static final String DEGRADER_HIGH_OUTSTANDING = "degrader.highOutstanding";
  public static final String DEGRADER_LOW_OUTSTANDING = "degrader.lowOutstanding";
  public static final String DEGRADER_MIN_OUTSTANDING_COUNT = "degrader.minOutstandingCount";
  public static final String DEGRADER_OVERRIDE_MIN_CALL_COUNT = "degrader.overrideMinCallCount";

  //used by service properties
  public static final String PATH = "path";
  public static final String SERVICE_NAME = "serviceName";
  public static final String CLOCK = "clock";
  public static final String SERVICES = "services";
  public static final String TRANSPORT_CLIENT_PROPERTIES = "transportClientProperties";
  public static final String PRIORITIZED_SCHEMES = "prioritizedSchemes";
  public static final String BANNED_URIS = "bannedUri";

  //load balancer specific properties
  public static final String LB_STRATEGY_NAME = "loadBalancerStrategyName";
  public static final String LB_STRATEGY_LIST = "loadBalancerStrategyList";
  public static final String LB_STRATEGY_PROPERTIES = "loadBalancerStrategyProperties";

  //to be deprecated load balancer specific properties
  public static final String LB_HASH_METHOD = "hashMethod";
  public static final String LB_HASH_CONFIG = "hashConfig";
  public static final String LB_STRATEGY_PROPERTIES_UPDATE_INTERVAL_MS = "updateIntervalMs";
  public static final String LB_STRATEGY_PROPERTIES_MAX_CLUSTER_LATENCY_WITHOUT_DEGRADING = "maxClusterLatencyWithoutDegrading";
  public static final String LB_STRATEGY_PROPERTIES_DEFAULT_SUCCESSFUL_TRANSMISSION_WEIGHT = "defaultSuccessfulTransmissionWeight";
  public static final String LB_STRATEGY_PROPERTIES_POINTS_PER_WEIGHT = "pointsPerWeight";
  public static final String LB_LOW_WATER_MARK = "lowWaterMark";
  public static final String LB_HIGH_WATER_MARK = "highWaterMark";
  public static final String LB_INITIAL_RECOVERY_LEVEL = "initialRecoveryLevel";
  public static final String LB_RING_RAMP_FACTOR = "ringRampFactor";
  public static final String LB_GLOBAL_STEP_UP = "globalStepUp";
  public static final String LB_GLOBAL_STEP_DOWN = "globalStepDown";

  //load balancer specific properties to replace the old ones
  public static final String HTTP_LB_HASH_METHOD = "http.loadBalancer.hashMethod";
  public static final String HTTP_LB_HASH_CONFIG = "http.loadBalancer.hashConfig";
  public static final String HTTP_LB_STRATEGY_PROPERTIES_UPDATE_INTERVAL_MS = "http.loadBalancer.updateIntervalMs";
  public static final String HTTP_LB_STRATEGY_PROPERTIES_MAX_CLUSTER_LATENCY_WITHOUT_DEGRADING = "http.loadBalancer.maxClusterLatencyWithoutDegrading";
  public static final String HTTP_LB_STRATEGY_PROPERTIES_DEFAULT_SUCCESSFUL_TRANSMISSION_WEIGHT = "http.loadBalancer.defaultSuccessfulTransmissionWeight";
  public static final String HTTP_LB_STRATEGY_PROPERTIES_POINTS_PER_WEIGHT = "http.loadBalancer.pointsPerWeight";
  public static final String HTTP_LB_LOW_WATER_MARK = "http.loadBalancer.lowWaterMark";
  public static final String HTTP_LB_HIGH_WATER_MARK = "http.loadBalancer.highWaterMark";
  public static final String HTTP_LB_INITIAL_RECOVERY_LEVEL = "http.loadBalancer.initialRecoveryLevel";
  public static final String HTTP_LB_RING_RAMP_FACTOR = "http.loadBalancer.ringRampFactor";
  public static final String HTTP_LB_GLOBAL_STEP_UP = "http.loadBalancer.globalStepUp";
  public static final String HTTP_LB_GLOBAL_STEP_DOWN = "http.loadBalancer.globalStepDown";

  //used by cluster properties
  public static final String CLUSTER_NAME = "clusterName";
  public static final String PARTITION_PROPERTIES = "partitionProperties";
  public static final String PARTITION_TYPE = "partitionType";
  public static final String KEY_RANGE_START = "keyRangeStart";
  public static final String PARTITION_SIZE = "partitionSize";
  public static final String PARTITION_COUNT = "partitionCount";
  public static final String PARTITION_KEY_REGEX = "partitionKeyRegex";
  public static final String HASH_ALGORITHM = "hashAlgorithm";
  public static final String CLUSTER_VARIANTS = "clusterVariants";
  public static final String TYPE = "type";
  public static final String CLUSTER_LIST = "clusterList";
  public static final String CLUSTER_VARIANTS_LIST = "clusterVariantsList";
  public static final String FULL_CLUSTER_LIST = "fullClusterList";

  //used by transport client creation
  public static final String HTTP_REQUEST_TIMEOUT = HttpClientFactory.HTTP_REQUEST_TIMEOUT;
  public static final String HTTP_MAX_RESPONSE_SIZE = HttpClientFactory.HTTP_MAX_RESPONSE_SIZE;
  public static final String HTTP_POOL_SIZE = HttpClientFactory.HTTP_POOL_SIZE;
  public static final String HTTP_IDLE_TIMEOUT = HttpClientFactory.HTTP_IDLE_TIMEOUT;
  public static final String HTTP_SHUTDOWN_TIMEOUT = HttpClientFactory.HTTP_SHUTDOWN_TIMEOUT;
  public static final String HTTP_SSL_CONTEXT = HttpClientFactory.HTTP_SSL_CONTEXT;
  public static final String HTTP_SSL_PARAMS = HttpClientFactory.HTTP_SSL_PARAMS;

  //used for multi colo
  public static final String DEFAULT_COLO = "defaultColo";
  public static final String COLO_VARIANTS = "coloVariants";
  public static final String MASTER_COLO = "masterColo";
  public static final String MASTER_SUFFIX = "Master";

}
