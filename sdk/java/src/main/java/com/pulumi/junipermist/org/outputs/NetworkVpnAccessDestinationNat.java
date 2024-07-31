// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkVpnAccessDestinationNat {
    private @Nullable String internalIp;
    private @Nullable String name;
    private @Nullable Integer port;

    private NetworkVpnAccessDestinationNat() {}
    public Optional<String> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkVpnAccessDestinationNat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String internalIp;
        private @Nullable String name;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(NetworkVpnAccessDestinationNat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIp = defaults.internalIp;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder internalIp(@Nullable String internalIp) {

            this.internalIp = internalIp;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        public NetworkVpnAccessDestinationNat build() {
            final var _resultValue = new NetworkVpnAccessDestinationNat();
            _resultValue.internalIp = internalIp;
            _resultValue.name = name;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}