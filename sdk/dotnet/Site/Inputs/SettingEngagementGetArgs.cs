// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingEngagementGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dwellTagNames")]
        public Input<Inputs.SettingEngagementDwellTagNamesGetArgs>? DwellTagNames { get; set; }

        /// <summary>
        /// add tags to visits within the duration (in seconds), available tags (passerby, bounce, engaged, stationed)
        /// </summary>
        [Input("dwellTags")]
        public Input<Inputs.SettingEngagementDwellTagsGetArgs>? DwellTags { get; set; }

        /// <summary>
        /// hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun).
        /// </summary>
        [Input("hours")]
        public Input<Inputs.SettingEngagementHoursGetArgs>? Hours { get; set; }

        /// <summary>
        /// max time, default is 43200(12h), max is 68400 (18h)
        /// </summary>
        [Input("maxDwell")]
        public Input<int>? MaxDwell { get; set; }

        /// <summary>
        /// min time
        /// </summary>
        [Input("minDwell")]
        public Input<int>? MinDwell { get; set; }

        public SettingEngagementGetArgs()
        {
        }
        public static new SettingEngagementGetArgs Empty => new SettingEngagementGetArgs();
    }
}
