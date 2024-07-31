// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplatePortUsagesRule {
    private @Nullable String equals;
    /**
     * @return use `equals_any` to match any item in a list
     * 
     */
    private @Nullable List<String> equalsAnies;
    /**
     * @return &#34;[0:3]&#34;:&#34;abcdef&#34; &gt; &#34;abc&#34;
     * &#34;split(.)[1]&#34;: &#34;a.b.c&#34; &gt; &#34;b&#34;
     * &#34;split(-)[1][0:3]: &#34;a1234-b5678-c90&#34; &gt; &#34;b56&#34;
     * 
     */
    private @Nullable String expression;
    /**
     * @return enum: `link_peermac`, `lldp_chassis_id`, `lldp_hardware_revision`, `lldp_manufacturer_name`, `lldp_oui`, `lldp_serial_number`, `lldp_system_name`, `radius_dynamicfilter`, `radius_usermac`, `radius_username`
     * 
     */
    private String src;
    /**
     * @return `port_usage` name
     * 
     */
    private @Nullable String usage;

    private NetworktemplatePortUsagesRule() {}
    public Optional<String> equals_() {
        return Optional.ofNullable(this.equals);
    }
    /**
     * @return use `equals_any` to match any item in a list
     * 
     */
    public List<String> equalsAnies() {
        return this.equalsAnies == null ? List.of() : this.equalsAnies;
    }
    /**
     * @return &#34;[0:3]&#34;:&#34;abcdef&#34; &gt; &#34;abc&#34;
     * &#34;split(.)[1]&#34;: &#34;a.b.c&#34; &gt; &#34;b&#34;
     * &#34;split(-)[1][0:3]: &#34;a1234-b5678-c90&#34; &gt; &#34;b56&#34;
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return enum: `link_peermac`, `lldp_chassis_id`, `lldp_hardware_revision`, `lldp_manufacturer_name`, `lldp_oui`, `lldp_serial_number`, `lldp_system_name`, `radius_dynamicfilter`, `radius_usermac`, `radius_username`
     * 
     */
    public String src() {
        return this.src;
    }
    /**
     * @return `port_usage` name
     * 
     */
    public Optional<String> usage() {
        return Optional.ofNullable(this.usage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplatePortUsagesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String equals;
        private @Nullable List<String> equalsAnies;
        private @Nullable String expression;
        private String src;
        private @Nullable String usage;
        public Builder() {}
        public Builder(NetworktemplatePortUsagesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equals = defaults.equals;
    	      this.equalsAnies = defaults.equalsAnies;
    	      this.expression = defaults.expression;
    	      this.src = defaults.src;
    	      this.usage = defaults.usage;
        }

        @CustomType.Setter("equals")
        public Builder equals_(@Nullable String equals) {

            this.equals = equals;
            return this;
        }
        @CustomType.Setter
        public Builder equalsAnies(@Nullable List<String> equalsAnies) {

            this.equalsAnies = equalsAnies;
            return this;
        }
        public Builder equalsAnies(String... equalsAnies) {
            return equalsAnies(List.of(equalsAnies));
        }
        @CustomType.Setter
        public Builder expression(@Nullable String expression) {

            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder src(String src) {
            if (src == null) {
              throw new MissingRequiredPropertyException("NetworktemplatePortUsagesRule", "src");
            }
            this.src = src;
            return this;
        }
        @CustomType.Setter
        public Builder usage(@Nullable String usage) {

            this.usage = usage;
            return this;
        }
        public NetworktemplatePortUsagesRule build() {
            final var _resultValue = new NetworktemplatePortUsagesRule();
            _resultValue.equals = equals;
            _resultValue.equalsAnies = equalsAnies;
            _resultValue.expression = expression;
            _resultValue.src = src;
            _resultValue.usage = usage;
            return _resultValue;
        }
    }
}
