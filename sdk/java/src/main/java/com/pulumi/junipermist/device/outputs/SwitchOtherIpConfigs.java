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
public final class SwitchOtherIpConfigs {
    /**
     * @return for EVPN, if anycast is desired
     * 
     */
    private @Nullable Boolean evpnAnycast;
    /**
     * @return required if `type`==`static`
     * 
     */
    private @Nullable String ip;
    /**
     * @return required if `type6`==`static`
     * 
     */
    private @Nullable String ip6;
    /**
     * @return optional, `subnet` from `network` definition will be used if defined
     * 
     */
    private @Nullable String netmask;
    /**
     * @return optional, `subnet` from `network` definition will be used if defined
     * 
     */
    private @Nullable String netmask6;
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    private @Nullable String type;
    /**
     * @return enum: `autoconf`, `dhcp`, `disabled`, `static`
     * 
     */
    private @Nullable String type6;

    private SwitchOtherIpConfigs() {}
    /**
     * @return for EVPN, if anycast is desired
     * 
     */
    public Optional<Boolean> evpnAnycast() {
        return Optional.ofNullable(this.evpnAnycast);
    }
    /**
     * @return required if `type`==`static`
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return required if `type6`==`static`
     * 
     */
    public Optional<String> ip6() {
        return Optional.ofNullable(this.ip6);
    }
    /**
     * @return optional, `subnet` from `network` definition will be used if defined
     * 
     */
    public Optional<String> netmask() {
        return Optional.ofNullable(this.netmask);
    }
    /**
     * @return optional, `subnet` from `network` definition will be used if defined
     * 
     */
    public Optional<String> netmask6() {
        return Optional.ofNullable(this.netmask6);
    }
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return enum: `autoconf`, `dhcp`, `disabled`, `static`
     * 
     */
    public Optional<String> type6() {
        return Optional.ofNullable(this.type6);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchOtherIpConfigs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean evpnAnycast;
        private @Nullable String ip;
        private @Nullable String ip6;
        private @Nullable String netmask;
        private @Nullable String netmask6;
        private @Nullable String type;
        private @Nullable String type6;
        public Builder() {}
        public Builder(SwitchOtherIpConfigs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evpnAnycast = defaults.evpnAnycast;
    	      this.ip = defaults.ip;
    	      this.ip6 = defaults.ip6;
    	      this.netmask = defaults.netmask;
    	      this.netmask6 = defaults.netmask6;
    	      this.type = defaults.type;
    	      this.type6 = defaults.type6;
        }

        @CustomType.Setter
        public Builder evpnAnycast(@Nullable Boolean evpnAnycast) {

            this.evpnAnycast = evpnAnycast;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder ip6(@Nullable String ip6) {

            this.ip6 = ip6;
            return this;
        }
        @CustomType.Setter
        public Builder netmask(@Nullable String netmask) {

            this.netmask = netmask;
            return this;
        }
        @CustomType.Setter
        public Builder netmask6(@Nullable String netmask6) {

            this.netmask6 = netmask6;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder type6(@Nullable String type6) {

            this.type6 = type6;
            return this;
        }
        public SwitchOtherIpConfigs build() {
            final var _resultValue = new SwitchOtherIpConfigs();
            _resultValue.evpnAnycast = evpnAnycast;
            _resultValue.ip = ip;
            _resultValue.ip6 = ip6;
            _resultValue.netmask = netmask;
            _resultValue.netmask6 = netmask6;
            _resultValue.type = type;
            _resultValue.type6 = type6;
            return _resultValue;
        }
    }
}