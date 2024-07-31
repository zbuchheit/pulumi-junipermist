// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device
{
    public static class GetSwitchStats
    {
        /// <summary>
        /// This data source provides the list of Switches with their statistics.
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
        ///     var switchStats = JuniperMist.Device.GetSwitchStats.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSwitchStatsResult> InvokeAsync(GetSwitchStatsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSwitchStatsResult>("junipermist:device/getSwitchStats:getSwitchStats", args ?? new GetSwitchStatsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the list of Switches with their statistics.
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
        ///     var switchStats = JuniperMist.Device.GetSwitchStats.Invoke(new()
        ///     {
        ///         OrgId = "15fca2ac-b1a6-47cc-9953-cc6906281550",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSwitchStatsResult> Invoke(GetSwitchStatsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSwitchStatsResult>("junipermist:device/getSwitchStats:getSwitchStats", args ?? new GetSwitchStatsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSwitchStatsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// duration like 7d, 2w
        /// </summary>
        [Input("duration")]
        public string? Duration { get; set; }

        /// <summary>
        /// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
        /// </summary>
        [Input("end")]
        public int? End { get; set; }

        /// <summary>
        /// if `evpn_unused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
        /// </summary>
        [Input("evpnUnused")]
        public string? EvpnUnused { get; set; }

        /// <summary>
        /// EVPN Topology ID
        /// </summary>
        [Input("evpntopoId")]
        public string? EvpntopoId { get; set; }

        [Input("mac")]
        public string? Mac { get; set; }

        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        [Input("siteId")]
        public string? SiteId { get; set; }

        /// <summary>
        /// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
        /// </summary>
        [Input("start")]
        public int? Start { get; set; }

        [Input("status")]
        public string? Status { get; set; }

        public GetSwitchStatsArgs()
        {
        }
        public static new GetSwitchStatsArgs Empty => new GetSwitchStatsArgs();
    }

    public sealed class GetSwitchStatsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// duration like 7d, 2w
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
        /// </summary>
        [Input("end")]
        public Input<int>? End { get; set; }

        /// <summary>
        /// if `evpn_unused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
        /// </summary>
        [Input("evpnUnused")]
        public Input<string>? EvpnUnused { get; set; }

        /// <summary>
        /// EVPN Topology ID
        /// </summary>
        [Input("evpntopoId")]
        public Input<string>? EvpntopoId { get; set; }

        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        /// <summary>
        /// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
        /// </summary>
        [Input("start")]
        public Input<int>? Start { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetSwitchStatsInvokeArgs()
        {
        }
        public static new GetSwitchStatsInvokeArgs Empty => new GetSwitchStatsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSwitchStatsResult
    {
        public readonly ImmutableArray<Outputs.GetSwitchStatsDeviceSwitchStatResult> DeviceSwitchStats;
        /// <summary>
        /// duration like 7d, 2w
        /// </summary>
        public readonly string? Duration;
        /// <summary>
        /// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
        /// </summary>
        public readonly int? End;
        /// <summary>
        /// if `evpn_unused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
        /// </summary>
        public readonly string? EvpnUnused;
        /// <summary>
        /// EVPN Topology ID
        /// </summary>
        public readonly string? EvpntopoId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Mac;
        public readonly string OrgId;
        public readonly string? SiteId;
        /// <summary>
        /// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
        /// </summary>
        public readonly int? Start;
        public readonly string? Status;

        [OutputConstructor]
        private GetSwitchStatsResult(
            ImmutableArray<Outputs.GetSwitchStatsDeviceSwitchStatResult> deviceSwitchStats,

            string? duration,

            int? end,

            string? evpnUnused,

            string? evpntopoId,

            string id,

            string? mac,

            string orgId,

            string? siteId,

            int? start,

            string? status)
        {
            DeviceSwitchStats = deviceSwitchStats;
            Duration = duration;
            End = end;
            EvpnUnused = evpnUnused;
            EvpntopoId = evpntopoId;
            Id = id;
            Mac = mac;
            OrgId = orgId;
            SiteId = siteId;
            Start = start;
            Status = status;
        }
    }
}
