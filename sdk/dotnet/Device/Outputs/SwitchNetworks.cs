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
    public sealed class SwitchNetworks
    {
        /// <summary>
        /// whether to stop clients to talk to each other, default is false (when enabled, a unique isolation_vlan_id is required)
        /// NOTE: this features requires uplink device to also a be Juniper device and `inter_switch_link` to be set
        /// </summary>
        public readonly bool? Isolation;
        public readonly string? IsolationVlanId;
        /// <summary>
        /// optional for pure switching, required when L3 / routing features are used
        /// </summary>
        public readonly string? Subnet;
        public readonly string VlanId;

        [OutputConstructor]
        private SwitchNetworks(
            bool? isolation,

            string? isolationVlanId,

            string? subnet,

            string vlanId)
        {
            Isolation = isolation;
            IsolationVlanId = isolationVlanId;
            Subnet = subnet;
            VlanId = vlanId;
        }
    }
}
