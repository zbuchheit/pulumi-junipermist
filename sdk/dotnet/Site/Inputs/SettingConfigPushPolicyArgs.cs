// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingConfigPushPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// stop any new config from being pushed to the device
        /// </summary>
        [Input("noPush")]
        public Input<bool>? NoPush { get; set; }

        /// <summary>
        /// if enabled, new config will only be pushed to device within the specified time window
        /// </summary>
        [Input("pushWindow")]
        public Input<Inputs.SettingConfigPushPolicyPushWindowArgs>? PushWindow { get; set; }

        public SettingConfigPushPolicyArgs()
        {
        }
        public static new SettingConfigPushPolicyArgs Empty => new SettingConfigPushPolicyArgs();
    }
}
