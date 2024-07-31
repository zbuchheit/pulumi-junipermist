// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class ApClientBridgeArgs : global::Pulumi.ResourceArgs
    {
        [Input("auth")]
        public Input<Inputs.ApClientBridgeAuthArgs>? Auth { get; set; }

        /// <summary>
        /// when acted as client bridge:
        ///   * only 5G radio can be used
        ///   * will not serve as AP on any radios
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("ssid")]
        public Input<string>? Ssid { get; set; }

        public ApClientBridgeArgs()
        {
        }
        public static new ApClientBridgeArgs Empty => new ApClientBridgeArgs();
    }
}
