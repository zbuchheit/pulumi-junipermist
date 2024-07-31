// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    public static class GetInventory
    {
        /// <summary>
        /// This data source provides the list of Devices in the Org inventory.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using JuniperMist = Pulumi.JuniperMist;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var inventory = JuniperMist.Org.GetInventory.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetInventoryResult> InvokeAsync(GetInventoryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInventoryResult>("junipermist:org/getInventory:getInventory", args ?? new GetInventoryArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Devices in the Org inventory.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using JuniperMist = Pulumi.JuniperMist;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var inventory = JuniperMist.Org.GetInventory.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetInventoryResult> Invoke(GetInventoryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInventoryResult>("junipermist:org/getInventory:getInventory", args ?? new GetInventoryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInventoryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// MAC address
        /// </summary>
        [Input("mac")]
        public string? Mac { get; set; }

        /// <summary>
        /// device model
        /// </summary>
        [Input("model")]
        public string? Model { get; set; }

        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// device serial
        /// </summary>
        [Input("serial")]
        public string? Serial { get; set; }

        /// <summary>
        /// site id if assigned, null if not assigned
        /// </summary>
        [Input("siteId")]
        public string? SiteId { get; set; }

        /// <summary>
        /// to display Unassigned devices
        /// </summary>
        [Input("unassigned")]
        public bool? Unassigned { get; set; }

        /// <summary>
        /// To display Virtual Chassis members
        /// </summary>
        [Input("vc")]
        public bool? Vc { get; set; }

        /// <summary>
        /// Virtual Chassis MAC Address
        /// </summary>
        [Input("vcMac")]
        public string? VcMac { get; set; }

        public GetInventoryArgs()
        {
        }
        public static new GetInventoryArgs Empty => new GetInventoryArgs();
    }

    public sealed class GetInventoryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// MAC address
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// device model
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// device serial
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// site id if assigned, null if not assigned
        /// </summary>
        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        /// <summary>
        /// to display Unassigned devices
        /// </summary>
        [Input("unassigned")]
        public Input<bool>? Unassigned { get; set; }

        /// <summary>
        /// To display Virtual Chassis members
        /// </summary>
        [Input("vc")]
        public Input<bool>? Vc { get; set; }

        /// <summary>
        /// Virtual Chassis MAC Address
        /// </summary>
        [Input("vcMac")]
        public Input<string>? VcMac { get; set; }

        public GetInventoryInvokeArgs()
        {
        }
        public static new GetInventoryInvokeArgs Empty => new GetInventoryInvokeArgs();
    }


    [OutputType]
    public sealed class GetInventoryResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// MAC address
        /// </summary>
        public readonly string? Mac;
        /// <summary>
        /// device model
        /// </summary>
        public readonly string? Model;
        public readonly string OrgId;
        public readonly ImmutableArray<Outputs.GetInventoryOrgInventoryResult> OrgInventories;
        /// <summary>
        /// device serial
        /// </summary>
        public readonly string? Serial;
        /// <summary>
        /// site id if assigned, null if not assigned
        /// </summary>
        public readonly string? SiteId;
        /// <summary>
        /// to display Unassigned devices
        /// </summary>
        public readonly bool? Unassigned;
        /// <summary>
        /// To display Virtual Chassis members
        /// </summary>
        public readonly bool? Vc;
        /// <summary>
        /// Virtual Chassis MAC Address
        /// </summary>
        public readonly string? VcMac;

        [OutputConstructor]
        private GetInventoryResult(
            string id,

            string? mac,

            string? model,

            string orgId,

            ImmutableArray<Outputs.GetInventoryOrgInventoryResult> orgInventories,

            string? serial,

            string? siteId,

            bool? unassigned,

            bool? vc,

            string? vcMac)
        {
            Id = id;
            Mac = mac;
            Model = model;
            OrgId = orgId;
            OrgInventories = orgInventories;
            Serial = serial;
            SiteId = siteId;
            Unassigned = unassigned;
            Vc = vc;
            VcMac = vcMac;
        }
    }
}
