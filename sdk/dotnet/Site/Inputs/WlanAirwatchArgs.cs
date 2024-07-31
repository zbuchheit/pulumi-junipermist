// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanAirwatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// API Key
        /// </summary>
        [Input("apiKey", required: true)]
        public Input<string> ApiKey { get; set; } = null!;

        /// <summary>
        /// console URL
        /// </summary>
        [Input("consoleUrl", required: true)]
        public Input<string> ConsoleUrl { get; set; } = null!;

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// password
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// username
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public WlanAirwatchArgs()
        {
        }
        public static new WlanAirwatchArgs Empty => new WlanAirwatchArgs();
    }
}
