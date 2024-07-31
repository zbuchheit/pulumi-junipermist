// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetApStatsDeviceApStatAutoPlacementInfo;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatAutoPlacement {
    /**
     * @return Additional information about auto placements AP data
     * 
     */
    private GetApStatsDeviceApStatAutoPlacementInfo info;
    /**
     * @return Flag to represent if AP is recommended as an anchor by auto placement service
     * 
     */
    private Boolean recommendedAnchor;
    /**
     * @return Basic Placement Status
     * 
     */
    private String status;
    /**
     * @return Additional info about placement status
     * 
     */
    private String statusDetail;
    /**
     * @return Flag to represent if auto_placement values are currently utilized
     * 
     */
    private Boolean useAutoPlacement;
    /**
     * @return X Autoplaced Position in pixels
     * 
     */
    private Double x;
    /**
     * @return X Autoplaced Position in meters
     * 
     */
    private Double xM;
    /**
     * @return Y Autoplaced Position in pixels
     * 
     */
    private Double y;
    /**
     * @return X Autoplaced Position in meters
     * 
     */
    private Double yM;

    private GetApStatsDeviceApStatAutoPlacement() {}
    /**
     * @return Additional information about auto placements AP data
     * 
     */
    public GetApStatsDeviceApStatAutoPlacementInfo info() {
        return this.info;
    }
    /**
     * @return Flag to represent if AP is recommended as an anchor by auto placement service
     * 
     */
    public Boolean recommendedAnchor() {
        return this.recommendedAnchor;
    }
    /**
     * @return Basic Placement Status
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Additional info about placement status
     * 
     */
    public String statusDetail() {
        return this.statusDetail;
    }
    /**
     * @return Flag to represent if auto_placement values are currently utilized
     * 
     */
    public Boolean useAutoPlacement() {
        return this.useAutoPlacement;
    }
    /**
     * @return X Autoplaced Position in pixels
     * 
     */
    public Double x() {
        return this.x;
    }
    /**
     * @return X Autoplaced Position in meters
     * 
     */
    public Double xM() {
        return this.xM;
    }
    /**
     * @return Y Autoplaced Position in pixels
     * 
     */
    public Double y() {
        return this.y;
    }
    /**
     * @return X Autoplaced Position in meters
     * 
     */
    public Double yM() {
        return this.yM;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatAutoPlacement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetApStatsDeviceApStatAutoPlacementInfo info;
        private Boolean recommendedAnchor;
        private String status;
        private String statusDetail;
        private Boolean useAutoPlacement;
        private Double x;
        private Double xM;
        private Double y;
        private Double yM;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatAutoPlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.info = defaults.info;
    	      this.recommendedAnchor = defaults.recommendedAnchor;
    	      this.status = defaults.status;
    	      this.statusDetail = defaults.statusDetail;
    	      this.useAutoPlacement = defaults.useAutoPlacement;
    	      this.x = defaults.x;
    	      this.xM = defaults.xM;
    	      this.y = defaults.y;
    	      this.yM = defaults.yM;
        }

        @CustomType.Setter
        public Builder info(GetApStatsDeviceApStatAutoPlacementInfo info) {
            if (info == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "info");
            }
            this.info = info;
            return this;
        }
        @CustomType.Setter
        public Builder recommendedAnchor(Boolean recommendedAnchor) {
            if (recommendedAnchor == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "recommendedAnchor");
            }
            this.recommendedAnchor = recommendedAnchor;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder statusDetail(String statusDetail) {
            if (statusDetail == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "statusDetail");
            }
            this.statusDetail = statusDetail;
            return this;
        }
        @CustomType.Setter
        public Builder useAutoPlacement(Boolean useAutoPlacement) {
            if (useAutoPlacement == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "useAutoPlacement");
            }
            this.useAutoPlacement = useAutoPlacement;
            return this;
        }
        @CustomType.Setter
        public Builder x(Double x) {
            if (x == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "x");
            }
            this.x = x;
            return this;
        }
        @CustomType.Setter
        public Builder xM(Double xM) {
            if (xM == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "xM");
            }
            this.xM = xM;
            return this;
        }
        @CustomType.Setter
        public Builder y(Double y) {
            if (y == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "y");
            }
            this.y = y;
            return this;
        }
        @CustomType.Setter
        public Builder yM(Double yM) {
            if (yM == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatAutoPlacement", "yM");
            }
            this.yM = yM;
            return this;
        }
        public GetApStatsDeviceApStatAutoPlacement build() {
            final var _resultValue = new GetApStatsDeviceApStatAutoPlacement();
            _resultValue.info = info;
            _resultValue.recommendedAnchor = recommendedAnchor;
            _resultValue.status = status;
            _resultValue.statusDetail = statusDetail;
            _resultValue.useAutoPlacement = useAutoPlacement;
            _resultValue.x = x;
            _resultValue.xM = xM;
            _resultValue.y = y;
            _resultValue.yM = yM;
            return _resultValue;
        }
    }
}
