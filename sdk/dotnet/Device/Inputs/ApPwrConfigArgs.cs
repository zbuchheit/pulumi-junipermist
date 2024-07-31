// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class ApPwrConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// additional power to request during negotiating with PSE over PoE, in mW
        /// </summary>
        [Input("base")]
        public Input<int>? Base { get; set; }

        /// <summary>
        /// whether to enable power out to peripheral, meanwhile will reduce power to wifi (only for AP45 at power mode)
        /// </summary>
        [Input("preferUsbOverWifi")]
        public Input<bool>? PreferUsbOverWifi { get; set; }

        public ApPwrConfigArgs()
        {
        }
        public static new ApPwrConfigArgs Empty => new ApPwrConfigArgs();
    }
}
