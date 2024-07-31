// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class ApPwrConfig
    {
        /// <summary>
        /// additional power to request during negotiating with PSE over PoE, in mW
        /// </summary>
        public readonly int? Base;
        /// <summary>
        /// whether to enable power out to peripheral, meanwhile will reduce power to wifi (only for AP45 at power mode)
        /// </summary>
        public readonly bool? PreferUsbOverWifi;

        [OutputConstructor]
        private ApPwrConfig(
            int? @base,

            bool? preferUsbOverWifi)
        {
            Base = @base;
            PreferUsbOverWifi = preferUsbOverWifi;
        }
    }
}
