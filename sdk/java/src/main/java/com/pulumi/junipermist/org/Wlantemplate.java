// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.WlantemplateArgs;
import com.pulumi.junipermist.org.inputs.WlantemplateState;
import com.pulumi.junipermist.org.outputs.WlantemplateApplies;
import com.pulumi.junipermist.org.outputs.WlantemplateExceptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource manages the Org WLAN Templates.A WLAN template is a collection of WLANs, tunneling policies, and wxlan policies. It is used to create and manage wlan configurations at an organizational level. WLAN templates allow for modular, scalable, and easy-to-manage configuration of ssids and their application to specific sites, site groups, or ap device profiles. They are valuable for automating configuration across multiple sites and profiles, making it easier to scale efficiently.
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
 * import com.pulumi.junipermist.org.Wlantemplate;
 * import com.pulumi.junipermist.org.WlantemplateArgs;
 * import com.pulumi.junipermist.org.inputs.WlantemplateAppliesArgs;
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
 *         var wlantempalteOne = new Wlantemplate("wlantempalteOne", WlantemplateArgs.builder()
 *             .name("wlantempalte_one")
 *             .orgId(terraformTest.id())
 *             .applies(WlantemplateAppliesArgs.builder()
 *                 .site_ids(terraformSite.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="junipermist:org/wlantemplate:Wlantemplate")
public class Wlantemplate extends com.pulumi.resources.CustomResource {
    /**
     * where this template should be applied to, can be org*id, site*ids, sitegroup_ids
     * 
     */
    @Export(name="applies", refs={WlantemplateApplies.class}, tree="[0]")
    private Output<WlantemplateApplies> applies;

    /**
     * @return where this template should be applied to, can be org*id, site*ids, sitegroup_ids
     * 
     */
    public Output<WlantemplateApplies> applies() {
        return this.applies;
    }
    /**
     * list of Device Profile ids
     * 
     */
    @Export(name="deviceprofileIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> deviceprofileIds;

    /**
     * @return list of Device Profile ids
     * 
     */
    public Output<List<String>> deviceprofileIds() {
        return this.deviceprofileIds;
    }
    /**
     * where this template should not be applied to (takes precedence)
     * 
     */
    @Export(name="exceptions", refs={WlantemplateExceptions.class}, tree="[0]")
    private Output<WlantemplateExceptions> exceptions;

    /**
     * @return where this template should not be applied to (takes precedence)
     * 
     */
    public Output<WlantemplateExceptions> exceptions() {
        return this.exceptions;
    }
    /**
     * whether to further filter by Device Profile
     * 
     */
    @Export(name="filterByDeviceprofile", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> filterByDeviceprofile;

    /**
     * @return whether to further filter by Device Profile
     * 
     */
    public Output<Boolean> filterByDeviceprofile() {
        return this.filterByDeviceprofile;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Wlantemplate(String name) {
        this(name, WlantemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Wlantemplate(String name, WlantemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Wlantemplate(String name, WlantemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/wlantemplate:Wlantemplate", name, args == null ? WlantemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Wlantemplate(String name, Output<String> id, @Nullable WlantemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/wlantemplate:Wlantemplate", name, state, makeResourceOptions(options, id));
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
    public static Wlantemplate get(String name, Output<String> id, @Nullable WlantemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Wlantemplate(name, id, state, options);
    }
}
