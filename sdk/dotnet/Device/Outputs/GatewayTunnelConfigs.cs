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
    public sealed class GatewayTunnelConfigs
    {
        public readonly Outputs.GatewayTunnelConfigsAutoProvision? AutoProvision;
        /// <summary>
        /// Only if `provider`== `custom-ipsec`
        /// </summary>
        public readonly int? IkeLifetime;
        /// <summary>
        /// Only if `provider`== `custom-ipsec`. enum: `aggressive`, `main`
        /// </summary>
        public readonly string? IkeMode;
        /// <summary>
        /// if `provider`== `custom-ipsec`
        /// </summary>
        public readonly ImmutableArray<Outputs.GatewayTunnelConfigsIkeProposal> IkeProposals;
        /// <summary>
        /// if `provider`== `custom-ipsec`
        /// </summary>
        public readonly int? IpsecLifetime;
        /// <summary>
        /// Only if  `provider`== `custom-ipsec`
        /// </summary>
        public readonly ImmutableArray<Outputs.GatewayTunnelConfigsIpsecProposal> IpsecProposals;
        /// <summary>
        /// Only if:
        ///   * `provider`== `zscaler-ipsec`
        ///   * `provider`==`jse-ipsec`
        ///   * `provider`== `custom-ipsec`
        /// </summary>
        public readonly string? LocalId;
        /// <summary>
        /// enum: `active-active`, `active-standby`
        /// </summary>
        public readonly string? Mode;
        public readonly Outputs.GatewayTunnelConfigsPrimary? Primary;
        /// <summary>
        /// Only if `provider`== `custom-ipsec`
        /// </summary>
        public readonly Outputs.GatewayTunnelConfigsProbe? Probe;
        /// <summary>
        /// Only if `provider`== `custom-ipsec`. enum: `gre`, `ipsec`
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// enum: `custom-ipsec`, `customer-gre`, `jse-ipsec`, `zscaler-gre`, `zscaler-ipsec`
        /// </summary>
        public readonly string? Provider;
        /// <summary>
        /// Only if:
        ///   * `provider`== `zscaler-ipsec`
        ///   * `provider`==`jse-ipsec`
        ///   * `provider`== `custom-ipsec`
        /// </summary>
        public readonly string? Psk;
        public readonly Outputs.GatewayTunnelConfigsSecondary? Secondary;
        /// <summary>
        /// Only if `provider`== `custom-gre` or `provider`== `custom-ipsec`. enum: `1`, `2`
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private GatewayTunnelConfigs(
            Outputs.GatewayTunnelConfigsAutoProvision? autoProvision,

            int? ikeLifetime,

            string? ikeMode,

            ImmutableArray<Outputs.GatewayTunnelConfigsIkeProposal> ikeProposals,

            int? ipsecLifetime,

            ImmutableArray<Outputs.GatewayTunnelConfigsIpsecProposal> ipsecProposals,

            string? localId,

            string? mode,

            Outputs.GatewayTunnelConfigsPrimary? primary,

            Outputs.GatewayTunnelConfigsProbe? probe,

            string? protocol,

            string? provider,

            string? psk,

            Outputs.GatewayTunnelConfigsSecondary? secondary,

            string? version)
        {
            AutoProvision = autoProvision;
            IkeLifetime = ikeLifetime;
            IkeMode = ikeMode;
            IkeProposals = ikeProposals;
            IpsecLifetime = ipsecLifetime;
            IpsecProposals = ipsecProposals;
            LocalId = localId;
            Mode = mode;
            Primary = primary;
            Probe = probe;
            Protocol = protocol;
            Provider = provider;
            Psk = psk;
            Secondary = secondary;
            Version = version;
        }
    }
}
