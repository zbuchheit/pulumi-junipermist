// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplatePortMirroringArgs : global::Pulumi.ResourceArgs
    {
        [Input("inputNetworksIngresses")]
        private InputList<string>? _inputNetworksIngresses;

        /// <summary>
        /// at least one of the `input_port_ids_ingress`, `input_port_ids_egress` or `input_networks_ingress ` should be specified
        /// </summary>
        public InputList<string> InputNetworksIngresses
        {
            get => _inputNetworksIngresses ?? (_inputNetworksIngresses = new InputList<string>());
            set => _inputNetworksIngresses = value;
        }

        [Input("inputPortIdsEgresses")]
        private InputList<string>? _inputPortIdsEgresses;

        /// <summary>
        /// at least one of the `input_port_ids_ingress`, `input_port_ids_egress` or `input_networks_ingress ` should be specified
        /// </summary>
        public InputList<string> InputPortIdsEgresses
        {
            get => _inputPortIdsEgresses ?? (_inputPortIdsEgresses = new InputList<string>());
            set => _inputPortIdsEgresses = value;
        }

        [Input("inputPortIdsIngresses")]
        private InputList<string>? _inputPortIdsIngresses;

        /// <summary>
        /// at least one of the `input_port_ids_ingress`, `input_port_ids_egress` or `input_networks_ingress ` should be specified
        /// </summary>
        public InputList<string> InputPortIdsIngresses
        {
            get => _inputPortIdsIngresses ?? (_inputPortIdsIngresses = new InputList<string>());
            set => _inputPortIdsIngresses = value;
        }

        /// <summary>
        /// exaclty one of the `output_port_id` or `output_network` should be provided
        /// </summary>
        [Input("outputNetwork")]
        public Input<string>? OutputNetwork { get; set; }

        /// <summary>
        /// exaclty one of the `output_port_id` or `output_network` should be provided
        /// </summary>
        [Input("outputPortId")]
        public Input<string>? OutputPortId { get; set; }

        public NetworktemplatePortMirroringArgs()
        {
        }
        public static new NetworktemplatePortMirroringArgs Empty => new NetworktemplatePortMirroringArgs();
    }
}
