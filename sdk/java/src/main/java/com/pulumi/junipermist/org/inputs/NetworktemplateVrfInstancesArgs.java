// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.NetworktemplateVrfInstancesExtraRoutesArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateVrfInstancesArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateVrfInstancesArgs Empty = new NetworktemplateVrfInstancesArgs();

    /**
     * Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    @Import(name="extraRoutes")
    private @Nullable Output<Map<String,NetworktemplateVrfInstancesExtraRoutesArgs>> extraRoutes;

    /**
     * @return Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
     * 
     */
    public Optional<Output<Map<String,NetworktemplateVrfInstancesExtraRoutesArgs>>> extraRoutes() {
        return Optional.ofNullable(this.extraRoutes);
    }

    @Import(name="networks")
    private @Nullable Output<List<String>> networks;

    public Optional<Output<List<String>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    private NetworktemplateVrfInstancesArgs() {}

    private NetworktemplateVrfInstancesArgs(NetworktemplateVrfInstancesArgs $) {
        this.extraRoutes = $.extraRoutes;
        this.networks = $.networks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateVrfInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateVrfInstancesArgs $;

        public Builder() {
            $ = new NetworktemplateVrfInstancesArgs();
        }

        public Builder(NetworktemplateVrfInstancesArgs defaults) {
            $ = new NetworktemplateVrfInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extraRoutes Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes(@Nullable Output<Map<String,NetworktemplateVrfInstancesExtraRoutesArgs>> extraRoutes) {
            $.extraRoutes = extraRoutes;
            return this;
        }

        /**
         * @param extraRoutes Property key is the destination CIDR (e.g. &#34;10.0.0.0/8&#34;)
         * 
         * @return builder
         * 
         */
        public Builder extraRoutes(Map<String,NetworktemplateVrfInstancesExtraRoutesArgs> extraRoutes) {
            return extraRoutes(Output.of(extraRoutes));
        }

        public Builder networks(@Nullable Output<List<String>> networks) {
            $.networks = networks;
            return this;
        }

        public Builder networks(List<String> networks) {
            return networks(Output.of(networks));
        }

        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }

        public NetworktemplateVrfInstancesArgs build() {
            return $;
        }
    }

}
