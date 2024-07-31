// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingGatewayMgmtAppProbingArgs : global::Pulumi.ResourceArgs
    {
        [Input("apps")]
        private InputList<string>? _apps;

        /// <summary>
        /// app-keys from /api/v1/const/applications
        /// </summary>
        public InputList<string> Apps
        {
            get => _apps ?? (_apps = new InputList<string>());
            set => _apps = value;
        }

        [Input("customApps")]
        private InputList<Inputs.SettingGatewayMgmtAppProbingCustomAppArgs>? _customApps;
        public InputList<Inputs.SettingGatewayMgmtAppProbingCustomAppArgs> CustomApps
        {
            get => _customApps ?? (_customApps = new InputList<Inputs.SettingGatewayMgmtAppProbingCustomAppArgs>());
            set => _customApps = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public SettingGatewayMgmtAppProbingArgs()
        {
        }
        public static new SettingGatewayMgmtAppProbingArgs Empty => new SettingGatewayMgmtAppProbingArgs();
    }
}
