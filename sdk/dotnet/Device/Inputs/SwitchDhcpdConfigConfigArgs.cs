// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchDhcpdConfigConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("dnsServers")]
        private InputList<string>? _dnsServers;

        /// <summary>
        /// if `type`==`local` - optional, if not defined, system one will be used
        /// </summary>
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;

        /// <summary>
        /// if `type`==`local` - optional, if not defined, system one will be used
        /// </summary>
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        [Input("fixedBindings")]
        private InputMap<Inputs.SwitchDhcpdConfigConfigFixedBindingsArgs>? _fixedBindings;

        /// <summary>
        /// Property key is the MAC Address
        /// </summary>
        public InputMap<Inputs.SwitchDhcpdConfigConfigFixedBindingsArgs> FixedBindings
        {
            get => _fixedBindings ?? (_fixedBindings = new InputMap<Inputs.SwitchDhcpdConfigConfigFixedBindingsArgs>());
            set => _fixedBindings = value;
        }

        /// <summary>
        /// if `type`==`local` - optional, `ip` will be used if not provided
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// if `type`==`local`
        /// </summary>
        [Input("ipEnd")]
        public Input<string>? IpEnd { get; set; }

        /// <summary>
        /// if `type6`==`local`
        /// </summary>
        [Input("ipEnd6")]
        public Input<string>? IpEnd6 { get; set; }

        /// <summary>
        /// if `type`==`local`
        /// </summary>
        [Input("ipStart")]
        public Input<string>? IpStart { get; set; }

        /// <summary>
        /// if `type6`==`local`
        /// </summary>
        [Input("ipStart6")]
        public Input<string>? IpStart6 { get; set; }

        /// <summary>
        /// in seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
        /// </summary>
        [Input("leaseTime")]
        public Input<int>? LeaseTime { get; set; }

        [Input("options")]
        private InputMap<Inputs.SwitchDhcpdConfigConfigOptionsArgs>? _options;

        /// <summary>
        /// Property key is the DHCP option number
        /// </summary>
        public InputMap<Inputs.SwitchDhcpdConfigConfigOptionsArgs> Options
        {
            get => _options ?? (_options = new InputMap<Inputs.SwitchDhcpdConfigConfigOptionsArgs>());
            set => _options = value;
        }

        /// <summary>
        /// `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients, 
        /// should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
        /// </summary>
        [Input("serverIdOverride")]
        public Input<bool>? ServerIdOverride { get; set; }

        [Input("servers")]
        private InputList<string>? _servers;

        /// <summary>
        /// if `type`==`relay`
        /// </summary>
        public InputList<string> Servers
        {
            get => _servers ?? (_servers = new InputList<string>());
            set => _servers = value;
        }

        [Input("servers6s")]
        private InputList<string>? _servers6s;

        /// <summary>
        /// if `type6`==`relay`
        /// </summary>
        public InputList<string> Servers6s
        {
            get => _servers6s ?? (_servers6s = new InputList<string>());
            set => _servers6s = value;
        }

        /// <summary>
        /// enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
        /// </summary>
        [Input("type6")]
        public Input<string>? Type6 { get; set; }

        [Input("vendorEncapulated")]
        private InputMap<Inputs.SwitchDhcpdConfigConfigVendorEncapulatedArgs>? _vendorEncapulated;

        /// <summary>
        /// Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
        ///   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
        ///   * sub option code: 1-255, sub-option code'
        /// </summary>
        public InputMap<Inputs.SwitchDhcpdConfigConfigVendorEncapulatedArgs> VendorEncapulated
        {
            get => _vendorEncapulated ?? (_vendorEncapulated = new InputMap<Inputs.SwitchDhcpdConfigConfigVendorEncapulatedArgs>());
            set => _vendorEncapulated = value;
        }

        public SwitchDhcpdConfigConfigArgs()
        {
        }
        public static new SwitchDhcpdConfigConfigArgs Empty => new SwitchDhcpdConfigConfigArgs();
    }
}
