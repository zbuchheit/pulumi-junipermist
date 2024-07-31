// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayServicePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `allow`, `deny`
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// For SRX Only
        /// </summary>
        [Input("appqoe")]
        public Input<Inputs.DeviceprofileGatewayServicePolicyAppqoeArgs>? Appqoe { get; set; }

        [Input("ewfs")]
        private InputList<Inputs.DeviceprofileGatewayServicePolicyEwfArgs>? _ewfs;
        public InputList<Inputs.DeviceprofileGatewayServicePolicyEwfArgs> Ewfs
        {
            get => _ewfs ?? (_ewfs = new InputList<Inputs.DeviceprofileGatewayServicePolicyEwfArgs>());
            set => _ewfs = value;
        }

        [Input("idp")]
        public Input<Inputs.DeviceprofileGatewayServicePolicyIdpArgs>? Idp { get; set; }

        /// <summary>
        /// access within the same VRF
        /// </summary>
        [Input("localRouting")]
        public Input<bool>? LocalRouting { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// by default, we derive all paths available and use them
        /// optionally, you can customize by using `path_preference`
        /// </summary>
        [Input("pathPreference")]
        public Input<string>? PathPreference { get; set; }

        /// <summary>
        /// used to link servicepolicy defined at org level and overwrite some attributes
        /// </summary>
        [Input("servicepolicyId")]
        public Input<string>? ServicepolicyId { get; set; }

        [Input("services")]
        private InputList<string>? _services;
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        [Input("tenants")]
        private InputList<string>? _tenants;
        public InputList<string> Tenants
        {
            get => _tenants ?? (_tenants = new InputList<string>());
            set => _tenants = value;
        }

        public DeviceprofileGatewayServicePolicyArgs()
        {
        }
        public static new DeviceprofileGatewayServicePolicyArgs Empty => new DeviceprofileGatewayServicePolicyArgs();
    }
}
