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
    public sealed class DeviceprofileGatewayTunnelConfigsIkeProposal
    {
        /// <summary>
        /// enum: `md5`, `sha1`, `sha2`
        /// </summary>
        public readonly string? AuthAlgo;
        /// <summary>
        /// enum:
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
        public readonly string? DhGroup;
        /// <summary>
        /// enum: `3des`, `aes128`, `aes256`, `aes_gcm128`, `aes_gcm256`
        /// </summary>
        public readonly string? EncAlgo;

        [OutputConstructor]
        private DeviceprofileGatewayTunnelConfigsIkeProposal(
            string? authAlgo,

            string? dhGroup,

            string? encAlgo)
        {
            AuthAlgo = authAlgo;
            DhGroup = dhGroup;
            EncAlgo = encAlgo;
        }
    }
}
