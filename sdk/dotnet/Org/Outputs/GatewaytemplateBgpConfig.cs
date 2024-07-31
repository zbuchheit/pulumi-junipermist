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
    public sealed class GatewaytemplateBgpConfig
    {
        public readonly string? AuthKey;
        /// <summary>
        /// when bfd_multiplier is configured alone. Default:
        ///   * 1000 if `type`==`external`
        ///   * 350 `type`==`internal`
        /// </summary>
        public readonly int? BfdMinimumInterval;
        /// <summary>
        /// when bfd_minimum_interval_is_configured alone
        /// </summary>
        public readonly int? BfdMultiplier;
        public readonly ImmutableArray<Outputs.GatewaytemplateBgpConfigCommunity> Communities;
        /// <summary>
        /// BFD provides faster path failure detection and is enabled by default
        /// </summary>
        public readonly bool? DisableBfd;
        public readonly string? Export;
        /// <summary>
        /// default export policies if no per-neighbor policies defined
        /// </summary>
        public readonly string? ExportPolicy;
        /// <summary>
        /// by default, either inet/net6 unicast depending on neighbor IP family (v4 or v6)
        /// for v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
        /// </summary>
        public readonly bool? ExtendedV4Nexthop;
        /// <summary>
        /// `0` means disable
        /// </summary>
        public readonly int? GracefulRestartTime;
        public readonly int? HoldTime;
        public readonly string? Import;
        /// <summary>
        /// default import policies if no per-neighbor policies defined
        /// </summary>
        public readonly string? ImportPolicy;
        public readonly int? LocalAs;
        public readonly int? NeighborAs;
        /// <summary>
        /// if per-neighbor as is desired. Property key is the neighbor address
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewaytemplateBgpConfigNeighbors>? Neighbors;
        /// <summary>
        /// if `type`!=`external`or `via`==`wan`networks where we expect BGP neighbor to connect to/from
        /// </summary>
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// by default, we'll re-advertise all learned BGP routers toward overlay
        /// </summary>
        public readonly bool? NoReadvertiseToOverlay;
        /// <summary>
        /// enum: `external`, `internal`
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// network name. enum: `lan`, `vpn`, `wan`
        /// </summary>
        public readonly string? Via;
        public readonly string? VpnName;
        /// <summary>
        /// if `via`==`wan`
        /// </summary>
        public readonly string? WanName;

        [OutputConstructor]
        private GatewaytemplateBgpConfig(
            string? authKey,

            int? bfdMinimumInterval,

            int? bfdMultiplier,

            ImmutableArray<Outputs.GatewaytemplateBgpConfigCommunity> communities,

            bool? disableBfd,

            string? export,

            string? exportPolicy,

            bool? extendedV4Nexthop,

            int? gracefulRestartTime,

            int? holdTime,

            string? import,

            string? importPolicy,

            int? localAs,

            int? neighborAs,

            ImmutableDictionary<string, Outputs.GatewaytemplateBgpConfigNeighbors>? neighbors,

            ImmutableArray<string> networks,

            bool? noReadvertiseToOverlay,

            string? type,

            string? via,

            string? vpnName,

            string? wanName)
        {
            AuthKey = authKey;
            BfdMinimumInterval = bfdMinimumInterval;
            BfdMultiplier = bfdMultiplier;
            Communities = communities;
            DisableBfd = disableBfd;
            Export = export;
            ExportPolicy = exportPolicy;
            ExtendedV4Nexthop = extendedV4Nexthop;
            GracefulRestartTime = gracefulRestartTime;
            HoldTime = holdTime;
            Import = import;
            ImportPolicy = importPolicy;
            LocalAs = localAs;
            NeighborAs = neighborAs;
            Neighbors = neighbors;
            Networks = networks;
            NoReadvertiseToOverlay = noReadvertiseToOverlay;
            Type = type;
            Via = via;
            VpnName = vpnName;
            WanName = wanName;
        }
    }
}
