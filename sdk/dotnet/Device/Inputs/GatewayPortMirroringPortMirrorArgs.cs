// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayPortMirroringPortMirrorArgs : global::Pulumi.ResourceArgs
    {
        [Input("familyType")]
        public Input<string>? FamilyType { get; set; }

        [Input("ingressPortIds")]
        private InputList<string>? _ingressPortIds;
        public InputList<string> IngressPortIds
        {
            get => _ingressPortIds ?? (_ingressPortIds = new InputList<string>());
            set => _ingressPortIds = value;
        }

        [Input("outputPortId")]
        public Input<string>? OutputPortId { get; set; }

        [Input("rate")]
        public Input<int>? Rate { get; set; }

        [Input("runLength")]
        public Input<int>? RunLength { get; set; }

        public GatewayPortMirroringPortMirrorArgs()
        {
        }
        public static new GatewayPortMirroringPortMirrorArgs Empty => new GatewayPortMirroringPortMirrorArgs();
    }
}
