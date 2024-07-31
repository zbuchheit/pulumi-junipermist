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
    public sealed class DeviceprofileGatewayRoutingPoliciesTerm
    {
        /// <summary>
        /// when used as import policy
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayRoutingPoliciesTermAction? Action;
        /// <summary>
        /// zero or more criteria/filter can be specified to match the term, all criteria have to be met
        /// </summary>
        public readonly Outputs.DeviceprofileGatewayRoutingPoliciesTermMatching? Matching;

        [OutputConstructor]
        private DeviceprofileGatewayRoutingPoliciesTerm(
            Outputs.DeviceprofileGatewayRoutingPoliciesTermAction? action,

            Outputs.DeviceprofileGatewayRoutingPoliciesTermMatching? matching)
        {
            Action = action;
            Matching = matching;
        }
    }
}
