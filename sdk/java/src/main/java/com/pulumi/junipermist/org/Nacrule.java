// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.NacruleArgs;
import com.pulumi.junipermist.org.inputs.NacruleState;
import com.pulumi.junipermist.org.outputs.NacruleMatching;
import com.pulumi.junipermist.org.outputs.NacruleNotMatching;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the NAC Rules (Auth Policies).A NAC Rule defines a list of critera (NAC Tag) the network client must match to execute the Rule, an action (Allow/Deny)and a list of RADIUS Attributes (NAC Tags) to return
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
 * import com.pulumi.junipermist.org.Nacrule;
 * import com.pulumi.junipermist.org.NacruleArgs;
 * import com.pulumi.junipermist.org.inputs.NacruleMatchingArgs;
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
 *         var nacruleOne = new Nacrule("nacruleOne", NacruleArgs.builder()
 *             .name("rule_one")
 *             .action("allow")
 *             .orgId(terraformTest.id())
 *             .matching(NacruleMatchingArgs.builder()
 *                 .port_types("wired")
 *                 .auth_type("mab")
 *                 .nactags("c055c60b-351a-4311-8ee5-9b7be5e5f902")
 *                 .build())
 *             .applyTags(            
 *                 "61c11327-5e1b-40ed-bbbf-5e95642c4f59",
 *                 "3f292454-ac5f-4a36-9aff-d0518d90b47a")
 *             .enabled(true)
 *             .order(9)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="junipermist:org/nacrule:Nacrule")
public class Nacrule extends com.pulumi.resources.CustomResource {
    /**
     * enum: `allow`, `block`
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return enum: `allow`, `block`
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * all optional, this goes into Access-Accept
     * 
     */
    @Export(name="applyTags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> applyTags;

    /**
     * @return all optional, this goes into Access-Accept
     * 
     */
    public Output<List<String>> applyTags() {
        return this.applyTags;
    }
    /**
     * enabled or not
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return enabled or not
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    @Export(name="matching", refs={NacruleMatching.class}, tree="[0]")
    private Output</* @Nullable */ NacruleMatching> matching;

    public Output<Optional<NacruleMatching>> matching() {
        return Codegen.optional(this.matching);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="notMatching", refs={NacruleNotMatching.class}, tree="[0]")
    private Output</* @Nullable */ NacruleNotMatching> notMatching;

    public Output<Optional<NacruleNotMatching>> notMatching() {
        return Codegen.optional(this.notMatching);
    }
    /**
     * the order of the rule, lower value implies higher priority
     * 
     */
    @Export(name="order", refs={Integer.class}, tree="[0]")
    private Output<Integer> order;

    /**
     * @return the order of the rule, lower value implies higher priority
     * 
     */
    public Output<Integer> order() {
        return this.order;
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
    public Nacrule(java.lang.String name) {
        this(name, NacruleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Nacrule(java.lang.String name, NacruleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Nacrule(java.lang.String name, NacruleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/nacrule:Nacrule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Nacrule(java.lang.String name, Output<java.lang.String> id, @Nullable NacruleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/nacrule:Nacrule", name, state, makeResourceOptions(options, id), false);
    }

    private static NacruleArgs makeArgs(NacruleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NacruleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Nacrule get(java.lang.String name, Output<java.lang.String> id, @Nullable NacruleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Nacrule(name, id, state, options);
    }
}
