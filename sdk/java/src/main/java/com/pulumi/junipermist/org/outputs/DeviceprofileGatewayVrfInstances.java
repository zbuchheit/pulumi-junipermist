// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileGatewayVrfInstances {
    private @Nullable List<String> networks;

    private DeviceprofileGatewayVrfInstances() {}
    public List<String> networks() {
        return this.networks == null ? List.of() : this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayVrfInstances defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> networks;
        public Builder() {}
        public Builder(DeviceprofileGatewayVrfInstances defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder networks(@Nullable List<String> networks) {

            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        public DeviceprofileGatewayVrfInstances build() {
            final var _resultValue = new DeviceprofileGatewayVrfInstances();
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}