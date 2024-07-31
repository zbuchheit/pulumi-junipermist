// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateAclTagsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// required if
        /// - `type`==`dynamic_gbp` (gbp_tag received from RADIUS)
        /// - `type`==`static_gbp` (applying gbp tag against matching conditions)
        /// </summary>
        [Input("gbpTag")]
        public Input<int>? GbpTag { get; set; }

        [Input("macs")]
        private InputList<string>? _macs;

        /// <summary>
        /// required if 
        /// - `type`==`mac`
        /// - `type`==`static_gbp` if from matching mac
        /// </summary>
        public InputList<string> Macs
        {
            get => _macs ?? (_macs = new InputList<string>());
            set => _macs = value;
        }

        /// <summary>
        /// if:
        ///   * `type`==`mac` (optional. default is `any`)
        ///   * `type`==`subnet` (optional. default is `any`)
        ///   * `type`==`network`
        ///   * `type`==`resource` (optional. default is `any`)
        ///   * `type`==`static_gbp` if from matching network (vlan)'
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// required if:
        ///   * `type`==`radius_group`
        ///   * `type`==`static_gbp`
        /// if from matching radius_group
        /// </summary>
        [Input("radiusGroup")]
        public Input<string>? RadiusGroup { get; set; }

        [Input("specs")]
        private InputList<Inputs.NetworktemplateAclTagsSpecArgs>? _specs;

        /// <summary>
        /// if `type`==`resource`
        /// empty means unrestricted, i.e. any
        /// </summary>
        public InputList<Inputs.NetworktemplateAclTagsSpecArgs> Specs
        {
            get => _specs ?? (_specs = new InputList<Inputs.NetworktemplateAclTagsSpecArgs>());
            set => _specs = value;
        }

        [Input("subnets")]
        private InputList<string>? _subnets;

        /// <summary>
        /// if 
        /// - `type`==`subnet` 
        /// - `type`==`resource` (optional. default is `any`)
        /// - `type`==`static_gbp` if from matching subnet
        /// </summary>
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        /// <summary>
        /// enum: `any`, `dynamic_gbp`, `mac`, `network`, `radius_group`, `resource`, `static_gbp`, `subnet`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NetworktemplateAclTagsArgs()
        {
        }
        public static new NetworktemplateAclTagsArgs Empty => new NetworktemplateAclTagsArgs();
    }
}
