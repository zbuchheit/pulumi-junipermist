// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingWidsRepeatedAuthFailuresArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingWidsRepeatedAuthFailuresArgs Empty = new SettingWidsRepeatedAuthFailuresArgs();

    /**
     * window where a trigger will be detected and action to be taken (in seconds)
     * 
     */
    @Import(name="duration")
    private @Nullable Output<Integer> duration;

    /**
     * @return window where a trigger will be detected and action to be taken (in seconds)
     * 
     */
    public Optional<Output<Integer>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * count of events to trigger
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<Integer> threshold;

    /**
     * @return count of events to trigger
     * 
     */
    public Optional<Output<Integer>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    private SettingWidsRepeatedAuthFailuresArgs() {}

    private SettingWidsRepeatedAuthFailuresArgs(SettingWidsRepeatedAuthFailuresArgs $) {
        this.duration = $.duration;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingWidsRepeatedAuthFailuresArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingWidsRepeatedAuthFailuresArgs $;

        public Builder() {
            $ = new SettingWidsRepeatedAuthFailuresArgs();
        }

        public Builder(SettingWidsRepeatedAuthFailuresArgs defaults) {
            $ = new SettingWidsRepeatedAuthFailuresArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration window where a trigger will be detected and action to be taken (in seconds)
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration window where a trigger will be detected and action to be taken (in seconds)
         * 
         * @return builder
         * 
         */
        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param threshold count of events to trigger
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold count of events to trigger
         * 
         * @return builder
         * 
         */
        public Builder threshold(Integer threshold) {
            return threshold(Output.of(threshold));
        }

        public SettingWidsRepeatedAuthFailuresArgs build() {
            return $;
        }
    }

}
