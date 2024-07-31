// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSitegroupsOrgSitegroup {
    private Double createdTime;
    private String id;
    private Double modifiedTime;
    private String name;
    private String orgId;
    private List<String> siteIds;

    private GetSitegroupsOrgSitegroup() {}
    public Double createdTime() {
        return this.createdTime;
    }
    public String id() {
        return this.id;
    }
    public Double modifiedTime() {
        return this.modifiedTime;
    }
    public String name() {
        return this.name;
    }
    public String orgId() {
        return this.orgId;
    }
    public List<String> siteIds() {
        return this.siteIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSitegroupsOrgSitegroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double createdTime;
        private String id;
        private Double modifiedTime;
        private String name;
        private String orgId;
        private List<String> siteIds;
        public Builder() {}
        public Builder(GetSitegroupsOrgSitegroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.id = defaults.id;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.siteIds = defaults.siteIds;
        }

        @CustomType.Setter
        public Builder createdTime(Double createdTime) {
            if (createdTime == null) {
              throw new MissingRequiredPropertyException("GetSitegroupsOrgSitegroup", "createdTime");
            }
            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSitegroupsOrgSitegroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(Double modifiedTime) {
            if (modifiedTime == null) {
              throw new MissingRequiredPropertyException("GetSitegroupsOrgSitegroup", "modifiedTime");
            }
            this.modifiedTime = modifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSitegroupsOrgSitegroup", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetSitegroupsOrgSitegroup", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder siteIds(List<String> siteIds) {
            if (siteIds == null) {
              throw new MissingRequiredPropertyException("GetSitegroupsOrgSitegroup", "siteIds");
            }
            this.siteIds = siteIds;
            return this;
        }
        public Builder siteIds(String... siteIds) {
            return siteIds(List.of(siteIds));
        }
        public GetSitegroupsOrgSitegroup build() {
            final var _resultValue = new GetSitegroupsOrgSitegroup();
            _resultValue.createdTime = createdTime;
            _resultValue.id = id;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.siteIds = siteIds;
            return _resultValue;
        }
    }
}
