// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSnmpConfigV3ConfigVacmAccessGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        [Input("prefixLists")]
        private InputList<Inputs.SwitchSnmpConfigV3ConfigVacmAccessPrefixListGetArgs>? _prefixLists;
        public InputList<Inputs.SwitchSnmpConfigV3ConfigVacmAccessPrefixListGetArgs> PrefixLists
        {
            get => _prefixLists ?? (_prefixLists = new InputList<Inputs.SwitchSnmpConfigV3ConfigVacmAccessPrefixListGetArgs>());
            set => _prefixLists = value;
        }

        public SwitchSnmpConfigV3ConfigVacmAccessGetArgs()
        {
        }
        public static new SwitchSnmpConfigV3ConfigVacmAccessGetArgs Empty => new SwitchSnmpConfigV3ConfigVacmAccessGetArgs();
    }
}
