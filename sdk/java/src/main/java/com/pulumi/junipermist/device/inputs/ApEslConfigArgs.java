// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApEslConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApEslConfigArgs Empty = new ApEslConfigArgs();

    /**
     * Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    @Import(name="cacert")
    private @Nullable Output<String> cacert;

    /**
     * @return Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    public Optional<Output<String>> cacert() {
        return Optional.ofNullable(this.cacert);
    }

    /**
     * Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    @Import(name="channel")
    private @Nullable Output<Integer> channel;

    /**
     * @return Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    public Optional<Output<Integer>> channel() {
        return Optional.ofNullable(this.channel);
    }

    /**
     * usb_config is ignored if esl_config enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return usb_config is ignored if esl_config enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * note: ble_config will be ingored if esl_config is enabled and with native mode. enum: `hanshow`, `imagotag`, `native`, `solum`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return note: ble_config will be ingored if esl_config is enabled and with native mode. enum: `hanshow`, `imagotag`, `native`, `solum`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    @Import(name="verifyCert")
    private @Nullable Output<Boolean> verifyCert;

    /**
     * @return Only if `type`==`imagotag` or `type`==`native`
     * 
     */
    public Optional<Output<Boolean>> verifyCert() {
        return Optional.ofNullable(this.verifyCert);
    }

    /**
     * Only if `type`==`solum` or `type`==`hanshow`
     * 
     */
    @Import(name="vlanId")
    private @Nullable Output<Integer> vlanId;

    /**
     * @return Only if `type`==`solum` or `type`==`hanshow`
     * 
     */
    public Optional<Output<Integer>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private ApEslConfigArgs() {}

    private ApEslConfigArgs(ApEslConfigArgs $) {
        this.cacert = $.cacert;
        this.channel = $.channel;
        this.enabled = $.enabled;
        this.host = $.host;
        this.port = $.port;
        this.type = $.type;
        this.verifyCert = $.verifyCert;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApEslConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApEslConfigArgs $;

        public Builder() {
            $ = new ApEslConfigArgs();
        }

        public Builder(ApEslConfigArgs defaults) {
            $ = new ApEslConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacert Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder cacert(@Nullable Output<String> cacert) {
            $.cacert = cacert;
            return this;
        }

        /**
         * @param cacert Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder cacert(String cacert) {
            return cacert(Output.of(cacert));
        }

        /**
         * @param channel Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder channel(@Nullable Output<Integer> channel) {
            $.channel = channel;
            return this;
        }

        /**
         * @param channel Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder channel(Integer channel) {
            return channel(Output.of(channel));
        }

        /**
         * @param enabled usb_config is ignored if esl_config enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled usb_config is ignored if esl_config enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param host Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param type note: ble_config will be ingored if esl_config is enabled and with native mode. enum: `hanshow`, `imagotag`, `native`, `solum`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type note: ble_config will be ingored if esl_config is enabled and with native mode. enum: `hanshow`, `imagotag`, `native`, `solum`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param verifyCert Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder verifyCert(@Nullable Output<Boolean> verifyCert) {
            $.verifyCert = verifyCert;
            return this;
        }

        /**
         * @param verifyCert Only if `type`==`imagotag` or `type`==`native`
         * 
         * @return builder
         * 
         */
        public Builder verifyCert(Boolean verifyCert) {
            return verifyCert(Output.of(verifyCert));
        }

        /**
         * @param vlanId Only if `type`==`solum` or `type`==`hanshow`
         * 
         * @return builder
         * 
         */
        public Builder vlanId(@Nullable Output<Integer> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        /**
         * @param vlanId Only if `type`==`solum` or `type`==`hanshow`
         * 
         * @return builder
         * 
         */
        public Builder vlanId(Integer vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public ApEslConfigArgs build() {
            return $;
        }
    }

}
