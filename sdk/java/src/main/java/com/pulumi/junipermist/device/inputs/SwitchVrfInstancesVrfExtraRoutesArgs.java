// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SwitchVrfInstancesVrfExtraRoutesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchVrfInstancesVrfExtraRoutesArgs Empty = new SwitchVrfInstancesVrfExtraRoutesArgs();

    /**
     * Next-hop address
     * 
     */
    @Import(name="via", required=true)
    private Output<String> via;

    /**
     * @return Next-hop address
     * 
     */
    public Output<String> via() {
        return this.via;
    }

    private SwitchVrfInstancesVrfExtraRoutesArgs() {}

    private SwitchVrfInstancesVrfExtraRoutesArgs(SwitchVrfInstancesVrfExtraRoutesArgs $) {
        this.via = $.via;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchVrfInstancesVrfExtraRoutesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchVrfInstancesVrfExtraRoutesArgs $;

        public Builder() {
            $ = new SwitchVrfInstancesVrfExtraRoutesArgs();
        }

        public Builder(SwitchVrfInstancesVrfExtraRoutesArgs defaults) {
            $ = new SwitchVrfInstancesVrfExtraRoutesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param via Next-hop address
         * 
         * @return builder
         * 
         */
        public Builder via(Output<String> via) {
            $.via = via;
            return this;
        }

        /**
         * @param via Next-hop address
         * 
         * @return builder
         * 
         */
        public Builder via(String via) {
            return via(Output.of(via));
        }

        public SwitchVrfInstancesVrfExtraRoutesArgs build() {
            if ($.via == null) {
                throw new MissingRequiredPropertyException("SwitchVrfInstancesVrfExtraRoutesArgs", "via");
            }
            return $;
        }
    }

}
