// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo {
    private String name;
    private String status;

    private GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo() {}
    public String name() {
        return this.name;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String status;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo", "status");
            }
            this.status = status;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatClusterConfigControlLinkInfo();
            _resultValue.name = name;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
