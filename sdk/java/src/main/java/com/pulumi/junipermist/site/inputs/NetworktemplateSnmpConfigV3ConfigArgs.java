// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigV3ConfigNotifyArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigV3ConfigTargetAddressArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigV3ConfigTargetParameterArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigV3ConfigUsmArgs;
import com.pulumi.junipermist.site.inputs.NetworktemplateSnmpConfigV3ConfigVacmArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSnmpConfigV3ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSnmpConfigV3ConfigArgs Empty = new NetworktemplateSnmpConfigV3ConfigArgs();

    @Import(name="notifies")
    private @Nullable Output<List<NetworktemplateSnmpConfigV3ConfigNotifyArgs>> notifies;

    public Optional<Output<List<NetworktemplateSnmpConfigV3ConfigNotifyArgs>>> notifies() {
        return Optional.ofNullable(this.notifies);
    }

    @Import(name="notifyFilters")
    private @Nullable Output<List<NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs>> notifyFilters;

    public Optional<Output<List<NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs>>> notifyFilters() {
        return Optional.ofNullable(this.notifyFilters);
    }

    @Import(name="targetAddresses")
    private @Nullable Output<List<NetworktemplateSnmpConfigV3ConfigTargetAddressArgs>> targetAddresses;

    public Optional<Output<List<NetworktemplateSnmpConfigV3ConfigTargetAddressArgs>>> targetAddresses() {
        return Optional.ofNullable(this.targetAddresses);
    }

    @Import(name="targetParameters")
    private @Nullable Output<List<NetworktemplateSnmpConfigV3ConfigTargetParameterArgs>> targetParameters;

    public Optional<Output<List<NetworktemplateSnmpConfigV3ConfigTargetParameterArgs>>> targetParameters() {
        return Optional.ofNullable(this.targetParameters);
    }

    @Import(name="usm")
    private @Nullable Output<NetworktemplateSnmpConfigV3ConfigUsmArgs> usm;

    public Optional<Output<NetworktemplateSnmpConfigV3ConfigUsmArgs>> usm() {
        return Optional.ofNullable(this.usm);
    }

    @Import(name="vacm")
    private @Nullable Output<NetworktemplateSnmpConfigV3ConfigVacmArgs> vacm;

    public Optional<Output<NetworktemplateSnmpConfigV3ConfigVacmArgs>> vacm() {
        return Optional.ofNullable(this.vacm);
    }

    private NetworktemplateSnmpConfigV3ConfigArgs() {}

    private NetworktemplateSnmpConfigV3ConfigArgs(NetworktemplateSnmpConfigV3ConfigArgs $) {
        this.notifies = $.notifies;
        this.notifyFilters = $.notifyFilters;
        this.targetAddresses = $.targetAddresses;
        this.targetParameters = $.targetParameters;
        this.usm = $.usm;
        this.vacm = $.vacm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateSnmpConfigV3ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSnmpConfigV3ConfigArgs $;

        public Builder() {
            $ = new NetworktemplateSnmpConfigV3ConfigArgs();
        }

        public Builder(NetworktemplateSnmpConfigV3ConfigArgs defaults) {
            $ = new NetworktemplateSnmpConfigV3ConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder notifies(@Nullable Output<List<NetworktemplateSnmpConfigV3ConfigNotifyArgs>> notifies) {
            $.notifies = notifies;
            return this;
        }

        public Builder notifies(List<NetworktemplateSnmpConfigV3ConfigNotifyArgs> notifies) {
            return notifies(Output.of(notifies));
        }

        public Builder notifies(NetworktemplateSnmpConfigV3ConfigNotifyArgs... notifies) {
            return notifies(List.of(notifies));
        }

        public Builder notifyFilters(@Nullable Output<List<NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs>> notifyFilters) {
            $.notifyFilters = notifyFilters;
            return this;
        }

        public Builder notifyFilters(List<NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs> notifyFilters) {
            return notifyFilters(Output.of(notifyFilters));
        }

        public Builder notifyFilters(NetworktemplateSnmpConfigV3ConfigNotifyFilterArgs... notifyFilters) {
            return notifyFilters(List.of(notifyFilters));
        }

        public Builder targetAddresses(@Nullable Output<List<NetworktemplateSnmpConfigV3ConfigTargetAddressArgs>> targetAddresses) {
            $.targetAddresses = targetAddresses;
            return this;
        }

        public Builder targetAddresses(List<NetworktemplateSnmpConfigV3ConfigTargetAddressArgs> targetAddresses) {
            return targetAddresses(Output.of(targetAddresses));
        }

        public Builder targetAddresses(NetworktemplateSnmpConfigV3ConfigTargetAddressArgs... targetAddresses) {
            return targetAddresses(List.of(targetAddresses));
        }

        public Builder targetParameters(@Nullable Output<List<NetworktemplateSnmpConfigV3ConfigTargetParameterArgs>> targetParameters) {
            $.targetParameters = targetParameters;
            return this;
        }

        public Builder targetParameters(List<NetworktemplateSnmpConfigV3ConfigTargetParameterArgs> targetParameters) {
            return targetParameters(Output.of(targetParameters));
        }

        public Builder targetParameters(NetworktemplateSnmpConfigV3ConfigTargetParameterArgs... targetParameters) {
            return targetParameters(List.of(targetParameters));
        }

        public Builder usm(@Nullable Output<NetworktemplateSnmpConfigV3ConfigUsmArgs> usm) {
            $.usm = usm;
            return this;
        }

        public Builder usm(NetworktemplateSnmpConfigV3ConfigUsmArgs usm) {
            return usm(Output.of(usm));
        }

        public Builder vacm(@Nullable Output<NetworktemplateSnmpConfigV3ConfigVacmArgs> vacm) {
            $.vacm = vacm;
            return this;
        }

        public Builder vacm(NetworktemplateSnmpConfigV3ConfigVacmArgs vacm) {
            return vacm(Output.of(vacm));
        }

        public NetworktemplateSnmpConfigV3ConfigArgs build() {
            return $;
        }
    }

}
