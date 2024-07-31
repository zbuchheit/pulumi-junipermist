// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileGatewayTunnelConfigsAutoProvisionPrimary {
    private @Nullable String numHosts;
    /**
     * @return optional, only needed if `vars_only`==`false`
     * 
     */
    private @Nullable List<String> wanNames;

    private DeviceprofileGatewayTunnelConfigsAutoProvisionPrimary() {}
    public Optional<String> numHosts() {
        return Optional.ofNullable(this.numHosts);
    }
    /**
     * @return optional, only needed if `vars_only`==`false`
     * 
     */
    public List<String> wanNames() {
        return this.wanNames == null ? List.of() : this.wanNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayTunnelConfigsAutoProvisionPrimary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String numHosts;
        private @Nullable List<String> wanNames;
        public Builder() {}
        public Builder(DeviceprofileGatewayTunnelConfigsAutoProvisionPrimary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numHosts = defaults.numHosts;
    	      this.wanNames = defaults.wanNames;
        }

        @CustomType.Setter
        public Builder numHosts(@Nullable String numHosts) {

            this.numHosts = numHosts;
            return this;
        }
        @CustomType.Setter
        public Builder wanNames(@Nullable List<String> wanNames) {

            this.wanNames = wanNames;
            return this;
        }
        public Builder wanNames(String... wanNames) {
            return wanNames(List.of(wanNames));
        }
        public DeviceprofileGatewayTunnelConfigsAutoProvisionPrimary build() {
            final var _resultValue = new DeviceprofileGatewayTunnelConfigsAutoProvisionPrimary();
            _resultValue.numHosts = numHosts;
            _resultValue.wanNames = wanNames;
            return _resultValue;
        }
    }
}
