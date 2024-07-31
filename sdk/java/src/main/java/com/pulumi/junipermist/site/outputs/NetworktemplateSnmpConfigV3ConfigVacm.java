// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.NetworktemplateSnmpConfigV3ConfigVacmAccess;
import com.pulumi.junipermist.site.outputs.NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigV3ConfigVacm {
    private @Nullable List<NetworktemplateSnmpConfigV3ConfigVacmAccess> accesses;
    private @Nullable NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup securityToGroup;

    private NetworktemplateSnmpConfigV3ConfigVacm() {}
    public List<NetworktemplateSnmpConfigV3ConfigVacmAccess> accesses() {
        return this.accesses == null ? List.of() : this.accesses;
    }
    public Optional<NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup> securityToGroup() {
        return Optional.ofNullable(this.securityToGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigV3ConfigVacm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NetworktemplateSnmpConfigV3ConfigVacmAccess> accesses;
        private @Nullable NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup securityToGroup;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigV3ConfigVacm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.securityToGroup = defaults.securityToGroup;
        }

        @CustomType.Setter
        public Builder accesses(@Nullable List<NetworktemplateSnmpConfigV3ConfigVacmAccess> accesses) {

            this.accesses = accesses;
            return this;
        }
        public Builder accesses(NetworktemplateSnmpConfigV3ConfigVacmAccess... accesses) {
            return accesses(List.of(accesses));
        }
        @CustomType.Setter
        public Builder securityToGroup(@Nullable NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup securityToGroup) {

            this.securityToGroup = securityToGroup;
            return this;
        }
        public NetworktemplateSnmpConfigV3ConfigVacm build() {
            final var _resultValue = new NetworktemplateSnmpConfigV3ConfigVacm();
            _resultValue.accesses = accesses;
            _resultValue.securityToGroup = securityToGroup;
            return _resultValue;
        }
    }
}
