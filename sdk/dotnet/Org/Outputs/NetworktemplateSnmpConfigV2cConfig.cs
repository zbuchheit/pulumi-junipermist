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
    public sealed class NetworktemplateSnmpConfigV2cConfig
    {
        public readonly string? Authorization;
        /// <summary>
        /// client_list_name here should refer to client_list above
        /// </summary>
        public readonly string? ClientListName;
        public readonly string? CommunityName;
        /// <summary>
        /// view name here should be defined in views above
        /// </summary>
        public readonly string? View;

        [OutputConstructor]
        private NetworktemplateSnmpConfigV2cConfig(
            string? authorization,

            string? clientListName,

            string? communityName,

            string? view)
        {
            Authorization = authorization;
            ClientListName = clientListName;
            CommunityName = communityName;
            View = view;
        }
    }
}
