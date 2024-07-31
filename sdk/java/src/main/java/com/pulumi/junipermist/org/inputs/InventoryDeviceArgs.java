// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryDeviceArgs Empty = new InventoryDeviceArgs();

    @Import(name="claimCode", required=true)
    private Output<String> claimCode;

    public Output<String> claimCode() {
        return this.claimCode;
    }

    /**
     * Device Hostname
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Device Hostname
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Mist Device ID
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Mist Device ID
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * MAC address
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return MAC address
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * device model
     * 
     */
    @Import(name="model")
    private @Nullable Output<String> model;

    /**
     * @return device model
     * 
     */
    public Optional<Output<String>> model() {
        return Optional.ofNullable(this.model);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * device serial
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return device serial
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * site id if assigned, null if not assigned
     * 
     */
    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    /**
     * @return site id if assigned, null if not assigned
     * 
     */
    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Virtual Chassis MAC Address
     * 
     */
    @Import(name="vcMac")
    private @Nullable Output<String> vcMac;

    /**
     * @return Virtual Chassis MAC Address
     * 
     */
    public Optional<Output<String>> vcMac() {
        return Optional.ofNullable(this.vcMac);
    }

    private InventoryDeviceArgs() {}

    private InventoryDeviceArgs(InventoryDeviceArgs $) {
        this.claimCode = $.claimCode;
        this.hostname = $.hostname;
        this.id = $.id;
        this.mac = $.mac;
        this.model = $.model;
        this.orgId = $.orgId;
        this.serial = $.serial;
        this.siteId = $.siteId;
        this.type = $.type;
        this.vcMac = $.vcMac;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryDeviceArgs $;

        public Builder() {
            $ = new InventoryDeviceArgs();
        }

        public Builder(InventoryDeviceArgs defaults) {
            $ = new InventoryDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder claimCode(Output<String> claimCode) {
            $.claimCode = claimCode;
            return this;
        }

        public Builder claimCode(String claimCode) {
            return claimCode(Output.of(claimCode));
        }

        /**
         * @param hostname Device Hostname
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Device Hostname
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param id Mist Device ID
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Mist Device ID
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param mac MAC address
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac MAC address
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        /**
         * @param model device model
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<String> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model device model
         * 
         * @return builder
         * 
         */
        public Builder model(String model) {
            return model(Output.of(model));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param serial device serial
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial device serial
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param siteId site id if assigned, null if not assigned
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId site id if assigned, null if not assigned
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vcMac Virtual Chassis MAC Address
         * 
         * @return builder
         * 
         */
        public Builder vcMac(@Nullable Output<String> vcMac) {
            $.vcMac = vcMac;
            return this;
        }

        /**
         * @param vcMac Virtual Chassis MAC Address
         * 
         * @return builder
         * 
         */
        public Builder vcMac(String vcMac) {
            return vcMac(Output.of(vcMac));
        }

        public InventoryDeviceArgs build() {
            if ($.claimCode == null) {
                throw new MissingRequiredPropertyException("InventoryDeviceArgs", "claimCode");
            }
            return $;
        }
    }

}