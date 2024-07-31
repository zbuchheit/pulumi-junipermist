// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup
    {
        public readonly ImmutableArray<Outputs.NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContent> Contents;
        /// <summary>
        /// enum: `usm`, `v1`, `v2c`
        /// </summary>
        public readonly string? SecurityModel;

        [OutputConstructor]
        private NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup(
            ImmutableArray<Outputs.NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContent> contents,

            string? securityModel)
        {
            Contents = contents;
            SecurityModel = securityModel;
        }
    }
}
