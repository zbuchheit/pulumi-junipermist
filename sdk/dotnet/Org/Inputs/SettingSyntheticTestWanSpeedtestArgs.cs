// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingSyntheticTestWanSpeedtestArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// any / HH:MM (24-hour format)
        /// </summary>
        [Input("timeOdFay")]
        public Input<string>? TimeOdFay { get; set; }

        public SettingSyntheticTestWanSpeedtestArgs()
        {
        }
        public static new SettingSyntheticTestWanSpeedtestArgs Empty => new SettingSyntheticTestWanSpeedtestArgs();
    }
}
