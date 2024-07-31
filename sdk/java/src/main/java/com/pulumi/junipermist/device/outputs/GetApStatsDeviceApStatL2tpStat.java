// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetApStatsDeviceApStatL2tpStatSession;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatL2tpStat {
    /**
     * @return list of sessions
     * 
     */
    private List<GetApStatsDeviceApStatL2tpStatSession> sessions;
    private String state;
    /**
     * @return uptime
     * 
     */
    private Integer uptime;
    /**
     * @return WxlanTunnel ID
     * 
     */
    private String wxtunnelId;

    private GetApStatsDeviceApStatL2tpStat() {}
    /**
     * @return list of sessions
     * 
     */
    public List<GetApStatsDeviceApStatL2tpStatSession> sessions() {
        return this.sessions;
    }
    public String state() {
        return this.state;
    }
    /**
     * @return uptime
     * 
     */
    public Integer uptime() {
        return this.uptime;
    }
    /**
     * @return WxlanTunnel ID
     * 
     */
    public String wxtunnelId() {
        return this.wxtunnelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatL2tpStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApStatsDeviceApStatL2tpStatSession> sessions;
        private String state;
        private Integer uptime;
        private String wxtunnelId;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatL2tpStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sessions = defaults.sessions;
    	      this.state = defaults.state;
    	      this.uptime = defaults.uptime;
    	      this.wxtunnelId = defaults.wxtunnelId;
        }

        @CustomType.Setter
        public Builder sessions(List<GetApStatsDeviceApStatL2tpStatSession> sessions) {
            if (sessions == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatL2tpStat", "sessions");
            }
            this.sessions = sessions;
            return this;
        }
        public Builder sessions(GetApStatsDeviceApStatL2tpStatSession... sessions) {
            return sessions(List.of(sessions));
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatL2tpStat", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder uptime(Integer uptime) {
            if (uptime == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatL2tpStat", "uptime");
            }
            this.uptime = uptime;
            return this;
        }
        @CustomType.Setter
        public Builder wxtunnelId(String wxtunnelId) {
            if (wxtunnelId == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatL2tpStat", "wxtunnelId");
            }
            this.wxtunnelId = wxtunnelId;
            return this;
        }
        public GetApStatsDeviceApStatL2tpStat build() {
            final var _resultValue = new GetApStatsDeviceApStatL2tpStat();
            _resultValue.sessions = sessions;
            _resultValue.state = state;
            _resultValue.uptime = uptime;
            _resultValue.wxtunnelId = wxtunnelId;
            return _resultValue;
        }
    }
}
