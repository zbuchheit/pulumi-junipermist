// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.SettingConfigPushPolicyPushWindowHoursArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingConfigPushPolicyPushWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingConfigPushPolicyPushWindowArgs Empty = new SettingConfigPushPolicyPushWindowArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun).
     * 
     */
    @Import(name="hours")
    private @Nullable Output<SettingConfigPushPolicyPushWindowHoursArgs> hours;

    /**
     * @return hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun).
     * 
     */
    public Optional<Output<SettingConfigPushPolicyPushWindowHoursArgs>> hours() {
        return Optional.ofNullable(this.hours);
    }

    private SettingConfigPushPolicyPushWindowArgs() {}

    private SettingConfigPushPolicyPushWindowArgs(SettingConfigPushPolicyPushWindowArgs $) {
        this.enabled = $.enabled;
        this.hours = $.hours;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingConfigPushPolicyPushWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingConfigPushPolicyPushWindowArgs $;

        public Builder() {
            $ = new SettingConfigPushPolicyPushWindowArgs();
        }

        public Builder(SettingConfigPushPolicyPushWindowArgs defaults) {
            $ = new SettingConfigPushPolicyPushWindowArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param hours hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun).
         * 
         * @return builder
         * 
         */
        public Builder hours(@Nullable Output<SettingConfigPushPolicyPushWindowHoursArgs> hours) {
            $.hours = hours;
            return this;
        }

        /**
         * @param hours hours of operation filter, the available days (mon, tue, wed, thu, fri, sat, sun).
         * 
         * @return builder
         * 
         */
        public Builder hours(SettingConfigPushPolicyPushWindowHoursArgs hours) {
            return hours(Output.of(hours));
        }

        public SettingConfigPushPolicyPushWindowArgs build() {
            return $;
        }
    }

}
