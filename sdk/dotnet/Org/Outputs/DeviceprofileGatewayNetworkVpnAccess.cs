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
    public sealed class DeviceprofileGatewayNetworkVpnAccess
    {
        /// <summary>
        /// if `routed`==`true`, whether to advertise an aggregated subnet toward HUB this is useful when there are multiple networks on SPOKE's side
        /// </summary>
        public readonly string? AdvertisedSubnet;
        /// <summary>
        /// whether to allow ping from vpn into this routed network
        /// </summary>
        public readonly bool? AllowPing;
        /// <summary>
        /// Property key may be an IP/Port (i.e. "63.16.0.3:443"), or a port (i.e. ":2222")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.DeviceprofileGatewayNetworkVpnAccessDestinationNat>? DestinationNat;
        /// <summary>
        /// if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub, a subnet is required to create and advertise the route to Hub
        /// </summary>
        public readonly string? NatPool;
        /// <summary>
        /// toward LAN-side BGP peers
        /// </summary>
        public readonly bool? NoReadvertiseToLanBgp;
        /// <summary>
        /// toward LAN-side OSPF peers
        /// </summary>
        public readonly bool? NoReadvertiseToLanOspf;
        /// <summary>
        /// toward overlay
        /// how HUB should deal with routes it received from Spokes
        /// </summary>
        public readonly bool? NoReadvertiseToOverlay;
        /// <summary>
        /// by default, the routes are only readvertised toward the same vrf on spoke
        /// to allow it to be leaked to other vrfs
        /// </summary>
        public readonly ImmutableArray<string> OtherVrfs;
        /// <summary>
        /// whether this network is routable
        /// </summary>
        public readonly bool? Routed;
        /// <summary>
        /// if `routed`==`false` (usually at Spoke), but some hosts needs to be reachable from Hub
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayNetworkVpnAccessSourceNat? SourceNat;
        /// <summary>
        /// Property key may be an IP Address (i.e. "172.16.0.1"), and IP Address and Port (i.e. "172.16.0.1:8443") or a CIDR (i.e. "172.16.0.12/20")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.DeviceprofileGatewayNetworkVpnAccessStaticNat>? StaticNat;
        /// <summary>
        /// toward overlay
        /// how HUB should deal with routes it received from Spokes
        /// </summary>
        public readonly string? SummarizedSubnet;
        /// <summary>
        /// toward LAN-side BGP peers
        /// </summary>
        public readonly string? SummarizedSubnetToLanBgp;
        /// <summary>
        /// toward LAN-side OSPF peers
        /// </summary>
        public readonly string? SummarizedSubnetToLanOspf;

        [OutputConstructor]
        private DeviceprofileGatewayNetworkVpnAccess(
            string? advertisedSubnet,

            bool? allowPing,

            ImmutableDictionary<string, Outputs.DeviceprofileGatewayNetworkVpnAccessDestinationNat>? destinationNat,

            string? natPool,

            bool? noReadvertiseToLanBgp,

            bool? noReadvertiseToLanOspf,

            bool? noReadvertiseToOverlay,

            ImmutableArray<string> otherVrfs,

            bool? routed,

            Outputs.DeviceprofileGatewayNetworkVpnAccessSourceNat? sourceNat,

            ImmutableDictionary<string, Outputs.DeviceprofileGatewayNetworkVpnAccessStaticNat>? staticNat,

            string? summarizedSubnet,

            string? summarizedSubnetToLanBgp,

            string? summarizedSubnetToLanOspf)
        {
            AdvertisedSubnet = advertisedSubnet;
            AllowPing = allowPing;
            DestinationNat = destinationNat;
            NatPool = natPool;
            NoReadvertiseToLanBgp = noReadvertiseToLanBgp;
            NoReadvertiseToLanOspf = noReadvertiseToLanOspf;
            NoReadvertiseToOverlay = noReadvertiseToOverlay;
            OtherVrfs = otherVrfs;
            Routed = routed;
            SourceNat = sourceNat;
            StaticNat = staticNat;
            SummarizedSubnet = summarizedSubnet;
            SummarizedSubnetToLanBgp = summarizedSubnetToLanBgp;
            SummarizedSubnetToLanOspf = summarizedSubnetToLanOspf;
        }
    }
}
