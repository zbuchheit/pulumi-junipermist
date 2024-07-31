// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class DeviceprofileGatewayServicePolicy
    {
        /// <summary>
        /// enum: `allow`, `deny`
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// For SRX Only
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayServicePolicyAppqoe? Appqoe;
        public readonly ImmutableArray<Outputs.DeviceprofileGatewayServicePolicyEwf> Ewfs;
        public readonly Outputs.DeviceprofileGatewayServicePolicyIdp? Idp;
        /// <summary>
        /// access within the same VRF
        /// </summary>
        public readonly bool? LocalRouting;
        public readonly string? Name;
        /// <summary>
        /// by default, we derive all paths available and use them
        /// optionally, you can customize by using `path_preference`
        /// </summary>
        public readonly string? PathPreference;
        /// <summary>
        /// used to link servicepolicy defined at org level and overwrite some attributes
        /// </summary>
        public readonly string? ServicepolicyId;
        public readonly ImmutableArray<string> Services;
        public readonly ImmutableArray<string> Tenants;

        [OutputConstructor]
        private DeviceprofileGatewayServicePolicy(
            string? action,

            Outputs.DeviceprofileGatewayServicePolicyAppqoe? appqoe,

            ImmutableArray<Outputs.DeviceprofileGatewayServicePolicyEwf> ewfs,

            Outputs.DeviceprofileGatewayServicePolicyIdp? idp,

            bool? localRouting,

            string? name,

            string? pathPreference,

            string? servicepolicyId,

            ImmutableArray<string> services,

            ImmutableArray<string> tenants)
        {
            Action = action;
            Appqoe = appqoe;
            Ewfs = ewfs;
            Idp = idp;
            LocalRouting = localRouting;
            Name = name;
            PathPreference = pathPreference;
            ServicepolicyId = servicepolicyId;
            Services = services;
            Tenants = tenants;
        }
    }
}
