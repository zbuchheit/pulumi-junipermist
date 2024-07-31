// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource managed the Org Site Groups (sitegroups).A site group is a feature that allows users to group multiple sites together based on regions, functions, or other parameters for efficient management of devices. Sites can exist in multiple groups simultaneously, and site groups can be used to ensure consistent settings, manage administrator access, and apply specific templates to groups of sites.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const sitegroupOne = new junipermist.org.Sitegroup("sitegroup_one", {
 *     orgId: terraformTest.id,
 *     name: "sitegroup_one",
 * });
 * ```
 */
export class Sitegroup extends pulumi.CustomResource {
    /**
     * Get an existing Sitegroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SitegroupState, opts?: pulumi.CustomResourceOptions): Sitegroup {
        return new Sitegroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/sitegroup:Sitegroup';

    /**
     * Returns true if the given object is an instance of Sitegroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Sitegroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Sitegroup.__pulumiType;
    }

    public readonly name!: pulumi.Output<string>;
    public readonly orgId!: pulumi.Output<string>;

    /**
     * Create a Sitegroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SitegroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SitegroupArgs | SitegroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SitegroupState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
        } else {
            const args = argsOrState as SitegroupArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Sitegroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Sitegroup resources.
 */
export interface SitegroupState {
    name?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Sitegroup resource.
 */
export interface SitegroupArgs {
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
}
