// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateVrfConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// whether to enable VRF (when supported on the device)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public GatewaytemplateVrfConfigGetArgs()
        {
        }
        public static new GatewaytemplateVrfConfigGetArgs Empty => new GatewaytemplateVrfConfigGetArgs();
    }
}
