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
    public sealed class GetSwitchStatsDeviceSwitchStatLastTroubleResult
    {
        /// <summary>
        /// Code definitions list at /api/v1/consts/ap*led*status
        /// </summary>
        public readonly string Code;
        public readonly int Timestamp;

        [OutputConstructor]
        private GetSwitchStatsDeviceSwitchStatLastTroubleResult(
            string code,

            int timestamp)
        {
            Code = code;
            Timestamp = timestamp;
        }
    }
}
