// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetServicepoliciesOrgServicepolicyAppqoe;
import com.pulumi.junipermist.org.outputs.GetServicepoliciesOrgServicepolicyEwf;
import com.pulumi.junipermist.org.outputs.GetServicepoliciesOrgServicepolicyIdp;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServicepoliciesOrgServicepolicy {
    /**
     * @return enum: `allow`, `deny`
     * 
     */
    private String action;
    /**
     * @return For SRX Only
     * 
     */
    private GetServicepoliciesOrgServicepolicyAppqoe appqoe;
    private Double createdTime;
    private List<GetServicepoliciesOrgServicepolicyEwf> ewfs;
    private String id;
    private GetServicepoliciesOrgServicepolicyIdp idp;
    /**
     * @return access within the same VRF
     * 
     */
    private Boolean localRouting;
    private Double modifiedTime;
    private String name;
    private String orgId;
    /**
     * @return by default, we derive all paths available and use them
     * optionally, you can customize by using `path_preference`
     * 
     */
    private String pathPreference;
    private List<String> services;
    private List<String> tenants;

    private GetServicepoliciesOrgServicepolicy() {}
    /**
     * @return enum: `allow`, `deny`
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return For SRX Only
     * 
     */
    public GetServicepoliciesOrgServicepolicyAppqoe appqoe() {
        return this.appqoe;
    }
    public Double createdTime() {
        return this.createdTime;
    }
    public List<GetServicepoliciesOrgServicepolicyEwf> ewfs() {
        return this.ewfs;
    }
    public String id() {
        return this.id;
    }
    public GetServicepoliciesOrgServicepolicyIdp idp() {
        return this.idp;
    }
    /**
     * @return access within the same VRF
     * 
     */
    public Boolean localRouting() {
        return this.localRouting;
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
    /**
     * @return by default, we derive all paths available and use them
     * optionally, you can customize by using `path_preference`
     * 
     */
    public String pathPreference() {
        return this.pathPreference;
    }
    public List<String> services() {
        return this.services;
    }
    public List<String> tenants() {
        return this.tenants;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicepoliciesOrgServicepolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private GetServicepoliciesOrgServicepolicyAppqoe appqoe;
        private Double createdTime;
        private List<GetServicepoliciesOrgServicepolicyEwf> ewfs;
        private String id;
        private GetServicepoliciesOrgServicepolicyIdp idp;
        private Boolean localRouting;
        private Double modifiedTime;
        private String name;
        private String orgId;
        private String pathPreference;
        private List<String> services;
        private List<String> tenants;
        public Builder() {}
        public Builder(GetServicepoliciesOrgServicepolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.appqoe = defaults.appqoe;
    	      this.createdTime = defaults.createdTime;
    	      this.ewfs = defaults.ewfs;
    	      this.id = defaults.id;
    	      this.idp = defaults.idp;
    	      this.localRouting = defaults.localRouting;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.pathPreference = defaults.pathPreference;
    	      this.services = defaults.services;
    	      this.tenants = defaults.tenants;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder appqoe(GetServicepoliciesOrgServicepolicyAppqoe appqoe) {
            if (appqoe == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "appqoe");
            }
            this.appqoe = appqoe;
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(Double createdTime) {
            if (createdTime == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "createdTime");
            }
            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder ewfs(List<GetServicepoliciesOrgServicepolicyEwf> ewfs) {
            if (ewfs == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "ewfs");
            }
            this.ewfs = ewfs;
            return this;
        }
        public Builder ewfs(GetServicepoliciesOrgServicepolicyEwf... ewfs) {
            return ewfs(List.of(ewfs));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder idp(GetServicepoliciesOrgServicepolicyIdp idp) {
            if (idp == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "idp");
            }
            this.idp = idp;
            return this;
        }
        @CustomType.Setter
        public Builder localRouting(Boolean localRouting) {
            if (localRouting == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "localRouting");
            }
            this.localRouting = localRouting;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(Double modifiedTime) {
            if (modifiedTime == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "modifiedTime");
            }
            this.modifiedTime = modifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder pathPreference(String pathPreference) {
            if (pathPreference == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "pathPreference");
            }
            this.pathPreference = pathPreference;
            return this;
        }
        @CustomType.Setter
        public Builder services(List<String> services) {
            if (services == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "services");
            }
            this.services = services;
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder tenants(List<String> tenants) {
            if (tenants == null) {
              throw new MissingRequiredPropertyException("GetServicepoliciesOrgServicepolicy", "tenants");
            }
            this.tenants = tenants;
            return this;
        }
        public Builder tenants(String... tenants) {
            return tenants(List.of(tenants));
        }
        public GetServicepoliciesOrgServicepolicy build() {
            final var _resultValue = new GetServicepoliciesOrgServicepolicy();
            _resultValue.action = action;
            _resultValue.appqoe = appqoe;
            _resultValue.createdTime = createdTime;
            _resultValue.ewfs = ewfs;
            _resultValue.id = id;
            _resultValue.idp = idp;
            _resultValue.localRouting = localRouting;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.pathPreference = pathPreference;
            _resultValue.services = services;
            _resultValue.tenants = tenants;
            return _resultValue;
        }
    }
}