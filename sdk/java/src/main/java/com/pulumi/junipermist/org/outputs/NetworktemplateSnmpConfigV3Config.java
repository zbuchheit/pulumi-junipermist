// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.NetworktemplateSnmpConfigV3ConfigNotify;
import com.pulumi.junipermist.org.outputs.NetworktemplateSnmpConfigV3ConfigNotifyFilter;
import com.pulumi.junipermist.org.outputs.NetworktemplateSnmpConfigV3ConfigTargetAddress;
import com.pulumi.junipermist.org.outputs.NetworktemplateSnmpConfigV3ConfigTargetParameter;
import com.pulumi.junipermist.org.outputs.NetworktemplateSnmpConfigV3ConfigUsm;
import com.pulumi.junipermist.org.outputs.NetworktemplateSnmpConfigV3ConfigVacm;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigV3Config {
    private @Nullable List<NetworktemplateSnmpConfigV3ConfigNotify> notifies;
    private @Nullable List<NetworktemplateSnmpConfigV3ConfigNotifyFilter> notifyFilters;
    private @Nullable List<NetworktemplateSnmpConfigV3ConfigTargetAddress> targetAddresses;
    private @Nullable List<NetworktemplateSnmpConfigV3ConfigTargetParameter> targetParameters;
    private @Nullable NetworktemplateSnmpConfigV3ConfigUsm usm;
    private @Nullable NetworktemplateSnmpConfigV3ConfigVacm vacm;

    private NetworktemplateSnmpConfigV3Config() {}
    public List<NetworktemplateSnmpConfigV3ConfigNotify> notifies() {
        return this.notifies == null ? List.of() : this.notifies;
    }
    public List<NetworktemplateSnmpConfigV3ConfigNotifyFilter> notifyFilters() {
        return this.notifyFilters == null ? List.of() : this.notifyFilters;
    }
    public List<NetworktemplateSnmpConfigV3ConfigTargetAddress> targetAddresses() {
        return this.targetAddresses == null ? List.of() : this.targetAddresses;
    }
    public List<NetworktemplateSnmpConfigV3ConfigTargetParameter> targetParameters() {
        return this.targetParameters == null ? List.of() : this.targetParameters;
    }
    public Optional<NetworktemplateSnmpConfigV3ConfigUsm> usm() {
        return Optional.ofNullable(this.usm);
    }
    public Optional<NetworktemplateSnmpConfigV3ConfigVacm> vacm() {
        return Optional.ofNullable(this.vacm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigV3Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NetworktemplateSnmpConfigV3ConfigNotify> notifies;
        private @Nullable List<NetworktemplateSnmpConfigV3ConfigNotifyFilter> notifyFilters;
        private @Nullable List<NetworktemplateSnmpConfigV3ConfigTargetAddress> targetAddresses;
        private @Nullable List<NetworktemplateSnmpConfigV3ConfigTargetParameter> targetParameters;
        private @Nullable NetworktemplateSnmpConfigV3ConfigUsm usm;
        private @Nullable NetworktemplateSnmpConfigV3ConfigVacm vacm;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigV3Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notifies = defaults.notifies;
    	      this.notifyFilters = defaults.notifyFilters;
    	      this.targetAddresses = defaults.targetAddresses;
    	      this.targetParameters = defaults.targetParameters;
    	      this.usm = defaults.usm;
    	      this.vacm = defaults.vacm;
        }

        @CustomType.Setter
        public Builder notifies(@Nullable List<NetworktemplateSnmpConfigV3ConfigNotify> notifies) {

            this.notifies = notifies;
            return this;
        }
        public Builder notifies(NetworktemplateSnmpConfigV3ConfigNotify... notifies) {
            return notifies(List.of(notifies));
        }
        @CustomType.Setter
        public Builder notifyFilters(@Nullable List<NetworktemplateSnmpConfigV3ConfigNotifyFilter> notifyFilters) {

            this.notifyFilters = notifyFilters;
            return this;
        }
        public Builder notifyFilters(NetworktemplateSnmpConfigV3ConfigNotifyFilter... notifyFilters) {
            return notifyFilters(List.of(notifyFilters));
        }
        @CustomType.Setter
        public Builder targetAddresses(@Nullable List<NetworktemplateSnmpConfigV3ConfigTargetAddress> targetAddresses) {

            this.targetAddresses = targetAddresses;
            return this;
        }
        public Builder targetAddresses(NetworktemplateSnmpConfigV3ConfigTargetAddress... targetAddresses) {
            return targetAddresses(List.of(targetAddresses));
        }
        @CustomType.Setter
        public Builder targetParameters(@Nullable List<NetworktemplateSnmpConfigV3ConfigTargetParameter> targetParameters) {

            this.targetParameters = targetParameters;
            return this;
        }
        public Builder targetParameters(NetworktemplateSnmpConfigV3ConfigTargetParameter... targetParameters) {
            return targetParameters(List.of(targetParameters));
        }
        @CustomType.Setter
        public Builder usm(@Nullable NetworktemplateSnmpConfigV3ConfigUsm usm) {

            this.usm = usm;
            return this;
        }
        @CustomType.Setter
        public Builder vacm(@Nullable NetworktemplateSnmpConfigV3ConfigVacm vacm) {

            this.vacm = vacm;
            return this;
        }
        public NetworktemplateSnmpConfigV3Config build() {
            final var _resultValue = new NetworktemplateSnmpConfigV3Config();
            _resultValue.notifies = notifies;
            _resultValue.notifyFilters = notifyFilters;
            _resultValue.targetAddresses = targetAddresses;
            _resultValue.targetParameters = targetParameters;
            _resultValue.usm = usm;
            _resultValue.vacm = vacm;
            return _resultValue;
        }
    }
}
