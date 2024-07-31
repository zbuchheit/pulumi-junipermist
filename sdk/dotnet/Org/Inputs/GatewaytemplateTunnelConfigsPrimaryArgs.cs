// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateTunnelConfigsPrimaryArgs : global::Pulumi.ResourceArgs
    {
        [Input("hosts")]
        private InputList<string>? _hosts;
        public InputList<string> Hosts
        {
            get => _hosts ?? (_hosts = new InputList<string>());
            set => _hosts = value;
        }

        [Input("internalIps")]
        private InputList<string>? _internalIps;

        /// <summary>
        /// Only if:
        ///   * `provider`== `zscaler-gre`
        ///   * `provider`== `custom-gre`
        /// </summary>
        public InputList<string> InternalIps
        {
            get => _internalIps ?? (_internalIps = new InputList<string>());
            set => _internalIps = value;
        }

        [Input("probeIps")]
        private InputList<string>? _probeIps;
        public InputList<string> ProbeIps
        {
            get => _probeIps ?? (_probeIps = new InputList<string>());
            set => _probeIps = value;
        }

        [Input("remoteIds")]
        private InputList<string>? _remoteIds;

        /// <summary>
        /// Only if `provider`== `custom-ipsec`
        /// </summary>
        public InputList<string> RemoteIds
        {
            get => _remoteIds ?? (_remoteIds = new InputList<string>());
            set => _remoteIds = value;
        }

        [Input("wanNames")]
        private InputList<string>? _wanNames;
        public InputList<string> WanNames
        {
            get => _wanNames ?? (_wanNames = new InputList<string>());
            set => _wanNames = value;
        }

        public GatewaytemplateTunnelConfigsPrimaryArgs()
        {
        }
        public static new GatewaytemplateTunnelConfigsPrimaryArgs Empty => new GatewaytemplateTunnelConfigsPrimaryArgs();
    }
}
