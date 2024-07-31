// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchOobIpConfig {
    private @Nullable String gateway;
    private @Nullable String ip;
    /**
     * @return used only if `subnet` is not specified in `networks`
     * 
     */
    private @Nullable String netmask;
    /**
     * @return optional, the network to be used for mgmt
     * 
     */
    private @Nullable String network;
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    private @Nullable String type;
    /**
     * @return f supported on the platform. If enabled, DNS will be using this routing-instance, too
     * 
     */
    private @Nullable Boolean useMgmtVrf;
    /**
     * @return for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired,
     * 
     */
    private @Nullable Boolean useMgmtVrfForHostOut;

    private SwitchOobIpConfig() {}
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return used only if `subnet` is not specified in `networks`
     * 
     */
    public Optional<String> netmask() {
        return Optional.ofNullable(this.netmask);
    }
    /**
     * @return optional, the network to be used for mgmt
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return f supported on the platform. If enabled, DNS will be using this routing-instance, too
     * 
     */
    public Optional<Boolean> useMgmtVrf() {
        return Optional.ofNullable(this.useMgmtVrf);
    }
    /**
     * @return for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired,
     * 
     */
    public Optional<Boolean> useMgmtVrfForHostOut() {
        return Optional.ofNullable(this.useMgmtVrfForHostOut);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchOobIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String gateway;
        private @Nullable String ip;
        private @Nullable String netmask;
        private @Nullable String network;
        private @Nullable String type;
        private @Nullable Boolean useMgmtVrf;
        private @Nullable Boolean useMgmtVrfForHostOut;
        public Builder() {}
        public Builder(SwitchOobIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gateway = defaults.gateway;
    	      this.ip = defaults.ip;
    	      this.netmask = defaults.netmask;
    	      this.network = defaults.network;
    	      this.type = defaults.type;
    	      this.useMgmtVrf = defaults.useMgmtVrf;
    	      this.useMgmtVrfForHostOut = defaults.useMgmtVrfForHostOut;
        }

        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder netmask(@Nullable String netmask) {

            this.netmask = netmask;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {

            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder useMgmtVrf(@Nullable Boolean useMgmtVrf) {

            this.useMgmtVrf = useMgmtVrf;
            return this;
        }
        @CustomType.Setter
        public Builder useMgmtVrfForHostOut(@Nullable Boolean useMgmtVrfForHostOut) {

            this.useMgmtVrfForHostOut = useMgmtVrfForHostOut;
            return this;
        }
        public SwitchOobIpConfig build() {
            final var _resultValue = new SwitchOobIpConfig();
            _resultValue.gateway = gateway;
            _resultValue.ip = ip;
            _resultValue.netmask = netmask;
            _resultValue.network = network;
            _resultValue.type = type;
            _resultValue.useMgmtVrf = useMgmtVrf;
            _resultValue.useMgmtVrfForHostOut = useMgmtVrfForHostOut;
            return _resultValue;
        }
    }
}
