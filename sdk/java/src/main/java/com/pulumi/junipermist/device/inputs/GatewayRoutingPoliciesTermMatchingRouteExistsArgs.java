// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayRoutingPoliciesTermMatchingRouteExistsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRoutingPoliciesTermMatchingRouteExistsArgs Empty = new GatewayRoutingPoliciesTermMatchingRouteExistsArgs();

    @Import(name="route")
    private @Nullable Output<String> route;

    public Optional<Output<String>> route() {
        return Optional.ofNullable(this.route);
    }

    /**
     * name of the vrf instance
     * it can also be the name of the VPN or wan if they
     * 
     */
    @Import(name="vrfName")
    private @Nullable Output<String> vrfName;

    /**
     * @return name of the vrf instance
     * it can also be the name of the VPN or wan if they
     * 
     */
    public Optional<Output<String>> vrfName() {
        return Optional.ofNullable(this.vrfName);
    }

    private GatewayRoutingPoliciesTermMatchingRouteExistsArgs() {}

    private GatewayRoutingPoliciesTermMatchingRouteExistsArgs(GatewayRoutingPoliciesTermMatchingRouteExistsArgs $) {
        this.route = $.route;
        this.vrfName = $.vrfName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRoutingPoliciesTermMatchingRouteExistsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRoutingPoliciesTermMatchingRouteExistsArgs $;

        public Builder() {
            $ = new GatewayRoutingPoliciesTermMatchingRouteExistsArgs();
        }

        public Builder(GatewayRoutingPoliciesTermMatchingRouteExistsArgs defaults) {
            $ = new GatewayRoutingPoliciesTermMatchingRouteExistsArgs(Objects.requireNonNull(defaults));
        }

        public Builder route(@Nullable Output<String> route) {
            $.route = route;
            return this;
        }

        public Builder route(String route) {
            return route(Output.of(route));
        }

        /**
         * @param vrfName name of the vrf instance
         * it can also be the name of the VPN or wan if they
         * 
         * @return builder
         * 
         */
        public Builder vrfName(@Nullable Output<String> vrfName) {
            $.vrfName = vrfName;
            return this;
        }

        /**
         * @param vrfName name of the vrf instance
         * it can also be the name of the VPN or wan if they
         * 
         * @return builder
         * 
         */
        public Builder vrfName(String vrfName) {
            return vrfName(Output.of(vrfName));
        }

        public GatewayRoutingPoliciesTermMatchingRouteExistsArgs build() {
            return $;
        }
    }

}