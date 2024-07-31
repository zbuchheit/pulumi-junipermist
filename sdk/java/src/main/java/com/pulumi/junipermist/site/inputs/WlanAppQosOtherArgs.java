// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanAppQosOtherArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanAppQosOtherArgs Empty = new WlanAppQosOtherArgs();

    @Import(name="dscp")
    private @Nullable Output<Integer> dscp;

    public Optional<Output<Integer>> dscp() {
        return Optional.ofNullable(this.dscp);
    }

    @Import(name="dstSubnet")
    private @Nullable Output<String> dstSubnet;

    public Optional<Output<String>> dstSubnet() {
        return Optional.ofNullable(this.dstSubnet);
    }

    @Import(name="portRanges")
    private @Nullable Output<String> portRanges;

    public Optional<Output<String>> portRanges() {
        return Optional.ofNullable(this.portRanges);
    }

    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="srcSubnet")
    private @Nullable Output<String> srcSubnet;

    public Optional<Output<String>> srcSubnet() {
        return Optional.ofNullable(this.srcSubnet);
    }

    private WlanAppQosOtherArgs() {}

    private WlanAppQosOtherArgs(WlanAppQosOtherArgs $) {
        this.dscp = $.dscp;
        this.dstSubnet = $.dstSubnet;
        this.portRanges = $.portRanges;
        this.protocol = $.protocol;
        this.srcSubnet = $.srcSubnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanAppQosOtherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanAppQosOtherArgs $;

        public Builder() {
            $ = new WlanAppQosOtherArgs();
        }

        public Builder(WlanAppQosOtherArgs defaults) {
            $ = new WlanAppQosOtherArgs(Objects.requireNonNull(defaults));
        }

        public Builder dscp(@Nullable Output<Integer> dscp) {
            $.dscp = dscp;
            return this;
        }

        public Builder dscp(Integer dscp) {
            return dscp(Output.of(dscp));
        }

        public Builder dstSubnet(@Nullable Output<String> dstSubnet) {
            $.dstSubnet = dstSubnet;
            return this;
        }

        public Builder dstSubnet(String dstSubnet) {
            return dstSubnet(Output.of(dstSubnet));
        }

        public Builder portRanges(@Nullable Output<String> portRanges) {
            $.portRanges = portRanges;
            return this;
        }

        public Builder portRanges(String portRanges) {
            return portRanges(Output.of(portRanges));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder srcSubnet(@Nullable Output<String> srcSubnet) {
            $.srcSubnet = srcSubnet;
            return this;
        }

        public Builder srcSubnet(String srcSubnet) {
            return srcSubnet(Output.of(srcSubnet));
        }

        public WlanAppQosOtherArgs build() {
            return $;
        }
    }

}