// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInventoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInventoryPlainArgs Empty = new GetInventoryPlainArgs();

    /**
     * MAC address
     * 
     */
    @Import(name="mac")
    private @Nullable String mac;

    /**
     * @return MAC address
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * device model
     * 
     */
    @Import(name="model")
    private @Nullable String model;

    /**
     * @return device model
     * 
     */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    /**
     * device serial
     * 
     */
    @Import(name="serial")
    private @Nullable String serial;

    /**
     * @return device serial
     * 
     */
    public Optional<String> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * site id if assigned, null if not assigned
     * 
     */
    @Import(name="siteId")
    private @Nullable String siteId;

    /**
     * @return site id if assigned, null if not assigned
     * 
     */
    public Optional<String> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * to display Unassigned devices
     * 
     */
    @Import(name="unassigned")
    private @Nullable Boolean unassigned;

    /**
     * @return to display Unassigned devices
     * 
     */
    public Optional<Boolean> unassigned() {
        return Optional.ofNullable(this.unassigned);
    }

    /**
     * To display Virtual Chassis members
     * 
     */
    @Import(name="vc")
    private @Nullable Boolean vc;

    /**
     * @return To display Virtual Chassis members
     * 
     */
    public Optional<Boolean> vc() {
        return Optional.ofNullable(this.vc);
    }

    /**
     * Virtual Chassis MAC Address
     * 
     */
    @Import(name="vcMac")
    private @Nullable String vcMac;

    /**
     * @return Virtual Chassis MAC Address
     * 
     */
    public Optional<String> vcMac() {
        return Optional.ofNullable(this.vcMac);
    }

    private GetInventoryPlainArgs() {}

    private GetInventoryPlainArgs(GetInventoryPlainArgs $) {
        this.mac = $.mac;
        this.model = $.model;
        this.orgId = $.orgId;
        this.serial = $.serial;
        this.siteId = $.siteId;
        this.unassigned = $.unassigned;
        this.vc = $.vc;
        this.vcMac = $.vcMac;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInventoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInventoryPlainArgs $;

        public Builder() {
            $ = new GetInventoryPlainArgs();
        }

        public Builder(GetInventoryPlainArgs defaults) {
            $ = new GetInventoryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mac MAC address
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable String mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param model device model
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable String model) {
            $.model = model;
            return this;
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param serial device serial
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable String serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param siteId site id if assigned, null if not assigned
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable String siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param unassigned to display Unassigned devices
         * 
         * @return builder
         * 
         */
        public Builder unassigned(@Nullable Boolean unassigned) {
            $.unassigned = unassigned;
            return this;
        }

        /**
         * @param vc To display Virtual Chassis members
         * 
         * @return builder
         * 
         */
        public Builder vc(@Nullable Boolean vc) {
            $.vc = vc;
            return this;
        }

        /**
         * @param vcMac Virtual Chassis MAC Address
         * 
         * @return builder
         * 
         */
        public Builder vcMac(@Nullable String vcMac) {
            $.vcMac = vcMac;
            return this;
        }

        public GetInventoryPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetInventoryPlainArgs", "orgId");
            }
            return $;
        }
    }

}
