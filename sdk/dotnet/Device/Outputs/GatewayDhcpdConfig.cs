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
    public sealed class GatewayDhcpdConfig
    {
        public readonly ImmutableDictionary<string, Outputs.GatewayDhcpdConfigConfig>? Config;
        /// <summary>
        /// if set to `true`, enable the DHCP server
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private GatewayDhcpdConfig(
            ImmutableDictionary<string, Outputs.GatewayDhcpdConfigConfig>? config,

            bool? enabled)
        {
            Config = config;
            Enabled = enabled;
        }
    }
}
