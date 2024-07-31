// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class DeviceprofileGatewayTunnelConfigsAutoProvision
    {
        public readonly bool? Enable;
        public readonly Outputs.DeviceprofileGatewayTunnelConfigsAutoProvisionLatlng? Latlng;
        public readonly Outputs.DeviceprofileGatewayTunnelConfigsAutoProvisionPrimary? Primary;
        /// <summary>
        /// enum: `APAC`, `Americas`, `EMEA`, `auto`
        /// </summary>
        public readonly string? Region;
        public readonly Outputs.DeviceprofileGatewayTunnelConfigsAutoProvisionSecondary? Secondary;

        [OutputConstructor]
        private DeviceprofileGatewayTunnelConfigsAutoProvision(
            bool? enable,

            Outputs.DeviceprofileGatewayTunnelConfigsAutoProvisionLatlng? latlng,

            Outputs.DeviceprofileGatewayTunnelConfigsAutoProvisionPrimary? primary,

            string? region,

            Outputs.DeviceprofileGatewayTunnelConfigsAutoProvisionSecondary? secondary)
        {
            Enable = enable;
            Latlng = latlng;
            Primary = primary;
            Region = region;
            Secondary = secondary;
        }
    }
}
