// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceprofilesGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceprofilesGatewayPlainArgs Empty = new GetDeviceprofilesGatewayPlainArgs();

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    private GetDeviceprofilesGatewayPlainArgs() {}

    private GetDeviceprofilesGatewayPlainArgs(GetDeviceprofilesGatewayPlainArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceprofilesGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceprofilesGatewayPlainArgs $;

        public Builder() {
            $ = new GetDeviceprofilesGatewayPlainArgs();
        }

        public Builder(GetDeviceprofilesGatewayPlainArgs defaults) {
            $ = new GetDeviceprofilesGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetDeviceprofilesGatewayPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetDeviceprofilesGatewayPlainArgs", "orgId");
            }
            return $;
        }
    }

}
