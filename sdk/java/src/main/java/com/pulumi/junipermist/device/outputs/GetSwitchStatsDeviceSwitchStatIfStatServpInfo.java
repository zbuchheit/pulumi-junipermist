// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSwitchStatsDeviceSwitchStatIfStatServpInfo {
    private String asn;
    private String city;
    private String countryCode;
    private Double latitude;
    private Double longitude;
    private String org;
    private String regionCode;

    private GetSwitchStatsDeviceSwitchStatIfStatServpInfo() {}
    public String asn() {
        return this.asn;
    }
    public String city() {
        return this.city;
    }
    public String countryCode() {
        return this.countryCode;
    }
    public Double latitude() {
        return this.latitude;
    }
    public Double longitude() {
        return this.longitude;
    }
    public String org() {
        return this.org;
    }
    public String regionCode() {
        return this.regionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStatsDeviceSwitchStatIfStatServpInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String asn;
        private String city;
        private String countryCode;
        private Double latitude;
        private Double longitude;
        private String org;
        private String regionCode;
        public Builder() {}
        public Builder(GetSwitchStatsDeviceSwitchStatIfStatServpInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.city = defaults.city;
    	      this.countryCode = defaults.countryCode;
    	      this.latitude = defaults.latitude;
    	      this.longitude = defaults.longitude;
    	      this.org = defaults.org;
    	      this.regionCode = defaults.regionCode;
        }

        @CustomType.Setter
        public Builder asn(String asn) {
            if (asn == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatIfStatServpInfo", "asn");
            }
            this.asn = asn;
            return this;
        }
        @CustomType.Setter
        public Builder city(String city) {
            if (city == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatIfStatServpInfo", "city");
            }
            this.city = city;
            return this;
        }
        @CustomType.Setter
        public Builder countryCode(String countryCode) {
            if (countryCode == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatIfStatServpInfo", "countryCode");
            }
            this.countryCode = countryCode;
            return this;
        }
        @CustomType.Setter
        public Builder latitude(Double latitude) {
            if (latitude == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatIfStatServpInfo", "latitude");
            }
            this.latitude = latitude;
            return this;
        }
        @CustomType.Setter
        public Builder longitude(Double longitude) {
            if (longitude == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatIfStatServpInfo", "longitude");
            }
            this.longitude = longitude;
            return this;
        }
        @CustomType.Setter
        public Builder org(String org) {
            if (org == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatIfStatServpInfo", "org");
            }
            this.org = org;
            return this;
        }
        @CustomType.Setter
        public Builder regionCode(String regionCode) {
            if (regionCode == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatIfStatServpInfo", "regionCode");
            }
            this.regionCode = regionCode;
            return this;
        }
        public GetSwitchStatsDeviceSwitchStatIfStatServpInfo build() {
            final var _resultValue = new GetSwitchStatsDeviceSwitchStatIfStatServpInfo();
            _resultValue.asn = asn;
            _resultValue.city = city;
            _resultValue.countryCode = countryCode;
            _resultValue.latitude = latitude;
            _resultValue.longitude = longitude;
            _resultValue.org = org;
            _resultValue.regionCode = regionCode;
            return _resultValue;
        }
    }
}
