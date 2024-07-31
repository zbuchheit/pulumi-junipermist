// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetSwitchStatsDeviceSwitchStat;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSwitchStatsResult {
    private List<GetSwitchStatsDeviceSwitchStat> deviceSwitchStats;
    /**
     * @return duration like 7d, 2w
     * 
     */
    private @Nullable String duration;
    /**
     * @return end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     * 
     */
    private @Nullable Integer end;
    /**
     * @return if `evpn_unused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
     * 
     */
    private @Nullable String evpnUnused;
    /**
     * @return EVPN Topology ID
     * 
     */
    private @Nullable String evpntopoId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String mac;
    private String orgId;
    private @Nullable String siteId;
    /**
     * @return start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     * 
     */
    private @Nullable Integer start;
    private @Nullable String status;

    private GetSwitchStatsResult() {}
    public List<GetSwitchStatsDeviceSwitchStat> deviceSwitchStats() {
        return this.deviceSwitchStats;
    }
    /**
     * @return duration like 7d, 2w
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * @return end datetime, can be epoch or relative time like -1d, -2h; now if not specified
     * 
     */
    public Optional<Integer> end() {
        return Optional.ofNullable(this.end);
    }
    /**
     * @return if `evpn_unused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
     * 
     */
    public Optional<String> evpnUnused() {
        return Optional.ofNullable(this.evpnUnused);
    }
    /**
     * @return EVPN Topology ID
     * 
     */
    public Optional<String> evpntopoId() {
        return Optional.ofNullable(this.evpntopoId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    public String orgId() {
        return this.orgId;
    }
    public Optional<String> siteId() {
        return Optional.ofNullable(this.siteId);
    }
    /**
     * @return start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     * 
     */
    public Optional<Integer> start() {
        return Optional.ofNullable(this.start);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStatsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSwitchStatsDeviceSwitchStat> deviceSwitchStats;
        private @Nullable String duration;
        private @Nullable Integer end;
        private @Nullable String evpnUnused;
        private @Nullable String evpntopoId;
        private String id;
        private @Nullable String mac;
        private String orgId;
        private @Nullable String siteId;
        private @Nullable Integer start;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetSwitchStatsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceSwitchStats = defaults.deviceSwitchStats;
    	      this.duration = defaults.duration;
    	      this.end = defaults.end;
    	      this.evpnUnused = defaults.evpnUnused;
    	      this.evpntopoId = defaults.evpntopoId;
    	      this.id = defaults.id;
    	      this.mac = defaults.mac;
    	      this.orgId = defaults.orgId;
    	      this.siteId = defaults.siteId;
    	      this.start = defaults.start;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder deviceSwitchStats(List<GetSwitchStatsDeviceSwitchStat> deviceSwitchStats) {
            if (deviceSwitchStats == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsResult", "deviceSwitchStats");
            }
            this.deviceSwitchStats = deviceSwitchStats;
            return this;
        }
        public Builder deviceSwitchStats(GetSwitchStatsDeviceSwitchStat... deviceSwitchStats) {
            return deviceSwitchStats(List.of(deviceSwitchStats));
        }
        @CustomType.Setter
        public Builder duration(@Nullable String duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder end(@Nullable Integer end) {

            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder evpnUnused(@Nullable String evpnUnused) {

            this.evpnUnused = evpnUnused;
            return this;
        }
        @CustomType.Setter
        public Builder evpntopoId(@Nullable String evpntopoId) {

            this.evpntopoId = evpntopoId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mac(@Nullable String mac) {

            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder siteId(@Nullable String siteId) {

            this.siteId = siteId;
            return this;
        }
        @CustomType.Setter
        public Builder start(@Nullable Integer start) {

            this.start = start;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetSwitchStatsResult build() {
            final var _resultValue = new GetSwitchStatsResult();
            _resultValue.deviceSwitchStats = deviceSwitchStats;
            _resultValue.duration = duration;
            _resultValue.end = end;
            _resultValue.evpnUnused = evpnUnused;
            _resultValue.evpntopoId = evpntopoId;
            _resultValue.id = id;
            _resultValue.mac = mac;
            _resultValue.orgId = orgId;
            _resultValue.siteId = siteId;
            _resultValue.start = start;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
