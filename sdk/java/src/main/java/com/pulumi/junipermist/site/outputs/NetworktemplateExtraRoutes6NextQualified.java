// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateExtraRoutes6NextQualified {
    private @Nullable Integer metric;
    private @Nullable Integer preference;

    private NetworktemplateExtraRoutes6NextQualified() {}
    public Optional<Integer> metric() {
        return Optional.ofNullable(this.metric);
    }
    public Optional<Integer> preference() {
        return Optional.ofNullable(this.preference);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateExtraRoutes6NextQualified defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer metric;
        private @Nullable Integer preference;
        public Builder() {}
        public Builder(NetworktemplateExtraRoutes6NextQualified defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.preference = defaults.preference;
        }

        @CustomType.Setter
        public Builder metric(@Nullable Integer metric) {

            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder preference(@Nullable Integer preference) {

            this.preference = preference;
            return this;
        }
        public NetworktemplateExtraRoutes6NextQualified build() {
            final var _resultValue = new NetworktemplateExtraRoutes6NextQualified();
            _resultValue.metric = metric;
            _resultValue.preference = preference;
            return _resultValue;
        }
    }
}
