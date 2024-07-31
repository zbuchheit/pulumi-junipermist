// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.site.outputs.WlanBonjourServices;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanBonjour {
    /**
     * @return additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
     * 
     */
    private List<String> additionalVlanIds;
    /**
     * @return whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return what services are allowed.
     * Property key is the service name
     * 
     */
    private Map<String,WlanBonjourServices> services;

    private WlanBonjour() {}
    /**
     * @return additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
     * 
     */
    public List<String> additionalVlanIds() {
        return this.additionalVlanIds;
    }
    /**
     * @return whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return what services are allowed.
     * Property key is the service name
     * 
     */
    public Map<String,WlanBonjourServices> services() {
        return this.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanBonjour defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> additionalVlanIds;
        private @Nullable Boolean enabled;
        private Map<String,WlanBonjourServices> services;
        public Builder() {}
        public Builder(WlanBonjour defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalVlanIds = defaults.additionalVlanIds;
    	      this.enabled = defaults.enabled;
    	      this.services = defaults.services;
        }

        @CustomType.Setter
        public Builder additionalVlanIds(List<String> additionalVlanIds) {
            if (additionalVlanIds == null) {
              throw new MissingRequiredPropertyException("WlanBonjour", "additionalVlanIds");
            }
            this.additionalVlanIds = additionalVlanIds;
            return this;
        }
        public Builder additionalVlanIds(String... additionalVlanIds) {
            return additionalVlanIds(List.of(additionalVlanIds));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder services(Map<String,WlanBonjourServices> services) {
            if (services == null) {
              throw new MissingRequiredPropertyException("WlanBonjour", "services");
            }
            this.services = services;
            return this;
        }
        public WlanBonjour build() {
            final var _resultValue = new WlanBonjour();
            _resultValue.additionalVlanIds = additionalVlanIds;
            _resultValue.enabled = enabled;
            _resultValue.services = services;
            return _resultValue;
        }
    }
}
