// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.NetworkInternetAccessDestinationNatArgs;
import com.pulumi.junipermist.org.inputs.NetworkInternetAccessStaticNatArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInternetAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInternetAccessArgs Empty = new NetworkInternetAccessArgs();

    @Import(name="createSimpleServicePolicy")
    private @Nullable Output<Boolean> createSimpleServicePolicy;

    public Optional<Output<Boolean>> createSimpleServicePolicy() {
        return Optional.ofNullable(this.createSimpleServicePolicy);
    }

    /**
     * Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
     * 
     */
    @Import(name="destinationNat")
    private @Nullable Output<Map<String,NetworkInternetAccessDestinationNatArgs>> destinationNat;

    /**
     * @return Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
     * 
     */
    public Optional<Output<Map<String,NetworkInternetAccessDestinationNatArgs>>> destinationNat() {
        return Optional.ofNullable(this.destinationNat);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
     * 
     */
    @Import(name="restricted")
    private @Nullable Output<Boolean> restricted;

    /**
     * @return by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
     * 
     */
    public Optional<Output<Boolean>> restricted() {
        return Optional.ofNullable(this.restricted);
    }

    /**
     * Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
     * 
     */
    @Import(name="staticNat")
    private @Nullable Output<Map<String,NetworkInternetAccessStaticNatArgs>> staticNat;

    /**
     * @return Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
     * 
     */
    public Optional<Output<Map<String,NetworkInternetAccessStaticNatArgs>>> staticNat() {
        return Optional.ofNullable(this.staticNat);
    }

    private NetworkInternetAccessArgs() {}

    private NetworkInternetAccessArgs(NetworkInternetAccessArgs $) {
        this.createSimpleServicePolicy = $.createSimpleServicePolicy;
        this.destinationNat = $.destinationNat;
        this.enabled = $.enabled;
        this.restricted = $.restricted;
        this.staticNat = $.staticNat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInternetAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInternetAccessArgs $;

        public Builder() {
            $ = new NetworkInternetAccessArgs();
        }

        public Builder(NetworkInternetAccessArgs defaults) {
            $ = new NetworkInternetAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder createSimpleServicePolicy(@Nullable Output<Boolean> createSimpleServicePolicy) {
            $.createSimpleServicePolicy = createSimpleServicePolicy;
            return this;
        }

        public Builder createSimpleServicePolicy(Boolean createSimpleServicePolicy) {
            return createSimpleServicePolicy(Output.of(createSimpleServicePolicy));
        }

        /**
         * @param destinationNat Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
         * 
         * @return builder
         * 
         */
        public Builder destinationNat(@Nullable Output<Map<String,NetworkInternetAccessDestinationNatArgs>> destinationNat) {
            $.destinationNat = destinationNat;
            return this;
        }

        /**
         * @param destinationNat Property key may be an IP/Port (i.e. &#34;63.16.0.3:443&#34;), or a port (i.e. &#34;:2222&#34;)
         * 
         * @return builder
         * 
         */
        public Builder destinationNat(Map<String,NetworkInternetAccessDestinationNatArgs> destinationNat) {
            return destinationNat(Output.of(destinationNat));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param restricted by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
         * 
         * @return builder
         * 
         */
        public Builder restricted(@Nullable Output<Boolean> restricted) {
            $.restricted = restricted;
            return this;
        }

        /**
         * @param restricted by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
         * 
         * @return builder
         * 
         */
        public Builder restricted(Boolean restricted) {
            return restricted(Output.of(restricted));
        }

        /**
         * @param staticNat Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
         * 
         * @return builder
         * 
         */
        public Builder staticNat(@Nullable Output<Map<String,NetworkInternetAccessStaticNatArgs>> staticNat) {
            $.staticNat = staticNat;
            return this;
        }

        /**
         * @param staticNat Property key may be an IP Address (i.e. &#34;172.16.0.1&#34;), and IP Address and Port (i.e. &#34;172.16.0.1:8443&#34;) or a CIDR (i.e. &#34;172.16.0.12/20&#34;)
         * 
         * @return builder
         * 
         */
        public Builder staticNat(Map<String,NetworkInternetAccessStaticNatArgs> staticNat) {
            return staticNat(Output.of(staticNat));
        }

        public NetworkInternetAccessArgs build() {
            return $;
        }
    }

}
