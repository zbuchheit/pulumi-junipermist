// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetVpnsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpnsArgs Empty = new GetVpnsArgs();

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    private GetVpnsArgs() {}

    private GetVpnsArgs(GetVpnsArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpnsArgs $;

        public Builder() {
            $ = new GetVpnsArgs();
        }

        public Builder(GetVpnsArgs defaults) {
            $ = new GetVpnsArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public GetVpnsArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetVpnsArgs", "orgId");
            }
            return $;
        }
    }

}