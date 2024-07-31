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
    public sealed class GetGatewayStatsDeviceGatewayStatApRedundancyResult
    {
        /// <summary>
        /// Property key is the node id
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetGatewayStatsDeviceGatewayStatApRedundancyModulesResult> Modules;
        public readonly int NumAps;
        public readonly int NumApsWithSwitchRedundancy;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatApRedundancyResult(
            ImmutableDictionary<string, Outputs.GetGatewayStatsDeviceGatewayStatApRedundancyModulesResult> modules,

            int numAps,

            int numApsWithSwitchRedundancy)
        {
            Modules = modules;
            NumAps = numAps;
            NumApsWithSwitchRedundancy = numApsWithSwitchRedundancy;
        }
    }
}
