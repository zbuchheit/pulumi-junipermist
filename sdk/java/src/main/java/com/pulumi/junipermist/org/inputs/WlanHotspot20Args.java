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


public final class WlanHotspot20Args extends com.pulumi.resources.ResourceArgs {

    public static final WlanHotspot20Args Empty = new WlanHotspot20Args();

    @Import(name="domainNames")
    private @Nullable Output<List<String>> domainNames;

    public Optional<Output<List<String>>> domainNames() {
        return Optional.ofNullable(this.domainNames);
    }

    /**
     * whether to enable hotspot 2.0 config
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return whether to enable hotspot 2.0 config
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="naiRealms")
    private @Nullable Output<List<String>> naiRealms;

    public Optional<Output<List<String>>> naiRealms() {
        return Optional.ofNullable(this.naiRealms);
    }

    /**
     * list of operators to support
     * 
     */
    @Import(name="operators")
    private @Nullable Output<List<String>> operators;

    /**
     * @return list of operators to support
     * 
     */
    public Optional<Output<List<String>>> operators() {
        return Optional.ofNullable(this.operators);
    }

    @Import(name="rcois")
    private @Nullable Output<List<String>> rcois;

    public Optional<Output<List<String>>> rcois() {
        return Optional.ofNullable(this.rcois);
    }

    /**
     * venue name, default is site name
     * 
     */
    @Import(name="venueName")
    private @Nullable Output<String> venueName;

    /**
     * @return venue name, default is site name
     * 
     */
    public Optional<Output<String>> venueName() {
        return Optional.ofNullable(this.venueName);
    }

    private WlanHotspot20Args() {}

    private WlanHotspot20Args(WlanHotspot20Args $) {
        this.domainNames = $.domainNames;
        this.enabled = $.enabled;
        this.naiRealms = $.naiRealms;
        this.operators = $.operators;
        this.rcois = $.rcois;
        this.venueName = $.venueName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanHotspot20Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanHotspot20Args $;

        public Builder() {
            $ = new WlanHotspot20Args();
        }

        public Builder(WlanHotspot20Args defaults) {
            $ = new WlanHotspot20Args(Objects.requireNonNull(defaults));
        }

        public Builder domainNames(@Nullable Output<List<String>> domainNames) {
            $.domainNames = domainNames;
            return this;
        }

        public Builder domainNames(List<String> domainNames) {
            return domainNames(Output.of(domainNames));
        }

        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }

        /**
         * @param enabled whether to enable hotspot 2.0 config
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled whether to enable hotspot 2.0 config
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder naiRealms(@Nullable Output<List<String>> naiRealms) {
            $.naiRealms = naiRealms;
            return this;
        }

        public Builder naiRealms(List<String> naiRealms) {
            return naiRealms(Output.of(naiRealms));
        }

        public Builder naiRealms(String... naiRealms) {
            return naiRealms(List.of(naiRealms));
        }

        /**
         * @param operators list of operators to support
         * 
         * @return builder
         * 
         */
        public Builder operators(@Nullable Output<List<String>> operators) {
            $.operators = operators;
            return this;
        }

        /**
         * @param operators list of operators to support
         * 
         * @return builder
         * 
         */
        public Builder operators(List<String> operators) {
            return operators(Output.of(operators));
        }

        /**
         * @param operators list of operators to support
         * 
         * @return builder
         * 
         */
        public Builder operators(String... operators) {
            return operators(List.of(operators));
        }

        public Builder rcois(@Nullable Output<List<String>> rcois) {
            $.rcois = rcois;
            return this;
        }

        public Builder rcois(List<String> rcois) {
            return rcois(Output.of(rcois));
        }

        public Builder rcois(String... rcois) {
            return rcois(List.of(rcois));
        }

        /**
         * @param venueName venue name, default is site name
         * 
         * @return builder
         * 
         */
        public Builder venueName(@Nullable Output<String> venueName) {
            $.venueName = venueName;
            return this;
        }

        /**
         * @param venueName venue name, default is site name
         * 
         * @return builder
         * 
         */
        public Builder venueName(String venueName) {
            return venueName(Output.of(venueName));
        }

        public WlanHotspot20Args build() {
            return $;
        }
    }

}