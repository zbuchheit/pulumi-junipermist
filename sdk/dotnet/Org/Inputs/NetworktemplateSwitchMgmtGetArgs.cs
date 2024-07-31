// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateSwitchMgmtGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("configRevert")]
        public Input<int>? ConfigRevert { get; set; }

        /// <summary>
        /// restrict inbound-traffic to host
        /// when enabled, all traffic that is not essential to our operation will be dropped 
        /// e.g. ntp / dns / traffic to mist will be allowed by default, if dhcpd is enabled, we'll make sure it works
        /// </summary>
        [Input("protectRe")]
        public Input<Inputs.NetworktemplateSwitchMgmtProtectReGetArgs>? ProtectRe { get; set; }

        [Input("rootPassword")]
        private Input<string>? _rootPassword;
        public Input<string>? RootPassword
        {
            get => _rootPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tacacs")]
        public Input<Inputs.NetworktemplateSwitchMgmtTacacsGetArgs>? Tacacs { get; set; }

        public NetworktemplateSwitchMgmtGetArgs()
        {
        }
        public static new NetworktemplateSwitchMgmtGetArgs Empty => new NetworktemplateSwitchMgmtGetArgs();
    }
}
