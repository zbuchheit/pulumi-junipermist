// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSnmpConfigV3ConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("notifies")]
        private InputList<Inputs.SwitchSnmpConfigV3ConfigNotifyArgs>? _notifies;
        public InputList<Inputs.SwitchSnmpConfigV3ConfigNotifyArgs> Notifies
        {
            get => _notifies ?? (_notifies = new InputList<Inputs.SwitchSnmpConfigV3ConfigNotifyArgs>());
            set => _notifies = value;
        }

        [Input("notifyFilters")]
        private InputList<Inputs.SwitchSnmpConfigV3ConfigNotifyFilterArgs>? _notifyFilters;
        public InputList<Inputs.SwitchSnmpConfigV3ConfigNotifyFilterArgs> NotifyFilters
        {
            get => _notifyFilters ?? (_notifyFilters = new InputList<Inputs.SwitchSnmpConfigV3ConfigNotifyFilterArgs>());
            set => _notifyFilters = value;
        }

        [Input("targetAddresses")]
        private InputList<Inputs.SwitchSnmpConfigV3ConfigTargetAddressArgs>? _targetAddresses;
        public InputList<Inputs.SwitchSnmpConfigV3ConfigTargetAddressArgs> TargetAddresses
        {
            get => _targetAddresses ?? (_targetAddresses = new InputList<Inputs.SwitchSnmpConfigV3ConfigTargetAddressArgs>());
            set => _targetAddresses = value;
        }

        [Input("targetParameters")]
        private InputList<Inputs.SwitchSnmpConfigV3ConfigTargetParameterArgs>? _targetParameters;
        public InputList<Inputs.SwitchSnmpConfigV3ConfigTargetParameterArgs> TargetParameters
        {
            get => _targetParameters ?? (_targetParameters = new InputList<Inputs.SwitchSnmpConfigV3ConfigTargetParameterArgs>());
            set => _targetParameters = value;
        }

        [Input("usm")]
        public Input<Inputs.SwitchSnmpConfigV3ConfigUsmArgs>? Usm { get; set; }

        [Input("vacm")]
        public Input<Inputs.SwitchSnmpConfigV3ConfigVacmArgs>? Vacm { get; set; }

        public SwitchSnmpConfigV3ConfigArgs()
        {
        }
        public static new SwitchSnmpConfigV3ConfigArgs Empty => new SwitchSnmpConfigV3ConfigArgs();
    }
}
