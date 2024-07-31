// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.GatewayPortMirroringPortMirrorArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayPortMirroringArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayPortMirroringArgs Empty = new GatewayPortMirroringArgs();

    @Import(name="portMirror")
    private @Nullable Output<GatewayPortMirroringPortMirrorArgs> portMirror;

    public Optional<Output<GatewayPortMirroringPortMirrorArgs>> portMirror() {
        return Optional.ofNullable(this.portMirror);
    }

    private GatewayPortMirroringArgs() {}

    private GatewayPortMirroringArgs(GatewayPortMirroringArgs $) {
        this.portMirror = $.portMirror;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayPortMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayPortMirroringArgs $;

        public Builder() {
            $ = new GatewayPortMirroringArgs();
        }

        public Builder(GatewayPortMirroringArgs defaults) {
            $ = new GatewayPortMirroringArgs(Objects.requireNonNull(defaults));
        }

        public Builder portMirror(@Nullable Output<GatewayPortMirroringPortMirrorArgs> portMirror) {
            $.portMirror = portMirror;
            return this;
        }

        public Builder portMirror(GatewayPortMirroringPortMirrorArgs portMirror) {
            return portMirror(Output.of(portMirror));
        }

        public GatewayPortMirroringArgs build() {
            return $;
        }
    }

}
