// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// only required if `type`==`context_prefix`
        /// </summary>
        [Input("contextPrefix")]
        public Input<string>? ContextPrefix { get; set; }

        /// <summary>
        /// refer to view name
        /// </summary>
        [Input("notifyView")]
        public Input<string>? NotifyView { get; set; }

        /// <summary>
        /// refer to view name
        /// </summary>
        [Input("readView")]
        public Input<string>? ReadView { get; set; }

        /// <summary>
        /// enum: `authentication`, `none`, `privacy`
        /// </summary>
        [Input("securityLevel")]
        public Input<string>? SecurityLevel { get; set; }

        /// <summary>
        /// enum: `any`, `usm`, `v1`, `v2c`
        /// </summary>
        [Input("securityModel")]
        public Input<string>? SecurityModel { get; set; }

        /// <summary>
        /// enum: `context_prefix`, `default_context_prefix`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// refer to view name
        /// </summary>
        [Input("writeView")]
        public Input<string>? WriteView { get; set; }

        public NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListGetArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListGetArgs Empty => new NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListGetArgs();
    }
}