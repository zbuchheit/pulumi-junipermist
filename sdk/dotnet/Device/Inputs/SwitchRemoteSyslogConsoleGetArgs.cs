// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchRemoteSyslogConsoleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("contents")]
        private InputList<Inputs.SwitchRemoteSyslogConsoleContentGetArgs>? _contents;
        public InputList<Inputs.SwitchRemoteSyslogConsoleContentGetArgs> Contents
        {
            get => _contents ?? (_contents = new InputList<Inputs.SwitchRemoteSyslogConsoleContentGetArgs>());
            set => _contents = value;
        }

        public SwitchRemoteSyslogConsoleGetArgs()
        {
        }
        public static new SwitchRemoteSyslogConsoleGetArgs Empty => new SwitchRemoteSyslogConsoleGetArgs();
    }
}