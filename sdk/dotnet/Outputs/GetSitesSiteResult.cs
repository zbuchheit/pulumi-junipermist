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
    public sealed class GetSitesSiteResult
    {
        /// <summary>
        /// full address of the site
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        /// </summary>
        public readonly string AlarmtemplateId;
        /// <summary>
        /// AP Template ID, used by APs
        /// </summary>
        public readonly string AptemplateId;
        /// <summary>
        /// country code for the site (for AP config generation), in two-character
        /// </summary>
        public readonly string CountryCode;
        public readonly double CreatedTime;
        /// <summary>
        /// Gateway Template ID, used by gateways
        /// </summary>
        public readonly string GatewaytemplateId;
        public readonly string Id;
        public readonly Outputs.GetSitesSiteLatlngResult Latlng;
        public readonly double ModifiedTime;
        public readonly string Name;
        /// <summary>
        /// Network Template ID, this takes precedence over Site Settings
        /// </summary>
        public readonly string NetworktemplateId;
        /// <summary>
        /// optional, any notes about the site
        /// </summary>
        public readonly string Notes;
        public readonly string OrgId;
        /// <summary>
        /// RF Template ID, this takes precedence over Site Settings
        /// </summary>
        public readonly string RftemplateId;
        /// <summary>
        /// SecPolicy ID
        /// </summary>
        public readonly string SecpolicyId;
        /// <summary>
        /// sitegroups this site belongs to
        /// </summary>
        public readonly ImmutableArray<string> SitegroupIds;
        /// <summary>
        /// Site Template ID
        /// </summary>
        public readonly string SitetemplateId;
        /// <summary>
        /// Timezone the site is at
        /// </summary>
        public readonly string Timezone;

        [OutputConstructor]
        private GetSitesSiteResult(
            string address,

            string alarmtemplateId,

            string aptemplateId,

            string countryCode,

            double createdTime,

            string gatewaytemplateId,

            string id,

            Outputs.GetSitesSiteLatlngResult latlng,

            double modifiedTime,

            string name,

            string networktemplateId,

            string notes,

            string orgId,

            string rftemplateId,

            string secpolicyId,

            ImmutableArray<string> sitegroupIds,

            string sitetemplateId,

            string timezone)
        {
            Address = address;
            AlarmtemplateId = alarmtemplateId;
            AptemplateId = aptemplateId;
            CountryCode = countryCode;
            CreatedTime = createdTime;
            GatewaytemplateId = gatewaytemplateId;
            Id = id;
            Latlng = latlng;
            ModifiedTime = modifiedTime;
            Name = name;
            NetworktemplateId = networktemplateId;
            Notes = notes;
            OrgId = orgId;
            RftemplateId = rftemplateId;
            SecpolicyId = secpolicyId;
            SitegroupIds = sitegroupIds;
            SitetemplateId = sitetemplateId;
            Timezone = timezone;
        }
    }
}
