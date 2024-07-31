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
    public sealed class NetworktemplateSwitchMgmt
    {
        public readonly int? ConfigRevert;
        /// <summary>
        /// restrict inbound-traffic to host
        /// when enabled, all traffic that is not essential to our operation will be dropped 
        /// e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we'll make sure it works
        /// </summary>
        public readonly Outputs.NetworktemplateSwitchMgmtProtectRe? ProtectRe;
        public readonly string? RootPassword;
        public readonly Outputs.NetworktemplateSwitchMgmtTacacs? Tacacs;

        [OutputConstructor]
        private NetworktemplateSwitchMgmt(
            int? configRevert,

            Outputs.NetworktemplateSwitchMgmtProtectRe? protectRe,

            string? rootPassword,

            Outputs.NetworktemplateSwitchMgmtTacacs? tacacs)
        {
            ConfigRevert = configRevert;
            ProtectRe = protectRe;
            RootPassword = rootPassword;
            Tacacs = tacacs;
        }
    }
}
