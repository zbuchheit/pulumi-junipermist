// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceprofilesApArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceprofilesApArgs Empty = new GetDeviceprofilesApArgs();

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    private GetDeviceprofilesApArgs() {}

    private GetDeviceprofilesApArgs(GetDeviceprofilesApArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceprofilesApArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceprofilesApArgs $;

        public Builder() {
            $ = new GetDeviceprofilesApArgs();
        }

        public Builder(GetDeviceprofilesApArgs defaults) {
            $ = new GetDeviceprofilesApArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public GetDeviceprofilesApArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetDeviceprofilesApArgs", "orgId");
            }
            return $;
        }
    }

}
