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
    public sealed class GetApStatsDeviceApStatRadioStatResult
    {
        /// <summary>
        /// radio stat
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatRadioStatBand24Result Band24;
        /// <summary>
        /// radio stat
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatRadioStatBand5Result Band5;
        /// <summary>
        /// radio stat
        /// </summary>
        public readonly Outputs.GetApStatsDeviceApStatRadioStatBand6Result Band6;

        [OutputConstructor]
        private GetApStatsDeviceApStatRadioStatResult(
            Outputs.GetApStatsDeviceApStatRadioStatBand24Result band24,

            Outputs.GetApStatsDeviceApStatRadioStatBand5Result band5,

            Outputs.GetApStatsDeviceApStatRadioStatBand6Result band6)
        {
            Band24 = band24;
            Band5 = band5;
            Band6 = band6;
        }
    }
}
