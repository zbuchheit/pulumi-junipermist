// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.DeviceprofileGatewayTunnelProviderOptionsJse;
import com.pulumi.junipermist.org.outputs.DeviceprofileGatewayTunnelProviderOptionsZscaler;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileGatewayTunnelProviderOptions {
    /**
     * @return for jse-ipsec, this allow provisioning of adequate resource on JSE. Make sure adequate licenses are added
     * 
     */
    private @Nullable DeviceprofileGatewayTunnelProviderOptionsJse jse;
    /**
     * @return for zscaler-ipsec and zscaler-gre
     * 
     */
    private @Nullable DeviceprofileGatewayTunnelProviderOptionsZscaler zscaler;

    private DeviceprofileGatewayTunnelProviderOptions() {}
    /**
     * @return for jse-ipsec, this allow provisioning of adequate resource on JSE. Make sure adequate licenses are added
     * 
     */
    public Optional<DeviceprofileGatewayTunnelProviderOptionsJse> jse() {
        return Optional.ofNullable(this.jse);
    }
    /**
     * @return for zscaler-ipsec and zscaler-gre
     * 
     */
    public Optional<DeviceprofileGatewayTunnelProviderOptionsZscaler> zscaler() {
        return Optional.ofNullable(this.zscaler);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileGatewayTunnelProviderOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DeviceprofileGatewayTunnelProviderOptionsJse jse;
        private @Nullable DeviceprofileGatewayTunnelProviderOptionsZscaler zscaler;
        public Builder() {}
        public Builder(DeviceprofileGatewayTunnelProviderOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jse = defaults.jse;
    	      this.zscaler = defaults.zscaler;
        }

        @CustomType.Setter
        public Builder jse(@Nullable DeviceprofileGatewayTunnelProviderOptionsJse jse) {

            this.jse = jse;
            return this;
        }
        @CustomType.Setter
        public Builder zscaler(@Nullable DeviceprofileGatewayTunnelProviderOptionsZscaler zscaler) {

            this.zscaler = zscaler;
            return this;
        }
        public DeviceprofileGatewayTunnelProviderOptions build() {
            final var _resultValue = new DeviceprofileGatewayTunnelProviderOptions();
            _resultValue.jse = jse;
            _resultValue.zscaler = zscaler;
            return _resultValue;
        }
    }
}
