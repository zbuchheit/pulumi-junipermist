// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanAppQosAppsArgs : global::Pulumi.ResourceArgs
    {
        [Input("dscp")]
        public Input<int>? Dscp { get; set; }

        /// <summary>
        /// subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
        /// </summary>
        [Input("dstSubnet")]
        public Input<string>? DstSubnet { get; set; }

        /// <summary>
        /// subnet filter is not required but helps AP to only inspect certain traffic (thus reducing AP load)
        /// </summary>
        [Input("srcSubnet")]
        public Input<string>? SrcSubnet { get; set; }

        public WlanAppQosAppsArgs()
        {
        }
        public static new WlanAppQosAppsArgs Empty => new WlanAppQosAppsArgs();
    }
}
