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
    public sealed class SwitchSwitchMgmtProtectReCustom
    {
        /// <summary>
        /// matched dst port, "0" means any
        /// </summary>
        public readonly string? PortRange;
        /// <summary>
        /// enum: `any`, `icmp`, `tcp`, `udp`
        /// </summary>
        public readonly string? Protocol;
        public readonly ImmutableArray<string> Subnets;

        [OutputConstructor]
        private SwitchSwitchMgmtProtectReCustom(
            string? portRange,

            string? protocol,

            ImmutableArray<string> subnets)
        {
            PortRange = portRange;
            Protocol = protocol;
            Subnets = subnets;
        }
    }
}
