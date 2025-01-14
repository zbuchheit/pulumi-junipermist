// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigTargetAddressGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("addressMask")]
        public Input<string>? AddressMask { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// &lt;refer to notify tag, can be multiple with blank
        /// </summary>
        [Input("tagList")]
        public Input<string>? TagList { get; set; }

        [Input("targetAddressName")]
        public Input<string>? TargetAddressName { get; set; }

        /// <summary>
        /// refer to notify target parameters name
        /// </summary>
        [Input("targetParameters")]
        public Input<string>? TargetParameters { get; set; }

        public NetworktemplateSnmpConfigV3ConfigTargetAddressGetArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigTargetAddressGetArgs Empty => new NetworktemplateSnmpConfigV3ConfigTargetAddressGetArgs();
    }
}
