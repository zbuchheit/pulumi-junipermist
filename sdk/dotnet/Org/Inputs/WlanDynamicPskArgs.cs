// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanDynamicPskArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultPsk")]
        private Input<string>? _defaultPsk;

        /// <summary>
        /// default PSK to use if cloud WLC is not available, 8-63 characters
        /// </summary>
        public Input<string>? DefaultPsk
        {
            get => _defaultPsk;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _defaultPsk = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("defaultVlanId")]
        public Input<string>? DefaultVlanId { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// when 11r is enabled, we'll try to use the cached PMK, this can be disabled
        /// `false` means auto
        /// </summary>
        [Input("forceLookup")]
        public Input<bool>? ForceLookup { get; set; }

        /// <summary>
        /// enum: `cloud_psks`, `radius`
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("vlanIds")]
        private InputList<string>? _vlanIds;
        public InputList<string> VlanIds
        {
            get => _vlanIds ?? (_vlanIds = new InputList<string>());
            set => _vlanIds = value;
        }

        public WlanDynamicPskArgs()
        {
        }
        public static new WlanDynamicPskArgs Empty => new WlanDynamicPskArgs();
    }
}
