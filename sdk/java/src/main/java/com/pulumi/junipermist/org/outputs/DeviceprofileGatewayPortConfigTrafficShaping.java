// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileGatewayPortConfigTrafficShaping {
    /**
     * @return percentages for differet class of traffic: high / medium / low / best-effort
     * sum must be equal to 100
     * 
     */
    private @Nullable List<Integer> classPercentages;
    private @Nullable Boolean enabled;

    private DeviceprofileGatewayPortConfigTrafficShaping() {}
    /**
     * @return percentages for differet class of traffic: high / medium / low / best-effort
     * sum must be equal to 100
     * 
     */
    public List<Integer> classPercentages() {
        return this.classPercentages == null ? List.of() : this.classPercentages;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayPortConfigTrafficShaping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Integer> classPercentages;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(DeviceprofileGatewayPortConfigTrafficShaping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classPercentages = defaults.classPercentages;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder classPercentages(@Nullable List<Integer> classPercentages) {

            this.classPercentages = classPercentages;
            return this;
        }
        public Builder classPercentages(Integer... classPercentages) {
            return classPercentages(List.of(classPercentages));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public DeviceprofileGatewayPortConfigTrafficShaping build() {
            final var _resultValue = new DeviceprofileGatewayPortConfigTrafficShaping();
            _resultValue.classPercentages = classPercentages;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
