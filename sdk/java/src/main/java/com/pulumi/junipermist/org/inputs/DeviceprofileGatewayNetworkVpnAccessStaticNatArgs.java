// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayNetworkVpnAccessStaticNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayNetworkVpnAccessStaticNatArgs Empty = new DeviceprofileGatewayNetworkVpnAccessStaticNatArgs();

    @Import(name="internalIp")
    private @Nullable Output<String> internalIp;

    public Optional<Output<String>> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    @Import(name="wanName")
    private @Nullable Output<String> wanName;

    /**
     * @return If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    public Optional<Output<String>> wanName() {
        return Optional.ofNullable(this.wanName);
    }

    private DeviceprofileGatewayNetworkVpnAccessStaticNatArgs() {}

    private DeviceprofileGatewayNetworkVpnAccessStaticNatArgs(DeviceprofileGatewayNetworkVpnAccessStaticNatArgs $) {
        this.internalIp = $.internalIp;
        this.name = $.name;
        this.wanName = $.wanName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayNetworkVpnAccessStaticNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayNetworkVpnAccessStaticNatArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayNetworkVpnAccessStaticNatArgs();
        }

        public Builder(DeviceprofileGatewayNetworkVpnAccessStaticNatArgs defaults) {
            $ = new DeviceprofileGatewayNetworkVpnAccessStaticNatArgs(Objects.requireNonNull(defaults));
        }

        public Builder internalIp(@Nullable Output<String> internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        public Builder internalIp(String internalIp) {
            return internalIp(Output.of(internalIp));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param wanName If not set, we configure the nat policies against all WAN ports for simplicity
         * 
         * @return builder
         * 
         */
        public Builder wanName(@Nullable Output<String> wanName) {
            $.wanName = wanName;
            return this;
        }

        /**
         * @param wanName If not set, we configure the nat policies against all WAN ports for simplicity
         * 
         * @return builder
         * 
         */
        public Builder wanName(String wanName) {
            return wanName(Output.of(wanName));
        }

        public DeviceprofileGatewayNetworkVpnAccessStaticNatArgs build() {
            return $;
        }
    }

}
