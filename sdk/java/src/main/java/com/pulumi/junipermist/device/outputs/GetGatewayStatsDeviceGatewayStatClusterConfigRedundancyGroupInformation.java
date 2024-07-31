// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation {
    private Integer id;
    private String monitoringFailure;
    private Integer threshold;

    private GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation() {}
    public Integer id() {
        return this.id;
    }
    public String monitoringFailure() {
        return this.monitoringFailure;
    }
    public Integer threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private String monitoringFailure;
        private Integer threshold;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.monitoringFailure = defaults.monitoringFailure;
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder monitoringFailure(String monitoringFailure) {
            if (monitoringFailure == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation", "monitoringFailure");
            }
            this.monitoringFailure = monitoringFailure;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Integer threshold) {
            if (threshold == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation", "threshold");
            }
            this.threshold = threshold;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatClusterConfigRedundancyGroupInformation();
            _resultValue.id = id;
            _resultValue.monitoringFailure = monitoringFailure;
            _resultValue.threshold = threshold;
            return _resultValue;
        }
    }
}