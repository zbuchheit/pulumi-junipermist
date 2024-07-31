// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingDeviceCertArgs : global::Pulumi.ResourceArgs
    {
        [Input("cert", required: true)]
        public Input<string> Cert { get; set; } = null!;

        [Input("key", required: true)]
        private Input<string>? _key;
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SettingDeviceCertArgs()
        {
        }
        public static new SettingDeviceCertArgs Empty => new SettingDeviceCertArgs();
    }
}
