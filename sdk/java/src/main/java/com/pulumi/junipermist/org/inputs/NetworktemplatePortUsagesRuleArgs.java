// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplatePortUsagesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplatePortUsagesRuleArgs Empty = new NetworktemplatePortUsagesRuleArgs();

    @Import(name="equals")
    private @Nullable Output<String> equals;

    public Optional<Output<String>> equals_() {
        return Optional.ofNullable(this.equals);
    }

    /**
     * use `equals_any` to match any item in a list
     * 
     */
    @Import(name="equalsAnies")
    private @Nullable Output<List<String>> equalsAnies;

    /**
     * @return use `equals_any` to match any item in a list
     * 
     */
    public Optional<Output<List<String>>> equalsAnies() {
        return Optional.ofNullable(this.equalsAnies);
    }

    /**
     * &#34;[0:3]&#34;:&#34;abcdef&#34; &gt; &#34;abc&#34;
     * &#34;split(.)[1]&#34;: &#34;a.b.c&#34; &gt; &#34;b&#34;
     * &#34;split(-)[1][0:3]: &#34;a1234-b5678-c90&#34; &gt; &#34;b56&#34;
     * 
     */
    @Import(name="expression")
    private @Nullable Output<String> expression;

    /**
     * @return &#34;[0:3]&#34;:&#34;abcdef&#34; &gt; &#34;abc&#34;
     * &#34;split(.)[1]&#34;: &#34;a.b.c&#34; &gt; &#34;b&#34;
     * &#34;split(-)[1][0:3]: &#34;a1234-b5678-c90&#34; &gt; &#34;b56&#34;
     * 
     */
    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    /**
     * enum: `link_peermac`, `lldp_chassis_id`, `lldp_hardware_revision`, `lldp_manufacturer_name`, `lldp_oui`, `lldp_serial_number`, `lldp_system_name`, `radius_dynamicfilter`, `radius_usermac`, `radius_username`
     * 
     */
    @Import(name="src", required=true)
    private Output<String> src;

    /**
     * @return enum: `link_peermac`, `lldp_chassis_id`, `lldp_hardware_revision`, `lldp_manufacturer_name`, `lldp_oui`, `lldp_serial_number`, `lldp_system_name`, `radius_dynamicfilter`, `radius_usermac`, `radius_username`
     * 
     */
    public Output<String> src() {
        return this.src;
    }

    /**
     * `port_usage` name
     * 
     */
    @Import(name="usage")
    private @Nullable Output<String> usage;

    /**
     * @return `port_usage` name
     * 
     */
    public Optional<Output<String>> usage() {
        return Optional.ofNullable(this.usage);
    }

    private NetworktemplatePortUsagesRuleArgs() {}

    private NetworktemplatePortUsagesRuleArgs(NetworktemplatePortUsagesRuleArgs $) {
        this.equals = $.equals;
        this.equalsAnies = $.equalsAnies;
        this.expression = $.expression;
        this.src = $.src;
        this.usage = $.usage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplatePortUsagesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplatePortUsagesRuleArgs $;

        public Builder() {
            $ = new NetworktemplatePortUsagesRuleArgs();
        }

        public Builder(NetworktemplatePortUsagesRuleArgs defaults) {
            $ = new NetworktemplatePortUsagesRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder equals_(@Nullable Output<String> equals) {
            $.equals = equals;
            return this;
        }

        public Builder equals_(String equals) {
            return equals_(Output.of(equals));
        }

        /**
         * @param equalsAnies use `equals_any` to match any item in a list
         * 
         * @return builder
         * 
         */
        public Builder equalsAnies(@Nullable Output<List<String>> equalsAnies) {
            $.equalsAnies = equalsAnies;
            return this;
        }

        /**
         * @param equalsAnies use `equals_any` to match any item in a list
         * 
         * @return builder
         * 
         */
        public Builder equalsAnies(List<String> equalsAnies) {
            return equalsAnies(Output.of(equalsAnies));
        }

        /**
         * @param equalsAnies use `equals_any` to match any item in a list
         * 
         * @return builder
         * 
         */
        public Builder equalsAnies(String... equalsAnies) {
            return equalsAnies(List.of(equalsAnies));
        }

        /**
         * @param expression &#34;[0:3]&#34;:&#34;abcdef&#34; &gt; &#34;abc&#34;
         * &#34;split(.)[1]&#34;: &#34;a.b.c&#34; &gt; &#34;b&#34;
         * &#34;split(-)[1][0:3]: &#34;a1234-b5678-c90&#34; &gt; &#34;b56&#34;
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression &#34;[0:3]&#34;:&#34;abcdef&#34; &gt; &#34;abc&#34;
         * &#34;split(.)[1]&#34;: &#34;a.b.c&#34; &gt; &#34;b&#34;
         * &#34;split(-)[1][0:3]: &#34;a1234-b5678-c90&#34; &gt; &#34;b56&#34;
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param src enum: `link_peermac`, `lldp_chassis_id`, `lldp_hardware_revision`, `lldp_manufacturer_name`, `lldp_oui`, `lldp_serial_number`, `lldp_system_name`, `radius_dynamicfilter`, `radius_usermac`, `radius_username`
         * 
         * @return builder
         * 
         */
        public Builder src(Output<String> src) {
            $.src = src;
            return this;
        }

        /**
         * @param src enum: `link_peermac`, `lldp_chassis_id`, `lldp_hardware_revision`, `lldp_manufacturer_name`, `lldp_oui`, `lldp_serial_number`, `lldp_system_name`, `radius_dynamicfilter`, `radius_usermac`, `radius_username`
         * 
         * @return builder
         * 
         */
        public Builder src(String src) {
            return src(Output.of(src));
        }

        /**
         * @param usage `port_usage` name
         * 
         * @return builder
         * 
         */
        public Builder usage(@Nullable Output<String> usage) {
            $.usage = usage;
            return this;
        }

        /**
         * @param usage `port_usage` name
         * 
         * @return builder
         * 
         */
        public Builder usage(String usage) {
            return usage(Output.of(usage));
        }

        public NetworktemplatePortUsagesRuleArgs build() {
            if ($.src == null) {
                throw new MissingRequiredPropertyException("NetworktemplatePortUsagesRuleArgs", "src");
            }
            return $;
        }
    }

}
