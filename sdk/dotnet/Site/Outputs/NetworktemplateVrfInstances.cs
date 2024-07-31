// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class NetworktemplateVrfInstances
    {
        public readonly ImmutableArray<string> Networks;
        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworktemplateVrfInstancesVrfExtraRoutes>? VrfExtraRoutes;

        [OutputConstructor]
        private NetworktemplateVrfInstances(
            ImmutableArray<string> networks,

            ImmutableDictionary<string, Outputs.NetworktemplateVrfInstancesVrfExtraRoutes>? vrfExtraRoutes)
        {
            Networks = networks;
            VrfExtraRoutes = vrfExtraRoutes;
        }
    }
}
