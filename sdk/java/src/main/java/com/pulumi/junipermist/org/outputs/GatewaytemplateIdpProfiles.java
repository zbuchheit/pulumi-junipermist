// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.GatewaytemplateIdpProfilesOverwrite;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateIdpProfiles {
    /**
     * @return enum: `critical`, `standard`, `strict`
     * 
     */
    private @Nullable String baseProfile;
    private @Nullable String name;
    private @Nullable String orgId;
    private @Nullable List<GatewaytemplateIdpProfilesOverwrite> overwrites;

    private GatewaytemplateIdpProfiles() {}
    /**
     * @return enum: `critical`, `standard`, `strict`
     * 
     */
    public Optional<String> baseProfile() {
        return Optional.ofNullable(this.baseProfile);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    public List<GatewaytemplateIdpProfilesOverwrite> overwrites() {
        return this.overwrites == null ? List.of() : this.overwrites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateIdpProfiles defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String baseProfile;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable List<GatewaytemplateIdpProfilesOverwrite> overwrites;
        public Builder() {}
        public Builder(GatewaytemplateIdpProfiles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseProfile = defaults.baseProfile;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.overwrites = defaults.overwrites;
        }

        @CustomType.Setter
        public Builder baseProfile(@Nullable String baseProfile) {

            this.baseProfile = baseProfile;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder overwrites(@Nullable List<GatewaytemplateIdpProfilesOverwrite> overwrites) {

            this.overwrites = overwrites;
            return this;
        }
        public Builder overwrites(GatewaytemplateIdpProfilesOverwrite... overwrites) {
            return overwrites(List.of(overwrites));
        }
        public GatewaytemplateIdpProfiles build() {
            final var _resultValue = new GatewaytemplateIdpProfiles();
            _resultValue.baseProfile = baseProfile;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.overwrites = overwrites;
            return _resultValue;
        }
    }
}
