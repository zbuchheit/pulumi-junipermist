// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigV3ConfigNotifyFilterContent {
    private @Nullable Boolean include;
    private @Nullable String oid;

    private NetworktemplateSnmpConfigV3ConfigNotifyFilterContent() {}
    public Optional<Boolean> include() {
        return Optional.ofNullable(this.include);
    }
    public Optional<String> oid() {
        return Optional.ofNullable(this.oid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigV3ConfigNotifyFilterContent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean include;
        private @Nullable String oid;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigV3ConfigNotifyFilterContent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
    	      this.oid = defaults.oid;
        }

        @CustomType.Setter
        public Builder include(@Nullable Boolean include) {

            this.include = include;
            return this;
        }
        @CustomType.Setter
        public Builder oid(@Nullable String oid) {

            this.oid = oid;
            return this;
        }
        public NetworktemplateSnmpConfigV3ConfigNotifyFilterContent build() {
            final var _resultValue = new NetworktemplateSnmpConfigV3ConfigNotifyFilterContent();
            _resultValue.include = include;
            _resultValue.oid = oid;
            return _resultValue;
        }
    }
}
