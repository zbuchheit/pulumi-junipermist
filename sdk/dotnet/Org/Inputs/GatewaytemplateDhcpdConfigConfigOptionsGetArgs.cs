// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateDhcpdConfigConfigOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `boolean`, `hex`, `int16`, `int32`, `ip`, `string`, `uint16`, `uint32`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public GatewaytemplateDhcpdConfigConfigOptionsGetArgs()
        {
        }
        public static new GatewaytemplateDhcpdConfigConfigOptionsGetArgs Empty => new GatewaytemplateDhcpdConfigConfigOptionsGetArgs();
    }
}
