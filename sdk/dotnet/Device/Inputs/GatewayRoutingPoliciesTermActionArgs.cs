// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayRoutingPoliciesTermActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("accept")]
        public Input<bool>? Accept { get; set; }

        [Input("addCommunities")]
        private InputList<string>? _addCommunities;
        public InputList<string> AddCommunities
        {
            get => _addCommunities ?? (_addCommunities = new InputList<string>());
            set => _addCommunities = value;
        }

        [Input("addTargetVrfs")]
        private InputList<string>? _addTargetVrfs;

        /// <summary>
        /// for SSR, hub decides how VRF routes are leaked on spoke
        /// </summary>
        public InputList<string> AddTargetVrfs
        {
            get => _addTargetVrfs ?? (_addTargetVrfs = new InputList<string>());
            set => _addTargetVrfs = value;
        }

        [Input("communities")]
        private InputList<string>? _communities;

        /// <summary>
        /// when used as export policy, optional
        /// </summary>
        public InputList<string> Communities
        {
            get => _communities ?? (_communities = new InputList<string>());
            set => _communities = value;
        }

        [Input("excludeAsPaths")]
        private InputList<string>? _excludeAsPaths;

        /// <summary>
        /// when used as export policy, optional. To exclude certain AS
        /// </summary>
        public InputList<string> ExcludeAsPaths
        {
            get => _excludeAsPaths ?? (_excludeAsPaths = new InputList<string>());
            set => _excludeAsPaths = value;
        }

        [Input("excludeCommunities")]
        private InputList<string>? _excludeCommunities;
        public InputList<string> ExcludeCommunities
        {
            get => _excludeCommunities ?? (_excludeCommunities = new InputList<string>());
            set => _excludeCommunities = value;
        }

        [Input("exportCommunitites")]
        private InputList<string>? _exportCommunitites;

        /// <summary>
        /// when used as export policy, optional
        /// </summary>
        public InputList<string> ExportCommunitites
        {
            get => _exportCommunitites ?? (_exportCommunitites = new InputList<string>());
            set => _exportCommunitites = value;
        }

        /// <summary>
        /// optional, for an import policy, local_preference can be changed
        /// </summary>
        [Input("localPreference")]
        public Input<string>? LocalPreference { get; set; }

        [Input("prependAsPaths")]
        private InputList<string>? _prependAsPaths;

        /// <summary>
        /// when used as export policy, optional. By default, the local AS will be prepended, to change it
        /// </summary>
        public InputList<string> PrependAsPaths
        {
            get => _prependAsPaths ?? (_prependAsPaths = new InputList<string>());
            set => _prependAsPaths = value;
        }

        public GatewayRoutingPoliciesTermActionArgs()
        {
        }
        public static new GatewayRoutingPoliciesTermActionArgs Empty => new GatewayRoutingPoliciesTermActionArgs();
    }
}
