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
    public sealed class DeviceprofileGatewayPathPreferencesPath
    {
        public readonly int? Cost;
        /// <summary>
        /// For SSR Only. `true`, if this specific path is undesired
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// only if `type`==`local`, if a different gateway is desired
        /// </summary>
        public readonly string? GatewayIp;
        /// <summary>
        /// only if `type`==`vpn`, if this vpn path can be used for internet
        /// </summary>
        public readonly bool? InternetAccess;
        /// <summary>
        /// required when 
        ///   * `type`==`vpn`: the name of the VPN Path to use 
        ///   * `type`==`wan`: the name of the WAN interface to use'
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// required when `type`==`local`
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// if `type`==`local`, if destination IP is to be replaced
        /// </summary>
        public readonly ImmutableArray<string> TargetIps;
        /// <summary>
        /// enum: `local`, `tunnel`, `vpn`, `wan`
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// required when`type`==`tunnel`
        /// </summary>
        public readonly string? WanName;

        [OutputConstructor]
        private DeviceprofileGatewayPathPreferencesPath(
            int? cost,

            bool? disabled,

            string? gatewayIp,

            bool? internetAccess,

            string? name,

            ImmutableArray<string> networks,

            ImmutableArray<string> targetIps,

            string? type,

            string? wanName)
        {
            Cost = cost;
            Disabled = disabled;
            GatewayIp = gatewayIp;
            InternetAccess = internetAccess;
            Name = name;
            Networks = networks;
            TargetIps = targetIps;
            Type = type;
            WanName = wanName;
        }
    }
}
