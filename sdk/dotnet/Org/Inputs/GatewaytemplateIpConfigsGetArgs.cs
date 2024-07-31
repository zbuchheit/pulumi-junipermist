// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateIpConfigsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        [Input("netmask", required: true)]
        public Input<string> Netmask { get; set; } = null!;

        [Input("secondaryIps")]
        private InputList<string>? _secondaryIps;

        /// <summary>
        /// optional list of secondary IPs in CIDR format
        /// </summary>
        public InputList<string> SecondaryIps
        {
            get => _secondaryIps ?? (_secondaryIps = new InputList<string>());
            set => _secondaryIps = value;
        }

        /// <summary>
        /// enum: `dhcp`, `static`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GatewaytemplateIpConfigsGetArgs()
        {
        }
        public static new GatewaytemplateIpConfigsGetArgs Empty => new GatewaytemplateIpConfigsGetArgs();
    }
}