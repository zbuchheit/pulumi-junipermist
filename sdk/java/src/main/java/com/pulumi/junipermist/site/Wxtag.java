// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.site.WxtagArgs;
import com.pulumi.junipermist.site.inputs.WxtagState;
import com.pulumi.junipermist.site.outputs.WxtagSpec;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Site Wxlan tags (labels).A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions.They can be used   * within the WxRules to create filtering rules, or assign specific VLAN  * in the WLANs configuration to assign a WLAN to specific APs  * to identify unknown application used by Wi-Fi clients
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.junipermist.site.Wxtag;
 * import com.pulumi.junipermist.site.WxtagArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var wtagOne = new Wxtag("wtagOne", WxtagArgs.builder()
 *             .siteId(terraformTest.id())
 *             .name("wtag_one")
 *             .values("10.3.0.0/16")
 *             .op("in")
 *             .type("match")
 *             .match("ip_range_subnet")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="junipermist:site/wxtag:Wxtag")
public class Wxtag extends com.pulumi.resources.CustomResource {
    /**
     * if `type`==`client`, Client MAC Address
     * 
     */
    @Export(name="mac", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mac;

    /**
     * @return if `type`==`client`, Client MAC Address
     * 
     */
    public Output<Optional<String>> mac() {
        return Codegen.optional(this.mac);
    }
    /**
     * required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
     * `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
     * 
     */
    @Export(name="match", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> match;

    /**
     * @return required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
     * `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
     * 
     */
    public Output<Optional<String>> match() {
        return Codegen.optional(this.match);
    }
    /**
     * The name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
     * 
     */
    @Export(name="op", refs={String.class}, tree="[0]")
    private Output<String> op;

    /**
     * @return required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
     * 
     */
    public Output<String> op() {
        return this.op;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }
    /**
     * if `type`==`spec`
     * 
     */
    @Export(name="specs", refs={List.class,WxtagSpec.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WxtagSpec>> specs;

    /**
     * @return if `type`==`spec`
     * 
     */
    public Output<Optional<List<WxtagSpec>>> specs() {
        return Codegen.optional(this.specs);
    }
    /**
     * enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
     * `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
     * `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
     * `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
     * Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ “6=1”, “26=10.2.3.4” ], this
     * support other RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches
     * the ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
     * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
     * `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
     * list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
     * 
     */
    @Export(name="values", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> values;

    /**
     * @return required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
     * `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
     * `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
     * `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
     * Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ “6=1”, “26=10.2.3.4” ], this
     * support other RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches
     * the ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
     * Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
     * `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
     * list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
     * 
     */
    public Output<Optional<List<String>>> values() {
        return Codegen.optional(this.values);
    }
    @Export(name="vlanId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlanId;

    public Output<Optional<String>> vlanId() {
        return Codegen.optional(this.vlanId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Wxtag(String name) {
        this(name, WxtagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Wxtag(String name, WxtagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Wxtag(String name, WxtagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:site/wxtag:Wxtag", name, args == null ? WxtagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Wxtag(String name, Output<String> id, @Nullable WxtagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:site/wxtag:Wxtag", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Wxtag get(String name, Output<String> id, @Nullable WxtagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Wxtag(name, id, state, options);
    }
}
