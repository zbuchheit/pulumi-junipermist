// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatModule2StatTemperature {
    private Double celsius;
    private String name;
    private String status;

    private GetGatewayStatsDeviceGatewayStatModule2StatTemperature() {}
    public Double celsius() {
        return this.celsius;
    }
    public String name() {
        return this.name;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatModule2StatTemperature defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double celsius;
        private String name;
        private String status;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatModule2StatTemperature defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.celsius = defaults.celsius;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder celsius(Double celsius) {
            if (celsius == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatTemperature", "celsius");
            }
            this.celsius = celsius;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatTemperature", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatTemperature", "status");
            }
            this.status = status;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatModule2StatTemperature build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatModule2StatTemperature();
            _resultValue.celsius = celsius;
            _resultValue.name = name;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
