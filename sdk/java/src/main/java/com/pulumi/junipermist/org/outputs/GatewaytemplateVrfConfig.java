// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateVrfConfig {
    /**
     * @return whether to enable VRF (when supported on the device)
     * 
     */
    private @Nullable Boolean enabled;

    private GatewaytemplateVrfConfig() {}
    /**
     * @return whether to enable VRF (when supported on the device)
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateVrfConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(GatewaytemplateVrfConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public GatewaytemplateVrfConfig build() {
            final var _resultValue = new GatewaytemplateVrfConfig();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
