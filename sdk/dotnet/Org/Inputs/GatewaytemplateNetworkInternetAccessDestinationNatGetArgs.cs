// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateNetworkInternetAccessDestinationNatGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("internalIp")]
        public Input<string>? InternalIp { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        public GatewaytemplateNetworkInternetAccessDestinationNatGetArgs()
        {
        }
        public static new GatewaytemplateNetworkInternetAccessDestinationNatGetArgs Empty => new GatewaytemplateNetworkInternetAccessDestinationNatGetArgs();
    }
}
