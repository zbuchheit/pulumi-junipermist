// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryDevice {
    private String claimCode;
    /**
     * @return Device Hostname
     * 
     */
    private @Nullable String hostname;
    /**
     * @return Mist Device ID
     * 
     */
    private @Nullable String id;
    /**
     * @return MAC address
     * 
     */
    private @Nullable String mac;
    /**
     * @return device model
     * 
     */
    private @Nullable String model;
    private @Nullable String orgId;
    /**
     * @return device serial
     * 
     */
    private @Nullable String serial;
    /**
     * @return site id if assigned, null if not assigned
     * 
     */
    private @Nullable String siteId;
    private @Nullable String type;
    /**
     * @return Virtual Chassis MAC Address
     * 
     */
    private @Nullable String vcMac;

    private InventoryDevice() {}
    public String claimCode() {
        return this.claimCode;
    }
    /**
     * @return Device Hostname
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return Mist Device ID
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return MAC address
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    /**
     * @return device model
     * 
     */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return device serial
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }
    /**
     * @return site id if assigned, null if not assigned
     * 
     */
    public Optional<String> siteId() {
        return Optional.ofNullable(this.siteId);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Virtual Chassis MAC Address
     * 
     */
    public Optional<String> vcMac() {
        return Optional.ofNullable(this.vcMac);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String claimCode;
        private @Nullable String hostname;
        private @Nullable String id;
        private @Nullable String mac;
        private @Nullable String model;
        private @Nullable String orgId;
        private @Nullable String serial;
        private @Nullable String siteId;
        private @Nullable String type;
        private @Nullable String vcMac;
        public Builder() {}
        public Builder(InventoryDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimCode = defaults.claimCode;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.mac = defaults.mac;
    	      this.model = defaults.model;
    	      this.orgId = defaults.orgId;
    	      this.serial = defaults.serial;
    	      this.siteId = defaults.siteId;
    	      this.type = defaults.type;
    	      this.vcMac = defaults.vcMac;
        }

        @CustomType.Setter
        public Builder claimCode(String claimCode) {
            if (claimCode == null) {
              throw new MissingRequiredPropertyException("InventoryDevice", "claimCode");
            }
            this.claimCode = claimCode;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {

            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mac(@Nullable String mac) {

            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder model(@Nullable String model) {

            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {

            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder serial(@Nullable String serial) {

            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder siteId(@Nullable String siteId) {

            this.siteId = siteId;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder vcMac(@Nullable String vcMac) {

            this.vcMac = vcMac;
            return this;
        }
        public InventoryDevice build() {
            final var _resultValue = new InventoryDevice();
            _resultValue.claimCode = claimCode;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.mac = mac;
            _resultValue.model = model;
            _resultValue.orgId = orgId;
            _resultValue.serial = serial;
            _resultValue.siteId = siteId;
            _resultValue.type = type;
            _resultValue.vcMac = vcMac;
            return _resultValue;
        }
    }
}
