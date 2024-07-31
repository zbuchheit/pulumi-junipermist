// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingCriticalUrlMonitoringMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingCriticalUrlMonitoringMonitorArgs Empty = new SettingCriticalUrlMonitoringMonitorArgs();

    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    @Import(name="vlanId")
    private @Nullable Output<String> vlanId;

    public Optional<Output<String>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private SettingCriticalUrlMonitoringMonitorArgs() {}

    private SettingCriticalUrlMonitoringMonitorArgs(SettingCriticalUrlMonitoringMonitorArgs $) {
        this.url = $.url;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingCriticalUrlMonitoringMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingCriticalUrlMonitoringMonitorArgs $;

        public Builder() {
            $ = new SettingCriticalUrlMonitoringMonitorArgs();
        }

        public Builder(SettingCriticalUrlMonitoringMonitorArgs defaults) {
            $ = new SettingCriticalUrlMonitoringMonitorArgs(Objects.requireNonNull(defaults));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public Builder vlanId(@Nullable Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public SettingCriticalUrlMonitoringMonitorArgs build() {
            return $;
        }
    }

}
