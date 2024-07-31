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
    public sealed class GatewayDhcpdConfigConfig
    {
        /// <summary>
        /// if `type`==`local` - optional, if not defined, system one will be used
        /// </summary>
        public readonly ImmutableArray<string> DnsServers;
        /// <summary>
        /// if `type`==`local` - optional, if not defined, system one will be used
        /// </summary>
        public readonly ImmutableArray<string> DnsSuffixes;
        /// <summary>
        /// Property key is the MAC Address
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewayDhcpdConfigConfigFixedBindings>? FixedBindings;
        /// <summary>
        /// if `type`==`local` - optional, `ip` will be used if not provided
        /// </summary>
        public readonly string? Gateway;
        /// <summary>
        /// if `type`==`local`
        /// </summary>
        public readonly string? IpEnd;
        /// <summary>
        /// if `type6`==`local`
        /// </summary>
        public readonly string? IpEnd6;
        /// <summary>
        /// if `type`==`local`
        /// </summary>
        public readonly string? IpStart;
        /// <summary>
        /// if `type6`==`local`
        /// </summary>
        public readonly string? IpStart6;
        /// <summary>
        /// in seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
        /// </summary>
        public readonly int? LeaseTime;
        /// <summary>
        /// Property key is the DHCP option number
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewayDhcpdConfigConfigOptions>? Options;
        /// <summary>
        /// `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients, 
        /// should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
        /// </summary>
        public readonly bool? ServerIdOverride;
        /// <summary>
        /// if `type`==`relay`
        /// </summary>
        public readonly ImmutableArray<string> Servers;
        /// <summary>
        /// if `type6`==`relay`
        /// </summary>
        public readonly ImmutableArray<string> Servers6s;
        /// <summary>
        /// enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
        /// </summary>
        public readonly string? Type6;
        /// <summary>
        /// Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
        ///   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
        ///   * sub option code: 1-255, sub-option code'
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GatewayDhcpdConfigConfigVendorEncapulated>? VendorEncapulated;

        [OutputConstructor]
        private GatewayDhcpdConfigConfig(
            ImmutableArray<string> dnsServers,

            ImmutableArray<string> dnsSuffixes,

            ImmutableDictionary<string, Outputs.GatewayDhcpdConfigConfigFixedBindings>? fixedBindings,

            string? gateway,

            string? ipEnd,

            string? ipEnd6,

            string? ipStart,

            string? ipStart6,

            int? leaseTime,

            ImmutableDictionary<string, Outputs.GatewayDhcpdConfigConfigOptions>? options,

            bool? serverIdOverride,

            ImmutableArray<string> servers,

            ImmutableArray<string> servers6s,

            string? type,

            string? type6,

            ImmutableDictionary<string, Outputs.GatewayDhcpdConfigConfigVendorEncapulated>? vendorEncapulated)
        {
            DnsServers = dnsServers;
            DnsSuffixes = dnsSuffixes;
            FixedBindings = fixedBindings;
            Gateway = gateway;
            IpEnd = ipEnd;
            IpEnd6 = ipEnd6;
            IpStart = ipStart;
            IpStart6 = ipStart6;
            LeaseTime = leaseTime;
            Options = options;
            ServerIdOverride = serverIdOverride;
            Servers = servers;
            Servers6s = servers6s;
            Type = type;
            Type6 = type6;
            VendorEncapulated = vendorEncapulated;
        }
    }
}
