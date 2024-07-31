// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApIpConfig {
    /**
     * @return if `type`==`static`
     * 
     */
    private @Nullable List<String> dns;
    /**
     * @return required if `type`==`static`
     * 
     */
    private @Nullable List<String> dnsSuffixes;
    /**
     * @return required if `type`==`static`
     * 
     */
    private @Nullable String gateway;
    private @Nullable String gateway6;
    /**
     * @return required if `type`==`static`
     * 
     */
    private @Nullable String ip;
    private @Nullable String ip6;
    private @Nullable Integer mtu;
    /**
     * @return required if `type`==`static`
     * 
     */
    private @Nullable String netmask;
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
    /**
     * @return management vlan id, default is 1 (untagged)
     * 
     */
    private @Nullable Integer vlanId;

    private ApIpConfig() {}
    /**
     * @return if `type`==`static`
     * 
     */
    public List<String> dns() {
        return this.dns == null ? List.of() : this.dns;
    }
    /**
     * @return required if `type`==`static`
     * 
     */
    public List<String> dnsSuffixes() {
        return this.dnsSuffixes == null ? List.of() : this.dnsSuffixes;
    }
    /**
     * @return required if `type`==`static`
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }
    public Optional<String> gateway6() {
        return Optional.ofNullable(this.gateway6);
    }
    /**
     * @return required if `type`==`static`
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<String> ip6() {
        return Optional.ofNullable(this.ip6);
    }
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    /**
     * @return required if `type`==`static`
     * 
     */
    public Optional<String> netmask() {
        return Optional.ofNullable(this.netmask);
    }
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
    /**
     * @return management vlan id, default is 1 (untagged)
     * 
     */
    public Optional<Integer> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> dns;
        private @Nullable List<String> dnsSuffixes;
        private @Nullable String gateway;
        private @Nullable String gateway6;
        private @Nullable String ip;
        private @Nullable String ip6;
        private @Nullable Integer mtu;
        private @Nullable String netmask;
        private @Nullable String netmask6;
        private @Nullable String type;
        private @Nullable String type6;
        private @Nullable Integer vlanId;
        public Builder() {}
        public Builder(ApIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dns = defaults.dns;
    	      this.dnsSuffixes = defaults.dnsSuffixes;
    	      this.gateway = defaults.gateway;
    	      this.gateway6 = defaults.gateway6;
    	      this.ip = defaults.ip;
    	      this.ip6 = defaults.ip6;
    	      this.mtu = defaults.mtu;
    	      this.netmask = defaults.netmask;
    	      this.netmask6 = defaults.netmask6;
    	      this.type = defaults.type;
    	      this.type6 = defaults.type6;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder dns(@Nullable List<String> dns) {

            this.dns = dns;
            return this;
        }
        public Builder dns(String... dns) {
            return dns(List.of(dns));
        }
        @CustomType.Setter
        public Builder dnsSuffixes(@Nullable List<String> dnsSuffixes) {

            this.dnsSuffixes = dnsSuffixes;
            return this;
        }
        public Builder dnsSuffixes(String... dnsSuffixes) {
            return dnsSuffixes(List.of(dnsSuffixes));
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder gateway6(@Nullable String gateway6) {

            this.gateway6 = gateway6;
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
        public Builder mtu(@Nullable Integer mtu) {

            this.mtu = mtu;
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
        @CustomType.Setter
        public Builder vlanId(@Nullable Integer vlanId) {

            this.vlanId = vlanId;
            return this;
        }
        public ApIpConfig build() {
            final var _resultValue = new ApIpConfig();
            _resultValue.dns = dns;
            _resultValue.dnsSuffixes = dnsSuffixes;
            _resultValue.gateway = gateway;
            _resultValue.gateway6 = gateway6;
            _resultValue.ip = ip;
            _resultValue.ip6 = ip6;
            _resultValue.mtu = mtu;
            _resultValue.netmask = netmask;
            _resultValue.netmask6 = netmask6;
            _resultValue.type = type;
            _resultValue.type6 = type6;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
