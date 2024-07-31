// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site
{
    /// <summary>
    /// This resource manages the Site Wxlan tags (labels).A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions.They can be used   * within the WxRules to create filtering rules, or assign specific VLAN  * in the WLANs configuration to assign a WLAN to specific APs  * to identify unknown application used by Wi-Fi clients
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
    ///     var wtagOne = new JuniperMist.Site.Wxtag("wtag_one", new()
    ///     {
    ///         SiteId = terraformTest.Id,
    ///         Name = "wtag_one",
    ///         Values = new[]
    ///         {
    ///             "10.3.0.0/16",
    ///         },
    ///         Op = "in",
    ///         Type = "match",
    ///         Match = "ip_range_subnet",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:site/wxtag:Wxtag")]
    public partial class Wxtag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// if `type`==`client`, Client MAC Address
        /// </summary>
        [Output("mac")]
        public Output<string?> Mac { get; private set; } = null!;

        /// <summary>
        /// required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
        /// `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        /// </summary>
        [Output("match")]
        public Output<string?> Match { get; private set; } = null!;

        /// <summary>
        /// The name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        /// </summary>
        [Output("op")]
        public Output<string> Op { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;

        /// <summary>
        /// if `type`==`spec`
        /// </summary>
        [Output("specs")]
        public Output<ImmutableArray<Outputs.WxtagSpec>> Specs { get; private set; } = null!;

        /// <summary>
        /// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
        /// `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
        /// `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
        /// `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
        /// Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ “6=1”, “26=10.2.3.4” ], this
        /// support other RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches
        /// the ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
        /// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
        /// `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
        /// list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        /// </summary>
        [Output("values")]
        public Output<ImmutableArray<string>> Values { get; private set; } = null!;

        [Output("vlanId")]
        public Output<string?> VlanId { get; private set; } = null!;


        /// <summary>
        /// Create a Wxtag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Wxtag(string name, WxtagArgs args, CustomResourceOptions? options = null)
            : base("junipermist:site/wxtag:Wxtag", name, args ?? new WxtagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Wxtag(string name, Input<string> id, WxtagState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:site/wxtag:Wxtag", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Wxtag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Wxtag Get(string name, Input<string> id, WxtagState? state = null, CustomResourceOptions? options = null)
        {
            return new Wxtag(name, id, state, options);
        }
    }

    public sealed class WxtagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// if `type`==`client`, Client MAC Address
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
        /// `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// The name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        /// </summary>
        [Input("op")]
        public Input<string>? Op { get; set; }

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        [Input("specs")]
        private InputList<Inputs.WxtagSpecArgs>? _specs;

        /// <summary>
        /// if `type`==`spec`
        /// </summary>
        public InputList<Inputs.WxtagSpecArgs> Specs
        {
            get => _specs ?? (_specs = new InputList<Inputs.WxtagSpecArgs>());
            set => _specs = value;
        }

        /// <summary>
        /// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
        /// `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
        /// `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
        /// `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
        /// Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ “6=1”, “26=10.2.3.4” ], this
        /// support other RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches
        /// the ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
        /// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
        /// `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
        /// list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        public WxtagArgs()
        {
        }
        public static new WxtagArgs Empty => new WxtagArgs();
    }

    public sealed class WxtagState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// if `type`==`client`, Client MAC Address
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
        /// `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// The name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        /// </summary>
        [Input("op")]
        public Input<string>? Op { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("specs")]
        private InputList<Inputs.WxtagSpecGetArgs>? _specs;

        /// <summary>
        /// if `type`==`spec`
        /// </summary>
        public InputList<Inputs.WxtagSpecGetArgs> Specs
        {
            get => _specs ?? (_specs = new InputList<Inputs.WxtagSpecGetArgs>());
            set => _specs = value;
        }

        /// <summary>
        /// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
        /// `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
        /// `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
        /// `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
        /// Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ “6=1”, “26=10.2.3.4” ], this
        /// support other RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches
        /// the ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
        /// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
        /// `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
        /// list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        public WxtagState()
        {
        }
        public static new WxtagState Empty => new WxtagState();
    }
}
