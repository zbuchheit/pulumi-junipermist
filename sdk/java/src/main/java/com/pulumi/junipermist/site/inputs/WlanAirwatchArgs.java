// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanAirwatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanAirwatchArgs Empty = new WlanAirwatchArgs();

    /**
     * API Key
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return API Key
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }

    /**
     * console URL
     * 
     */
    @Import(name="consoleUrl", required=true)
    private Output<String> consoleUrl;

    /**
     * @return console URL
     * 
     */
    public Output<String> consoleUrl() {
        return this.consoleUrl;
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * password
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return password
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * username
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return username
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private WlanAirwatchArgs() {}

    private WlanAirwatchArgs(WlanAirwatchArgs $) {
        this.apiKey = $.apiKey;
        this.consoleUrl = $.consoleUrl;
        this.enabled = $.enabled;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanAirwatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanAirwatchArgs $;

        public Builder() {
            $ = new WlanAirwatchArgs();
        }

        public Builder(WlanAirwatchArgs defaults) {
            $ = new WlanAirwatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey API Key
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey API Key
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param consoleUrl console URL
         * 
         * @return builder
         * 
         */
        public Builder consoleUrl(Output<String> consoleUrl) {
            $.consoleUrl = consoleUrl;
            return this;
        }

        /**
         * @param consoleUrl console URL
         * 
         * @return builder
         * 
         */
        public Builder consoleUrl(String consoleUrl) {
            return consoleUrl(Output.of(consoleUrl));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param password password
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password password
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username username
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username username
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public WlanAirwatchArgs build() {
            if ($.apiKey == null) {
                throw new MissingRequiredPropertyException("WlanAirwatchArgs", "apiKey");
            }
            if ($.consoleUrl == null) {
                throw new MissingRequiredPropertyException("WlanAirwatchArgs", "consoleUrl");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("WlanAirwatchArgs", "password");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("WlanAirwatchArgs", "username");
            }
            return $;
        }
    }

}
