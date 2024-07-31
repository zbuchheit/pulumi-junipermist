// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatIf2StatServpInfo;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatIf2Stat {
    private String addressMode;
    private List<String> ips;
    private List<String> natAddresses;
    private String networkName;
    private String portId;
    private String portUsage;
    private String redundancyState;
    private Integer rxBytes;
    private Integer rxPkts;
    private GetGatewayStatsDeviceGatewayStatIf2StatServpInfo servpInfo;
    private Integer txBytes;
    private Integer txPkts;
    private Boolean up;
    private Integer vlan;
    private String wanName;
    private String wanType;

    private GetGatewayStatsDeviceGatewayStatIf2Stat() {}
    public String addressMode() {
        return this.addressMode;
    }
    public List<String> ips() {
        return this.ips;
    }
    public List<String> natAddresses() {
        return this.natAddresses;
    }
    public String networkName() {
        return this.networkName;
    }
    public String portId() {
        return this.portId;
    }
    public String portUsage() {
        return this.portUsage;
    }
    public String redundancyState() {
        return this.redundancyState;
    }
    public Integer rxBytes() {
        return this.rxBytes;
    }
    public Integer rxPkts() {
        return this.rxPkts;
    }
    public GetGatewayStatsDeviceGatewayStatIf2StatServpInfo servpInfo() {
        return this.servpInfo;
    }
    public Integer txBytes() {
        return this.txBytes;
    }
    public Integer txPkts() {
        return this.txPkts;
    }
    public Boolean up() {
        return this.up;
    }
    public Integer vlan() {
        return this.vlan;
    }
    public String wanName() {
        return this.wanName;
    }
    public String wanType() {
        return this.wanType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatIf2Stat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addressMode;
        private List<String> ips;
        private List<String> natAddresses;
        private String networkName;
        private String portId;
        private String portUsage;
        private String redundancyState;
        private Integer rxBytes;
        private Integer rxPkts;
        private GetGatewayStatsDeviceGatewayStatIf2StatServpInfo servpInfo;
        private Integer txBytes;
        private Integer txPkts;
        private Boolean up;
        private Integer vlan;
        private String wanName;
        private String wanType;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatIf2Stat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressMode = defaults.addressMode;
    	      this.ips = defaults.ips;
    	      this.natAddresses = defaults.natAddresses;
    	      this.networkName = defaults.networkName;
    	      this.portId = defaults.portId;
    	      this.portUsage = defaults.portUsage;
    	      this.redundancyState = defaults.redundancyState;
    	      this.rxBytes = defaults.rxBytes;
    	      this.rxPkts = defaults.rxPkts;
    	      this.servpInfo = defaults.servpInfo;
    	      this.txBytes = defaults.txBytes;
    	      this.txPkts = defaults.txPkts;
    	      this.up = defaults.up;
    	      this.vlan = defaults.vlan;
    	      this.wanName = defaults.wanName;
    	      this.wanType = defaults.wanType;
        }

        @CustomType.Setter
        public Builder addressMode(String addressMode) {
            if (addressMode == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "addressMode");
            }
            this.addressMode = addressMode;
            return this;
        }
        @CustomType.Setter
        public Builder ips(List<String> ips) {
            if (ips == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "ips");
            }
            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder natAddresses(List<String> natAddresses) {
            if (natAddresses == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "natAddresses");
            }
            this.natAddresses = natAddresses;
            return this;
        }
        public Builder natAddresses(String... natAddresses) {
            return natAddresses(List.of(natAddresses));
        }
        @CustomType.Setter
        public Builder networkName(String networkName) {
            if (networkName == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "networkName");
            }
            this.networkName = networkName;
            return this;
        }
        @CustomType.Setter
        public Builder portId(String portId) {
            if (portId == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "portId");
            }
            this.portId = portId;
            return this;
        }
        @CustomType.Setter
        public Builder portUsage(String portUsage) {
            if (portUsage == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "portUsage");
            }
            this.portUsage = portUsage;
            return this;
        }
        @CustomType.Setter
        public Builder redundancyState(String redundancyState) {
            if (redundancyState == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "redundancyState");
            }
            this.redundancyState = redundancyState;
            return this;
        }
        @CustomType.Setter
        public Builder rxBytes(Integer rxBytes) {
            if (rxBytes == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "rxBytes");
            }
            this.rxBytes = rxBytes;
            return this;
        }
        @CustomType.Setter
        public Builder rxPkts(Integer rxPkts) {
            if (rxPkts == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "rxPkts");
            }
            this.rxPkts = rxPkts;
            return this;
        }
        @CustomType.Setter
        public Builder servpInfo(GetGatewayStatsDeviceGatewayStatIf2StatServpInfo servpInfo) {
            if (servpInfo == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "servpInfo");
            }
            this.servpInfo = servpInfo;
            return this;
        }
        @CustomType.Setter
        public Builder txBytes(Integer txBytes) {
            if (txBytes == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "txBytes");
            }
            this.txBytes = txBytes;
            return this;
        }
        @CustomType.Setter
        public Builder txPkts(Integer txPkts) {
            if (txPkts == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "txPkts");
            }
            this.txPkts = txPkts;
            return this;
        }
        @CustomType.Setter
        public Builder up(Boolean up) {
            if (up == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "up");
            }
            this.up = up;
            return this;
        }
        @CustomType.Setter
        public Builder vlan(Integer vlan) {
            if (vlan == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "vlan");
            }
            this.vlan = vlan;
            return this;
        }
        @CustomType.Setter
        public Builder wanName(String wanName) {
            if (wanName == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "wanName");
            }
            this.wanName = wanName;
            return this;
        }
        @CustomType.Setter
        public Builder wanType(String wanType) {
            if (wanType == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatIf2Stat", "wanType");
            }
            this.wanType = wanType;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatIf2Stat build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatIf2Stat();
            _resultValue.addressMode = addressMode;
            _resultValue.ips = ips;
            _resultValue.natAddresses = natAddresses;
            _resultValue.networkName = networkName;
            _resultValue.portId = portId;
            _resultValue.portUsage = portUsage;
            _resultValue.redundancyState = redundancyState;
            _resultValue.rxBytes = rxBytes;
            _resultValue.rxPkts = rxPkts;
            _resultValue.servpInfo = servpInfo;
            _resultValue.txBytes = txBytes;
            _resultValue.txPkts = txPkts;
            _resultValue.up = up;
            _resultValue.vlan = vlan;
            _resultValue.wanName = wanName;
            _resultValue.wanType = wanType;
            return _resultValue;
        }
    }
}
