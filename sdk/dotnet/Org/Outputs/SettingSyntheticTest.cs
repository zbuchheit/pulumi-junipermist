// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class SettingSyntheticTest
    {
        public readonly bool? Disabled;
        public readonly ImmutableArray<Outputs.SettingSyntheticTestVlan> Vlans;
        public readonly Outputs.SettingSyntheticTestWanSpeedtest? WanSpeedtest;

        [OutputConstructor]
        private SettingSyntheticTest(
            bool? disabled,

            ImmutableArray<Outputs.SettingSyntheticTestVlan> vlans,

            Outputs.SettingSyntheticTestWanSpeedtest? wanSpeedtest)
        {
            Disabled = disabled;
            Vlans = vlans;
            WanSpeedtest = wanSpeedtest;
        }
    }
}
