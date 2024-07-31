// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.site.inputs.NetworktemplateExtraRoutesNextQualifiedArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateExtraRoutesArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateExtraRoutesArgs Empty = new NetworktemplateExtraRoutesArgs();

    /**
     * this takes precedence
     * 
     */
    @Import(name="discard")
    private @Nullable Output<Boolean> discard;

    /**
     * @return this takes precedence
     * 
     */
    public Optional<Output<Boolean>> discard() {
        return Optional.ofNullable(this.discard);
    }

    @Import(name="metric")
    private @Nullable Output<Integer> metric;

    public Optional<Output<Integer>> metric() {
        return Optional.ofNullable(this.metric);
    }

    @Import(name="nextQualified")
    private @Nullable Output<Map<String,NetworktemplateExtraRoutesNextQualifiedArgs>> nextQualified;

    public Optional<Output<Map<String,NetworktemplateExtraRoutesNextQualifiedArgs>>> nextQualified() {
        return Optional.ofNullable(this.nextQualified);
    }

    @Import(name="noResolve")
    private @Nullable Output<Boolean> noResolve;

    public Optional<Output<Boolean>> noResolve() {
        return Optional.ofNullable(this.noResolve);
    }

    @Import(name="preference")
    private @Nullable Output<Integer> preference;

    public Optional<Output<Integer>> preference() {
        return Optional.ofNullable(this.preference);
    }

    /**
     * next-hop IP Address
     * 
     */
    @Import(name="via", required=true)
    private Output<String> via;

    /**
     * @return next-hop IP Address
     * 
     */
    public Output<String> via() {
        return this.via;
    }

    private NetworktemplateExtraRoutesArgs() {}

    private NetworktemplateExtraRoutesArgs(NetworktemplateExtraRoutesArgs $) {
        this.discard = $.discard;
        this.metric = $.metric;
        this.nextQualified = $.nextQualified;
        this.noResolve = $.noResolve;
        this.preference = $.preference;
        this.via = $.via;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateExtraRoutesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateExtraRoutesArgs $;

        public Builder() {
            $ = new NetworktemplateExtraRoutesArgs();
        }

        public Builder(NetworktemplateExtraRoutesArgs defaults) {
            $ = new NetworktemplateExtraRoutesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param discard this takes precedence
         * 
         * @return builder
         * 
         */
        public Builder discard(@Nullable Output<Boolean> discard) {
            $.discard = discard;
            return this;
        }

        /**
         * @param discard this takes precedence
         * 
         * @return builder
         * 
         */
        public Builder discard(Boolean discard) {
            return discard(Output.of(discard));
        }

        public Builder metric(@Nullable Output<Integer> metric) {
            $.metric = metric;
            return this;
        }

        public Builder metric(Integer metric) {
            return metric(Output.of(metric));
        }

        public Builder nextQualified(@Nullable Output<Map<String,NetworktemplateExtraRoutesNextQualifiedArgs>> nextQualified) {
            $.nextQualified = nextQualified;
            return this;
        }

        public Builder nextQualified(Map<String,NetworktemplateExtraRoutesNextQualifiedArgs> nextQualified) {
            return nextQualified(Output.of(nextQualified));
        }

        public Builder noResolve(@Nullable Output<Boolean> noResolve) {
            $.noResolve = noResolve;
            return this;
        }

        public Builder noResolve(Boolean noResolve) {
            return noResolve(Output.of(noResolve));
        }

        public Builder preference(@Nullable Output<Integer> preference) {
            $.preference = preference;
            return this;
        }

        public Builder preference(Integer preference) {
            return preference(Output.of(preference));
        }

        /**
         * @param via next-hop IP Address
         * 
         * @return builder
         * 
         */
        public Builder via(Output<String> via) {
            $.via = via;
            return this;
        }

        /**
         * @param via next-hop IP Address
         * 
         * @return builder
         * 
         */
        public Builder via(String via) {
            return via(Output.of(via));
        }

        public NetworktemplateExtraRoutesArgs build() {
            if ($.via == null) {
                throw new MissingRequiredPropertyException("NetworktemplateExtraRoutesArgs", "via");
            }
            return $;
        }
    }

}
