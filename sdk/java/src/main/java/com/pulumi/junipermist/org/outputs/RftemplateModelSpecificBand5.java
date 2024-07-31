// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RftemplateModelSpecificBand5 {
    private @Nullable Boolean allowRrmDisable;
    private @Nullable Integer antGain;
    /**
     * @return enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
     * 
     */
    private @Nullable String antennaMode;
    /**
     * @return channel width for the 5GHz band. enum: `20`, `40`, `80`
     * 
     */
    private @Nullable Integer bandwidth;
    /**
     * @return For RFTemplates. List of channels, null or empty array means auto
     * 
     */
    private @Nullable List<Integer> channels;
    /**
     * @return whether to disable the radio
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return TX power of the radio. For Devices, 0 means auto. -1 / -2 / -3 / …: treated as 0 / -1 / -2 / …
     * 
     */
    private @Nullable Integer power;
    /**
     * @return when power=0, max tx power to use, HW-specific values will be used if not set
     * 
     */
    private @Nullable Integer powerMax;
    /**
     * @return when power=0, min tx power to use, HW-specific values will be used if not set
     * 
     */
    private @Nullable Integer powerMin;
    /**
     * @return enum: `auto`, `long`, `short`
     * 
     */
    private @Nullable String preamble;

    private RftemplateModelSpecificBand5() {}
    public Optional<Boolean> allowRrmDisable() {
        return Optional.ofNullable(this.allowRrmDisable);
    }
    public Optional<Integer> antGain() {
        return Optional.ofNullable(this.antGain);
    }
    /**
     * @return enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
     * 
     */
    public Optional<String> antennaMode() {
        return Optional.ofNullable(this.antennaMode);
    }
    /**
     * @return channel width for the 5GHz band. enum: `20`, `40`, `80`
     * 
     */
    public Optional<Integer> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }
    /**
     * @return For RFTemplates. List of channels, null or empty array means auto
     * 
     */
    public List<Integer> channels() {
        return this.channels == null ? List.of() : this.channels;
    }
    /**
     * @return whether to disable the radio
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return TX power of the radio. For Devices, 0 means auto. -1 / -2 / -3 / …: treated as 0 / -1 / -2 / …
     * 
     */
    public Optional<Integer> power() {
        return Optional.ofNullable(this.power);
    }
    /**
     * @return when power=0, max tx power to use, HW-specific values will be used if not set
     * 
     */
    public Optional<Integer> powerMax() {
        return Optional.ofNullable(this.powerMax);
    }
    /**
     * @return when power=0, min tx power to use, HW-specific values will be used if not set
     * 
     */
    public Optional<Integer> powerMin() {
        return Optional.ofNullable(this.powerMin);
    }
    /**
     * @return enum: `auto`, `long`, `short`
     * 
     */
    public Optional<String> preamble() {
        return Optional.ofNullable(this.preamble);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RftemplateModelSpecificBand5 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowRrmDisable;
        private @Nullable Integer antGain;
        private @Nullable String antennaMode;
        private @Nullable Integer bandwidth;
        private @Nullable List<Integer> channels;
        private @Nullable Boolean disabled;
        private @Nullable Integer power;
        private @Nullable Integer powerMax;
        private @Nullable Integer powerMin;
        private @Nullable String preamble;
        public Builder() {}
        public Builder(RftemplateModelSpecificBand5 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowRrmDisable = defaults.allowRrmDisable;
    	      this.antGain = defaults.antGain;
    	      this.antennaMode = defaults.antennaMode;
    	      this.bandwidth = defaults.bandwidth;
    	      this.channels = defaults.channels;
    	      this.disabled = defaults.disabled;
    	      this.power = defaults.power;
    	      this.powerMax = defaults.powerMax;
    	      this.powerMin = defaults.powerMin;
    	      this.preamble = defaults.preamble;
        }

        @CustomType.Setter
        public Builder allowRrmDisable(@Nullable Boolean allowRrmDisable) {

            this.allowRrmDisable = allowRrmDisable;
            return this;
        }
        @CustomType.Setter
        public Builder antGain(@Nullable Integer antGain) {

            this.antGain = antGain;
            return this;
        }
        @CustomType.Setter
        public Builder antennaMode(@Nullable String antennaMode) {

            this.antennaMode = antennaMode;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(@Nullable Integer bandwidth) {

            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder channels(@Nullable List<Integer> channels) {

            this.channels = channels;
            return this;
        }
        public Builder channels(Integer... channels) {
            return channels(List.of(channels));
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder power(@Nullable Integer power) {

            this.power = power;
            return this;
        }
        @CustomType.Setter
        public Builder powerMax(@Nullable Integer powerMax) {

            this.powerMax = powerMax;
            return this;
        }
        @CustomType.Setter
        public Builder powerMin(@Nullable Integer powerMin) {

            this.powerMin = powerMin;
            return this;
        }
        @CustomType.Setter
        public Builder preamble(@Nullable String preamble) {

            this.preamble = preamble;
            return this;
        }
        public RftemplateModelSpecificBand5 build() {
            final var _resultValue = new RftemplateModelSpecificBand5();
            _resultValue.allowRrmDisable = allowRrmDisable;
            _resultValue.antGain = antGain;
            _resultValue.antennaMode = antennaMode;
            _resultValue.bandwidth = bandwidth;
            _resultValue.channels = channels;
            _resultValue.disabled = disabled;
            _resultValue.power = power;
            _resultValue.powerMax = powerMax;
            _resultValue.powerMin = powerMin;
            _resultValue.preamble = preamble;
            return _resultValue;
        }
    }
}
