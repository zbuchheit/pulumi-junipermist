// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NacruleMatchingArgs extends com.pulumi.resources.ResourceArgs {

    public static final NacruleMatchingArgs Empty = new NacruleMatchingArgs();

    /**
     * enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `psk`
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    /**
     * @return enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `psk`
     * 
     */
    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    @Import(name="nactags")
    private @Nullable Output<List<String>> nactags;

    public Optional<Output<List<String>>> nactags() {
        return Optional.ofNullable(this.nactags);
    }

    @Import(name="portTypes")
    private @Nullable Output<List<String>> portTypes;

    public Optional<Output<List<String>>> portTypes() {
        return Optional.ofNullable(this.portTypes);
    }

    /**
     * list of site ids to match
     * 
     */
    @Import(name="siteIds")
    private @Nullable Output<List<String>> siteIds;

    /**
     * @return list of site ids to match
     * 
     */
    public Optional<Output<List<String>>> siteIds() {
        return Optional.ofNullable(this.siteIds);
    }

    /**
     * list of sitegroup ids to match
     * 
     */
    @Import(name="sitegroupIds")
    private @Nullable Output<List<String>> sitegroupIds;

    /**
     * @return list of sitegroup ids to match
     * 
     */
    public Optional<Output<List<String>>> sitegroupIds() {
        return Optional.ofNullable(this.sitegroupIds);
    }

    /**
     * list of vendors to match
     * 
     */
    @Import(name="vendors")
    private @Nullable Output<List<String>> vendors;

    /**
     * @return list of vendors to match
     * 
     */
    public Optional<Output<List<String>>> vendors() {
        return Optional.ofNullable(this.vendors);
    }

    private NacruleMatchingArgs() {}

    private NacruleMatchingArgs(NacruleMatchingArgs $) {
        this.authType = $.authType;
        this.nactags = $.nactags;
        this.portTypes = $.portTypes;
        this.siteIds = $.siteIds;
        this.sitegroupIds = $.sitegroupIds;
        this.vendors = $.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NacruleMatchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NacruleMatchingArgs $;

        public Builder() {
            $ = new NacruleMatchingArgs();
        }

        public Builder(NacruleMatchingArgs defaults) {
            $ = new NacruleMatchingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authType enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `psk`
         * 
         * @return builder
         * 
         */
        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `psk`
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        public Builder nactags(@Nullable Output<List<String>> nactags) {
            $.nactags = nactags;
            return this;
        }

        public Builder nactags(List<String> nactags) {
            return nactags(Output.of(nactags));
        }

        public Builder nactags(String... nactags) {
            return nactags(List.of(nactags));
        }

        public Builder portTypes(@Nullable Output<List<String>> portTypes) {
            $.portTypes = portTypes;
            return this;
        }

        public Builder portTypes(List<String> portTypes) {
            return portTypes(Output.of(portTypes));
        }

        public Builder portTypes(String... portTypes) {
            return portTypes(List.of(portTypes));
        }

        /**
         * @param siteIds list of site ids to match
         * 
         * @return builder
         * 
         */
        public Builder siteIds(@Nullable Output<List<String>> siteIds) {
            $.siteIds = siteIds;
            return this;
        }

        /**
         * @param siteIds list of site ids to match
         * 
         * @return builder
         * 
         */
        public Builder siteIds(List<String> siteIds) {
            return siteIds(Output.of(siteIds));
        }

        /**
         * @param siteIds list of site ids to match
         * 
         * @return builder
         * 
         */
        public Builder siteIds(String... siteIds) {
            return siteIds(List.of(siteIds));
        }

        /**
         * @param sitegroupIds list of sitegroup ids to match
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(@Nullable Output<List<String>> sitegroupIds) {
            $.sitegroupIds = sitegroupIds;
            return this;
        }

        /**
         * @param sitegroupIds list of sitegroup ids to match
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(List<String> sitegroupIds) {
            return sitegroupIds(Output.of(sitegroupIds));
        }

        /**
         * @param sitegroupIds list of sitegroup ids to match
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(String... sitegroupIds) {
            return sitegroupIds(List.of(sitegroupIds));
        }

        /**
         * @param vendors list of vendors to match
         * 
         * @return builder
         * 
         */
        public Builder vendors(@Nullable Output<List<String>> vendors) {
            $.vendors = vendors;
            return this;
        }

        /**
         * @param vendors list of vendors to match
         * 
         * @return builder
         * 
         */
        public Builder vendors(List<String> vendors) {
            return vendors(Output.of(vendors));
        }

        /**
         * @param vendors list of vendors to match
         * 
         * @return builder
         * 
         */
        public Builder vendors(String... vendors) {
            return vendors(List.of(vendors));
        }

        public NacruleMatchingArgs build() {
            return $;
        }
    }

}
