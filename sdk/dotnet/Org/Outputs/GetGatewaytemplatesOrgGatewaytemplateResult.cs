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
    public sealed class GetGatewaytemplatesOrgGatewaytemplateResult
    {
        public readonly double CreatedTime;
        public readonly string Id;
        public readonly double ModifiedTime;
        public readonly string Name;
        public readonly string OrgId;

        [OutputConstructor]
        private GetGatewaytemplatesOrgGatewaytemplateResult(
            double createdTime,

            string id,

            double modifiedTime,

            string name,

            string orgId)
        {
            CreatedTime = createdTime;
            Id = id;
            ModifiedTime = modifiedTime;
            Name = name;
            OrgId = orgId;
        }
    }
}
