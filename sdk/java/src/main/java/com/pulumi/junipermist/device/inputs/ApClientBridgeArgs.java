// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.ApClientBridgeAuthArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApClientBridgeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApClientBridgeArgs Empty = new ApClientBridgeArgs();

    @Import(name="auth")
    private @Nullable Output<ApClientBridgeAuthArgs> auth;

    public Optional<Output<ApClientBridgeAuthArgs>> auth() {
        return Optional.ofNullable(this.auth);
    }

    /**
     * when acted as client bridge:
     *   * only 5G radio can be used
     *   * will not serve as AP on any radios
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return when acted as client bridge:
     *   * only 5G radio can be used
     *   * will not serve as AP on any radios
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="ssid")
    private @Nullable Output<String> ssid;

    public Optional<Output<String>> ssid() {
        return Optional.ofNullable(this.ssid);
    }

    private ApClientBridgeArgs() {}

    private ApClientBridgeArgs(ApClientBridgeArgs $) {
        this.auth = $.auth;
        this.enabled = $.enabled;
        this.ssid = $.ssid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApClientBridgeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApClientBridgeArgs $;

        public Builder() {
            $ = new ApClientBridgeArgs();
        }

        public Builder(ApClientBridgeArgs defaults) {
            $ = new ApClientBridgeArgs(Objects.requireNonNull(defaults));
        }

        public Builder auth(@Nullable Output<ApClientBridgeAuthArgs> auth) {
            $.auth = auth;
            return this;
        }

        public Builder auth(ApClientBridgeAuthArgs auth) {
            return auth(Output.of(auth));
        }

        /**
         * @param enabled when acted as client bridge:
         *   * only 5G radio can be used
         *   * will not serve as AP on any radios
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled when acted as client bridge:
         *   * only 5G radio can be used
         *   * will not serve as AP on any radios
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder ssid(@Nullable Output<String> ssid) {
            $.ssid = ssid;
            return this;
        }

        public Builder ssid(String ssid) {
            return ssid(Output.of(ssid));
        }

        public ApClientBridgeArgs build() {
            return $;
        }
    }

}
