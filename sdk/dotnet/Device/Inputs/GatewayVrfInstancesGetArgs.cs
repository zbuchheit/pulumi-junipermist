// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayVrfInstancesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("networks")]
        private InputList<string>? _networks;
        public InputList<string> Networks
        {
            get => _networks ?? (_networks = new InputList<string>());
            set => _networks = value;
        }

        public GatewayVrfInstancesGetArgs()
        {
        }
        public static new GatewayVrfInstancesGetArgs Empty => new GatewayVrfInstancesGetArgs();
    }
}
