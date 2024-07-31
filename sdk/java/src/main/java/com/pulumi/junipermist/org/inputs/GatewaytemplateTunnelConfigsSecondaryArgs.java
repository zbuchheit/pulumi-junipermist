// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateTunnelConfigsSecondaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateTunnelConfigsSecondaryArgs Empty = new GatewaytemplateTunnelConfigsSecondaryArgs();

    @Import(name="hosts")
    private @Nullable Output<List<String>> hosts;

    public Optional<Output<List<String>>> hosts() {
        return Optional.ofNullable(this.hosts);
    }

    /**
     * Only if:
     *   * `provider`== `zscaler-gre`
     *   * `provider`== `custom-gre`
     * 
     */
    @Import(name="internalIps")
    private @Nullable Output<List<String>> internalIps;

    /**
     * @return Only if:
     *   * `provider`== `zscaler-gre`
     *   * `provider`== `custom-gre`
     * 
     */
    public Optional<Output<List<String>>> internalIps() {
        return Optional.ofNullable(this.internalIps);
    }

    @Import(name="probeIps")
    private @Nullable Output<List<String>> probeIps;

    public Optional<Output<List<String>>> probeIps() {
        return Optional.ofNullable(this.probeIps);
    }

    /**
     * Only if `provider`== `custom-ipsec`
     * 
     */
    @Import(name="remoteIds")
    private @Nullable Output<List<String>> remoteIds;

    /**
     * @return Only if `provider`== `custom-ipsec`
     * 
     */
    public Optional<Output<List<String>>> remoteIds() {
        return Optional.ofNullable(this.remoteIds);
    }

    @Import(name="wanNames")
    private @Nullable Output<List<String>> wanNames;

    public Optional<Output<List<String>>> wanNames() {
        return Optional.ofNullable(this.wanNames);
    }

    private GatewaytemplateTunnelConfigsSecondaryArgs() {}

    private GatewaytemplateTunnelConfigsSecondaryArgs(GatewaytemplateTunnelConfigsSecondaryArgs $) {
        this.hosts = $.hosts;
        this.internalIps = $.internalIps;
        this.probeIps = $.probeIps;
        this.remoteIds = $.remoteIds;
        this.wanNames = $.wanNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateTunnelConfigsSecondaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateTunnelConfigsSecondaryArgs $;

        public Builder() {
            $ = new GatewaytemplateTunnelConfigsSecondaryArgs();
        }

        public Builder(GatewaytemplateTunnelConfigsSecondaryArgs defaults) {
            $ = new GatewaytemplateTunnelConfigsSecondaryArgs(Objects.requireNonNull(defaults));
        }

        public Builder hosts(@Nullable Output<List<String>> hosts) {
            $.hosts = hosts;
            return this;
        }

        public Builder hosts(List<String> hosts) {
            return hosts(Output.of(hosts));
        }

        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }

        /**
         * @param internalIps Only if:
         *   * `provider`== `zscaler-gre`
         *   * `provider`== `custom-gre`
         * 
         * @return builder
         * 
         */
        public Builder internalIps(@Nullable Output<List<String>> internalIps) {
            $.internalIps = internalIps;
            return this;
        }

        /**
         * @param internalIps Only if:
         *   * `provider`== `zscaler-gre`
         *   * `provider`== `custom-gre`
         * 
         * @return builder
         * 
         */
        public Builder internalIps(List<String> internalIps) {
            return internalIps(Output.of(internalIps));
        }

        /**
         * @param internalIps Only if:
         *   * `provider`== `zscaler-gre`
         *   * `provider`== `custom-gre`
         * 
         * @return builder
         * 
         */
        public Builder internalIps(String... internalIps) {
            return internalIps(List.of(internalIps));
        }

        public Builder probeIps(@Nullable Output<List<String>> probeIps) {
            $.probeIps = probeIps;
            return this;
        }

        public Builder probeIps(List<String> probeIps) {
            return probeIps(Output.of(probeIps));
        }

        public Builder probeIps(String... probeIps) {
            return probeIps(List.of(probeIps));
        }

        /**
         * @param remoteIds Only if `provider`== `custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder remoteIds(@Nullable Output<List<String>> remoteIds) {
            $.remoteIds = remoteIds;
            return this;
        }

        /**
         * @param remoteIds Only if `provider`== `custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder remoteIds(List<String> remoteIds) {
            return remoteIds(Output.of(remoteIds));
        }

        /**
         * @param remoteIds Only if `provider`== `custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder remoteIds(String... remoteIds) {
            return remoteIds(List.of(remoteIds));
        }

        public Builder wanNames(@Nullable Output<List<String>> wanNames) {
            $.wanNames = wanNames;
            return this;
        }

        public Builder wanNames(List<String> wanNames) {
            return wanNames(Output.of(wanNames));
        }

        public Builder wanNames(String... wanNames) {
            return wanNames(List.of(wanNames));
        }

        public GatewaytemplateTunnelConfigsSecondaryArgs build() {
            return $;
        }
    }

}
