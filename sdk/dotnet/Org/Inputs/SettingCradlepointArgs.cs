// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingCradlepointArgs : global::Pulumi.ResourceArgs
    {
        [Input("cpApiId", required: true)]
        public Input<string> CpApiId { get; set; } = null!;

        [Input("cpApiKey", required: true)]
        private Input<string>? _cpApiKey;
        public Input<string>? CpApiKey
        {
            get => _cpApiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _cpApiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("ecmApiId", required: true)]
        public Input<string> EcmApiId { get; set; } = null!;

        [Input("ecmApiKey", required: true)]
        private Input<string>? _ecmApiKey;
        public Input<string>? EcmApiKey
        {
            get => _ecmApiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _ecmApiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SettingCradlepointArgs()
        {
        }
        public static new SettingCradlepointArgs Empty => new SettingCradlepointArgs();
    }
}
