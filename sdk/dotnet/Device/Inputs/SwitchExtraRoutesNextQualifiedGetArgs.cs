// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchExtraRoutesNextQualifiedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("metric")]
        public Input<int>? Metric { get; set; }

        [Input("preference")]
        public Input<int>? Preference { get; set; }

        public SwitchExtraRoutesNextQualifiedGetArgs()
        {
        }
        public static new SwitchExtraRoutesNextQualifiedGetArgs Empty => new SwitchExtraRoutesNextQualifiedGetArgs();
    }
}
