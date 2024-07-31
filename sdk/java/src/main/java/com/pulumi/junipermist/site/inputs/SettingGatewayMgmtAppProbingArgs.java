// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.SettingGatewayMgmtAppProbingCustomAppArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingGatewayMgmtAppProbingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingGatewayMgmtAppProbingArgs Empty = new SettingGatewayMgmtAppProbingArgs();

    /**
     * app-keys from /api/v1/const/applications
     * 
     */
    @Import(name="apps")
    private @Nullable Output<List<String>> apps;

    /**
     * @return app-keys from /api/v1/const/applications
     * 
     */
    public Optional<Output<List<String>>> apps() {
        return Optional.ofNullable(this.apps);
    }

    @Import(name="customApps")
    private @Nullable Output<List<SettingGatewayMgmtAppProbingCustomAppArgs>> customApps;

    public Optional<Output<List<SettingGatewayMgmtAppProbingCustomAppArgs>>> customApps() {
        return Optional.ofNullable(this.customApps);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private SettingGatewayMgmtAppProbingArgs() {}

    private SettingGatewayMgmtAppProbingArgs(SettingGatewayMgmtAppProbingArgs $) {
        this.apps = $.apps;
        this.customApps = $.customApps;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingGatewayMgmtAppProbingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingGatewayMgmtAppProbingArgs $;

        public Builder() {
            $ = new SettingGatewayMgmtAppProbingArgs();
        }

        public Builder(SettingGatewayMgmtAppProbingArgs defaults) {
            $ = new SettingGatewayMgmtAppProbingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apps app-keys from /api/v1/const/applications
         * 
         * @return builder
         * 
         */
        public Builder apps(@Nullable Output<List<String>> apps) {
            $.apps = apps;
            return this;
        }

        /**
         * @param apps app-keys from /api/v1/const/applications
         * 
         * @return builder
         * 
         */
        public Builder apps(List<String> apps) {
            return apps(Output.of(apps));
        }

        /**
         * @param apps app-keys from /api/v1/const/applications
         * 
         * @return builder
         * 
         */
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }

        public Builder customApps(@Nullable Output<List<SettingGatewayMgmtAppProbingCustomAppArgs>> customApps) {
            $.customApps = customApps;
            return this;
        }

        public Builder customApps(List<SettingGatewayMgmtAppProbingCustomAppArgs> customApps) {
            return customApps(Output.of(customApps));
        }

        public Builder customApps(SettingGatewayMgmtAppProbingCustomAppArgs... customApps) {
            return customApps(List.of(customApps));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public SettingGatewayMgmtAppProbingArgs build() {
            return $;
        }
    }

}
