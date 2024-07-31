// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs Empty = new DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs();

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

    private DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs() {}

    private DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs(DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs $) {
        this.route = $.route;
        this.vrfName = $.vrfName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs();
        }

        public Builder(DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs defaults) {
            $ = new DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs(Objects.requireNonNull(defaults));
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

        public DeviceprofileGatewayRoutingPoliciesTermMatchingRouteExistsArgs build() {
            return $;
        }
    }

}
