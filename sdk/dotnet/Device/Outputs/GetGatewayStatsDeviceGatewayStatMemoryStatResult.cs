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
    public sealed class GetGatewayStatsDeviceGatewayStatMemoryStatResult
    {
        public readonly double Usage;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatMemoryStatResult(double usage)
        {
            Usage = usage;
        }
    }
}
