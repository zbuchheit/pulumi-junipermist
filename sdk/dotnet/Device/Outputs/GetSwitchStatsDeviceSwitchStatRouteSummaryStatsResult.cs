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
    public sealed class GetSwitchStatsDeviceSwitchStatRouteSummaryStatsResult
    {
        public readonly int FibRoutes;
        public readonly int MaxUnicastRoutesSupported;
        public readonly int RibRoutes;
        public readonly int TotalRoutes;

        [OutputConstructor]
        private GetSwitchStatsDeviceSwitchStatRouteSummaryStatsResult(
            int fibRoutes,

            int maxUnicastRoutesSupported,

            int ribRoutes,

            int totalRoutes)
        {
            FibRoutes = fibRoutes;
            MaxUnicastRoutesSupported = maxUnicastRoutesSupported;
            RibRoutes = ribRoutes;
            TotalRoutes = totalRoutes;
        }
    }
}
