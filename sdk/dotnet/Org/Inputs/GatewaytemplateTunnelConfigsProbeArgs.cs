// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateTunnelConfigsProbeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// how often to trigger the probe
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// number of consecutive misses before declaring the tunnel down
        /// </summary>
        [Input("threshold")]
        public Input<int>? Threshold { get; set; }

        /// <summary>
        /// time within which to complete the connectivity check
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// enum: `http`, `icmp`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GatewaytemplateTunnelConfigsProbeArgs()
        {
        }
        public static new GatewaytemplateTunnelConfigsProbeArgs Empty => new GatewaytemplateTunnelConfigsProbeArgs();
    }
}
