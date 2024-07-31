// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApStatsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApStatsArgs Empty = new GetApStatsArgs();

    /**
     * duration like 7d, 2w
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return duration like 7d, 2w
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     * 
     */
    @Import(name="end")
    private @Nullable Output<Integer> end;

    /**
     * @return end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     * 
     */
    public Optional<Output<Integer>> end() {
        return Optional.ofNullable(this.end);
    }

    @Import(name="mac")
    private @Nullable Output<String> mac;

    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     * 
     */
    @Import(name="start")
    private @Nullable Output<Integer> start;

    /**
     * @return start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     * 
     */
    public Optional<Output<Integer>> start() {
        return Optional.ofNullable(this.start);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetApStatsArgs() {}

    private GetApStatsArgs(GetApStatsArgs $) {
        this.duration = $.duration;
        this.end = $.end;
        this.mac = $.mac;
        this.orgId = $.orgId;
        this.siteId = $.siteId;
        this.start = $.start;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApStatsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApStatsArgs $;

        public Builder() {
            $ = new GetApStatsArgs();
        }

        public Builder(GetApStatsArgs defaults) {
            $ = new GetApStatsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration duration like 7d, 2w
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration duration like 7d, 2w
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param end end datetime, can be epoch or relative time like -1d, -2h; now if not specified
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<Integer> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end end datetime, can be epoch or relative time like -1d, -2h; now if not specified
         * 
         * @return builder
         * 
         */
        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param start start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<Integer> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
         * 
         * @return builder
         * 
         */
        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetApStatsArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetApStatsArgs", "orgId");
            }
            return $;
        }
    }

}
