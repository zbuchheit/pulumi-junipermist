// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchMistNac
    {
        public readonly bool? Enabled;
        public readonly string? Network;

        [OutputConstructor]
        private SwitchMistNac(
            bool? enabled,

            string? network)
        {
            Enabled = enabled;
            Network = network;
        }
    }
}
