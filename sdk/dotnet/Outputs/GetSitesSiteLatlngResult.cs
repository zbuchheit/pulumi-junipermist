// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Outputs
{

    [OutputType]
    public sealed class GetSitesSiteLatlngResult
    {
        public readonly double Lat;
        public readonly double Lng;

        [OutputConstructor]
        private GetSitesSiteLatlngResult(
            double lat,

            double lng)
        {
            Lat = lat;
            Lng = lng;
        }
    }
}
