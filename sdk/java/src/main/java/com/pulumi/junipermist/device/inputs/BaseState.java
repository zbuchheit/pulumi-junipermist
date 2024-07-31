// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.BaseLatlngArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaseState extends com.pulumi.resources.ResourceArgs {

    public static final BaseState Empty = new BaseState();

    /**
     * full address of the site
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return full address of the site
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
     * 
     */
    @Import(name="alarmtemplateId")
    private @Nullable Output<String> alarmtemplateId;

    /**
     * @return Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
     * 
     */
    public Optional<Output<String>> alarmtemplateId() {
        return Optional.ofNullable(this.alarmtemplateId);
    }

    /**
     * AP Template ID, used by APs
     * 
     */
    @Import(name="aptemplateId")
    private @Nullable Output<String> aptemplateId;

    /**
     * @return AP Template ID, used by APs
     * 
     */
    public Optional<Output<String>> aptemplateId() {
        return Optional.ofNullable(this.aptemplateId);
    }

    /**
     * country code for the site (for AP config generation), in two-character
     * 
     */
    @Import(name="countryCode")
    private @Nullable Output<String> countryCode;

    /**
     * @return country code for the site (for AP config generation), in two-character
     * 
     */
    public Optional<Output<String>> countryCode() {
        return Optional.ofNullable(this.countryCode);
    }

    /**
     * Gateway Template ID, used by gateways
     * 
     */
    @Import(name="gatewaytemplateId")
    private @Nullable Output<String> gatewaytemplateId;

    /**
     * @return Gateway Template ID, used by gateways
     * 
     */
    public Optional<Output<String>> gatewaytemplateId() {
        return Optional.ofNullable(this.gatewaytemplateId);
    }

    @Import(name="latlng")
    private @Nullable Output<BaseLatlngArgs> latlng;

    public Optional<Output<BaseLatlngArgs>> latlng() {
        return Optional.ofNullable(this.latlng);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Network Template ID, this takes precedence over Site Settings
     * 
     */
    @Import(name="networktemplateId")
    private @Nullable Output<String> networktemplateId;

    /**
     * @return Network Template ID, this takes precedence over Site Settings
     * 
     */
    public Optional<Output<String>> networktemplateId() {
        return Optional.ofNullable(this.networktemplateId);
    }

    /**
     * optional, any notes about the site
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return optional, any notes about the site
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * RF Template ID, this takes precedence over Site Settings
     * 
     */
    @Import(name="rftemplateId")
    private @Nullable Output<String> rftemplateId;

    /**
     * @return RF Template ID, this takes precedence over Site Settings
     * 
     */
    public Optional<Output<String>> rftemplateId() {
        return Optional.ofNullable(this.rftemplateId);
    }

    /**
     * SecPolicy ID
     * 
     */
    @Import(name="secpolicyId")
    private @Nullable Output<String> secpolicyId;

    /**
     * @return SecPolicy ID
     * 
     */
    public Optional<Output<String>> secpolicyId() {
        return Optional.ofNullable(this.secpolicyId);
    }

    /**
     * sitegroups this site belongs to
     * 
     */
    @Import(name="sitegroupIds")
    private @Nullable Output<List<String>> sitegroupIds;

    /**
     * @return sitegroups this site belongs to
     * 
     */
    public Optional<Output<List<String>>> sitegroupIds() {
        return Optional.ofNullable(this.sitegroupIds);
    }

    /**
     * Site Template ID
     * 
     */
    @Import(name="sitetemplateId")
    private @Nullable Output<String> sitetemplateId;

    /**
     * @return Site Template ID
     * 
     */
    public Optional<Output<String>> sitetemplateId() {
        return Optional.ofNullable(this.sitetemplateId);
    }

    /**
     * Timezone the site is at
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return Timezone the site is at
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private BaseState() {}

    private BaseState(BaseState $) {
        this.address = $.address;
        this.alarmtemplateId = $.alarmtemplateId;
        this.aptemplateId = $.aptemplateId;
        this.countryCode = $.countryCode;
        this.gatewaytemplateId = $.gatewaytemplateId;
        this.latlng = $.latlng;
        this.name = $.name;
        this.networktemplateId = $.networktemplateId;
        this.notes = $.notes;
        this.orgId = $.orgId;
        this.rftemplateId = $.rftemplateId;
        this.secpolicyId = $.secpolicyId;
        this.sitegroupIds = $.sitegroupIds;
        this.sitetemplateId = $.sitetemplateId;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaseState $;

        public Builder() {
            $ = new BaseState();
        }

        public Builder(BaseState defaults) {
            $ = new BaseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param address full address of the site
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address full address of the site
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param alarmtemplateId Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
         * 
         * @return builder
         * 
         */
        public Builder alarmtemplateId(@Nullable Output<String> alarmtemplateId) {
            $.alarmtemplateId = alarmtemplateId;
            return this;
        }

        /**
         * @param alarmtemplateId Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
         * 
         * @return builder
         * 
         */
        public Builder alarmtemplateId(String alarmtemplateId) {
            return alarmtemplateId(Output.of(alarmtemplateId));
        }

        /**
         * @param aptemplateId AP Template ID, used by APs
         * 
         * @return builder
         * 
         */
        public Builder aptemplateId(@Nullable Output<String> aptemplateId) {
            $.aptemplateId = aptemplateId;
            return this;
        }

        /**
         * @param aptemplateId AP Template ID, used by APs
         * 
         * @return builder
         * 
         */
        public Builder aptemplateId(String aptemplateId) {
            return aptemplateId(Output.of(aptemplateId));
        }

        /**
         * @param countryCode country code for the site (for AP config generation), in two-character
         * 
         * @return builder
         * 
         */
        public Builder countryCode(@Nullable Output<String> countryCode) {
            $.countryCode = countryCode;
            return this;
        }

        /**
         * @param countryCode country code for the site (for AP config generation), in two-character
         * 
         * @return builder
         * 
         */
        public Builder countryCode(String countryCode) {
            return countryCode(Output.of(countryCode));
        }

        /**
         * @param gatewaytemplateId Gateway Template ID, used by gateways
         * 
         * @return builder
         * 
         */
        public Builder gatewaytemplateId(@Nullable Output<String> gatewaytemplateId) {
            $.gatewaytemplateId = gatewaytemplateId;
            return this;
        }

        /**
         * @param gatewaytemplateId Gateway Template ID, used by gateways
         * 
         * @return builder
         * 
         */
        public Builder gatewaytemplateId(String gatewaytemplateId) {
            return gatewaytemplateId(Output.of(gatewaytemplateId));
        }

        public Builder latlng(@Nullable Output<BaseLatlngArgs> latlng) {
            $.latlng = latlng;
            return this;
        }

        public Builder latlng(BaseLatlngArgs latlng) {
            return latlng(Output.of(latlng));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networktemplateId Network Template ID, this takes precedence over Site Settings
         * 
         * @return builder
         * 
         */
        public Builder networktemplateId(@Nullable Output<String> networktemplateId) {
            $.networktemplateId = networktemplateId;
            return this;
        }

        /**
         * @param networktemplateId Network Template ID, this takes precedence over Site Settings
         * 
         * @return builder
         * 
         */
        public Builder networktemplateId(String networktemplateId) {
            return networktemplateId(Output.of(networktemplateId));
        }

        /**
         * @param notes optional, any notes about the site
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes optional, any notes about the site
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param rftemplateId RF Template ID, this takes precedence over Site Settings
         * 
         * @return builder
         * 
         */
        public Builder rftemplateId(@Nullable Output<String> rftemplateId) {
            $.rftemplateId = rftemplateId;
            return this;
        }

        /**
         * @param rftemplateId RF Template ID, this takes precedence over Site Settings
         * 
         * @return builder
         * 
         */
        public Builder rftemplateId(String rftemplateId) {
            return rftemplateId(Output.of(rftemplateId));
        }

        /**
         * @param secpolicyId SecPolicy ID
         * 
         * @return builder
         * 
         */
        public Builder secpolicyId(@Nullable Output<String> secpolicyId) {
            $.secpolicyId = secpolicyId;
            return this;
        }

        /**
         * @param secpolicyId SecPolicy ID
         * 
         * @return builder
         * 
         */
        public Builder secpolicyId(String secpolicyId) {
            return secpolicyId(Output.of(secpolicyId));
        }

        /**
         * @param sitegroupIds sitegroups this site belongs to
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(@Nullable Output<List<String>> sitegroupIds) {
            $.sitegroupIds = sitegroupIds;
            return this;
        }

        /**
         * @param sitegroupIds sitegroups this site belongs to
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(List<String> sitegroupIds) {
            return sitegroupIds(Output.of(sitegroupIds));
        }

        /**
         * @param sitegroupIds sitegroups this site belongs to
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(String... sitegroupIds) {
            return sitegroupIds(List.of(sitegroupIds));
        }

        /**
         * @param sitetemplateId Site Template ID
         * 
         * @return builder
         * 
         */
        public Builder sitetemplateId(@Nullable Output<String> sitetemplateId) {
            $.sitetemplateId = sitetemplateId;
            return this;
        }

        /**
         * @param sitetemplateId Site Template ID
         * 
         * @return builder
         * 
         */
        public Builder sitetemplateId(String sitetemplateId) {
            return sitetemplateId(Output.of(sitetemplateId));
        }

        /**
         * @param timezone Timezone the site is at
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone Timezone the site is at
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public BaseState build() {
            return $;
        }
    }

}
