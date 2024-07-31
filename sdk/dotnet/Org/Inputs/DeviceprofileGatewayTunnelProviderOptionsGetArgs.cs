// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayTunnelProviderOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// for jse-ipsec, this allow provisioning of adequate resource on JSE. Make sure adequate licenses are added
        /// </summary>
        [Input("jse")]
        public Input<Inputs.DeviceprofileGatewayTunnelProviderOptionsJseGetArgs>? Jse { get; set; }

        /// <summary>
        /// for zscaler-ipsec and zscaler-gre
        /// </summary>
        [Input("zscaler")]
        public Input<Inputs.DeviceprofileGatewayTunnelProviderOptionsZscalerGetArgs>? Zscaler { get; set; }

        public DeviceprofileGatewayTunnelProviderOptionsGetArgs()
        {
        }
        public static new DeviceprofileGatewayTunnelProviderOptionsGetArgs Empty => new DeviceprofileGatewayTunnelProviderOptionsGetArgs();
    }
}
