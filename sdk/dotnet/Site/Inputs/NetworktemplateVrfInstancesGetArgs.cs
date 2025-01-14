// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateVrfInstancesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("networks")]
        private InputList<string>? _networks;
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        [Input("vrfExtraRoutes")]
        private InputMap<Inputs.NetworktemplateVrfInstancesVrfExtraRoutesGetArgs>? _vrfExtraRoutes;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public InputMap<Inputs.NetworktemplateVrfInstancesVrfExtraRoutesGetArgs> VrfExtraRoutes
        {
            get => _vrfExtraRoutes ?? (_vrfExtraRoutes = new InputMap<Inputs.NetworktemplateVrfInstancesVrfExtraRoutesGetArgs>());
            set => _vrfExtraRoutes = value;
        }

        public NetworktemplateVrfInstancesGetArgs()
        {
        }
        public static new NetworktemplateVrfInstancesGetArgs Empty => new NetworktemplateVrfInstancesGetArgs();
    }
}
