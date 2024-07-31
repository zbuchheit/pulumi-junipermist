// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkVpnAccessSourceNat {
    private @Nullable String externalIp;

    private NetworkVpnAccessSourceNat() {}
    public Optional<String> externalIp() {
        return Optional.ofNullable(this.externalIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkVpnAccessSourceNat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String externalIp;
        public Builder() {}
        public Builder(NetworkVpnAccessSourceNat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIp = defaults.externalIp;
        }

        @CustomType.Setter
        public Builder externalIp(@Nullable String externalIp) {

            this.externalIp = externalIp;
            return this;
        }
        public NetworkVpnAccessSourceNat build() {
            final var _resultValue = new NetworkVpnAccessSourceNat();
            _resultValue.externalIp = externalIp;
            return _resultValue;
        }
    }
}