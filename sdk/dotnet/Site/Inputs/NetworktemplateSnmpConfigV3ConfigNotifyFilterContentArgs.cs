// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigNotifyFilterContentArgs : global::Pulumi.ResourceArgs
    {
        [Input("include")]
        public Input<bool>? Include { get; set; }

        [Input("oid")]
        public Input<string>? Oid { get; set; }

        public NetworktemplateSnmpConfigV3ConfigNotifyFilterContentArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigNotifyFilterContentArgs Empty => new NetworktemplateSnmpConfigV3ConfigNotifyFilterContentArgs();
    }
}
