// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSnmpConfigV2cConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("authorization")]
        public Input<string>? Authorization { get; set; }

        /// <summary>
        /// client_list_name here should refer to client_list above
        /// </summary>
        [Input("clientListName")]
        public Input<string>? ClientListName { get; set; }

        [Input("communityName")]
        public Input<string>? CommunityName { get; set; }

        /// <summary>
        /// view name here should be defined in views above
        /// </summary>
        [Input("view")]
        public Input<string>? View { get; set; }

        public SwitchSnmpConfigV2cConfigArgs()
        {
        }
        public static new SwitchSnmpConfigV2cConfigArgs Empty => new SwitchSnmpConfigV2cConfigArgs();
    }
}
