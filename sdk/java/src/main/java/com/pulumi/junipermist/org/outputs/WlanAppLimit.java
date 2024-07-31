// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanAppLimit {
    /**
     * @return Map from app key to bandwidth in kbps.
     * Property key is the app key, defined in Get Application List
     * 
     */
    private @Nullable Map<String,Integer> apps;
    private @Nullable Boolean enabled;
    /**
     * @return Map from wxtag_id of Hostname Wxlan Tags to bandwidth in kbps
     * Property key is the wxtag id
     * 
     */
    private @Nullable Map<String,Integer> wxtagIds;

    private WlanAppLimit() {}
    /**
     * @return Map from app key to bandwidth in kbps.
     * Property key is the app key, defined in Get Application List
     * 
     */
    public Map<String,Integer> apps() {
        return this.apps == null ? Map.of() : this.apps;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Map from wxtag_id of Hostname Wxlan Tags to bandwidth in kbps
     * Property key is the wxtag id
     * 
     */
    public Map<String,Integer> wxtagIds() {
        return this.wxtagIds == null ? Map.of() : this.wxtagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanAppLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Integer> apps;
        private @Nullable Boolean enabled;
        private @Nullable Map<String,Integer> wxtagIds;
        public Builder() {}
        public Builder(WlanAppLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apps = defaults.apps;
    	      this.enabled = defaults.enabled;
    	      this.wxtagIds = defaults.wxtagIds;
        }

        @CustomType.Setter
        public Builder apps(@Nullable Map<String,Integer> apps) {

            this.apps = apps;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder wxtagIds(@Nullable Map<String,Integer> wxtagIds) {

            this.wxtagIds = wxtagIds;
            return this;
        }
        public WlanAppLimit build() {
            final var _resultValue = new WlanAppLimit();
            _resultValue.apps = apps;
            _resultValue.enabled = enabled;
            _resultValue.wxtagIds = wxtagIds;
            return _resultValue;
        }
    }
}