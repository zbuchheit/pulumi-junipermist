// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatEslStat {
    private Integer channel;
    private Boolean connected;
    private String type;
    private Boolean up;

    private GetApStatsDeviceApStatEslStat() {}
    public Integer channel() {
        return this.channel;
    }
    public Boolean connected() {
        return this.connected;
    }
    public String type() {
        return this.type;
    }
    public Boolean up() {
        return this.up;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatEslStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer channel;
        private Boolean connected;
        private String type;
        private Boolean up;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatEslStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.connected = defaults.connected;
    	      this.type = defaults.type;
    	      this.up = defaults.up;
        }

        @CustomType.Setter
        public Builder channel(Integer channel) {
            if (channel == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEslStat", "channel");
            }
            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder connected(Boolean connected) {
            if (connected == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEslStat", "connected");
            }
            this.connected = connected;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEslStat", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder up(Boolean up) {
            if (up == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatEslStat", "up");
            }
            this.up = up;
            return this;
        }
        public GetApStatsDeviceApStatEslStat build() {
            final var _resultValue = new GetApStatsDeviceApStatEslStat();
            _resultValue.channel = channel;
            _resultValue.connected = connected;
            _resultValue.type = type;
            _resultValue.up = up;
            return _resultValue;
        }
    }
}
