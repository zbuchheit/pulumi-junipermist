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
    public sealed class GatewaytemplateTunnelConfigsAutoProvisionPrimary
    {
        public readonly string? NumHosts;
        /// <summary>
        /// optional, only needed if `vars_only`==`false`
        /// </summary>
        public readonly ImmutableArray<string> WanNames;

        [OutputConstructor]
        private GatewaytemplateTunnelConfigsAutoProvisionPrimary(
            string? numHosts,

            ImmutableArray<string> wanNames)
        {
            NumHosts = numHosts;
            WanNames = wanNames;
        }
    }
}
