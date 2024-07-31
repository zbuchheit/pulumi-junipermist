// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayTunnelProviderOptionsJseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayTunnelProviderOptionsJseArgs Empty = new GatewayTunnelProviderOptionsJseArgs();

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

    private GatewayTunnelProviderOptionsJseArgs() {}

    private GatewayTunnelProviderOptionsJseArgs(GatewayTunnelProviderOptionsJseArgs $) {
        this.name = $.name;
        this.numUsers = $.numUsers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayTunnelProviderOptionsJseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayTunnelProviderOptionsJseArgs $;

        public Builder() {
            $ = new GatewayTunnelProviderOptionsJseArgs();
        }

        public Builder(GatewayTunnelProviderOptionsJseArgs defaults) {
            $ = new GatewayTunnelProviderOptionsJseArgs(Objects.requireNonNull(defaults));
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

        public GatewayTunnelProviderOptionsJseArgs build() {
            return $;
        }
    }

}