// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource manages WAN Assurance Service Policies (Application Policiess).The Service Policies are used in the `servicepolicy_policies` from the Gateway configuration and Gateway templates.They can be used to manage common policies betweeen multiples configurations
    /// </summary>
    [JuniperMistResourceType("junipermist:org/servicepolicy:Servicepolicy")]
    public partial class Servicepolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// enum: `allow`, `deny`
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// For SRX Only
        /// </summary>
        [Output("appqoe")]
        public Output<Outputs.ServicepolicyAppqoe?> Appqoe { get; private set; } = null!;

        [Output("ewfs")]
        public Output<ImmutableArray<Outputs.ServicepolicyEwf>> Ewfs { get; private set; } = null!;

        [Output("idp")]
        public Output<Outputs.ServicepolicyIdp?> Idp { get; private set; } = null!;

        /// <summary>
        /// access within the same VRF
        /// </summary>
        [Output("localRouting")]
        public Output<bool> LocalRouting { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// by default, we derive all paths available and use them
        /// optionally, you can customize by using `path_preference`
        /// </summary>
        [Output("pathPreference")]
        public Output<string?> PathPreference { get; private set; } = null!;

        [Output("services")]
        public Output<ImmutableArray<string>> Services { get; private set; } = null!;

        [Output("tenants")]
        public Output<ImmutableArray<string>> Tenants { get; private set; } = null!;


        /// <summary>
        /// Create a Servicepolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Servicepolicy(string name, ServicepolicyArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/servicepolicy:Servicepolicy", name, args ?? new ServicepolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Servicepolicy(string name, Input<string> id, ServicepolicyState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/servicepolicy:Servicepolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Servicepolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Servicepolicy Get(string name, Input<string> id, ServicepolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new Servicepolicy(name, id, state, options);
        }
    }

    public sealed class ServicepolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `allow`, `deny`
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// For SRX Only
        /// </summary>
        [Input("appqoe")]
        public Input<Inputs.ServicepolicyAppqoeArgs>? Appqoe { get; set; }

        [Input("ewfs")]
        private InputList<Inputs.ServicepolicyEwfArgs>? _ewfs;
        public InputList<Inputs.ServicepolicyEwfArgs> Ewfs
        {
            get => _ewfs ?? (_ewfs = new InputList<Inputs.ServicepolicyEwfArgs>());
            set => _ewfs = value;
        }

        [Input("idp")]
        public Input<Inputs.ServicepolicyIdpArgs>? Idp { get; set; }

        /// <summary>
        /// access within the same VRF
        /// </summary>
        [Input("localRouting")]
        public Input<bool>? LocalRouting { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// by default, we derive all paths available and use them
        /// optionally, you can customize by using `path_preference`
        /// </summary>
        [Input("pathPreference")]
        public Input<string>? PathPreference { get; set; }

        [Input("services")]
        private InputList<string>? _services;
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        [Input("tenants")]
        private InputList<string>? _tenants;
        public InputList<string> Tenants
        {
            get => _tenants ?? (_tenants = new InputList<string>());
            set => _tenants = value;
        }

        public ServicepolicyArgs()
        {
        }
        public static new ServicepolicyArgs Empty => new ServicepolicyArgs();
    }

    public sealed class ServicepolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `allow`, `deny`
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// For SRX Only
        /// </summary>
        [Input("appqoe")]
        public Input<Inputs.ServicepolicyAppqoeGetArgs>? Appqoe { get; set; }

        [Input("ewfs")]
        private InputList<Inputs.ServicepolicyEwfGetArgs>? _ewfs;
        public InputList<Inputs.ServicepolicyEwfGetArgs> Ewfs
        {
            get => _ewfs ?? (_ewfs = new InputList<Inputs.ServicepolicyEwfGetArgs>());
            set => _ewfs = value;
        }

        [Input("idp")]
        public Input<Inputs.ServicepolicyIdpGetArgs>? Idp { get; set; }

        /// <summary>
        /// access within the same VRF
        /// </summary>
        [Input("localRouting")]
        public Input<bool>? LocalRouting { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// by default, we derive all paths available and use them
        /// optionally, you can customize by using `path_preference`
        /// </summary>
        [Input("pathPreference")]
        public Input<string>? PathPreference { get; set; }

        [Input("services")]
        private InputList<string>? _services;
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        [Input("tenants")]
        private InputList<string>? _tenants;
        public InputList<string> Tenants
        {
            get => _tenants ?? (_tenants = new InputList<string>());
            set => _tenants = value;
        }

        public ServicepolicyState()
        {
        }
        public static new ServicepolicyState Empty => new ServicepolicyState();
    }
}
