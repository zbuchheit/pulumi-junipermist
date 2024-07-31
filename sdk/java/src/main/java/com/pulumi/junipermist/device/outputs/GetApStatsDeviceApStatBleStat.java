// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatBleStat {
    private Boolean beaconEnabled;
    private Integer beaconRate;
    private Boolean eddystoneUidEnabled;
    private Integer eddystoneUidFreqMsec;
    private String eddystoneUidInstance;
    private String eddystoneUidNamespace;
    private Boolean eddystoneUrlEnabled;
    /**
     * @return Frequency (msec) of data emmit by Eddystone-UID beacon
     * 
     */
    private Integer eddystoneUrlFreqMsec;
    private String eddystoneUrlUrl;
    private Boolean ibeaconEnabled;
    private Integer ibeaconFreqMsec;
    private Integer ibeaconMajor;
    private Integer ibeaconMinor;
    private String ibeaconUuid;
    private Integer major;
    private List<Integer> minors;
    private Integer power;
    private Integer rxBytes;
    private Integer rxPkts;
    private Integer txBytes;
    private Integer txPkts;
    /**
     * @return resets due to tx hung
     * 
     */
    private Integer txResets;
    private String uuid;

    private GetApStatsDeviceApStatBleStat() {}
    public Boolean beaconEnabled() {
        return this.beaconEnabled;
    }
    public Integer beaconRate() {
        return this.beaconRate;
    }
    public Boolean eddystoneUidEnabled() {
        return this.eddystoneUidEnabled;
    }
    public Integer eddystoneUidFreqMsec() {
        return this.eddystoneUidFreqMsec;
    }
    public String eddystoneUidInstance() {
        return this.eddystoneUidInstance;
    }
    public String eddystoneUidNamespace() {
        return this.eddystoneUidNamespace;
    }
    public Boolean eddystoneUrlEnabled() {
        return this.eddystoneUrlEnabled;
    }
    /**
     * @return Frequency (msec) of data emmit by Eddystone-UID beacon
     * 
     */
    public Integer eddystoneUrlFreqMsec() {
        return this.eddystoneUrlFreqMsec;
    }
    public String eddystoneUrlUrl() {
        return this.eddystoneUrlUrl;
    }
    public Boolean ibeaconEnabled() {
        return this.ibeaconEnabled;
    }
    public Integer ibeaconFreqMsec() {
        return this.ibeaconFreqMsec;
    }
    public Integer ibeaconMajor() {
        return this.ibeaconMajor;
    }
    public Integer ibeaconMinor() {
        return this.ibeaconMinor;
    }
    public String ibeaconUuid() {
        return this.ibeaconUuid;
    }
    public Integer major() {
        return this.major;
    }
    public List<Integer> minors() {
        return this.minors;
    }
    public Integer power() {
        return this.power;
    }
    public Integer rxBytes() {
        return this.rxBytes;
    }
    public Integer rxPkts() {
        return this.rxPkts;
    }
    public Integer txBytes() {
        return this.txBytes;
    }
    public Integer txPkts() {
        return this.txPkts;
    }
    /**
     * @return resets due to tx hung
     * 
     */
    public Integer txResets() {
        return this.txResets;
    }
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatBleStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean beaconEnabled;
        private Integer beaconRate;
        private Boolean eddystoneUidEnabled;
        private Integer eddystoneUidFreqMsec;
        private String eddystoneUidInstance;
        private String eddystoneUidNamespace;
        private Boolean eddystoneUrlEnabled;
        private Integer eddystoneUrlFreqMsec;
        private String eddystoneUrlUrl;
        private Boolean ibeaconEnabled;
        private Integer ibeaconFreqMsec;
        private Integer ibeaconMajor;
        private Integer ibeaconMinor;
        private String ibeaconUuid;
        private Integer major;
        private List<Integer> minors;
        private Integer power;
        private Integer rxBytes;
        private Integer rxPkts;
        private Integer txBytes;
        private Integer txPkts;
        private Integer txResets;
        private String uuid;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatBleStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beaconEnabled = defaults.beaconEnabled;
    	      this.beaconRate = defaults.beaconRate;
    	      this.eddystoneUidEnabled = defaults.eddystoneUidEnabled;
    	      this.eddystoneUidFreqMsec = defaults.eddystoneUidFreqMsec;
    	      this.eddystoneUidInstance = defaults.eddystoneUidInstance;
    	      this.eddystoneUidNamespace = defaults.eddystoneUidNamespace;
    	      this.eddystoneUrlEnabled = defaults.eddystoneUrlEnabled;
    	      this.eddystoneUrlFreqMsec = defaults.eddystoneUrlFreqMsec;
    	      this.eddystoneUrlUrl = defaults.eddystoneUrlUrl;
    	      this.ibeaconEnabled = defaults.ibeaconEnabled;
    	      this.ibeaconFreqMsec = defaults.ibeaconFreqMsec;
    	      this.ibeaconMajor = defaults.ibeaconMajor;
    	      this.ibeaconMinor = defaults.ibeaconMinor;
    	      this.ibeaconUuid = defaults.ibeaconUuid;
    	      this.major = defaults.major;
    	      this.minors = defaults.minors;
    	      this.power = defaults.power;
    	      this.rxBytes = defaults.rxBytes;
    	      this.rxPkts = defaults.rxPkts;
    	      this.txBytes = defaults.txBytes;
    	      this.txPkts = defaults.txPkts;
    	      this.txResets = defaults.txResets;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder beaconEnabled(Boolean beaconEnabled) {
            if (beaconEnabled == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "beaconEnabled");
            }
            this.beaconEnabled = beaconEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder beaconRate(Integer beaconRate) {
            if (beaconRate == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "beaconRate");
            }
            this.beaconRate = beaconRate;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidEnabled(Boolean eddystoneUidEnabled) {
            if (eddystoneUidEnabled == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "eddystoneUidEnabled");
            }
            this.eddystoneUidEnabled = eddystoneUidEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidFreqMsec(Integer eddystoneUidFreqMsec) {
            if (eddystoneUidFreqMsec == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "eddystoneUidFreqMsec");
            }
            this.eddystoneUidFreqMsec = eddystoneUidFreqMsec;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidInstance(String eddystoneUidInstance) {
            if (eddystoneUidInstance == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "eddystoneUidInstance");
            }
            this.eddystoneUidInstance = eddystoneUidInstance;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUidNamespace(String eddystoneUidNamespace) {
            if (eddystoneUidNamespace == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "eddystoneUidNamespace");
            }
            this.eddystoneUidNamespace = eddystoneUidNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUrlEnabled(Boolean eddystoneUrlEnabled) {
            if (eddystoneUrlEnabled == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "eddystoneUrlEnabled");
            }
            this.eddystoneUrlEnabled = eddystoneUrlEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUrlFreqMsec(Integer eddystoneUrlFreqMsec) {
            if (eddystoneUrlFreqMsec == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "eddystoneUrlFreqMsec");
            }
            this.eddystoneUrlFreqMsec = eddystoneUrlFreqMsec;
            return this;
        }
        @CustomType.Setter
        public Builder eddystoneUrlUrl(String eddystoneUrlUrl) {
            if (eddystoneUrlUrl == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "eddystoneUrlUrl");
            }
            this.eddystoneUrlUrl = eddystoneUrlUrl;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconEnabled(Boolean ibeaconEnabled) {
            if (ibeaconEnabled == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "ibeaconEnabled");
            }
            this.ibeaconEnabled = ibeaconEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconFreqMsec(Integer ibeaconFreqMsec) {
            if (ibeaconFreqMsec == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "ibeaconFreqMsec");
            }
            this.ibeaconFreqMsec = ibeaconFreqMsec;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconMajor(Integer ibeaconMajor) {
            if (ibeaconMajor == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "ibeaconMajor");
            }
            this.ibeaconMajor = ibeaconMajor;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconMinor(Integer ibeaconMinor) {
            if (ibeaconMinor == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "ibeaconMinor");
            }
            this.ibeaconMinor = ibeaconMinor;
            return this;
        }
        @CustomType.Setter
        public Builder ibeaconUuid(String ibeaconUuid) {
            if (ibeaconUuid == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "ibeaconUuid");
            }
            this.ibeaconUuid = ibeaconUuid;
            return this;
        }
        @CustomType.Setter
        public Builder major(Integer major) {
            if (major == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "major");
            }
            this.major = major;
            return this;
        }
        @CustomType.Setter
        public Builder minors(List<Integer> minors) {
            if (minors == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "minors");
            }
            this.minors = minors;
            return this;
        }
        public Builder minors(Integer... minors) {
            return minors(List.of(minors));
        }
        @CustomType.Setter
        public Builder power(Integer power) {
            if (power == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "power");
            }
            this.power = power;
            return this;
        }
        @CustomType.Setter
        public Builder rxBytes(Integer rxBytes) {
            if (rxBytes == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "rxBytes");
            }
            this.rxBytes = rxBytes;
            return this;
        }
        @CustomType.Setter
        public Builder rxPkts(Integer rxPkts) {
            if (rxPkts == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "rxPkts");
            }
            this.rxPkts = rxPkts;
            return this;
        }
        @CustomType.Setter
        public Builder txBytes(Integer txBytes) {
            if (txBytes == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "txBytes");
            }
            this.txBytes = txBytes;
            return this;
        }
        @CustomType.Setter
        public Builder txPkts(Integer txPkts) {
            if (txPkts == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "txPkts");
            }
            this.txPkts = txPkts;
            return this;
        }
        @CustomType.Setter
        public Builder txResets(Integer txResets) {
            if (txResets == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "txResets");
            }
            this.txResets = txResets;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatBleStat", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetApStatsDeviceApStatBleStat build() {
            final var _resultValue = new GetApStatsDeviceApStatBleStat();
            _resultValue.beaconEnabled = beaconEnabled;
            _resultValue.beaconRate = beaconRate;
            _resultValue.eddystoneUidEnabled = eddystoneUidEnabled;
            _resultValue.eddystoneUidFreqMsec = eddystoneUidFreqMsec;
            _resultValue.eddystoneUidInstance = eddystoneUidInstance;
            _resultValue.eddystoneUidNamespace = eddystoneUidNamespace;
            _resultValue.eddystoneUrlEnabled = eddystoneUrlEnabled;
            _resultValue.eddystoneUrlFreqMsec = eddystoneUrlFreqMsec;
            _resultValue.eddystoneUrlUrl = eddystoneUrlUrl;
            _resultValue.ibeaconEnabled = ibeaconEnabled;
            _resultValue.ibeaconFreqMsec = ibeaconFreqMsec;
            _resultValue.ibeaconMajor = ibeaconMajor;
            _resultValue.ibeaconMinor = ibeaconMinor;
            _resultValue.ibeaconUuid = ibeaconUuid;
            _resultValue.major = major;
            _resultValue.minors = minors;
            _resultValue.power = power;
            _resultValue.rxBytes = rxBytes;
            _resultValue.rxPkts = rxPkts;
            _resultValue.txBytes = txBytes;
            _resultValue.txPkts = txPkts;
            _resultValue.txResets = txResets;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
