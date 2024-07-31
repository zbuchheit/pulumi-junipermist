// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingMxedgeMgmtGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("fipsEnabled")]
        public Input<bool>? FipsEnabled { get; set; }

        [Input("mistPassword")]
        private Input<string>? _mistPassword;
        public Input<string>? MistPassword
        {
            get => _mistPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _mistPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// enum: `dhcp`, `disabled`, `static`
        /// </summary>
        [Input("oobIpType")]
        public Input<string>? OobIpType { get; set; }

        /// <summary>
        /// enum: `autoconf`, `dhcp`, `disabled`, `static`
        /// </summary>
        [Input("oobIpType6")]
        public Input<string>? OobIpType6 { get; set; }

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

        public SettingMxedgeMgmtGetArgs()
        {
        }
        public static new SettingMxedgeMgmtGetArgs Empty => new SettingMxedgeMgmtGetArgs();
    }
}
