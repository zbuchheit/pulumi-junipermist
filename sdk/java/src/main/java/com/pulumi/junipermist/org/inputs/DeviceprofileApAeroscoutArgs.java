// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileApAeroscoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileApAeroscoutArgs Empty = new DeviceprofileApAeroscoutArgs();

    /**
     * whether to enable aeroscout config
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return whether to enable aeroscout config
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * required if enabled, aeroscout server host
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return required if enabled, aeroscout server host
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * whether to enable the feature to allow wireless clients data received and sent to AES server for location calculation
     * 
     */
    @Import(name="locateConnected")
    private @Nullable Output<Boolean> locateConnected;

    /**
     * @return whether to enable the feature to allow wireless clients data received and sent to AES server for location calculation
     * 
     */
    public Optional<Output<Boolean>> locateConnected() {
        return Optional.ofNullable(this.locateConnected);
    }

    private DeviceprofileApAeroscoutArgs() {}

    private DeviceprofileApAeroscoutArgs(DeviceprofileApAeroscoutArgs $) {
        this.enabled = $.enabled;
        this.host = $.host;
        this.locateConnected = $.locateConnected;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileApAeroscoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileApAeroscoutArgs $;

        public Builder() {
            $ = new DeviceprofileApAeroscoutArgs();
        }

        public Builder(DeviceprofileApAeroscoutArgs defaults) {
            $ = new DeviceprofileApAeroscoutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled whether to enable aeroscout config
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled whether to enable aeroscout config
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param host required if enabled, aeroscout server host
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host required if enabled, aeroscout server host
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param locateConnected whether to enable the feature to allow wireless clients data received and sent to AES server for location calculation
         * 
         * @return builder
         * 
         */
        public Builder locateConnected(@Nullable Output<Boolean> locateConnected) {
            $.locateConnected = locateConnected;
            return this;
        }

        /**
         * @param locateConnected whether to enable the feature to allow wireless clients data received and sent to AES server for location calculation
         * 
         * @return builder
         * 
         */
        public Builder locateConnected(Boolean locateConnected) {
            return locateConnected(Output.of(locateConnected));
        }

        public DeviceprofileApAeroscoutArgs build() {
            return $;
        }
    }

}
