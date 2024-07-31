// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSwitchMgmtProtectReCustomArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// matched dst port, "0" means any
        /// </summary>
        [Input("portRange")]
        public Input<string>? PortRange { get; set; }

        /// <summary>
        /// enum: `any`, `icmp`, `tcp`, `udp`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("subnets")]
        private InputList<string>? _subnets;
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        public NetworktemplateSwitchMgmtProtectReCustomArgs()
        {
        }
        public static new NetworktemplateSwitchMgmtProtectReCustomArgs Empty => new NetworktemplateSwitchMgmtProtectReCustomArgs();
    }
}
