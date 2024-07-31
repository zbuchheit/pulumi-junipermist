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
    public sealed class GatewayNetwork
    {
        public readonly double? CreatedTime;
        /// <summary>
        /// whether to disallow Mist Devices in the network
        /// </summary>
        public readonly bool? DisallowMistServices;
        public readonly string? Gateway;
        public readonly string? Gateway6;
        public readonly string? Id;
        public readonly Outputs.GatewayNetworkInternalAccess? InternalAccess;
        /// <summary>
        /// whether this network has direct internet access
        /// </summary>
        public readonly Outputs.GatewayNetworkInternetAccess? InternetAccess;
        /// <summary>
        /// whether to allow clients in the network to talk to each other
        /// </summary>
        public readonly bool? Isolation;
        public readonly double? ModifiedTime;
        public readonly string Name;
        public readonly string? OrgId;
        /// <summary>
        /// for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        /// </summary>
        public readonly ImmutableArray<string> RoutedForNetworks;
        public readonly string Subnet;
        public readonly string? Subnet6;
        public readonly ImmutableDictionary<string, Outputs.GatewayNetworkTenants>? Tenants;
        public readonly string? VlanId;
        /// <summary>
        /// Property key is the VPN name. Whether this network can be accessed from vpn
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewayNetworkVpnAccess>? VpnAccess;

        [OutputConstructor]
        private GatewayNetwork(
            double? createdTime,

            bool? disallowMistServices,

            string? gateway,

            string? gateway6,

            string? id,

            Outputs.GatewayNetworkInternalAccess? internalAccess,

            Outputs.GatewayNetworkInternetAccess? internetAccess,

            bool? isolation,

            double? modifiedTime,

            string name,

            string? orgId,

            ImmutableArray<string> routedForNetworks,

            string subnet,

            string? subnet6,

            ImmutableDictionary<string, Outputs.GatewayNetworkTenants>? tenants,

            string? vlanId,

            ImmutableDictionary<string, Outputs.GatewayNetworkVpnAccess>? vpnAccess)
        {
            CreatedTime = createdTime;
            DisallowMistServices = disallowMistServices;
            Gateway = gateway;
            Gateway6 = gateway6;
            Id = id;
            InternalAccess = internalAccess;
            InternetAccess = internetAccess;
            Isolation = isolation;
            ModifiedTime = modifiedTime;
            Name = name;
            OrgId = orgId;
            RoutedForNetworks = routedForNetworks;
            Subnet = subnet;
            Subnet6 = subnet6;
            Tenants = tenants;
            VlanId = vlanId;
            VpnAccess = vpnAccess;
        }
    }
}
