// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGatewayStatsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayStatsPlainArgs Empty = new GetGatewayStatsPlainArgs();

    /**
     * duration like 7d, 2w
     * 
     */
    @Import(name="duration")
    private @Nullable String duration;

    /**
     * @return duration like 7d, 2w
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     * 
     */
    @Import(name="end")
    private @Nullable Integer end;

    /**
     * @return end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     * 
     */
    public Optional<Integer> end() {
        return Optional.ofNullable(this.end);
    }

    @Import(name="mac")
    private @Nullable String mac;

    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    @Import(name="siteId")
    private @Nullable String siteId;

    public Optional<String> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     * 
     */
    @Import(name="start")
    private @Nullable Integer start;

    /**
     * @return start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     * 
     */
    public Optional<Integer> start() {
        return Optional.ofNullable(this.start);
    }

    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetGatewayStatsPlainArgs() {}

    private GetGatewayStatsPlainArgs(GetGatewayStatsPlainArgs $) {
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
    public static Builder builder(GetGatewayStatsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayStatsPlainArgs $;

        public Builder() {
            $ = new GetGatewayStatsPlainArgs();
        }

        public Builder(GetGatewayStatsPlainArgs defaults) {
            $ = new GetGatewayStatsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration duration like 7d, 2w
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable String duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param end end datetime, can be epoch or relative time like -1d, -2h; now if not specified
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Integer end) {
            $.end = end;
            return this;
        }

        public Builder mac(@Nullable String mac) {
            $.mac = mac;
            return this;
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder siteId(@Nullable String siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param start start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Integer start) {
            $.start = start;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetGatewayStatsPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetGatewayStatsPlainArgs", "orgId");
            }
            return $;
        }
    }

}
