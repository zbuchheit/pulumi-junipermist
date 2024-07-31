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
    public sealed class SwitchRemoteSyslogUser
    {
        public readonly ImmutableArray<Outputs.SwitchRemoteSyslogUserContent> Contents;
        public readonly string? Match;
        public readonly string? User;

        [OutputConstructor]
        private SwitchRemoteSyslogUser(
            ImmutableArray<Outputs.SwitchRemoteSyslogUserContent> contents,

            string? match,

            string? user)
        {
            Contents = contents;
            Match = match;
            User = user;
        }
    }
}
