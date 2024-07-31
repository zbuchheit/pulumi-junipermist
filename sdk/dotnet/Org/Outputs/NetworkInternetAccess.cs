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
    public sealed class NetworkInternetAccess
    {
        public readonly bool? CreateSimpleServicePolicy;
        /// <summary>
        /// Property key may be an IP/Port (i.e. "63.16.0.3:443"), or a port (i.e. ":2222")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworkInternetAccessDestinationNat>? DestinationNat;
        public readonly bool? Enabled;
        /// <summary>
        /// by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
        /// </summary>
        public readonly bool? Restricted;
        /// <summary>
        /// Property key may be an IP Address (i.e. "172.16.0.1"), and IP Address and Port (i.e. "172.16.0.1:8443") or a CIDR (i.e. "172.16.0.12/20")
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.NetworkInternetAccessStaticNat>? StaticNat;

        [OutputConstructor]
        private NetworkInternetAccess(
            bool? createSimpleServicePolicy,

            ImmutableDictionary<string, Outputs.NetworkInternetAccessDestinationNat>? destinationNat,

            bool? enabled,

            bool? restricted,

            ImmutableDictionary<string, Outputs.NetworkInternetAccessStaticNat>? staticNat)
        {
            CreateSimpleServicePolicy = createSimpleServicePolicy;
            DestinationNat = destinationNat;
            Enabled = enabled;
            Restricted = restricted;
            StaticNat = staticNat;
        }
    }
}
