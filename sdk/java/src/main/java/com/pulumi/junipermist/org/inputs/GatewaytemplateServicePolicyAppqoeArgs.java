// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateServicePolicyAppqoeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateServicePolicyAppqoeArgs Empty = new GatewaytemplateServicePolicyAppqoeArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private GatewaytemplateServicePolicyAppqoeArgs() {}

    private GatewaytemplateServicePolicyAppqoeArgs(GatewaytemplateServicePolicyAppqoeArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateServicePolicyAppqoeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateServicePolicyAppqoeArgs $;

        public Builder() {
            $ = new GatewaytemplateServicePolicyAppqoeArgs();
        }

        public Builder(GatewaytemplateServicePolicyAppqoeArgs defaults) {
            $ = new GatewaytemplateServicePolicyAppqoeArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public GatewaytemplateServicePolicyAppqoeArgs build() {
            return $;
        }
    }

}
