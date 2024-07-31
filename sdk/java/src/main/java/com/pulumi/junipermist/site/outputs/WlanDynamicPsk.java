// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanDynamicPsk {
    /**
     * @return default PSK to use if cloud WLC is not available, 8-63 characters
     * 
     */
    private @Nullable String defaultPsk;
    private @Nullable String defaultVlanId;
    private @Nullable Boolean enabled;
    /**
     * @return when 11r is enabled, we&#39;ll try to use the cached PMK, this can be disabled
     * `false` means auto
     * 
     */
    private @Nullable Boolean forceLookup;
    /**
     * @return enum: `cloud_psks`, `radius`
     * 
     */
    private @Nullable String source;
    private @Nullable List<String> vlanIds;

    private WlanDynamicPsk() {}
    /**
     * @return default PSK to use if cloud WLC is not available, 8-63 characters
     * 
     */
    public Optional<String> defaultPsk() {
        return Optional.ofNullable(this.defaultPsk);
    }
    public Optional<String> defaultVlanId() {
        return Optional.ofNullable(this.defaultVlanId);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return when 11r is enabled, we&#39;ll try to use the cached PMK, this can be disabled
     * `false` means auto
     * 
     */
    public Optional<Boolean> forceLookup() {
        return Optional.ofNullable(this.forceLookup);
    }
    /**
     * @return enum: `cloud_psks`, `radius`
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public List<String> vlanIds() {
        return this.vlanIds == null ? List.of() : this.vlanIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanDynamicPsk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultPsk;
        private @Nullable String defaultVlanId;
        private @Nullable Boolean enabled;
        private @Nullable Boolean forceLookup;
        private @Nullable String source;
        private @Nullable List<String> vlanIds;
        public Builder() {}
        public Builder(WlanDynamicPsk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultPsk = defaults.defaultPsk;
    	      this.defaultVlanId = defaults.defaultVlanId;
    	      this.enabled = defaults.enabled;
    	      this.forceLookup = defaults.forceLookup;
    	      this.source = defaults.source;
    	      this.vlanIds = defaults.vlanIds;
        }

        @CustomType.Setter
        public Builder defaultPsk(@Nullable String defaultPsk) {

            this.defaultPsk = defaultPsk;
            return this;
        }
        @CustomType.Setter
        public Builder defaultVlanId(@Nullable String defaultVlanId) {

            this.defaultVlanId = defaultVlanId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder forceLookup(@Nullable Boolean forceLookup) {

            this.forceLookup = forceLookup;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder vlanIds(@Nullable List<String> vlanIds) {

            this.vlanIds = vlanIds;
            return this;
        }
        public Builder vlanIds(String... vlanIds) {
            return vlanIds(List.of(vlanIds));
        }
        public WlanDynamicPsk build() {
            final var _resultValue = new WlanDynamicPsk();
            _resultValue.defaultPsk = defaultPsk;
            _resultValue.defaultVlanId = defaultVlanId;
            _resultValue.enabled = enabled;
            _resultValue.forceLookup = forceLookup;
            _resultValue.source = source;
            _resultValue.vlanIds = vlanIds;
            return _resultValue;
        }
    }
}
