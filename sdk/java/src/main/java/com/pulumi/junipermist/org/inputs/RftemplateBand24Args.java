// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RftemplateBand24Args extends com.pulumi.resources.ResourceArgs {

    public static final RftemplateBand24Args Empty = new RftemplateBand24Args();

    @Import(name="allowRrmDisable")
    private @Nullable Output<Boolean> allowRrmDisable;

    public Optional<Output<Boolean>> allowRrmDisable() {
        return Optional.ofNullable(this.allowRrmDisable);
    }

    @Import(name="antGain")
    private @Nullable Output<Integer> antGain;

    public Optional<Output<Integer>> antGain() {
        return Optional.ofNullable(this.antGain);
    }

    /**
     * enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
     * 
     */
    @Import(name="antennaMode")
    private @Nullable Output<String> antennaMode;

    /**
     * @return enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
     * 
     */
    public Optional<Output<String>> antennaMode() {
        return Optional.ofNullable(this.antennaMode);
    }

    /**
     * channel width for the 2.4GHz band. enum: `20`, `40`
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return channel width for the 2.4GHz band. enum: `20`, `40`
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * For RFTemplates. List of channels, null or empty array means auto
     * 
     */
    @Import(name="channels")
    private @Nullable Output<List<Integer>> channels;

    /**
     * @return For RFTemplates. List of channels, null or empty array means auto
     * 
     */
    public Optional<Output<List<Integer>>> channels() {
        return Optional.ofNullable(this.channels);
    }

    /**
     * whether to disable the radio
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return whether to disable the radio
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * TX power of the radio. For Devices, 0 means auto. -1 / -2 / -3 / …: treated as 0 / -1 / -2 / …
     * 
     */
    @Import(name="power")
    private @Nullable Output<Integer> power;

    /**
     * @return TX power of the radio. For Devices, 0 means auto. -1 / -2 / -3 / …: treated as 0 / -1 / -2 / …
     * 
     */
    public Optional<Output<Integer>> power() {
        return Optional.ofNullable(this.power);
    }

    /**
     * when power=0, max tx power to use, HW-specific values will be used if not set
     * 
     */
    @Import(name="powerMax")
    private @Nullable Output<Integer> powerMax;

    /**
     * @return when power=0, max tx power to use, HW-specific values will be used if not set
     * 
     */
    public Optional<Output<Integer>> powerMax() {
        return Optional.ofNullable(this.powerMax);
    }

    /**
     * when power=0, min tx power to use, HW-specific values will be used if not set
     * 
     */
    @Import(name="powerMin")
    private @Nullable Output<Integer> powerMin;

    /**
     * @return when power=0, min tx power to use, HW-specific values will be used if not set
     * 
     */
    public Optional<Output<Integer>> powerMin() {
        return Optional.ofNullable(this.powerMin);
    }

    /**
     * enum: `auto`, `long`, `short`
     * 
     */
    @Import(name="preamble")
    private @Nullable Output<String> preamble;

    /**
     * @return enum: `auto`, `long`, `short`
     * 
     */
    public Optional<Output<String>> preamble() {
        return Optional.ofNullable(this.preamble);
    }

    private RftemplateBand24Args() {}

    private RftemplateBand24Args(RftemplateBand24Args $) {
        this.allowRrmDisable = $.allowRrmDisable;
        this.antGain = $.antGain;
        this.antennaMode = $.antennaMode;
        this.bandwidth = $.bandwidth;
        this.channels = $.channels;
        this.disabled = $.disabled;
        this.power = $.power;
        this.powerMax = $.powerMax;
        this.powerMin = $.powerMin;
        this.preamble = $.preamble;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RftemplateBand24Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RftemplateBand24Args $;

        public Builder() {
            $ = new RftemplateBand24Args();
        }

        public Builder(RftemplateBand24Args defaults) {
            $ = new RftemplateBand24Args(Objects.requireNonNull(defaults));
        }

        public Builder allowRrmDisable(@Nullable Output<Boolean> allowRrmDisable) {
            $.allowRrmDisable = allowRrmDisable;
            return this;
        }

        public Builder allowRrmDisable(Boolean allowRrmDisable) {
            return allowRrmDisable(Output.of(allowRrmDisable));
        }

        public Builder antGain(@Nullable Output<Integer> antGain) {
            $.antGain = antGain;
            return this;
        }

        public Builder antGain(Integer antGain) {
            return antGain(Output.of(antGain));
        }

        /**
         * @param antennaMode enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
         * 
         * @return builder
         * 
         */
        public Builder antennaMode(@Nullable Output<String> antennaMode) {
            $.antennaMode = antennaMode;
            return this;
        }

        /**
         * @param antennaMode enum: `1x1`, `2x2`, `3x3`, `4x4`, `default`
         * 
         * @return builder
         * 
         */
        public Builder antennaMode(String antennaMode) {
            return antennaMode(Output.of(antennaMode));
        }

        /**
         * @param bandwidth channel width for the 2.4GHz band. enum: `20`, `40`
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth channel width for the 2.4GHz band. enum: `20`, `40`
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param channels For RFTemplates. List of channels, null or empty array means auto
         * 
         * @return builder
         * 
         */
        public Builder channels(@Nullable Output<List<Integer>> channels) {
            $.channels = channels;
            return this;
        }

        /**
         * @param channels For RFTemplates. List of channels, null or empty array means auto
         * 
         * @return builder
         * 
         */
        public Builder channels(List<Integer> channels) {
            return channels(Output.of(channels));
        }

        /**
         * @param channels For RFTemplates. List of channels, null or empty array means auto
         * 
         * @return builder
         * 
         */
        public Builder channels(Integer... channels) {
            return channels(List.of(channels));
        }

        /**
         * @param disabled whether to disable the radio
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled whether to disable the radio
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param power TX power of the radio. For Devices, 0 means auto. -1 / -2 / -3 / …: treated as 0 / -1 / -2 / …
         * 
         * @return builder
         * 
         */
        public Builder power(@Nullable Output<Integer> power) {
            $.power = power;
            return this;
        }

        /**
         * @param power TX power of the radio. For Devices, 0 means auto. -1 / -2 / -3 / …: treated as 0 / -1 / -2 / …
         * 
         * @return builder
         * 
         */
        public Builder power(Integer power) {
            return power(Output.of(power));
        }

        /**
         * @param powerMax when power=0, max tx power to use, HW-specific values will be used if not set
         * 
         * @return builder
         * 
         */
        public Builder powerMax(@Nullable Output<Integer> powerMax) {
            $.powerMax = powerMax;
            return this;
        }

        /**
         * @param powerMax when power=0, max tx power to use, HW-specific values will be used if not set
         * 
         * @return builder
         * 
         */
        public Builder powerMax(Integer powerMax) {
            return powerMax(Output.of(powerMax));
        }

        /**
         * @param powerMin when power=0, min tx power to use, HW-specific values will be used if not set
         * 
         * @return builder
         * 
         */
        public Builder powerMin(@Nullable Output<Integer> powerMin) {
            $.powerMin = powerMin;
            return this;
        }

        /**
         * @param powerMin when power=0, min tx power to use, HW-specific values will be used if not set
         * 
         * @return builder
         * 
         */
        public Builder powerMin(Integer powerMin) {
            return powerMin(Output.of(powerMin));
        }

        /**
         * @param preamble enum: `auto`, `long`, `short`
         * 
         * @return builder
         * 
         */
        public Builder preamble(@Nullable Output<String> preamble) {
            $.preamble = preamble;
            return this;
        }

        /**
         * @param preamble enum: `auto`, `long`, `short`
         * 
         * @return builder
         * 
         */
        public Builder preamble(String preamble) {
            return preamble(Output.of(preamble));
        }

        public RftemplateBand24Args build() {
            return $;
        }
    }

}
