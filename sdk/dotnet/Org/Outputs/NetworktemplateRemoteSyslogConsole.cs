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
    public sealed class NetworktemplateRemoteSyslogConsole
    {
        public readonly ImmutableArray<Outputs.NetworktemplateRemoteSyslogConsoleContent> Contents;

        [OutputConstructor]
        private NetworktemplateRemoteSyslogConsole(ImmutableArray<Outputs.NetworktemplateRemoteSyslogConsoleContent> contents)
        {
            Contents = contents;
        }
    }
}
