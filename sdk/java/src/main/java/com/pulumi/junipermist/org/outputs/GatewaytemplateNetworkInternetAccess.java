// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.GatewaytemplateNetworkInternetAccessDestinationNat;
import com.pulumi.junipermist.org.outputs.GatewaytemplateNetworkInternetAccessStaticNat;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateNetworkInternetAccess {
    private @Nullable Boolean createSimpleServicePolicy;
    /**
     * @return Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
     * 
     */
    private @Nullable Map<String,GatewaytemplateNetworkInternetAccessDestinationNat> destinationNat;
    private @Nullable Boolean enabled;
    /**
     * @return by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
     * 
     */
    private @Nullable Boolean restricted;
    /**
     * @return Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
     * 
     */
    private @Nullable Map<String,GatewaytemplateNetworkInternetAccessStaticNat> staticNat;

    private GatewaytemplateNetworkInternetAccess() {}
    public Optional<Boolean> createSimpleServicePolicy() {
        return Optional.ofNullable(this.createSimpleServicePolicy);
    }
    /**
     * @return Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
     * 
     */
    public Map<String,GatewaytemplateNetworkInternetAccessDestinationNat> destinationNat() {
        return this.destinationNat == null ? Map.of() : this.destinationNat;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
     * 
     */
    public Optional<Boolean> restricted() {
        return Optional.ofNullable(this.restricted);
    }
    /**
     * @return Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
     * 
     */
    public Map<String,GatewaytemplateNetworkInternetAccessStaticNat> staticNat() {
        return this.staticNat == null ? Map.of() : this.staticNat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateNetworkInternetAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean createSimpleServicePolicy;
        private @Nullable Map<String,GatewaytemplateNetworkInternetAccessDestinationNat> destinationNat;
        private @Nullable Boolean enabled;
        private @Nullable Boolean restricted;
        private @Nullable Map<String,GatewaytemplateNetworkInternetAccessStaticNat> staticNat;
        public Builder() {}
        public Builder(GatewaytemplateNetworkInternetAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createSimpleServicePolicy = defaults.createSimpleServicePolicy;
    	      this.destinationNat = defaults.destinationNat;
    	      this.enabled = defaults.enabled;
    	      this.restricted = defaults.restricted;
    	      this.staticNat = defaults.staticNat;
        }

        @CustomType.Setter
        public Builder createSimpleServicePolicy(@Nullable Boolean createSimpleServicePolicy) {

            this.createSimpleServicePolicy = createSimpleServicePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder destinationNat(@Nullable Map<String,GatewaytemplateNetworkInternetAccessDestinationNat> destinationNat) {

            this.destinationNat = destinationNat;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder restricted(@Nullable Boolean restricted) {

            this.restricted = restricted;
            return this;
        }
        @CustomType.Setter
        public Builder staticNat(@Nullable Map<String,GatewaytemplateNetworkInternetAccessStaticNat> staticNat) {

            this.staticNat = staticNat;
            return this;
        }
        public GatewaytemplateNetworkInternetAccess build() {
            final var _resultValue = new GatewaytemplateNetworkInternetAccess();
            _resultValue.createSimpleServicePolicy = createSimpleServicePolicy;
            _resultValue.destinationNat = destinationNat;
            _resultValue.enabled = enabled;
            _resultValue.restricted = restricted;
            _resultValue.staticNat = staticNat;
            return _resultValue;
        }
    }
}
