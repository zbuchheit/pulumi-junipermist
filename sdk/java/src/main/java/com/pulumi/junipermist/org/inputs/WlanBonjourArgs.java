// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.inputs.WlanBonjourServicesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanBonjourArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanBonjourArgs Empty = new WlanBonjourArgs();

    /**
     * additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
     * 
     */
    @Import(name="additionalVlanIds", required=true)
    private Output<List<String>> additionalVlanIds;

    /**
     * @return additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
     * 
     */
    public Output<List<String>> additionalVlanIds() {
        return this.additionalVlanIds;
    }

    /**
     * whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * what services are allowed.
     * Property key is the service name
     * 
     */
    @Import(name="services", required=true)
    private Output<Map<String,WlanBonjourServicesArgs>> services;

    /**
     * @return what services are allowed.
     * Property key is the service name
     * 
     */
    public Output<Map<String,WlanBonjourServicesArgs>> services() {
        return this.services;
    }

    private WlanBonjourArgs() {}

    private WlanBonjourArgs(WlanBonjourArgs $) {
        this.additionalVlanIds = $.additionalVlanIds;
        this.enabled = $.enabled;
        this.services = $.services;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanBonjourArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanBonjourArgs $;

        public Builder() {
            $ = new WlanBonjourArgs();
        }

        public Builder(WlanBonjourArgs defaults) {
            $ = new WlanBonjourArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalVlanIds additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
         * 
         * @return builder
         * 
         */
        public Builder additionalVlanIds(Output<List<String>> additionalVlanIds) {
            $.additionalVlanIds = additionalVlanIds;
            return this;
        }

        /**
         * @param additionalVlanIds additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
         * 
         * @return builder
         * 
         */
        public Builder additionalVlanIds(List<String> additionalVlanIds) {
            return additionalVlanIds(Output.of(additionalVlanIds));
        }

        /**
         * @param additionalVlanIds additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
         * 
         * @return builder
         * 
         */
        public Builder additionalVlanIds(String... additionalVlanIds) {
            return additionalVlanIds(List.of(additionalVlanIds));
        }

        /**
         * @param enabled whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param services what services are allowed.
         * Property key is the service name
         * 
         * @return builder
         * 
         */
        public Builder services(Output<Map<String,WlanBonjourServicesArgs>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services what services are allowed.
         * Property key is the service name
         * 
         * @return builder
         * 
         */
        public Builder services(Map<String,WlanBonjourServicesArgs> services) {
            return services(Output.of(services));
        }

        public WlanBonjourArgs build() {
            if ($.additionalVlanIds == null) {
                throw new MissingRequiredPropertyException("WlanBonjourArgs", "additionalVlanIds");
            }
            if ($.services == null) {
                throw new MissingRequiredPropertyException("WlanBonjourArgs", "services");
            }
            return $;
        }
    }

}
