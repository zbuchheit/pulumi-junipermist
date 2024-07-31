// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanCiscoCwaArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanCiscoCwaArgs Empty = new WlanCiscoCwaArgs();

    /**
     * list of hostnames without http(s):// (matched by substring)
     * 
     */
    @Import(name="allowedHostnames")
    private @Nullable Output<List<String>> allowedHostnames;

    /**
     * @return list of hostnames without http(s):// (matched by substring)
     * 
     */
    public Optional<Output<List<String>>> allowedHostnames() {
        return Optional.ofNullable(this.allowedHostnames);
    }

    /**
     * list of CIDRs
     * 
     */
    @Import(name="allowedSubnets")
    private @Nullable Output<List<String>> allowedSubnets;

    /**
     * @return list of CIDRs
     * 
     */
    public Optional<Output<List<String>>> allowedSubnets() {
        return Optional.ofNullable(this.allowedSubnets);
    }

    /**
     * list of blocked CIDRs
     * 
     */
    @Import(name="blockedSubnets")
    private @Nullable Output<List<String>> blockedSubnets;

    /**
     * @return list of blocked CIDRs
     * 
     */
    public Optional<Output<List<String>>> blockedSubnets() {
        return Optional.ofNullable(this.blockedSubnets);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private WlanCiscoCwaArgs() {}

    private WlanCiscoCwaArgs(WlanCiscoCwaArgs $) {
        this.allowedHostnames = $.allowedHostnames;
        this.allowedSubnets = $.allowedSubnets;
        this.blockedSubnets = $.blockedSubnets;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanCiscoCwaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanCiscoCwaArgs $;

        public Builder() {
            $ = new WlanCiscoCwaArgs();
        }

        public Builder(WlanCiscoCwaArgs defaults) {
            $ = new WlanCiscoCwaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedHostnames list of hostnames without http(s):// (matched by substring)
         * 
         * @return builder
         * 
         */
        public Builder allowedHostnames(@Nullable Output<List<String>> allowedHostnames) {
            $.allowedHostnames = allowedHostnames;
            return this;
        }

        /**
         * @param allowedHostnames list of hostnames without http(s):// (matched by substring)
         * 
         * @return builder
         * 
         */
        public Builder allowedHostnames(List<String> allowedHostnames) {
            return allowedHostnames(Output.of(allowedHostnames));
        }

        /**
         * @param allowedHostnames list of hostnames without http(s):// (matched by substring)
         * 
         * @return builder
         * 
         */
        public Builder allowedHostnames(String... allowedHostnames) {
            return allowedHostnames(List.of(allowedHostnames));
        }

        /**
         * @param allowedSubnets list of CIDRs
         * 
         * @return builder
         * 
         */
        public Builder allowedSubnets(@Nullable Output<List<String>> allowedSubnets) {
            $.allowedSubnets = allowedSubnets;
            return this;
        }

        /**
         * @param allowedSubnets list of CIDRs
         * 
         * @return builder
         * 
         */
        public Builder allowedSubnets(List<String> allowedSubnets) {
            return allowedSubnets(Output.of(allowedSubnets));
        }

        /**
         * @param allowedSubnets list of CIDRs
         * 
         * @return builder
         * 
         */
        public Builder allowedSubnets(String... allowedSubnets) {
            return allowedSubnets(List.of(allowedSubnets));
        }

        /**
         * @param blockedSubnets list of blocked CIDRs
         * 
         * @return builder
         * 
         */
        public Builder blockedSubnets(@Nullable Output<List<String>> blockedSubnets) {
            $.blockedSubnets = blockedSubnets;
            return this;
        }

        /**
         * @param blockedSubnets list of blocked CIDRs
         * 
         * @return builder
         * 
         */
        public Builder blockedSubnets(List<String> blockedSubnets) {
            return blockedSubnets(Output.of(blockedSubnets));
        }

        /**
         * @param blockedSubnets list of blocked CIDRs
         * 
         * @return builder
         * 
         */
        public Builder blockedSubnets(String... blockedSubnets) {
            return blockedSubnets(List.of(blockedSubnets));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public WlanCiscoCwaArgs build() {
            return $;
        }
    }

}
