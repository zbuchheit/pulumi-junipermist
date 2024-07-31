// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingMistNacIdpArgs : global::Pulumi.ResourceArgs
    {
        [Input("excludeRealms")]
        private InputList<string>? _excludeRealms;

        /// <summary>
        /// when the IDP of mxedge_proxy type, exclude the following realms from proxying in addition to other valid home realms in this org
        /// </summary>
        public InputList<string> ExcludeRealms
        {
            get => _excludeRealms ?? (_excludeRealms = new InputList<string>());
            set => _excludeRealms = value;
        }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("userRealms")]
        private InputList<string>? _userRealms;

        /// <summary>
        /// which realm should trigger this IDP. User Realm is extracted from:
        ///   * Username-AVP (`mist.com` from john@mist.com)
        ///   * Cert CN
        /// </summary>
        public InputList<string> UserRealms
        {
            get => _userRealms ?? (_userRealms = new InputList<string>());
            set => _userRealms = value;
        }

        public SettingMistNacIdpArgs()
        {
        }
        public static new SettingMistNacIdpArgs Empty => new SettingMistNacIdpArgs();
    }
}
