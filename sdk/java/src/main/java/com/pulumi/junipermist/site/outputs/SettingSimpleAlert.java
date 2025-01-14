// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.SettingSimpleAlertArpFailure;
import com.pulumi.junipermist.site.outputs.SettingSimpleAlertDhcpFailure;
import com.pulumi.junipermist.site.outputs.SettingSimpleAlertDnsFailure;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingSimpleAlert {
    private @Nullable SettingSimpleAlertArpFailure arpFailure;
    private @Nullable SettingSimpleAlertDhcpFailure dhcpFailure;
    private @Nullable SettingSimpleAlertDnsFailure dnsFailure;

    private SettingSimpleAlert() {}
    public Optional<SettingSimpleAlertArpFailure> arpFailure() {
        return Optional.ofNullable(this.arpFailure);
    }
    public Optional<SettingSimpleAlertDhcpFailure> dhcpFailure() {
        return Optional.ofNullable(this.dhcpFailure);
    }
    public Optional<SettingSimpleAlertDnsFailure> dnsFailure() {
        return Optional.ofNullable(this.dnsFailure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingSimpleAlert defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SettingSimpleAlertArpFailure arpFailure;
        private @Nullable SettingSimpleAlertDhcpFailure dhcpFailure;
        private @Nullable SettingSimpleAlertDnsFailure dnsFailure;
        public Builder() {}
        public Builder(SettingSimpleAlert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arpFailure = defaults.arpFailure;
    	      this.dhcpFailure = defaults.dhcpFailure;
    	      this.dnsFailure = defaults.dnsFailure;
        }

        @CustomType.Setter
        public Builder arpFailure(@Nullable SettingSimpleAlertArpFailure arpFailure) {

            this.arpFailure = arpFailure;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpFailure(@Nullable SettingSimpleAlertDhcpFailure dhcpFailure) {

            this.dhcpFailure = dhcpFailure;
            return this;
        }
        @CustomType.Setter
        public Builder dnsFailure(@Nullable SettingSimpleAlertDnsFailure dnsFailure) {

            this.dnsFailure = dnsFailure;
            return this;
        }
        public SettingSimpleAlert build() {
            final var _resultValue = new SettingSimpleAlert();
            _resultValue.arpFailure = arpFailure;
            _resultValue.dhcpFailure = dhcpFailure;
            _resultValue.dnsFailure = dnsFailure;
            return _resultValue;
        }
    }
}
