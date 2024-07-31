// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetSwitchStatsDeviceSwitchStatModuleStatPoe {
    private Double maxPower;
    private Double powerDraw;

    private GetSwitchStatsDeviceSwitchStatModuleStatPoe() {}
    public Double maxPower() {
        return this.maxPower;
    }
    public Double powerDraw() {
        return this.powerDraw;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStatsDeviceSwitchStatModuleStatPoe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double maxPower;
        private Double powerDraw;
        public Builder() {}
        public Builder(GetSwitchStatsDeviceSwitchStatModuleStatPoe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPower = defaults.maxPower;
    	      this.powerDraw = defaults.powerDraw;
        }

        @CustomType.Setter
        public Builder maxPower(Double maxPower) {
            if (maxPower == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatModuleStatPoe", "maxPower");
            }
            this.maxPower = maxPower;
            return this;
        }
        @CustomType.Setter
        public Builder powerDraw(Double powerDraw) {
            if (powerDraw == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatModuleStatPoe", "powerDraw");
            }
            this.powerDraw = powerDraw;
            return this;
        }
        public GetSwitchStatsDeviceSwitchStatModuleStatPoe build() {
            final var _resultValue = new GetSwitchStatsDeviceSwitchStatModuleStatPoe();
            _resultValue.maxPower = maxPower;
            _resultValue.powerDraw = powerDraw;
            return _resultValue;
        }
    }
}
