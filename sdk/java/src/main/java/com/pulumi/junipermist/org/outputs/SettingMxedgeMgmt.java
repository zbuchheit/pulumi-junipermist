// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingMxedgeMgmt {
    private @Nullable Boolean fipsEnabled;
    private @Nullable String mistPassword;
    /**
     * @return enum: `dhcp`, `disabled`, `static`
     * 
     */
    private @Nullable String oobIpType;
    /**
     * @return enum: `autoconf`, `dhcp`, `disabled`, `static`
     * 
     */
    private @Nullable String oobIpType6;
    private @Nullable String rootPassword;

    private SettingMxedgeMgmt() {}
    public Optional<Boolean> fipsEnabled() {
        return Optional.ofNullable(this.fipsEnabled);
    }
    public Optional<String> mistPassword() {
        return Optional.ofNullable(this.mistPassword);
    }
    /**
     * @return enum: `dhcp`, `disabled`, `static`
     * 
     */
    public Optional<String> oobIpType() {
        return Optional.ofNullable(this.oobIpType);
    }
    /**
     * @return enum: `autoconf`, `dhcp`, `disabled`, `static`
     * 
     */
    public Optional<String> oobIpType6() {
        return Optional.ofNullable(this.oobIpType6);
    }
    public Optional<String> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingMxedgeMgmt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean fipsEnabled;
        private @Nullable String mistPassword;
        private @Nullable String oobIpType;
        private @Nullable String oobIpType6;
        private @Nullable String rootPassword;
        public Builder() {}
        public Builder(SettingMxedgeMgmt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fipsEnabled = defaults.fipsEnabled;
    	      this.mistPassword = defaults.mistPassword;
    	      this.oobIpType = defaults.oobIpType;
    	      this.oobIpType6 = defaults.oobIpType6;
    	      this.rootPassword = defaults.rootPassword;
        }

        @CustomType.Setter
        public Builder fipsEnabled(@Nullable Boolean fipsEnabled) {

            this.fipsEnabled = fipsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder mistPassword(@Nullable String mistPassword) {

            this.mistPassword = mistPassword;
            return this;
        }
        @CustomType.Setter
        public Builder oobIpType(@Nullable String oobIpType) {

            this.oobIpType = oobIpType;
            return this;
        }
        @CustomType.Setter
        public Builder oobIpType6(@Nullable String oobIpType6) {

            this.oobIpType6 = oobIpType6;
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(@Nullable String rootPassword) {

            this.rootPassword = rootPassword;
            return this;
        }
        public SettingMxedgeMgmt build() {
            final var _resultValue = new SettingMxedgeMgmt();
            _resultValue.fipsEnabled = fipsEnabled;
            _resultValue.mistPassword = mistPassword;
            _resultValue.oobIpType = oobIpType;
            _resultValue.oobIpType6 = oobIpType6;
            _resultValue.rootPassword = rootPassword;
            return _resultValue;
        }
    }
}
