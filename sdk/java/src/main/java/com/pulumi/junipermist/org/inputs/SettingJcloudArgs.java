// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SettingJcloudArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingJcloudArgs Empty = new SettingJcloudArgs();

    /**
     * JCloud Org Token
     * 
     */
    @Import(name="orgApitoken", required=true)
    private Output<String> orgApitoken;

    /**
     * @return JCloud Org Token
     * 
     */
    public Output<String> orgApitoken() {
        return this.orgApitoken;
    }

    /**
     * JCloud Org Token Name
     * 
     */
    @Import(name="orgApitokenName", required=true)
    private Output<String> orgApitokenName;

    /**
     * @return JCloud Org Token Name
     * 
     */
    public Output<String> orgApitokenName() {
        return this.orgApitokenName;
    }

    /**
     * JCloud Org ID
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return JCloud Org ID
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    private SettingJcloudArgs() {}

    private SettingJcloudArgs(SettingJcloudArgs $) {
        this.orgApitoken = $.orgApitoken;
        this.orgApitokenName = $.orgApitokenName;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingJcloudArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingJcloudArgs $;

        public Builder() {
            $ = new SettingJcloudArgs();
        }

        public Builder(SettingJcloudArgs defaults) {
            $ = new SettingJcloudArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param orgApitoken JCloud Org Token
         * 
         * @return builder
         * 
         */
        public Builder orgApitoken(Output<String> orgApitoken) {
            $.orgApitoken = orgApitoken;
            return this;
        }

        /**
         * @param orgApitoken JCloud Org Token
         * 
         * @return builder
         * 
         */
        public Builder orgApitoken(String orgApitoken) {
            return orgApitoken(Output.of(orgApitoken));
        }

        /**
         * @param orgApitokenName JCloud Org Token Name
         * 
         * @return builder
         * 
         */
        public Builder orgApitokenName(Output<String> orgApitokenName) {
            $.orgApitokenName = orgApitokenName;
            return this;
        }

        /**
         * @param orgApitokenName JCloud Org Token Name
         * 
         * @return builder
         * 
         */
        public Builder orgApitokenName(String orgApitokenName) {
            return orgApitokenName(Output.of(orgApitokenName));
        }

        /**
         * @param orgId JCloud Org ID
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId JCloud Org ID
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public SettingJcloudArgs build() {
            if ($.orgApitoken == null) {
                throw new MissingRequiredPropertyException("SettingJcloudArgs", "orgApitoken");
            }
            if ($.orgApitokenName == null) {
                throw new MissingRequiredPropertyException("SettingJcloudArgs", "orgApitokenName");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("SettingJcloudArgs", "orgId");
            }
            return $;
        }
    }

}