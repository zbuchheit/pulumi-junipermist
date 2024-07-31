// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateVrfConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateVrfConfigArgs Empty = new GatewaytemplateVrfConfigArgs();

    /**
     * whether to enable VRF (when supported on the device)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return whether to enable VRF (when supported on the device)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private GatewaytemplateVrfConfigArgs() {}

    private GatewaytemplateVrfConfigArgs(GatewaytemplateVrfConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateVrfConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateVrfConfigArgs $;

        public Builder() {
            $ = new GatewaytemplateVrfConfigArgs();
        }

        public Builder(GatewaytemplateVrfConfigArgs defaults) {
            $ = new GatewaytemplateVrfConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled whether to enable VRF (when supported on the device)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled whether to enable VRF (when supported on the device)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public GatewaytemplateVrfConfigArgs build() {
            return $;
        }
    }

}
