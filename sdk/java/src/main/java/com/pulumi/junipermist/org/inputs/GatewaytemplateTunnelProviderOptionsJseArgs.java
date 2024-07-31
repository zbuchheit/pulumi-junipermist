// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateTunnelProviderOptionsJseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateTunnelProviderOptionsJseArgs Empty = new GatewaytemplateTunnelProviderOptionsJseArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="numUsers")
    private @Nullable Output<Integer> numUsers;

    public Optional<Output<Integer>> numUsers() {
        return Optional.ofNullable(this.numUsers);
    }

    private GatewaytemplateTunnelProviderOptionsJseArgs() {}

    private GatewaytemplateTunnelProviderOptionsJseArgs(GatewaytemplateTunnelProviderOptionsJseArgs $) {
        this.name = $.name;
        this.numUsers = $.numUsers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateTunnelProviderOptionsJseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateTunnelProviderOptionsJseArgs $;

        public Builder() {
            $ = new GatewaytemplateTunnelProviderOptionsJseArgs();
        }

        public Builder(GatewaytemplateTunnelProviderOptionsJseArgs defaults) {
            $ = new GatewaytemplateTunnelProviderOptionsJseArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder numUsers(@Nullable Output<Integer> numUsers) {
            $.numUsers = numUsers;
            return this;
        }

        public Builder numUsers(Integer numUsers) {
            return numUsers(Output.of(numUsers));
        }

        public GatewaytemplateTunnelProviderOptionsJseArgs build() {
            return $;
        }
    }

}
