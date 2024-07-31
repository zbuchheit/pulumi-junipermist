// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileApPwrConfig {
    /**
     * @return additional power to request during negotiating with PSE over PoE, in mW
     * 
     */
    private @Nullable Integer base;
    /**
     * @return whether to enable power out to peripheral, meanwhile will reduce power to wifi (only for AP45 at power mode)
     * 
     */
    private @Nullable Boolean preferUsbOverWifi;

    private DeviceprofileApPwrConfig() {}
    /**
     * @return additional power to request during negotiating with PSE over PoE, in mW
     * 
     */
    public Optional<Integer> base() {
        return Optional.ofNullable(this.base);
    }
    /**
     * @return whether to enable power out to peripheral, meanwhile will reduce power to wifi (only for AP45 at power mode)
     * 
     */
    public Optional<Boolean> preferUsbOverWifi() {
        return Optional.ofNullable(this.preferUsbOverWifi);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileApPwrConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer base;
        private @Nullable Boolean preferUsbOverWifi;
        public Builder() {}
        public Builder(DeviceprofileApPwrConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.preferUsbOverWifi = defaults.preferUsbOverWifi;
        }

        @CustomType.Setter
        public Builder base(@Nullable Integer base) {

            this.base = base;
            return this;
        }
        @CustomType.Setter
        public Builder preferUsbOverWifi(@Nullable Boolean preferUsbOverWifi) {

            this.preferUsbOverWifi = preferUsbOverWifi;
            return this;
        }
        public DeviceprofileApPwrConfig build() {
            final var _resultValue = new DeviceprofileApPwrConfig();
            _resultValue.base = base;
            _resultValue.preferUsbOverWifi = preferUsbOverWifi;
            return _resultValue;
        }
    }
}