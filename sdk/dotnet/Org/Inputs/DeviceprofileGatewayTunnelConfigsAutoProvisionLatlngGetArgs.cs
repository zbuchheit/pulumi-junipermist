// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("lat", required: true)]
        public Input<double> Lat { get; set; } = null!;

        [Input("lng", required: true)]
        public Input<double> Lng { get; set; } = null!;

        public DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngGetArgs()
        {
        }
        public static new DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngGetArgs Empty => new DeviceprofileGatewayTunnelConfigsAutoProvisionLatlngGetArgs();
    }
}
