// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// refer to group_name under access
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        [Input("securityName")]
        public Input<string>? SecurityName { get; set; }

        public NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContentGetArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContentGetArgs Empty => new NetworktemplateSnmpConfigV3ConfigVacmSecurityToGroupContentGetArgs();
    }
}
