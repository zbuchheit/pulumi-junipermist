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
    public sealed class NetworktemplateSwitchMgmtProtectRe
    {
        /// <summary>
        /// optionally, services we'll allow
        /// </summary>
        public readonly ImmutableArray<string> AllowedServices;
        public readonly ImmutableArray<Outputs.NetworktemplateSwitchMgmtProtectReCustom> Customs;
        /// <summary>
        /// when enabled, all traffic that is not essential to our operation will be dropped
        /// e.g. ntp / dns / traffic to mist will be allowed by default
        ///      if dhcpd is enabled, we'll make sure it works
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// host/subnets we'll allow traffic to/from
        /// </summary>
        public readonly ImmutableArray<string> TrustedHosts;

        [OutputConstructor]
        private NetworktemplateSwitchMgmtProtectRe(
            ImmutableArray<string> allowedServices,

            ImmutableArray<Outputs.NetworktemplateSwitchMgmtProtectReCustom> customs,

            bool? enabled,

            ImmutableArray<string> trustedHosts)
        {
            AllowedServices = allowedServices;
            Customs = customs;
            Enabled = enabled;
            TrustedHosts = trustedHosts;
        }
    }
}