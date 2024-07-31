// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetWxtagsOrgWxtag;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWxtagsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String orgId;
    private List<GetWxtagsOrgWxtag> orgWxtags;

    private GetWxtagsResult() {}
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
    public List<GetWxtagsOrgWxtag> orgWxtags() {
        return this.orgWxtags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWxtagsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String orgId;
        private List<GetWxtagsOrgWxtag> orgWxtags;
        public Builder() {}
        public Builder(GetWxtagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.orgWxtags = defaults.orgWxtags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWxtagsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetWxtagsResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder orgWxtags(List<GetWxtagsOrgWxtag> orgWxtags) {
            if (orgWxtags == null) {
              throw new MissingRequiredPropertyException("GetWxtagsResult", "orgWxtags");
            }
            this.orgWxtags = orgWxtags;
            return this;
        }
        public Builder orgWxtags(GetWxtagsOrgWxtag... orgWxtags) {
            return orgWxtags(List.of(orgWxtags));
        }
        public GetWxtagsResult build() {
            final var _resultValue = new GetWxtagsResult();
            _resultValue.id = id;
            _resultValue.orgId = orgId;
            _resultValue.orgWxtags = orgWxtags;
            return _resultValue;
        }
    }
}
