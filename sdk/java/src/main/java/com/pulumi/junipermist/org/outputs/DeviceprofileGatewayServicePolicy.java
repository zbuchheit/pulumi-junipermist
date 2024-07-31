// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.DeviceprofileGatewayServicePolicyAppqoe;
import com.pulumi.junipermist.org.outputs.DeviceprofileGatewayServicePolicyEwf;
import com.pulumi.junipermist.org.outputs.DeviceprofileGatewayServicePolicyIdp;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileGatewayServicePolicy {
    /**
     * @return enum: `allow`, `deny`
     * 
     */
    private @Nullable String action;
    /**
     * @return For SRX Only
     * 
     */
    private @Nullable DeviceprofileGatewayServicePolicyAppqoe appqoe;
    private @Nullable List<DeviceprofileGatewayServicePolicyEwf> ewfs;
    private @Nullable DeviceprofileGatewayServicePolicyIdp idp;
    /**
     * @return access within the same VRF
     * 
     */
    private @Nullable Boolean localRouting;
    private @Nullable String name;
    /**
     * @return by default, we derive all paths available and use them
     * optionally, you can customize by using `path_preference`
     * 
     */
    private @Nullable String pathPreference;
    /**
     * @return used to link servicepolicy defined at org level and overwrite some attributes
     * 
     */
    private @Nullable String servicepolicyId;
    private @Nullable List<String> services;
    private @Nullable List<String> tenants;

    private DeviceprofileGatewayServicePolicy() {}
    /**
     * @return enum: `allow`, `deny`
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return For SRX Only
     * 
     */
    public Optional<DeviceprofileGatewayServicePolicyAppqoe> appqoe() {
        return Optional.ofNullable(this.appqoe);
    }
    public List<DeviceprofileGatewayServicePolicyEwf> ewfs() {
        return this.ewfs == null ? List.of() : this.ewfs;
    }
    public Optional<DeviceprofileGatewayServicePolicyIdp> idp() {
        return Optional.ofNullable(this.idp);
    }
    /**
     * @return access within the same VRF
     * 
     */
    public Optional<Boolean> localRouting() {
        return Optional.ofNullable(this.localRouting);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return by default, we derive all paths available and use them
     * optionally, you can customize by using `path_preference`
     * 
     */
    public Optional<String> pathPreference() {
        return Optional.ofNullable(this.pathPreference);
    }
    /**
     * @return used to link servicepolicy defined at org level and overwrite some attributes
     * 
     */
    public Optional<String> servicepolicyId() {
        return Optional.ofNullable(this.servicepolicyId);
    }
    public List<String> services() {
        return this.services == null ? List.of() : this.services;
    }
    public List<String> tenants() {
        return this.tenants == null ? List.of() : this.tenants;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayServicePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable DeviceprofileGatewayServicePolicyAppqoe appqoe;
        private @Nullable List<DeviceprofileGatewayServicePolicyEwf> ewfs;
        private @Nullable DeviceprofileGatewayServicePolicyIdp idp;
        private @Nullable Boolean localRouting;
        private @Nullable String name;
        private @Nullable String pathPreference;
        private @Nullable String servicepolicyId;
        private @Nullable List<String> services;
        private @Nullable List<String> tenants;
        public Builder() {}
        public Builder(DeviceprofileGatewayServicePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.appqoe = defaults.appqoe;
    	      this.ewfs = defaults.ewfs;
    	      this.idp = defaults.idp;
    	      this.localRouting = defaults.localRouting;
    	      this.name = defaults.name;
    	      this.pathPreference = defaults.pathPreference;
    	      this.servicepolicyId = defaults.servicepolicyId;
    	      this.services = defaults.services;
    	      this.tenants = defaults.tenants;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder appqoe(@Nullable DeviceprofileGatewayServicePolicyAppqoe appqoe) {

            this.appqoe = appqoe;
            return this;
        }
        @CustomType.Setter
        public Builder ewfs(@Nullable List<DeviceprofileGatewayServicePolicyEwf> ewfs) {

            this.ewfs = ewfs;
            return this;
        }
        public Builder ewfs(DeviceprofileGatewayServicePolicyEwf... ewfs) {
            return ewfs(List.of(ewfs));
        }
        @CustomType.Setter
        public Builder idp(@Nullable DeviceprofileGatewayServicePolicyIdp idp) {

            this.idp = idp;
            return this;
        }
        @CustomType.Setter
        public Builder localRouting(@Nullable Boolean localRouting) {

            this.localRouting = localRouting;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pathPreference(@Nullable String pathPreference) {

            this.pathPreference = pathPreference;
            return this;
        }
        @CustomType.Setter
        public Builder servicepolicyId(@Nullable String servicepolicyId) {

            this.servicepolicyId = servicepolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder services(@Nullable List<String> services) {

            this.services = services;
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder tenants(@Nullable List<String> tenants) {

            this.tenants = tenants;
            return this;
        }
        public Builder tenants(String... tenants) {
            return tenants(List.of(tenants));
        }
        public DeviceprofileGatewayServicePolicy build() {
            final var _resultValue = new DeviceprofileGatewayServicePolicy();
            _resultValue.action = action;
            _resultValue.appqoe = appqoe;
            _resultValue.ewfs = ewfs;
            _resultValue.idp = idp;
            _resultValue.localRouting = localRouting;
            _resultValue.name = name;
            _resultValue.pathPreference = pathPreference;
            _resultValue.servicepolicyId = servicepolicyId;
            _resultValue.services = services;
            _resultValue.tenants = tenants;
            return _resultValue;
        }
    }
}
