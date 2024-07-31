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
    public sealed class NetworktemplateSnmpConfigV3ConfigVacm
    {
        public readonly ImmutableArray<Outputs.NetworktemplateSnmpConfigV3ConfigVacmAccess> Accesses;
        public readonly Outputs.NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup? SecurityToGroup;

        [OutputConstructor]
        private NetworktemplateSnmpConfigV3ConfigVacm(
            ImmutableArray<Outputs.NetworktemplateSnmpConfigV3ConfigVacmAccess> accesses,

            Outputs.NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroup? securityToGroup)
        {
            Accesses = accesses;
            SecurityToGroup = securityToGroup;
        }
    }
}
