// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicepolicyEwfArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicepolicyEwfArgs Empty = new ServicepolicyEwfArgs();

    @Import(name="alertOnly")
    private @Nullable Output<Boolean> alertOnly;

    public Optional<Output<Boolean>> alertOnly() {
        return Optional.ofNullable(this.alertOnly);
    }

    @Import(name="blockMessage")
    private @Nullable Output<String> blockMessage;

    public Optional<Output<String>> blockMessage() {
        return Optional.ofNullable(this.blockMessage);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * enum: `critical`, `standard`, `strict`
     * 
     */
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @return enum: `critical`, `standard`, `strict`
     * 
     */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    private ServicepolicyEwfArgs() {}

    private ServicepolicyEwfArgs(ServicepolicyEwfArgs $) {
        this.alertOnly = $.alertOnly;
        this.blockMessage = $.blockMessage;
        this.enabled = $.enabled;
        this.profile = $.profile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicepolicyEwfArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicepolicyEwfArgs $;

        public Builder() {
            $ = new ServicepolicyEwfArgs();
        }

        public Builder(ServicepolicyEwfArgs defaults) {
            $ = new ServicepolicyEwfArgs(Objects.requireNonNull(defaults));
        }

        public Builder alertOnly(@Nullable Output<Boolean> alertOnly) {
            $.alertOnly = alertOnly;
            return this;
        }

        public Builder alertOnly(Boolean alertOnly) {
            return alertOnly(Output.of(alertOnly));
        }

        public Builder blockMessage(@Nullable Output<String> blockMessage) {
            $.blockMessage = blockMessage;
            return this;
        }

        public Builder blockMessage(String blockMessage) {
            return blockMessage(Output.of(blockMessage));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param profile enum: `critical`, `standard`, `strict`
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile enum: `critical`, `standard`, `strict`
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        public ServicepolicyEwfArgs build() {
            return $;
        }
    }

}
