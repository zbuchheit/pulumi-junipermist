// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the list of WAN Assurance IDP Profiles.An IDP Profile is a configuration setting that defines the behavior and actions of an intrusion detection and prevention (IDP) system.It specifies how the idp system should detect and respond to potential security threats or attacks on a network.The profile includes rules and policies that determine which types of traffic or attacks should be monitored,what actions should be taken when a threat is detected, and any exceptions or exclusions for specific destinations or attack types.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const idpprofiles = junipermist.org.getIdpprofiles({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getIdpprofiles(args: GetIdpprofilesArgs, opts?: pulumi.InvokeOptions): Promise<GetIdpprofilesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("junipermist:org/getIdpprofiles:getIdpprofiles", {
        "orgId": args.orgId,
    }, opts);
}

/**
 * A collection of arguments for invoking getIdpprofiles.
 */
export interface GetIdpprofilesArgs {
    orgId: string;
}

/**
 * A collection of values returned by getIdpprofiles.
 */
export interface GetIdpprofilesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly orgId: string;
    readonly orgIdpprofiles: outputs.org.GetIdpprofilesOrgIdpprofile[];
}
/**
 * This data source provides the list of WAN Assurance IDP Profiles.An IDP Profile is a configuration setting that defines the behavior and actions of an intrusion detection and prevention (IDP) system.It specifies how the idp system should detect and respond to potential security threats or attacks on a network.The profile includes rules and policies that determine which types of traffic or attacks should be monitored,what actions should be taken when a threat is detected, and any exceptions or exclusions for specific destinations or attack types.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/junipermist";
 *
 * const idpprofiles = junipermist.org.getIdpprofiles({
 *     orgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
 * });
 * ```
 */
export function getIdpprofilesOutput(args: GetIdpprofilesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIdpprofilesResult> {
    return pulumi.output(args).apply((a: any) => getIdpprofiles(a, opts))
}

/**
 * A collection of arguments for invoking getIdpprofiles.
 */
export interface GetIdpprofilesOutputArgs {
    orgId: pulumi.Input<string>;
}
