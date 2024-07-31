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
    public sealed class GetApStatsDeviceApStatIpConfigResult
    {
        /// <summary>
        /// if `type`==`static`
        /// </summary>
        public readonly ImmutableArray<string> Dns;
        /// <summary>
        /// required if `type`==`static`
        /// </summary>
        public readonly ImmutableArray<string> DnsSuffixes;
        /// <summary>
        /// required if `type`==`static`
        /// </summary>
        public readonly string Gateway;
        public readonly string Gateway6;
        /// <summary>
        /// required if `type`==`static`
        /// </summary>
        public readonly string Ip;
        public readonly string Ip6;
        public readonly int Mtu;
        /// <summary>
        /// required if `type`==`static`
        /// </summary>
        public readonly string Netmask;
        public readonly string Netmask6;
        public readonly string Type;
        public readonly string Type6;
        /// <summary>
        /// management vlan id, default is 1 (untagged)
        /// </summary>
        public readonly int VlanId;

        [OutputConstructor]
        private GetApStatsDeviceApStatIpConfigResult(
            ImmutableArray<string> dns,

            ImmutableArray<string> dnsSuffixes,

            string gateway,

            string gateway6,

            string ip,

            string ip6,

            int mtu,

            string netmask,

            string netmask6,

            string type,

            string type6,

            int vlanId)
        {
            Dns = dns;
            DnsSuffixes = dnsSuffixes;
            Gateway = gateway;
            Gateway6 = gateway6;
            Ip = ip;
            Ip6 = ip6;
            Mtu = mtu;
            Netmask = netmask;
            Netmask6 = netmask6;
            Type = type;
            Type6 = type6;
            VlanId = vlanId;
        }
    }
}
