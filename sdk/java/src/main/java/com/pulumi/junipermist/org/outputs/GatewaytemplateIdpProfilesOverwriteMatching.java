// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateIdpProfilesOverwriteMatching {
    private @Nullable List<String> attackNames;
    private @Nullable List<String> dstSubnets;
    private @Nullable List<String> severities;

    private GatewaytemplateIdpProfilesOverwriteMatching() {}
    public List<String> attackNames() {
        return this.attackNames == null ? List.of() : this.attackNames;
    }
    public List<String> dstSubnets() {
        return this.dstSubnets == null ? List.of() : this.dstSubnets;
    }
    public List<String> severities() {
        return this.severities == null ? List.of() : this.severities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateIdpProfilesOverwriteMatching defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> attackNames;
        private @Nullable List<String> dstSubnets;
        private @Nullable List<String> severities;
        public Builder() {}
        public Builder(GatewaytemplateIdpProfilesOverwriteMatching defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attackNames = defaults.attackNames;
    	      this.dstSubnets = defaults.dstSubnets;
    	      this.severities = defaults.severities;
        }

        @CustomType.Setter
        public Builder attackNames(@Nullable List<String> attackNames) {

            this.attackNames = attackNames;
            return this;
        }
        public Builder attackNames(String... attackNames) {
            return attackNames(List.of(attackNames));
        }
        @CustomType.Setter
        public Builder dstSubnets(@Nullable List<String> dstSubnets) {

            this.dstSubnets = dstSubnets;
            return this;
        }
        public Builder dstSubnets(String... dstSubnets) {
            return dstSubnets(List.of(dstSubnets));
        }
        @CustomType.Setter
        public Builder severities(@Nullable List<String> severities) {

            this.severities = severities;
            return this;
        }
        public Builder severities(String... severities) {
            return severities(List.of(severities));
        }
        public GatewaytemplateIdpProfilesOverwriteMatching build() {
            final var _resultValue = new GatewaytemplateIdpProfilesOverwriteMatching();
            _resultValue.attackNames = attackNames;
            _resultValue.dstSubnets = dstSubnets;
            _resultValue.severities = severities;
            return _resultValue;
        }
    }
}
