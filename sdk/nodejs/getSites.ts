// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This datasource provides the list of sites in a Mist Organization.A site represents a project, a deployment. A site contains a set of Maps, Wlans, Policies, Zones, ...
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const sites = junipermist.getSites({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getSites(args: GetSitesArgs, opts?: pulumi.InvokeOptions): Promise<GetSitesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:index/getSites:getSites", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSites.
 */
export interface GetSitesArgs {
    orgId: string;
}

/**
 * A collection of values returned by getSites.
 */
export interface GetSitesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
    readonly sites: outputs.GetSitesSite[];
}
/**
 * This datasource provides the list of sites in a Mist Organization.A site represents a project, a deployment. A site contains a set of Maps, Wlans, Policies, Zones, ...
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const sites = junipermist.getSites({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getSitesOutput(args: GetSitesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSitesResult> {
    return pulumi.output(args).apply((a: any) => getSites(a, opts))
}

/**
 * A collection of arguments for invoking getSites.
 */
export interface GetSitesOutputArgs {
    orgId: pulumi.Input<string>;
}
