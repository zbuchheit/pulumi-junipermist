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
    public sealed class GetSwitchStatsDeviceSwitchStatModuleStatPicResult
    {
        public readonly int Index;
        public readonly string ModelNumber;
        public readonly ImmutableArray<Outputs.GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroupResult> PortGroups;

        [OutputConstructor]
        private GetSwitchStatsDeviceSwitchStatModuleStatPicResult(
            int index,

            string modelNumber,

            ImmutableArray<Outputs.GetSwitchStatsDeviceSwitchStatModuleStatPicPortGroupResult> portGroups)
        {
            Index = index;
            ModelNumber = modelNumber;
            PortGroups = portGroups;
        }
    }
}
