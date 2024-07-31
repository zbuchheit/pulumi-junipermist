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


public final class DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs Empty = new DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs();

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

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs() {}

    private DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs(DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs $) {
        this.internalIp = $.internalIp;
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs();
        }

        public Builder(DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs defaults) {
            $ = new DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs(Objects.requireNonNull(defaults));
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

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public DeviceprofileGatewayNetworkInternetAccessDestinationNatArgs build() {
            return $;
        }
    }

}
