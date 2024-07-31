// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingApiPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// by default, API hides password/secrets when the user doesn't have write access
        ///   * `true`: API will hide passwords/secrets for all users
        ///   * `false`: API will hide passwords/secrets for read-only users
        /// </summary>
        [Input("noReveal")]
        public Input<bool>? NoReveal { get; set; }

        public SettingApiPolicyGetArgs()
        {
        }
        public static new SettingApiPolicyGetArgs Empty => new SettingApiPolicyGetArgs();
    }
}
