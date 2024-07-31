// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayTunnelConfigsIpsecProposalGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `md5`, `sha1`, `sha2`
        /// </summary>
        [Input("authAlgo")]
        public Input<string>? AuthAlgo { get; set; }

        /// <summary>
        /// Only if `provider`== `custom-ipsec`. enum:
        ///   * 1
        ///   * 2 (1024-bit)
        ///   * 5
        ///   * 14 (default, 2048-bit)
        ///   * 15 (3072-bit)
        ///   * 16 (4096-bit)
        ///   * 19 (256-bit ECP)
        ///   * 20 (384-bit ECP)
        ///   * 21 (521-bit ECP)
        ///   * 24 (2048-bit ECP)
        /// </summary>
        [Input("dhGroup")]
        public Input<string>? DhGroup { get; set; }

        /// <summary>
        /// enum: `3des`, `aes128`, `aes256`, `aes_gcm128`, `aes_gcm256`
        /// </summary>
        [Input("encAlgo")]
        public Input<string>? EncAlgo { get; set; }

        public GatewayTunnelConfigsIpsecProposalGetArgs()
        {
        }
        public static new GatewayTunnelConfigsIpsecProposalGetArgs Empty => new GatewayTunnelConfigsIpsecProposalGetArgs();
    }
}
