// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanScheduleHoursArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanScheduleHoursArgs Empty = new WlanScheduleHoursArgs();

    @Import(name="fri")
    private @Nullable Output<String> fri;

    public Optional<Output<String>> fri() {
        return Optional.ofNullable(this.fri);
    }

    @Import(name="mon")
    private @Nullable Output<String> mon;

    public Optional<Output<String>> mon() {
        return Optional.ofNullable(this.mon);
    }

    @Import(name="sat")
    private @Nullable Output<String> sat;

    public Optional<Output<String>> sat() {
        return Optional.ofNullable(this.sat);
    }

    @Import(name="sun")
    private @Nullable Output<String> sun;

    public Optional<Output<String>> sun() {
        return Optional.ofNullable(this.sun);
    }

    @Import(name="thu")
    private @Nullable Output<String> thu;

    public Optional<Output<String>> thu() {
        return Optional.ofNullable(this.thu);
    }

    @Import(name="tue")
    private @Nullable Output<String> tue;

    public Optional<Output<String>> tue() {
        return Optional.ofNullable(this.tue);
    }

    @Import(name="wed")
    private @Nullable Output<String> wed;

    public Optional<Output<String>> wed() {
        return Optional.ofNullable(this.wed);
    }

    private WlanScheduleHoursArgs() {}

    private WlanScheduleHoursArgs(WlanScheduleHoursArgs $) {
        this.fri = $.fri;
        this.mon = $.mon;
        this.sat = $.sat;
        this.sun = $.sun;
        this.thu = $.thu;
        this.tue = $.tue;
        this.wed = $.wed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanScheduleHoursArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanScheduleHoursArgs $;

        public Builder() {
            $ = new WlanScheduleHoursArgs();
        }

        public Builder(WlanScheduleHoursArgs defaults) {
            $ = new WlanScheduleHoursArgs(Objects.requireNonNull(defaults));
        }

        public Builder fri(@Nullable Output<String> fri) {
            $.fri = fri;
            return this;
        }

        public Builder fri(String fri) {
            return fri(Output.of(fri));
        }

        public Builder mon(@Nullable Output<String> mon) {
            $.mon = mon;
            return this;
        }

        public Builder mon(String mon) {
            return mon(Output.of(mon));
        }

        public Builder sat(@Nullable Output<String> sat) {
            $.sat = sat;
            return this;
        }

        public Builder sat(String sat) {
            return sat(Output.of(sat));
        }

        public Builder sun(@Nullable Output<String> sun) {
            $.sun = sun;
            return this;
        }

        public Builder sun(String sun) {
            return sun(Output.of(sun));
        }

        public Builder thu(@Nullable Output<String> thu) {
            $.thu = thu;
            return this;
        }

        public Builder thu(String thu) {
            return thu(Output.of(thu));
        }

        public Builder tue(@Nullable Output<String> tue) {
            $.tue = tue;
            return this;
        }

        public Builder tue(String tue) {
            return tue(Output.of(tue));
        }

        public Builder wed(@Nullable Output<String> wed) {
            $.wed = wed;
            return this;
        }

        public Builder wed(String wed) {
            return wed(Output.of(wed));
        }

        public WlanScheduleHoursArgs build() {
            return $;
        }
    }

}
