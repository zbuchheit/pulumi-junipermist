// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayBgpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("authKey")]
        public Input<string>? AuthKey { get; set; }

        /// <summary>
        /// when bfd_multiplier is configured alone. Default:
        ///   * 1000 if `type`==`external`
        ///   * 350 `type`==`internal`
        /// </summary>
        [Input("bfdMinimumInterval")]
        public Input<int>? BfdMinimumInterval { get; set; }

        /// <summary>
        /// when bfd_minimum_interval_is_configured alone
        /// </summary>
        [Input("bfdMultiplier")]
        public Input<int>? BfdMultiplier { get; set; }

        [Input("communities")]
        private InputList<Inputs.DeviceprofileGatewayBgpConfigCommunityGetArgs>? _communities;
        public InputList<Inputs.DeviceprofileGatewayBgpConfigCommunityGetArgs> Communities
        {
            get => _communities ?? (_communities = new InputList<Inputs.DeviceprofileGatewayBgpConfigCommunityGetArgs>());
            set => _communities = value;
        }

        /// <summary>
        /// BFD provides faster path failure detection and is enabled by default
        /// </summary>
        [Input("disableBfd")]
        public Input<bool>? DisableBfd { get; set; }

        [Input("export")]
        public Input<string>? Export { get; set; }

        /// <summary>
        /// default export policies if no per-neighbor policies defined
        /// </summary>
        [Input("exportPolicy")]
        public Input<string>? ExportPolicy { get; set; }

        /// <summary>
        /// by default, either inet/net6 unicast depending on neighbor IP family (v4 or v6)
        /// for v6 neighbors, to exchange v4 nexthop, which allows dual-stack support, enable this
        /// </summary>
        [Input("extendedV4Nexthop")]
        public Input<bool>? ExtendedV4Nexthop { get; set; }

        /// <summary>
        /// `0` means disable
        /// </summary>
        [Input("gracefulRestartTime")]
        public Input<int>? GracefulRestartTime { get; set; }

        [Input("holdTime")]
        public Input<int>? HoldTime { get; set; }

        [Input("import")]
        public Input<string>? Import { get; set; }

        /// <summary>
        /// default import policies if no per-neighbor policies defined
        /// </summary>
        [Input("importPolicy")]
        public Input<string>? ImportPolicy { get; set; }

        [Input("localAs")]
        public Input<int>? LocalAs { get; set; }

        [Input("neighborAs")]
        public Input<int>? NeighborAs { get; set; }

        [Input("neighbors")]
        private InputMap<Inputs.DeviceprofileGatewayBgpConfigNeighborsGetArgs>? _neighbors;

        /// <summary>
        /// if per-neighbor as is desired. Property key is the neighbor address
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayBgpConfigNeighborsGetArgs> Neighbors
        {
            get => _neighbors ?? (_neighbors = new InputMap<Inputs.DeviceprofileGatewayBgpConfigNeighborsGetArgs>());
            set => _neighbors = value;
        }

        [Input("networks")]
        private InputList<string>? _networks;

        /// <summary>
        /// if `type`!=`external`or `via`==`wan`networks where we expect BGP neighbor to connect to/from
        /// </summary>
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        /// <summary>
        /// by default, we'll re-advertise all learned BGP routers toward overlay
        /// </summary>
        [Input("noReadvertiseToOverlay")]
        public Input<bool>? NoReadvertiseToOverlay { get; set; }

        /// <summary>
        /// enum: `external`, `internal`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// network name. enum: `lan`, `vpn`, `wan`
        /// </summary>
        [Input("via")]
        public Input<string>? Via { get; set; }

        [Input("vpnName")]
        public Input<string>? VpnName { get; set; }

        /// <summary>
        /// if `via`==`wan`
        /// </summary>
        [Input("wanName")]
        public Input<string>? WanName { get; set; }

        public DeviceprofileGatewayBgpConfigGetArgs()
        {
        }
        public static new DeviceprofileGatewayBgpConfigGetArgs Empty => new DeviceprofileGatewayBgpConfigGetArgs();
    }
}
