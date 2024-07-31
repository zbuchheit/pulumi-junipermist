// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchSwitchMgmtTacacsTacplusServer
    {
        public readonly string? Host;
        public readonly string? Port;
        public readonly string? Secret;
        public readonly int? Timeout;

        [OutputConstructor]
        private SwitchSwitchMgmtTacacsTacplusServer(
            string? host,

            string? port,

            string? secret,

            int? timeout)
        {
            Host = host;
            Port = port;
            Secret = secret;
            Timeout = timeout;
        }
    }
}
