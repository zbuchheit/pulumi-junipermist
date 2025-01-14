// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayPortConfigTrafficShapingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("classPercentages")]
        private InputList<int>? _classPercentages;

        /// <summary>
        /// percentages for differet class of traffic: high / medium / low / best-effort
        /// sum must be equal to 100
        /// </summary>
        public InputList<int> ClassPercentages
        {
            get => _classPercentages ?? (_classPercentages = new InputList<int>());
            set => _classPercentages = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public GatewayPortConfigTrafficShapingGetArgs()
        {
        }
        public static new GatewayPortConfigTrafficShapingGetArgs Empty => new GatewayPortConfigTrafficShapingGetArgs();
    }
}
