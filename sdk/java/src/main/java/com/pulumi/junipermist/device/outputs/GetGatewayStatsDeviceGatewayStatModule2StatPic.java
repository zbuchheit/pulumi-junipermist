// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatModule2StatPicPortGroup;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatModule2StatPic {
    private Integer index;
    private String modelNumber;
    private List<GetGatewayStatsDeviceGatewayStatModule2StatPicPortGroup> portGroups;

    private GetGatewayStatsDeviceGatewayStatModule2StatPic() {}
    public Integer index() {
        return this.index;
    }
    public String modelNumber() {
        return this.modelNumber;
    }
    public List<GetGatewayStatsDeviceGatewayStatModule2StatPicPortGroup> portGroups() {
        return this.portGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatModule2StatPic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer index;
        private String modelNumber;
        private List<GetGatewayStatsDeviceGatewayStatModule2StatPicPortGroup> portGroups;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatModule2StatPic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.index = defaults.index;
    	      this.modelNumber = defaults.modelNumber;
    	      this.portGroups = defaults.portGroups;
        }

        @CustomType.Setter
        public Builder index(Integer index) {
            if (index == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatPic", "index");
            }
            this.index = index;
            return this;
        }
        @CustomType.Setter
        public Builder modelNumber(String modelNumber) {
            if (modelNumber == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatPic", "modelNumber");
            }
            this.modelNumber = modelNumber;
            return this;
        }
        @CustomType.Setter
        public Builder portGroups(List<GetGatewayStatsDeviceGatewayStatModule2StatPicPortGroup> portGroups) {
            if (portGroups == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2StatPic", "portGroups");
            }
            this.portGroups = portGroups;
            return this;
        }
        public Builder portGroups(GetGatewayStatsDeviceGatewayStatModule2StatPicPortGroup... portGroups) {
            return portGroups(List.of(portGroups));
        }
        public GetGatewayStatsDeviceGatewayStatModule2StatPic build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatModule2StatPic();
            _resultValue.index = index;
            _resultValue.modelNumber = modelNumber;
            _resultValue.portGroups = portGroups;
            return _resultValue;
        }
    }
}
