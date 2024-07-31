// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.NetworktemplateVrfInstancesExtraRoutes;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateVrfInstances {
    /**
     * @return Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    private @Nullable Map<String,NetworktemplateVrfInstancesExtraRoutes> extraRoutes;
    private @Nullable List<String> networks;

    private NetworktemplateVrfInstances() {}
    /**
     * @return Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    public Map<String,NetworktemplateVrfInstancesExtraRoutes> extraRoutes() {
        return this.extraRoutes == null ? Map.of() : this.extraRoutes;
    }
    public List<String> networks() {
        return this.networks == null ? List.of() : this.networks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateVrfInstances defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,NetworktemplateVrfInstancesExtraRoutes> extraRoutes;
        private @Nullable List<String> networks;
        public Builder() {}
        public Builder(NetworktemplateVrfInstances defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extraRoutes = defaults.extraRoutes;
    	      this.networks = defaults.networks;
        }

        @CustomType.Setter
        public Builder extraRoutes(@Nullable Map<String,NetworktemplateVrfInstancesExtraRoutes> extraRoutes) {

            this.extraRoutes = extraRoutes;
            return this;
        }
        @CustomType.Setter
        public Builder networks(@Nullable List<String> networks) {

            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        public NetworktemplateVrfInstances build() {
            final var _resultValue = new NetworktemplateVrfInstances();
            _resultValue.extraRoutes = extraRoutes;
            _resultValue.networks = networks;
            return _resultValue;
        }
    }
}
