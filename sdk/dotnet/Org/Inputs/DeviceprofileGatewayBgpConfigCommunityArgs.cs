// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayBgpConfigCommunityArgs : global::Pulumi.ResourceArgs
    {
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("localPreference")]
        public Input<int>? LocalPreference { get; set; }

        [Input("vpnName")]
        public Input<string>? VpnName { get; set; }

        public DeviceprofileGatewayBgpConfigCommunityArgs()
        {
        }
        public static new DeviceprofileGatewayBgpConfigCommunityArgs Empty => new DeviceprofileGatewayBgpConfigCommunityArgs();
    }
}
