// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayTunnelConfigsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoProvision")]
        public Input<Inputs.GatewayTunnelConfigsAutoProvisionGetArgs>? AutoProvision { get; set; }

        /// <summary>
        /// Only if `provider`== `custom-ipsec`
        /// </summary>
        [Input("ikeLifetime")]
        public Input<int>? IkeLifetime { get; set; }

        /// <summary>
        /// Only if `provider`== `custom-ipsec`. enum: `aggressive`, `main`
        /// </summary>
        [Input("ikeMode")]
        public Input<string>? IkeMode { get; set; }

        [Input("ikeProposals")]
        private InputList<Inputs.GatewayTunnelConfigsIkeProposalGetArgs>? _ikeProposals;

        /// <summary>
        /// if `provider`== `custom-ipsec`
        /// </summary>
        public InputList<Inputs.GatewayTunnelConfigsIkeProposalGetArgs> IkeProposals
        {
            get => _ikeProposals ?? (_ikeProposals = new InputList<Inputs.GatewayTunnelConfigsIkeProposalGetArgs>());
            set => _ikeProposals = value;
        }

        /// <summary>
        /// if `provider`== `custom-ipsec`
        /// </summary>
        [Input("ipsecLifetime")]
        public Input<int>? IpsecLifetime { get; set; }

        [Input("ipsecProposals")]
        private InputList<Inputs.GatewayTunnelConfigsIpsecProposalGetArgs>? _ipsecProposals;

        /// <summary>
        /// Only if  `provider`== `custom-ipsec`
        /// </summary>
        public InputList<Inputs.GatewayTunnelConfigsIpsecProposalGetArgs> IpsecProposals
        {
            get => _ipsecProposals ?? (_ipsecProposals = new InputList<Inputs.GatewayTunnelConfigsIpsecProposalGetArgs>());
            set => _ipsecProposals = value;
        }

        /// <summary>
        /// Only if:
        ///   * `provider`== `zscaler-ipsec`
        ///   * `provider`==`jse-ipsec`
        ///   * `provider`== `custom-ipsec`
        /// </summary>
        [Input("localId")]
        public Input<string>? LocalId { get; set; }

        /// <summary>
        /// enum: `active-active`, `active-standby`
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("primary")]
        public Input<Inputs.GatewayTunnelConfigsPrimaryGetArgs>? Primary { get; set; }

        /// <summary>
        /// Only if `provider`== `custom-ipsec`
        /// </summary>
        [Input("probe")]
        public Input<Inputs.GatewayTunnelConfigsProbeGetArgs>? Probe { get; set; }

        /// <summary>
        /// Only if `provider`== `custom-ipsec`. enum: `gre`, `ipsec`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// enum: `custom-ipsec`, `customer-gre`, `jse-ipsec`, `zscaler-gre`, `zscaler-ipsec`
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        [Input("psk")]
        private Input<string>? _psk;

        /// <summary>
        /// Only if:
        ///   * `provider`== `zscaler-ipsec`
        ///   * `provider`==`jse-ipsec`
        ///   * `provider`== `custom-ipsec`
        /// </summary>
        public Input<string>? Psk
        {
            get => _psk;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _psk = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("secondary")]
        public Input<Inputs.GatewayTunnelConfigsSecondaryGetArgs>? Secondary { get; set; }

        /// <summary>
        /// Only if `provider`== `custom-gre` or `provider`== `custom-ipsec`. enum: `1`, `2`
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GatewayTunnelConfigsGetArgs()
        {
        }
        public static new GatewayTunnelConfigsGetArgs Empty => new GatewayTunnelConfigsGetArgs();
    }
}
