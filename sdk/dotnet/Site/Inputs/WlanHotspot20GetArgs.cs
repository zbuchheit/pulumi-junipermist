// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanHotspot20GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("domainNames")]
        private InputList<string>? _domainNames;
        public InputList<string> DomainNames
        {
            get => _domainNames ?? (_domainNames = new InputList<string>());
            set => _domainNames = value;
        }

        /// <summary>
        /// whether to enable hotspot 2.0 config
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("naiRealms")]
        private InputList<string>? _naiRealms;
        public InputList<string> NaiRealms
        {
            get => _naiRealms ?? (_naiRealms = new InputList<string>());
            set => _naiRealms = value;
        }

        [Input("operators")]
        private InputList<string>? _operators;

        /// <summary>
        /// list of operators to support
        /// </summary>
        public InputList<string> Operators
        {
            get => _operators ?? (_operators = new InputList<string>());
            set => _operators = value;
        }

        [Input("rcois")]
        private InputList<string>? _rcois;
        public InputList<string> Rcois
        {
            get => _rcois ?? (_rcois = new InputList<string>());
            set => _rcois = value;
        }

        /// <summary>
        /// venue name, default is site name
        /// </summary>
        [Input("venueName")]
        public Input<string>? VenueName { get; set; }

        public WlanHotspot20GetArgs()
        {
        }
        public static new WlanHotspot20GetArgs Empty => new WlanHotspot20GetArgs();
    }
}
