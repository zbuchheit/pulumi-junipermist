// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetSwitchStatsDeviceSwitchStatMacTableStats {
    private Integer macTableCount;
    private Integer maxMacEntriesSupported;

    private GetSwitchStatsDeviceSwitchStatMacTableStats() {}
    public Integer macTableCount() {
        return this.macTableCount;
    }
    public Integer maxMacEntriesSupported() {
        return this.maxMacEntriesSupported;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStatsDeviceSwitchStatMacTableStats defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer macTableCount;
        private Integer maxMacEntriesSupported;
        public Builder() {}
        public Builder(GetSwitchStatsDeviceSwitchStatMacTableStats defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.macTableCount = defaults.macTableCount;
    	      this.maxMacEntriesSupported = defaults.maxMacEntriesSupported;
        }

        @CustomType.Setter
        public Builder macTableCount(Integer macTableCount) {
            if (macTableCount == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatMacTableStats", "macTableCount");
            }
            this.macTableCount = macTableCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxMacEntriesSupported(Integer maxMacEntriesSupported) {
            if (maxMacEntriesSupported == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatMacTableStats", "maxMacEntriesSupported");
            }
            this.maxMacEntriesSupported = maxMacEntriesSupported;
            return this;
        }
        public GetSwitchStatsDeviceSwitchStatMacTableStats build() {
            final var _resultValue = new GetSwitchStatsDeviceSwitchStatMacTableStats();
            _resultValue.macTableCount = macTableCount;
            _resultValue.maxMacEntriesSupported = maxMacEntriesSupported;
            return _resultValue;
        }
    }
}
