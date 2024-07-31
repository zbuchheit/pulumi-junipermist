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
    public sealed class NetworktemplateRemoteSyslogUserContent
    {
        /// <summary>
        /// enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
        /// </summary>
        public readonly string? Facility;
        /// <summary>
        /// enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
        /// </summary>
        public readonly string? Severity;

        [OutputConstructor]
        private NetworktemplateRemoteSyslogUserContent(
            string? facility,

            string? severity)
        {
            Facility = facility;
            Severity = severity;
        }
    }
}
