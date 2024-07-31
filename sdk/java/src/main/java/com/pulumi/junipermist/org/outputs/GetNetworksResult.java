// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetNetworksOrgNetwork;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworksResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String orgId;
    private List<GetNetworksOrgNetwork> orgNetworks;

    private GetNetworksResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String orgId() {
        return this.orgId;
    }
    public List<GetNetworksOrgNetwork> orgNetworks() {
        return this.orgNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String orgId;
        private List<GetNetworksOrgNetwork> orgNetworks;
        public Builder() {}
        public Builder(GetNetworksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.orgNetworks = defaults.orgNetworks;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder orgNetworks(List<GetNetworksOrgNetwork> orgNetworks) {
            if (orgNetworks == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "orgNetworks");
            }
            this.orgNetworks = orgNetworks;
            return this;
        }
        public Builder orgNetworks(GetNetworksOrgNetwork... orgNetworks) {
            return orgNetworks(List.of(orgNetworks));
        }
        public GetNetworksResult build() {
            final var _resultValue = new GetNetworksResult();
            _resultValue.id = id;
            _resultValue.orgId = orgId;
            _resultValue.orgNetworks = orgNetworks;
            return _resultValue;
        }
    }
}