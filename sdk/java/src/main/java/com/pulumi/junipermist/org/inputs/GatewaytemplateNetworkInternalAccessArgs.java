// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateNetworkInternalAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateNetworkInternalAccessArgs Empty = new GatewaytemplateNetworkInternalAccessArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private GatewaytemplateNetworkInternalAccessArgs() {}

    private GatewaytemplateNetworkInternalAccessArgs(GatewaytemplateNetworkInternalAccessArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateNetworkInternalAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateNetworkInternalAccessArgs $;

        public Builder() {
            $ = new GatewaytemplateNetworkInternalAccessArgs();
        }

        public Builder(GatewaytemplateNetworkInternalAccessArgs defaults) {
            $ = new GatewaytemplateNetworkInternalAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public GatewaytemplateNetworkInternalAccessArgs build() {
            return $;
        }
    }

}
