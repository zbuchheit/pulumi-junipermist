// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayDhcpdConfigConfigOptionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `boolean`, `hex`, `int16`, `int32`, `ip`, `string`, `uint16`, `uint32`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public GatewayDhcpdConfigConfigOptionsArgs()
        {
        }
        public static new GatewayDhcpdConfigConfigOptionsArgs Empty => new GatewayDhcpdConfigConfigOptionsArgs();
    }
}
