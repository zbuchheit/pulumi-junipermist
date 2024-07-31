// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.GatewaytemplateRoutingPoliciesTermActionArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateRoutingPoliciesTermMatchingArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateRoutingPoliciesTermArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateRoutingPoliciesTermArgs Empty = new GatewaytemplateRoutingPoliciesTermArgs();

    /**
     * when used as import policy
     * 
     */
    @Import(name="action")
    private @Nullable Output<GatewaytemplateRoutingPoliciesTermActionArgs> action;

    /**
     * @return when used as import policy
     * 
     */
    public Optional<Output<GatewaytemplateRoutingPoliciesTermActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * zero or more criteria/filter can be specified to match the term, all criteria have to be met
     * 
     */
    @Import(name="matching")
    private @Nullable Output<GatewaytemplateRoutingPoliciesTermMatchingArgs> matching;

    /**
     * @return zero or more criteria/filter can be specified to match the term, all criteria have to be met
     * 
     */
    public Optional<Output<GatewaytemplateRoutingPoliciesTermMatchingArgs>> matching() {
        return Optional.ofNullable(this.matching);
    }

    private GatewaytemplateRoutingPoliciesTermArgs() {}

    private GatewaytemplateRoutingPoliciesTermArgs(GatewaytemplateRoutingPoliciesTermArgs $) {
        this.action = $.action;
        this.matching = $.matching;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateRoutingPoliciesTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateRoutingPoliciesTermArgs $;

        public Builder() {
            $ = new GatewaytemplateRoutingPoliciesTermArgs();
        }

        public Builder(GatewaytemplateRoutingPoliciesTermArgs defaults) {
            $ = new GatewaytemplateRoutingPoliciesTermArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action when used as import policy
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<GatewaytemplateRoutingPoliciesTermActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action when used as import policy
         * 
         * @return builder
         * 
         */
        public Builder action(GatewaytemplateRoutingPoliciesTermActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param matching zero or more criteria/filter can be specified to match the term, all criteria have to be met
         * 
         * @return builder
         * 
         */
        public Builder matching(@Nullable Output<GatewaytemplateRoutingPoliciesTermMatchingArgs> matching) {
            $.matching = matching;
            return this;
        }

        /**
         * @param matching zero or more criteria/filter can be specified to match the term, all criteria have to be met
         * 
         * @return builder
         * 
         */
        public Builder matching(GatewaytemplateRoutingPoliciesTermMatchingArgs matching) {
            return matching(Output.of(matching));
        }

        public GatewaytemplateRoutingPoliciesTermArgs build() {
            return $;
        }
    }

}
