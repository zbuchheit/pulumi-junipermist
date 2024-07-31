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
    public sealed class GatewayNetworkVpnAccessStaticNat
    {
        public readonly string? InternalIp;
        public readonly string? Name;
        /// <summary>
        /// If not set, we configure the nat policies against all WAN ports for simplicity
        /// </summary>
        public readonly string? WanName;

        [OutputConstructor]
        private GatewayNetworkVpnAccessStaticNat(
            string? internalIp,

            string? name,

            string? wanName)
        {
            InternalIp = internalIp;
            Name = name;
            WanName = wanName;
        }
    }
}
