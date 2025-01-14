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
    public sealed class GatewaytemplatePortConfigIpConfig
    {
        /// <summary>
        /// except for out-of_band interface (vme/em0/fxp0)
        /// </summary>
        public readonly ImmutableArray<string> Dns;
        /// <summary>
        /// except for out-of_band interface (vme/em0/fxp0)
        /// </summary>
        public readonly ImmutableArray<string> DnsSuffixes;
        /// <summary>
        /// except for out-of_band interface (vme/em0/fxp0)
        /// </summary>
        public readonly string? Gateway;
        public readonly string? Ip;
        /// <summary>
        /// used only if `subnet` is not specified in `networks`
        /// </summary>
        public readonly string? Netmask;
        /// <summary>
        /// optional, the network to be used for mgmt
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// if `type`==`pppoe`
        /// </summary>
        public readonly string? PoserPassword;
        /// <summary>
        /// if `type`==`pppoe`. enum: `chap`, `none`, `pap`
        /// </summary>
        public readonly string? PppoeAuth;
        /// <summary>
        /// if `type`==`pppoe`
        /// </summary>
        public readonly string? PppoeUsername;
        /// <summary>
        /// enum: `dhcp`, `pppoe`, `static`
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private GatewaytemplatePortConfigIpConfig(
            ImmutableArray<string> dns,

            ImmutableArray<string> dnsSuffixes,

            string? gateway,

            string? ip,

            string? netmask,

            string? network,

            string? poserPassword,

            string? pppoeAuth,

            string? pppoeUsername,

            string? type)
        {
            Dns = dns;
            DnsSuffixes = dnsSuffixes;
            Gateway = gateway;
            Ip = ip;
            Netmask = netmask;
            Network = network;
            PoserPassword = poserPassword;
            PppoeAuth = pppoeAuth;
            PppoeUsername = pppoeUsername;
            Type = type;
        }
    }
}
