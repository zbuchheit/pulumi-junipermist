// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingCriticalUrlMonitoringMonitorArgs : global::Pulumi.ResourceArgs
    {
        [Input("url")]
        public Input<string>? Url { get; set; }

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        public SettingCriticalUrlMonitoringMonitorArgs()
        {
        }
        public static new SettingCriticalUrlMonitoringMonitorArgs Empty => new SettingCriticalUrlMonitoringMonitorArgs();
    }
}
