// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This resource manages the Org inventory.It can be used to claim, unclaim, assign, unassign, reassign devices
 */
export class Inventory extends pulumi.CustomResource {
    /**
     * Get an existing Inventory resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InventoryState, opts?: pulumi.CustomResourceOptions): Inventory {
        return new Inventory(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:org/inventory:Inventory';

    /**
     * Returns true if the given object is an instance of Inventory.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Inventory {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Inventory.__pulumiType;
    }

    public readonly devices!: pulumi.Output<outputs.org.InventoryDevice[]>;
    public readonly orgId!: pulumi.Output<string>;

    /**
     * Create a Inventory resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InventoryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InventoryArgs | InventoryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InventoryState | undefined;
            resourceInputs["devices"] = state ? state.devices : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
        } else {
            const args = argsOrState as InventoryArgs | undefined;
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["devices"] = args ? args.devices : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Inventory.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Inventory resources.
 */
export interface InventoryState {
    devices?: pulumi.Input<pulumi.Input<inputs.org.InventoryDevice>[]>;
    orgId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Inventory resource.
 */
export interface InventoryArgs {
    devices?: pulumi.Input<pulumi.Input<inputs.org.InventoryDevice>[]>;
    orgId: pulumi.Input<string>;
}
