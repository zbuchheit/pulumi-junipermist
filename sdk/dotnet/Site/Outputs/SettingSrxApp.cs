// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class SettingSrxApp
    {
        public readonly bool? Enabled;

        [OutputConstructor]
        private SettingSrxApp(bool? enabled)
        {
            Enabled = enabled;
        }
    }
}
