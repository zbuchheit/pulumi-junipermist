// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlantemplateExceptionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("siteIds")]
        private InputList<string>? _siteIds;

        /// <summary>
        /// list of site ids
        /// </summary>
        public InputList<string> SiteIds
        {
            get => _siteIds ?? (_siteIds = new InputList<string>());
            set => _siteIds = value;
        }

        [Input("sitegroupIds")]
        private InputList<string>? _sitegroupIds;

        /// <summary>
        /// list of sitegroup ids
        /// </summary>
        public InputList<string> SitegroupIds
        {
            get => _sitegroupIds ?? (_sitegroupIds = new InputList<string>());
            set => _sitegroupIds = value;
        }

        public WlantemplateExceptionsGetArgs()
        {
        }
        public static new WlantemplateExceptionsGetArgs Empty => new WlantemplateExceptionsGetArgs();
    }
}
