// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingSyntheticTestArgs : global::Pulumi.ResourceArgs
    {
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("vlans")]
        private InputList<Inputs.SettingSyntheticTestVlanArgs>? _vlans;
        public InputList<Inputs.SettingSyntheticTestVlanArgs> Vlans
        {
            get => _vlans ?? (_vlans = new InputList<Inputs.SettingSyntheticTestVlanArgs>());
            set => _vlans = value;
        }

        [Input("wanSpeedtest")]
        public Input<Inputs.SettingSyntheticTestWanSpeedtestArgs>? WanSpeedtest { get; set; }

        public SettingSyntheticTestArgs()
        {
        }
        public static new SettingSyntheticTestArgs Empty => new SettingSyntheticTestArgs();
    }
}
