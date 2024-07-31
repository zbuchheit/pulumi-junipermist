// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchIpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dns")]
        private InputList<string>? _dns;
        public InputList<string> Dns
        {
            get => _dns ?? (_dns = new InputList<string>());
            set => _dns = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// used only if `subnet` is not specified in `networks`
        /// </summary>
        [Input("netmask")]
        public Input<string>? Netmask { get; set; }

        /// <summary>
        /// the network where this mgmt IP reside, this will be used as default network for outbound-ssh, dns, ntp, dns, tacplus, radius, syslog, snmp
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// enum: `dhcp`, `static`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public SwitchIpConfigGetArgs()
        {
        }
        public static new SwitchIpConfigGetArgs Empty => new SwitchIpConfigGetArgs();
    }
}
