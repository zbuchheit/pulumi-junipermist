// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateTunnelProviderOptionsZscalerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aupAcceptanceRequired")]
        public Input<bool>? AupAcceptanceRequired { get; set; }

        /// <summary>
        /// days before AUP is requested again
        /// </summary>
        [Input("aupExpire")]
        public Input<int>? AupExpire { get; set; }

        /// <summary>
        /// proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
        /// </summary>
        [Input("aupSslProxy")]
        public Input<bool>? AupSslProxy { get; set; }

        /// <summary>
        /// the download bandwidth cap of the link, in Mbps
        /// </summary>
        [Input("downloadMbps")]
        public Input<int>? DownloadMbps { get; set; }

        /// <summary>
        /// if `use_xff`==`true`, display Acceptable Use Policy (AUP)
        /// </summary>
        [Input("enableAup")]
        public Input<bool>? EnableAup { get; set; }

        /// <summary>
        /// when `enforce_authentication`==`false`, display caution notification for non-authenticated users
        /// </summary>
        [Input("enableCaution")]
        public Input<bool>? EnableCaution { get; set; }

        [Input("enforceAuthentication")]
        public Input<bool>? EnforceAuthentication { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("subLocations")]
        private InputList<Inputs.GatewaytemplateTunnelProviderOptionsZscalerSubLocationGetArgs>? _subLocations;

        /// <summary>
        /// if `use_xff`==`true`
        /// </summary>
        public InputList<Inputs.GatewaytemplateTunnelProviderOptionsZscalerSubLocationGetArgs> SubLocations
        {
            get => _subLocations ?? (_subLocations = new InputList<Inputs.GatewaytemplateTunnelProviderOptionsZscalerSubLocationGetArgs>());
            set => _subLocations = value;
        }

        /// <summary>
        /// the download bandwidth cap of the link, in Mbps
        /// </summary>
        [Input("uploadMbps")]
        public Input<int>? UploadMbps { get; set; }

        /// <summary>
        /// location uses proxy chaining to forward traffic
        /// </summary>
        [Input("useXff")]
        public Input<bool>? UseXff { get; set; }

        public GatewaytemplateTunnelProviderOptionsZscalerGetArgs()
        {
        }
        public static new GatewaytemplateTunnelProviderOptionsZscalerGetArgs Empty => new GatewaytemplateTunnelProviderOptionsZscalerGetArgs();
    }
}
