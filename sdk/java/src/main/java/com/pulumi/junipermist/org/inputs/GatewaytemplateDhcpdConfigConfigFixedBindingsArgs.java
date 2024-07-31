// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateDhcpdConfigConfigFixedBindingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateDhcpdConfigConfigFixedBindingsArgs Empty = new GatewaytemplateDhcpdConfigConfigFixedBindingsArgs();

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GatewaytemplateDhcpdConfigConfigFixedBindingsArgs() {}

    private GatewaytemplateDhcpdConfigConfigFixedBindingsArgs(GatewaytemplateDhcpdConfigConfigFixedBindingsArgs $) {
        this.ip = $.ip;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateDhcpdConfigConfigFixedBindingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateDhcpdConfigConfigFixedBindingsArgs $;

        public Builder() {
            $ = new GatewaytemplateDhcpdConfigConfigFixedBindingsArgs();
        }

        public Builder(GatewaytemplateDhcpdConfigConfigFixedBindingsArgs defaults) {
            $ = new GatewaytemplateDhcpdConfigConfigFixedBindingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GatewaytemplateDhcpdConfigConfigFixedBindingsArgs build() {
            if ($.ip == null) {
                throw new MissingRequiredPropertyException("GatewaytemplateDhcpdConfigConfigFixedBindingsArgs", "ip");
            }
            return $;
        }
    }

}
