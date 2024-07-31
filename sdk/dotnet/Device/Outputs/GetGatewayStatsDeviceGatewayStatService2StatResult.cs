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
    public sealed class GetGatewayStatsDeviceGatewayStatService2StatResult
    {
        public readonly string AshVersion;
        public readonly string CiaVersion;
        public readonly string EmberVersion;
        public readonly string IpsecClientVersion;
        public readonly string MistAgentVersion;
        public readonly string PackageVersion;
        public readonly string TestingToolsVersion;
        public readonly string WheeljackVersion;

        [OutputConstructor]
        private GetGatewayStatsDeviceGatewayStatService2StatResult(
            string ashVersion,

            string ciaVersion,

            string emberVersion,

            string ipsecClientVersion,

            string mistAgentVersion,

            string packageVersion,

            string testingToolsVersion,

            string wheeljackVersion)
        {
            AshVersion = ashVersion;
            CiaVersion = ciaVersion;
            EmberVersion = emberVersion;
            IpsecClientVersion = ipsecClientVersion;
            MistAgentVersion = mistAgentVersion;
            PackageVersion = packageVersion;
            TestingToolsVersion = testingToolsVersion;
            WheeljackVersion = wheeljackVersion;
        }
    }
}
