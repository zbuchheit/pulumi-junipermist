// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateDhcpdConfigConfigFixedBindingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        public GatewaytemplateDhcpdConfigConfigFixedBindingsArgs()
        {
        }
        public static new GatewaytemplateDhcpdConfigConfigFixedBindingsArgs Empty => new GatewaytemplateDhcpdConfigConfigFixedBindingsArgs();
    }
}
