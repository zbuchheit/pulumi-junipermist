// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingCloudsharkArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingCloudsharkArgs Empty = new SettingCloudsharkArgs();

    @Import(name="apitoken", required=true)
    private Output<String> apitoken;

    public Output<String> apitoken() {
        return this.apitoken;
    }

    /**
     * if using CS Enteprise
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return if using CS Enteprise
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private SettingCloudsharkArgs() {}

    private SettingCloudsharkArgs(SettingCloudsharkArgs $) {
        this.apitoken = $.apitoken;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingCloudsharkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingCloudsharkArgs $;

        public Builder() {
            $ = new SettingCloudsharkArgs();
        }

        public Builder(SettingCloudsharkArgs defaults) {
            $ = new SettingCloudsharkArgs(Objects.requireNonNull(defaults));
        }

        public Builder apitoken(Output<String> apitoken) {
            $.apitoken = apitoken;
            return this;
        }

        public Builder apitoken(String apitoken) {
            return apitoken(Output.of(apitoken));
        }

        /**
         * @param url if using CS Enteprise
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url if using CS Enteprise
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public SettingCloudsharkArgs build() {
            if ($.apitoken == null) {
                throw new MissingRequiredPropertyException("SettingCloudsharkArgs", "apitoken");
            }
            return $;
        }
    }

}
