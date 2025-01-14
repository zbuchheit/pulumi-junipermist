// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetNactagsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNactagsPlainArgs Empty = new GetNactagsPlainArgs();

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    private GetNactagsPlainArgs() {}

    private GetNactagsPlainArgs(GetNactagsPlainArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNactagsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNactagsPlainArgs $;

        public Builder() {
            $ = new GetNactagsPlainArgs();
        }

        public Builder(GetNactagsPlainArgs defaults) {
            $ = new GetNactagsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetNactagsPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetNactagsPlainArgs", "orgId");
            }
            return $;
        }
    }

}
