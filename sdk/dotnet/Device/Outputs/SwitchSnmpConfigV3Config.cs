// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchSnmpConfigV3Config
    {
        public readonly ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigNotify> Notifies;
        public readonly ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigNotifyFilter> NotifyFilters;
        public readonly ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigTargetAddress> TargetAddresses;
        public readonly ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigTargetParameter> TargetParameters;
        public readonly Outputs.SwitchSnmpConfigV3ConfigUsm? Usm;
        public readonly Outputs.SwitchSnmpConfigV3ConfigVacm? Vacm;

        [OutputConstructor]
        private SwitchSnmpConfigV3Config(
            ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigNotify> notifies,

            ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigNotifyFilter> notifyFilters,

            ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigTargetAddress> targetAddresses,

            ImmutableArray<Outputs.SwitchSnmpConfigV3ConfigTargetParameter> targetParameters,

            Outputs.SwitchSnmpConfigV3ConfigUsm? usm,

            Outputs.SwitchSnmpConfigV3ConfigVacm? vacm)
        {
            Notifies = notifies;
            NotifyFilters = notifyFilters;
            TargetAddresses = targetAddresses;
            TargetParameters = targetParameters;
            Usm = usm;
            Vacm = vacm;
        }
    }
}