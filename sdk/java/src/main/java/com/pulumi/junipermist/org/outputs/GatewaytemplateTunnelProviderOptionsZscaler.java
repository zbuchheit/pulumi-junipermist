// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.GatewaytemplateTunnelProviderOptionsZscalerSubLocation;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateTunnelProviderOptionsZscaler {
    private @Nullable Boolean aupAcceptanceRequired;
    /**
     * @return days before AUP is requested again
     * 
     */
    private @Nullable Integer aupExpire;
    /**
     * @return proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
     * 
     */
    private @Nullable Boolean aupSslProxy;
    /**
     * @return the download bandwidth cap of the link, in Mbps
     * 
     */
    private @Nullable Integer downloadMbps;
    /**
     * @return if `use_xff`==`true`, display Acceptable Use Policy (AUP)
     * 
     */
    private @Nullable Boolean enableAup;
    /**
     * @return when `enforce_authentication`==`false`, display caution notification for non-authenticated users
     * 
     */
    private @Nullable Boolean enableCaution;
    private @Nullable Boolean enforceAuthentication;
    private @Nullable String name;
    /**
     * @return if `use_xff`==`true`
     * 
     */
    private @Nullable List<GatewaytemplateTunnelProviderOptionsZscalerSubLocation> subLocations;
    /**
     * @return the download bandwidth cap of the link, in Mbps
     * 
     */
    private @Nullable Integer uploadMbps;
    /**
     * @return location uses proxy chaining to forward traffic
     * 
     */
    private @Nullable Boolean useXff;

    private GatewaytemplateTunnelProviderOptionsZscaler() {}
    public Optional<Boolean> aupAcceptanceRequired() {
        return Optional.ofNullable(this.aupAcceptanceRequired);
    }
    /**
     * @return days before AUP is requested again
     * 
     */
    public Optional<Integer> aupExpire() {
        return Optional.ofNullable(this.aupExpire);
    }
    /**
     * @return proxy HTTPs traffic, requiring Zscaler cert to be installed in browser
     * 
     */
    public Optional<Boolean> aupSslProxy() {
        return Optional.ofNullable(this.aupSslProxy);
    }
    /**
     * @return the download bandwidth cap of the link, in Mbps
     * 
     */
    public Optional<Integer> downloadMbps() {
        return Optional.ofNullable(this.downloadMbps);
    }
    /**
     * @return if `use_xff`==`true`, display Acceptable Use Policy (AUP)
     * 
     */
    public Optional<Boolean> enableAup() {
        return Optional.ofNullable(this.enableAup);
    }
    /**
     * @return when `enforce_authentication`==`false`, display caution notification for non-authenticated users
     * 
     */
    public Optional<Boolean> enableCaution() {
        return Optional.ofNullable(this.enableCaution);
    }
    public Optional<Boolean> enforceAuthentication() {
        return Optional.ofNullable(this.enforceAuthentication);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return if `use_xff`==`true`
     * 
     */
    public List<GatewaytemplateTunnelProviderOptionsZscalerSubLocation> subLocations() {
        return this.subLocations == null ? List.of() : this.subLocations;
    }
    /**
     * @return the download bandwidth cap of the link, in Mbps
     * 
     */
    public Optional<Integer> uploadMbps() {
        return Optional.ofNullable(this.uploadMbps);
    }
    /**
     * @return location uses proxy chaining to forward traffic
     * 
     */
    public Optional<Boolean> useXff() {
        return Optional.ofNullable(this.useXff);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateTunnelProviderOptionsZscaler defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean aupAcceptanceRequired;
        private @Nullable Integer aupExpire;
        private @Nullable Boolean aupSslProxy;
        private @Nullable Integer downloadMbps;
        private @Nullable Boolean enableAup;
        private @Nullable Boolean enableCaution;
        private @Nullable Boolean enforceAuthentication;
        private @Nullable String name;
        private @Nullable List<GatewaytemplateTunnelProviderOptionsZscalerSubLocation> subLocations;
        private @Nullable Integer uploadMbps;
        private @Nullable Boolean useXff;
        public Builder() {}
        public Builder(GatewaytemplateTunnelProviderOptionsZscaler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aupAcceptanceRequired = defaults.aupAcceptanceRequired;
    	      this.aupExpire = defaults.aupExpire;
    	      this.aupSslProxy = defaults.aupSslProxy;
    	      this.downloadMbps = defaults.downloadMbps;
    	      this.enableAup = defaults.enableAup;
    	      this.enableCaution = defaults.enableCaution;
    	      this.enforceAuthentication = defaults.enforceAuthentication;
    	      this.name = defaults.name;
    	      this.subLocations = defaults.subLocations;
    	      this.uploadMbps = defaults.uploadMbps;
    	      this.useXff = defaults.useXff;
        }

        @CustomType.Setter
        public Builder aupAcceptanceRequired(@Nullable Boolean aupAcceptanceRequired) {

            this.aupAcceptanceRequired = aupAcceptanceRequired;
            return this;
        }
        @CustomType.Setter
        public Builder aupExpire(@Nullable Integer aupExpire) {

            this.aupExpire = aupExpire;
            return this;
        }
        @CustomType.Setter
        public Builder aupSslProxy(@Nullable Boolean aupSslProxy) {

            this.aupSslProxy = aupSslProxy;
            return this;
        }
        @CustomType.Setter
        public Builder downloadMbps(@Nullable Integer downloadMbps) {

            this.downloadMbps = downloadMbps;
            return this;
        }
        @CustomType.Setter
        public Builder enableAup(@Nullable Boolean enableAup) {

            this.enableAup = enableAup;
            return this;
        }
        @CustomType.Setter
        public Builder enableCaution(@Nullable Boolean enableCaution) {

            this.enableCaution = enableCaution;
            return this;
        }
        @CustomType.Setter
        public Builder enforceAuthentication(@Nullable Boolean enforceAuthentication) {

            this.enforceAuthentication = enforceAuthentication;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder subLocations(@Nullable List<GatewaytemplateTunnelProviderOptionsZscalerSubLocation> subLocations) {

            this.subLocations = subLocations;
            return this;
        }
        public Builder subLocations(GatewaytemplateTunnelProviderOptionsZscalerSubLocation... subLocations) {
            return subLocations(List.of(subLocations));
        }
        @CustomType.Setter
        public Builder uploadMbps(@Nullable Integer uploadMbps) {

            this.uploadMbps = uploadMbps;
            return this;
        }
        @CustomType.Setter
        public Builder useXff(@Nullable Boolean useXff) {

            this.useXff = useXff;
            return this;
        }
        public GatewaytemplateTunnelProviderOptionsZscaler build() {
            final var _resultValue = new GatewaytemplateTunnelProviderOptionsZscaler();
            _resultValue.aupAcceptanceRequired = aupAcceptanceRequired;
            _resultValue.aupExpire = aupExpire;
            _resultValue.aupSslProxy = aupSslProxy;
            _resultValue.downloadMbps = downloadMbps;
            _resultValue.enableAup = enableAup;
            _resultValue.enableCaution = enableCaution;
            _resultValue.enforceAuthentication = enforceAuthentication;
            _resultValue.name = name;
            _resultValue.subLocations = subLocations;
            _resultValue.uploadMbps = uploadMbps;
            _resultValue.useXff = useXff;
            return _resultValue;
        }
    }
}
