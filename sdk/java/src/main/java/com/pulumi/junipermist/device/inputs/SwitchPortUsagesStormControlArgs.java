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


public final class SwitchPortUsagesStormControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchPortUsagesStormControlArgs Empty = new SwitchPortUsagesStormControlArgs();

    /**
     * whether to disable storm control on broadcast traffic
     * 
     */
    @Import(name="noBroadcast")
    private @Nullable Output<Boolean> noBroadcast;

    /**
     * @return whether to disable storm control on broadcast traffic
     * 
     */
    public Optional<Output<Boolean>> noBroadcast() {
        return Optional.ofNullable(this.noBroadcast);
    }

    /**
     * whether to disable storm control on multicast traffic
     * 
     */
    @Import(name="noMulticast")
    private @Nullable Output<Boolean> noMulticast;

    /**
     * @return whether to disable storm control on multicast traffic
     * 
     */
    public Optional<Output<Boolean>> noMulticast() {
        return Optional.ofNullable(this.noMulticast);
    }

    /**
     * whether to disable storm control on registered multicast traffic
     * 
     */
    @Import(name="noRegisteredMulticast")
    private @Nullable Output<Boolean> noRegisteredMulticast;

    /**
     * @return whether to disable storm control on registered multicast traffic
     * 
     */
    public Optional<Output<Boolean>> noRegisteredMulticast() {
        return Optional.ofNullable(this.noRegisteredMulticast);
    }

    /**
     * whether to disable storm control on unknown unicast traffic
     * 
     */
    @Import(name="noUnknownUnicast")
    private @Nullable Output<Boolean> noUnknownUnicast;

    /**
     * @return whether to disable storm control on unknown unicast traffic
     * 
     */
    public Optional<Output<Boolean>> noUnknownUnicast() {
        return Optional.ofNullable(this.noUnknownUnicast);
    }

    /**
     * bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
     * 
     */
    @Import(name="percentage")
    private @Nullable Output<Integer> percentage;

    /**
     * @return bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
     * 
     */
    public Optional<Output<Integer>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    private SwitchPortUsagesStormControlArgs() {}

    private SwitchPortUsagesStormControlArgs(SwitchPortUsagesStormControlArgs $) {
        this.noBroadcast = $.noBroadcast;
        this.noMulticast = $.noMulticast;
        this.noRegisteredMulticast = $.noRegisteredMulticast;
        this.noUnknownUnicast = $.noUnknownUnicast;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchPortUsagesStormControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchPortUsagesStormControlArgs $;

        public Builder() {
            $ = new SwitchPortUsagesStormControlArgs();
        }

        public Builder(SwitchPortUsagesStormControlArgs defaults) {
            $ = new SwitchPortUsagesStormControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param noBroadcast whether to disable storm control on broadcast traffic
         * 
         * @return builder
         * 
         */
        public Builder noBroadcast(@Nullable Output<Boolean> noBroadcast) {
            $.noBroadcast = noBroadcast;
            return this;
        }

        /**
         * @param noBroadcast whether to disable storm control on broadcast traffic
         * 
         * @return builder
         * 
         */
        public Builder noBroadcast(Boolean noBroadcast) {
            return noBroadcast(Output.of(noBroadcast));
        }

        /**
         * @param noMulticast whether to disable storm control on multicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noMulticast(@Nullable Output<Boolean> noMulticast) {
            $.noMulticast = noMulticast;
            return this;
        }

        /**
         * @param noMulticast whether to disable storm control on multicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noMulticast(Boolean noMulticast) {
            return noMulticast(Output.of(noMulticast));
        }

        /**
         * @param noRegisteredMulticast whether to disable storm control on registered multicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noRegisteredMulticast(@Nullable Output<Boolean> noRegisteredMulticast) {
            $.noRegisteredMulticast = noRegisteredMulticast;
            return this;
        }

        /**
         * @param noRegisteredMulticast whether to disable storm control on registered multicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noRegisteredMulticast(Boolean noRegisteredMulticast) {
            return noRegisteredMulticast(Output.of(noRegisteredMulticast));
        }

        /**
         * @param noUnknownUnicast whether to disable storm control on unknown unicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noUnknownUnicast(@Nullable Output<Boolean> noUnknownUnicast) {
            $.noUnknownUnicast = noUnknownUnicast;
            return this;
        }

        /**
         * @param noUnknownUnicast whether to disable storm control on unknown unicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noUnknownUnicast(Boolean noUnknownUnicast) {
            return noUnknownUnicast(Output.of(noUnknownUnicast));
        }

        /**
         * @param percentage bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
         * 
         * @return builder
         * 
         */
        public Builder percentage(@Nullable Output<Integer> percentage) {
            $.percentage = percentage;
            return this;
        }

        /**
         * @param percentage bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
         * 
         * @return builder
         * 
         */
        public Builder percentage(Integer percentage) {
            return percentage(Output.of(percentage));
        }

        public SwitchPortUsagesStormControlArgs build() {
            return $;
        }
    }

}
