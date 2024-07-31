// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WxtagSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// matched destination port, "0" means any
        /// </summary>
        [Input("portRange")]
        public Input<string>? PortRange { get; set; }

        /// <summary>
        /// tcp / udp / icmp / gre / any / ":protocol_number", `protocol_number` is between 1-254
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("subnets", required: true)]
        private InputList<string>? _subnets;

        /// <summary>
        /// matched destination subnets and/or IP Addresses
        /// </summary>
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        public WxtagSpecGetArgs()
        {
        }
        public static new WxtagSpecGetArgs Empty => new WxtagSpecGetArgs();
    }
}
