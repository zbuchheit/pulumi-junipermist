// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanAcctServer {
    /**
     * @return ip / hostname of RADIUS server
     * 
     */
    private String host;
    private @Nullable Boolean keywrapEnabled;
    /**
     * @return enum: `ascii`, `hex`
     * 
     */
    private @Nullable String keywrapFormat;
    private @Nullable String keywrapKek;
    private @Nullable String keywrapMack;
    /**
     * @return Acct port of RADIUS server
     * 
     */
    private @Nullable Integer port;
    /**
     * @return secret of RADIUS server
     * 
     */
    private String secret;

    private WlanAcctServer() {}
    /**
     * @return ip / hostname of RADIUS server
     * 
     */
    public String host() {
        return this.host;
    }
    public Optional<Boolean> keywrapEnabled() {
        return Optional.ofNullable(this.keywrapEnabled);
    }
    /**
     * @return enum: `ascii`, `hex`
     * 
     */
    public Optional<String> keywrapFormat() {
        return Optional.ofNullable(this.keywrapFormat);
    }
    public Optional<String> keywrapKek() {
        return Optional.ofNullable(this.keywrapKek);
    }
    public Optional<String> keywrapMack() {
        return Optional.ofNullable(this.keywrapMack);
    }
    /**
     * @return Acct port of RADIUS server
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return secret of RADIUS server
     * 
     */
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanAcctServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private @Nullable Boolean keywrapEnabled;
        private @Nullable String keywrapFormat;
        private @Nullable String keywrapKek;
        private @Nullable String keywrapMack;
        private @Nullable Integer port;
        private String secret;
        public Builder() {}
        public Builder(WlanAcctServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.keywrapEnabled = defaults.keywrapEnabled;
    	      this.keywrapFormat = defaults.keywrapFormat;
    	      this.keywrapKek = defaults.keywrapKek;
    	      this.keywrapMack = defaults.keywrapMack;
    	      this.port = defaults.port;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("WlanAcctServer", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapEnabled(@Nullable Boolean keywrapEnabled) {

            this.keywrapEnabled = keywrapEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapFormat(@Nullable String keywrapFormat) {

            this.keywrapFormat = keywrapFormat;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapKek(@Nullable String keywrapKek) {

            this.keywrapKek = keywrapKek;
            return this;
        }
        @CustomType.Setter
        public Builder keywrapMack(@Nullable String keywrapMack) {

            this.keywrapMack = keywrapMack;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            if (secret == null) {
              throw new MissingRequiredPropertyException("WlanAcctServer", "secret");
            }
            this.secret = secret;
            return this;
        }
        public WlanAcctServer build() {
            final var _resultValue = new WlanAcctServer();
            _resultValue.host = host;
            _resultValue.keywrapEnabled = keywrapEnabled;
            _resultValue.keywrapFormat = keywrapFormat;
            _resultValue.keywrapKek = keywrapKek;
            _resultValue.keywrapMack = keywrapMack;
            _resultValue.port = port;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
