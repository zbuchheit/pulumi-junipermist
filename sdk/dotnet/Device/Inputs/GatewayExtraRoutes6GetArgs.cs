// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayExtraRoutes6GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("via", required: true)]
        public Input<string> Via { get; set; } = null!;

        public GatewayExtraRoutes6GetArgs()
        {
        }
        public static new GatewayExtraRoutes6GetArgs Empty => new GatewayExtraRoutes6GetArgs();
    }
}
