// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateNetworkVpnAccessSourceNatGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("externalIp")]
        public Input<string>? ExternalIp { get; set; }

        public GatewaytemplateNetworkVpnAccessSourceNatGetArgs()
        {
        }
        public static new GatewaytemplateNetworkVpnAccessSourceNatGetArgs Empty => new GatewaytemplateNetworkVpnAccessSourceNatGetArgs();
    }
}
