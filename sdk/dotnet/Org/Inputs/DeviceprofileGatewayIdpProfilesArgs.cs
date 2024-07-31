// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayIdpProfilesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `critical`, `standard`, `strict`
        /// </summary>
        [Input("baseProfile")]
        public Input<string>? BaseProfile { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("overwrites")]
        private InputList<Inputs.DeviceprofileGatewayIdpProfilesOverwriteArgs>? _overwrites;
        public InputList<Inputs.DeviceprofileGatewayIdpProfilesOverwriteArgs> Overwrites
        {
            get => _overwrites ?? (_overwrites = new InputList<Inputs.DeviceprofileGatewayIdpProfilesOverwriteArgs>());
            set => _overwrites = value;
        }

        public DeviceprofileGatewayIdpProfilesArgs()
        {
        }
        public static new DeviceprofileGatewayIdpProfilesArgs Empty => new DeviceprofileGatewayIdpProfilesArgs();
    }
}