// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateIpConfigsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateIpConfigsArgs Empty = new GatewaytemplateIpConfigsArgs();

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    @Import(name="netmask", required=true)
    private Output<String> netmask;

    public Output<String> netmask() {
        return this.netmask;
    }

    /**
     * optional list of secondary IPs in CIDR format
     * 
     */
    @Import(name="secondaryIps")
    private @Nullable Output<List<String>> secondaryIps;

    /**
     * @return optional list of secondary IPs in CIDR format
     * 
     */
    public Optional<Output<List<String>>> secondaryIps() {
        return Optional.ofNullable(this.secondaryIps);
    }

    /**
     * enum: `dhcp`, `static`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GatewaytemplateIpConfigsArgs() {}

    private GatewaytemplateIpConfigsArgs(GatewaytemplateIpConfigsArgs $) {
        this.ip = $.ip;
        this.netmask = $.netmask;
        this.secondaryIps = $.secondaryIps;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateIpConfigsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateIpConfigsArgs $;

        public Builder() {
            $ = new GatewaytemplateIpConfigsArgs();
        }

        public Builder(GatewaytemplateIpConfigsArgs defaults) {
            $ = new GatewaytemplateIpConfigsArgs(Objects.requireNonNull(defaults));
        }

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder netmask(Output<String> netmask) {
            $.netmask = netmask;
            return this;
        }

        public Builder netmask(String netmask) {
            return netmask(Output.of(netmask));
        }

        /**
         * @param secondaryIps optional list of secondary IPs in CIDR format
         * 
         * @return builder
         * 
         */
        public Builder secondaryIps(@Nullable Output<List<String>> secondaryIps) {
            $.secondaryIps = secondaryIps;
            return this;
        }

        /**
         * @param secondaryIps optional list of secondary IPs in CIDR format
         * 
         * @return builder
         * 
         */
        public Builder secondaryIps(List<String> secondaryIps) {
            return secondaryIps(Output.of(secondaryIps));
        }

        /**
         * @param secondaryIps optional list of secondary IPs in CIDR format
         * 
         * @return builder
         * 
         */
        public Builder secondaryIps(String... secondaryIps) {
            return secondaryIps(List.of(secondaryIps));
        }

        /**
         * @param type enum: `dhcp`, `static`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `dhcp`, `static`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GatewaytemplateIpConfigsArgs build() {
            if ($.ip == null) {
                throw new MissingRequiredPropertyException("GatewaytemplateIpConfigsArgs", "ip");
            }
            if ($.netmask == null) {
                throw new MissingRequiredPropertyException("GatewaytemplateIpConfigsArgs", "netmask");
            }
            return $;
        }
    }

}
