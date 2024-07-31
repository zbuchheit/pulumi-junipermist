// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs Empty = new NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs();

    /**
     * only required if `type`==`context_prefix`
     * 
     */
    @Import(name="contextPrefix")
    private @Nullable Output<String> contextPrefix;

    /**
     * @return only required if `type`==`context_prefix`
     * 
     */
    public Optional<Output<String>> contextPrefix() {
        return Optional.ofNullable(this.contextPrefix);
    }

    /**
     * refer to view name
     * 
     */
    @Import(name="notifyView")
    private @Nullable Output<String> notifyView;

    /**
     * @return refer to view name
     * 
     */
    public Optional<Output<String>> notifyView() {
        return Optional.ofNullable(this.notifyView);
    }

    /**
     * refer to view name
     * 
     */
    @Import(name="readView")
    private @Nullable Output<String> readView;

    /**
     * @return refer to view name
     * 
     */
    public Optional<Output<String>> readView() {
        return Optional.ofNullable(this.readView);
    }

    /**
     * enum: `authentication`, `none`, `privacy`
     * 
     */
    @Import(name="securityLevel")
    private @Nullable Output<String> securityLevel;

    /**
     * @return enum: `authentication`, `none`, `privacy`
     * 
     */
    public Optional<Output<String>> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }

    /**
     * enum: `any`, `usm`, `v1`, `v2c`
     * 
     */
    @Import(name="securityModel")
    private @Nullable Output<String> securityModel;

    /**
     * @return enum: `any`, `usm`, `v1`, `v2c`
     * 
     */
    public Optional<Output<String>> securityModel() {
        return Optional.ofNullable(this.securityModel);
    }

    /**
     * enum: `context_prefix`, `default_context_prefix`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `context_prefix`, `default_context_prefix`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * refer to view name
     * 
     */
    @Import(name="writeView")
    private @Nullable Output<String> writeView;

    /**
     * @return refer to view name
     * 
     */
    public Optional<Output<String>> writeView() {
        return Optional.ofNullable(this.writeView);
    }

    private NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs() {}

    private NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs(NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs $) {
        this.contextPrefix = $.contextPrefix;
        this.notifyView = $.notifyView;
        this.readView = $.readView;
        this.securityLevel = $.securityLevel;
        this.securityModel = $.securityModel;
        this.type = $.type;
        this.writeView = $.writeView;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs $;

        public Builder() {
            $ = new NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs();
        }

        public Builder(NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs defaults) {
            $ = new NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contextPrefix only required if `type`==`context_prefix`
         * 
         * @return builder
         * 
         */
        public Builder contextPrefix(@Nullable Output<String> contextPrefix) {
            $.contextPrefix = contextPrefix;
            return this;
        }

        /**
         * @param contextPrefix only required if `type`==`context_prefix`
         * 
         * @return builder
         * 
         */
        public Builder contextPrefix(String contextPrefix) {
            return contextPrefix(Output.of(contextPrefix));
        }

        /**
         * @param notifyView refer to view name
         * 
         * @return builder
         * 
         */
        public Builder notifyView(@Nullable Output<String> notifyView) {
            $.notifyView = notifyView;
            return this;
        }

        /**
         * @param notifyView refer to view name
         * 
         * @return builder
         * 
         */
        public Builder notifyView(String notifyView) {
            return notifyView(Output.of(notifyView));
        }

        /**
         * @param readView refer to view name
         * 
         * @return builder
         * 
         */
        public Builder readView(@Nullable Output<String> readView) {
            $.readView = readView;
            return this;
        }

        /**
         * @param readView refer to view name
         * 
         * @return builder
         * 
         */
        public Builder readView(String readView) {
            return readView(Output.of(readView));
        }

        /**
         * @param securityLevel enum: `authentication`, `none`, `privacy`
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(@Nullable Output<String> securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        /**
         * @param securityLevel enum: `authentication`, `none`, `privacy`
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(String securityLevel) {
            return securityLevel(Output.of(securityLevel));
        }

        /**
         * @param securityModel enum: `any`, `usm`, `v1`, `v2c`
         * 
         * @return builder
         * 
         */
        public Builder securityModel(@Nullable Output<String> securityModel) {
            $.securityModel = securityModel;
            return this;
        }

        /**
         * @param securityModel enum: `any`, `usm`, `v1`, `v2c`
         * 
         * @return builder
         * 
         */
        public Builder securityModel(String securityModel) {
            return securityModel(Output.of(securityModel));
        }

        /**
         * @param type enum: `context_prefix`, `default_context_prefix`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `context_prefix`, `default_context_prefix`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param writeView refer to view name
         * 
         * @return builder
         * 
         */
        public Builder writeView(@Nullable Output<String> writeView) {
            $.writeView = writeView;
            return this;
        }

        /**
         * @param writeView refer to view name
         * 
         * @return builder
         * 
         */
        public Builder writeView(String writeView) {
            return writeView(Output.of(writeView));
        }

        public NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs build() {
            return $;
        }
    }

}
