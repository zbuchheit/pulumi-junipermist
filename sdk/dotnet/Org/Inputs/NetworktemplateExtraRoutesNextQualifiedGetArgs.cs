// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateExtraRoutesNextQualifiedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("metric")]
        public Input<int>? Metric { get; set; }

        [Input("preference")]
        public Input<int>? Preference { get; set; }

        public NetworktemplateExtraRoutesNextQualifiedGetArgs()
        {
        }
        public static new NetworktemplateExtraRoutesNextQualifiedGetArgs Empty => new NetworktemplateExtraRoutesNextQualifiedGetArgs();
    }
}
