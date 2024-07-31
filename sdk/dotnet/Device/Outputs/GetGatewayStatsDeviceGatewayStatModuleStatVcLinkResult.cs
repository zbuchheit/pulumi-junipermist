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
    public sealed class GetGatewayStatsDeviceGatewayStatModuleStatVcLinkResult
    {
        public readonly int NeighborModuleIdx;
        public readonly string NeighborPortId;
        public readonly string PortId;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatModuleStatVcLinkResult(
            int neighborModuleIdx,

            string neighborPortId,

            string portId)
        {
            NeighborModuleIdx = neighborModuleIdx;
            NeighborPortId = neighborPortId;
            PortId = portId;
        }
    }
}
