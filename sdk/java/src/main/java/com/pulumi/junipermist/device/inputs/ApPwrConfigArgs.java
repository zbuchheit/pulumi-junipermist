// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApPwrConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApPwrConfigArgs Empty = new ApPwrConfigArgs();

    /**
     * additional power to request during negotiating with PSE over PoE, in mW
     * 
     */
    @Import(name="base")
    private @Nullable Output<Integer> base;

    /**
     * @return additional power to request during negotiating with PSE over PoE, in mW
     * 
     */
    public Optional<Output<Integer>> base() {
        return Optional.ofNullable(this.base);
    }

    /**
     * whether to enable power out to peripheral, meanwhile will reduce power to wifi (only for AP45 at power mode)
     * 
     */
    @Import(name="preferUsbOverWifi")
    private @Nullable Output<Boolean> preferUsbOverWifi;

    /**
     * @return whether to enable power out to peripheral, meanwhile will reduce power to wifi (only for AP45 at power mode)
     * 
     */
    public Optional<Output<Boolean>> preferUsbOverWifi() {
        return Optional.ofNullable(this.preferUsbOverWifi);
    }

    private ApPwrConfigArgs() {}

    private ApPwrConfigArgs(ApPwrConfigArgs $) {
        this.base = $.base;
        this.preferUsbOverWifi = $.preferUsbOverWifi;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApPwrConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApPwrConfigArgs $;

        public Builder() {
            $ = new ApPwrConfigArgs();
        }

        public Builder(ApPwrConfigArgs defaults) {
            $ = new ApPwrConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param base additional power to request during negotiating with PSE over PoE, in mW
         * 
         * @return builder
         * 
         */
        public Builder base(@Nullable Output<Integer> base) {
            $.base = base;
            return this;
        }

        /**
         * @param base additional power to request during negotiating with PSE over PoE, in mW
         * 
         * @return builder
         * 
         */
        public Builder base(Integer base) {
            return base(Output.of(base));
        }

        /**
         * @param preferUsbOverWifi whether to enable power out to peripheral, meanwhile will reduce power to wifi (only for AP45 at power mode)
         * 
         * @return builder
         * 
         */
        public Builder preferUsbOverWifi(@Nullable Output<Boolean> preferUsbOverWifi) {
            $.preferUsbOverWifi = preferUsbOverWifi;
            return this;
        }

        /**
         * @param preferUsbOverWifi whether to enable power out to peripheral, meanwhile will reduce power to wifi (only for AP45 at power mode)
         * 
         * @return builder
         * 
         */
        public Builder preferUsbOverWifi(Boolean preferUsbOverWifi) {
            return preferUsbOverWifi(Output.of(preferUsbOverWifi));
        }

        public ApPwrConfigArgs build() {
            return $;
        }
    }

}