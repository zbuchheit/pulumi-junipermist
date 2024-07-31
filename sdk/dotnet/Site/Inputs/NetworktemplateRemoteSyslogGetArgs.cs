// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateRemoteSyslogGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("archive")]
        public Input<Inputs.NetworktemplateRemoteSyslogArchiveGetArgs>? Archive { get; set; }

        [Input("console")]
        public Input<Inputs.NetworktemplateRemoteSyslogConsoleGetArgs>? Console { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("files")]
        private InputList<Inputs.NetworktemplateRemoteSyslogFileGetArgs>? _files;
        public InputList<Inputs.NetworktemplateRemoteSyslogFileGetArgs> Files
        {
            get => _files ?? (_files = new InputList<Inputs.NetworktemplateRemoteSyslogFileGetArgs>());
            set => _files = value;
        }

        /// <summary>
        /// if source_address is configured, will use the vlan firstly otherwise use source_ip
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("sendToAllServers")]
        public Input<bool>? SendToAllServers { get; set; }

        [Input("servers")]
        private InputList<Inputs.NetworktemplateRemoteSyslogServerGetArgs>? _servers;
        public InputList<Inputs.NetworktemplateRemoteSyslogServerGetArgs> Servers
        {
            get => _servers ?? (_servers = new InputList<Inputs.NetworktemplateRemoteSyslogServerGetArgs>());
            set => _servers = value;
        }

        /// <summary>
        /// enum: `millisecond`, `year`, `year millisecond`
        /// </summary>
        [Input("timeFormat")]
        public Input<string>? TimeFormat { get; set; }

        [Input("users")]
        private InputList<Inputs.NetworktemplateRemoteSyslogUserGetArgs>? _users;
        public InputList<Inputs.NetworktemplateRemoteSyslogUserGetArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.NetworktemplateRemoteSyslogUserGetArgs>());
            set => _users = value;
        }

        public NetworktemplateRemoteSyslogGetArgs()
        {
        }
        public static new NetworktemplateRemoteSyslogGetArgs Empty => new NetworktemplateRemoteSyslogGetArgs();
    }
}
