// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchRemoteSyslogUserContentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
        /// </summary>
        [Input("facility")]
        public Input<string>? Facility { get; set; }

        /// <summary>
        /// enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        public SwitchRemoteSyslogUserContentArgs()
        {
        }
        public static new SwitchRemoteSyslogUserContentArgs Empty => new SwitchRemoteSyslogUserContentArgs();
    }
}
