// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.WlanAppQosApps;
import com.pulumi.junipermist.site.outputs.WlanAppQosOther;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanAppQos {
    private @Nullable Map<String,WlanAppQosApps> apps;
    private @Nullable Boolean enabled;
    private @Nullable List<WlanAppQosOther> others;

    private WlanAppQos() {}
    public Map<String,WlanAppQosApps> apps() {
        return this.apps == null ? Map.of() : this.apps;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<WlanAppQosOther> others() {
        return this.others == null ? List.of() : this.others;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanAppQos defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,WlanAppQosApps> apps;
        private @Nullable Boolean enabled;
        private @Nullable List<WlanAppQosOther> others;
        public Builder() {}
        public Builder(WlanAppQos defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apps = defaults.apps;
    	      this.enabled = defaults.enabled;
    	      this.others = defaults.others;
        }

        @CustomType.Setter
        public Builder apps(@Nullable Map<String,WlanAppQosApps> apps) {

            this.apps = apps;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder others(@Nullable List<WlanAppQosOther> others) {

            this.others = others;
            return this;
        }
        public Builder others(WlanAppQosOther... others) {
            return others(List.of(others));
        }
        public WlanAppQos build() {
            final var _resultValue = new WlanAppQos();
            _resultValue.apps = apps;
            _resultValue.enabled = enabled;
            _resultValue.others = others;
            return _resultValue;
        }
    }
}
