// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateVrfInstancesVrfExtraRoutesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Next-hop address
        /// </summary>
        [Input("via", required: true)]
        public Input<string> Via { get; set; } = null!;

        public NetworktemplateVrfInstancesVrfExtraRoutesArgs()
        {
        }
        public static new NetworktemplateVrfInstancesVrfExtraRoutesArgs Empty => new NetworktemplateVrfInstancesVrfExtraRoutesArgs();
    }
}