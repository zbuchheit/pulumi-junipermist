// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateRemoteSyslogServerArgs : global::Pulumi.ResourceArgs
    {
        [Input("contents")]
        private InputList<Inputs.NetworktemplateRemoteSyslogServerContentArgs>? _contents;
        public InputList<Inputs.NetworktemplateRemoteSyslogServerContentArgs> Contents
        {
            get => _contents ?? (_contents = new InputList<Inputs.NetworktemplateRemoteSyslogServerContentArgs>());
            set => _contents = value;
        }

        [Input("explicitPriority")]
        public Input<bool>? ExplicitPriority { get; set; }

        /// <summary>
        /// enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
        /// </summary>
        [Input("facility")]
        public Input<string>? Facility { get; set; }

        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("match")]
        public Input<string>? Match { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// enum: `tcp`, `udp`
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("routingInstance")]
        public Input<string>? RoutingInstance { get; set; }

        /// <summary>
        /// enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
        /// </summary>
        [Input("severity")]
        public Input<string>? Severity { get; set; }

        /// <summary>
        /// if source_address is configured, will use the vlan firstly otherwise use source_ip
        /// </summary>
        [Input("sourceAddress")]
        public Input<string>? SourceAddress { get; set; }

        [Input("structuredData")]
        public Input<bool>? StructuredData { get; set; }

        [Input("tag")]
        public Input<string>? Tag { get; set; }

        public NetworktemplateRemoteSyslogServerArgs()
        {
        }
        public static new NetworktemplateRemoteSyslogServerArgs Empty => new NetworktemplateRemoteSyslogServerArgs();
    }
}
