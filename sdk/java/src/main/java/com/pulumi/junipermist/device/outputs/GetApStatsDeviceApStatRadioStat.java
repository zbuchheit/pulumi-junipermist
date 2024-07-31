// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetApStatsDeviceApStatRadioStatBand24;
import com.pulumi.junipermist.device.outputs.GetApStatsDeviceApStatRadioStatBand5;
import com.pulumi.junipermist.device.outputs.GetApStatsDeviceApStatRadioStatBand6;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatRadioStat {
    /**
     * @return radio stat
     * 
     */
    private GetApStatsDeviceApStatRadioStatBand24 band24;
    /**
     * @return radio stat
     * 
     */
    private GetApStatsDeviceApStatRadioStatBand5 band5;
    /**
     * @return radio stat
     * 
     */
    private GetApStatsDeviceApStatRadioStatBand6 band6;

    private GetApStatsDeviceApStatRadioStat() {}
    /**
     * @return radio stat
     * 
     */
    public GetApStatsDeviceApStatRadioStatBand24 band24() {
        return this.band24;
    }
    /**
     * @return radio stat
     * 
     */
    public GetApStatsDeviceApStatRadioStatBand5 band5() {
        return this.band5;
    }
    /**
     * @return radio stat
     * 
     */
    public GetApStatsDeviceApStatRadioStatBand6 band6() {
        return this.band6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatRadioStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApStatsDeviceApStatRadioStatBand24 band24;
        private GetApStatsDeviceApStatRadioStatBand5 band5;
        private GetApStatsDeviceApStatRadioStatBand6 band6;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatRadioStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.band24 = defaults.band24;
    	      this.band5 = defaults.band5;
    	      this.band6 = defaults.band6;
        }

        @CustomType.Setter
        public Builder band24(GetApStatsDeviceApStatRadioStatBand24 band24) {
            if (band24 == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatRadioStat", "band24");
            }
            this.band24 = band24;
            return this;
        }
        @CustomType.Setter
        public Builder band5(GetApStatsDeviceApStatRadioStatBand5 band5) {
            if (band5 == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatRadioStat", "band5");
            }
            this.band5 = band5;
            return this;
        }
        @CustomType.Setter
        public Builder band6(GetApStatsDeviceApStatRadioStatBand6 band6) {
            if (band6 == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatRadioStat", "band6");
            }
            this.band6 = band6;
            return this;
        }
        public GetApStatsDeviceApStatRadioStat build() {
            final var _resultValue = new GetApStatsDeviceApStatRadioStat();
            _resultValue.band24 = band24;
            _resultValue.band5 = band5;
            _resultValue.band6 = band6;
            return _resultValue;
        }
    }
}