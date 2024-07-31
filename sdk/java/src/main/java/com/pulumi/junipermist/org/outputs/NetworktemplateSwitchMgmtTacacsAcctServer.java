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
public final class NetworktemplateSwitchMgmtTacacsAcctServer {
    private @Nullable String host;
    private @Nullable String port;
    private @Nullable String secret;
    private @Nullable Integer timeout;

    private NetworktemplateSwitchMgmtTacacsAcctServer() {}
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSwitchMgmtTacacsAcctServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String host;
        private @Nullable String port;
        private @Nullable String secret;
        private @Nullable Integer timeout;
        public Builder() {}
        public Builder(NetworktemplateSwitchMgmtTacacsAcctServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.secret = defaults.secret;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {

            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {

            this.timeout = timeout;
            return this;
        }
        public NetworktemplateSwitchMgmtTacacsAcctServer build() {
            final var _resultValue = new NetworktemplateSwitchMgmtTacacsAcctServer();
            _resultValue.host = host;
            _resultValue.port = port;
            _resultValue.secret = secret;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
