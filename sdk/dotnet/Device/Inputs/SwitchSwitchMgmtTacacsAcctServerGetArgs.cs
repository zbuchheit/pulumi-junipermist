// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSwitchMgmtTacacsAcctServerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("port")]
        public Input<string>? Port { get; set; }

        [Input("secret")]
        private Input<string>? _secret;
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public SwitchSwitchMgmtTacacsAcctServerGetArgs()
        {
        }
        public static new SwitchSwitchMgmtTacacsAcctServerGetArgs Empty => new SwitchSwitchMgmtTacacsAcctServerGetArgs();
    }
}
