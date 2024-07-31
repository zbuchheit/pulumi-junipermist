// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanAuthArgs Empty = new WlanAuthArgs();

    /**
     * SAE anti-clogging token threshold
     * 
     */
    @Import(name="anticlogThreshold")
    private @Nullable Output<Integer> anticlogThreshold;

    /**
     * @return SAE anti-clogging token threshold
     * 
     */
    public Optional<Output<Integer>> anticlogThreshold() {
        return Optional.ofNullable(this.anticlogThreshold);
    }

    /**
     * whether to trigger EAP reauth when the session ends
     * 
     */
    @Import(name="eapReauth")
    private @Nullable Output<Boolean> eapReauth;

    /**
     * @return whether to trigger EAP reauth when the session ends
     * 
     */
    public Optional<Output<Boolean>> eapReauth() {
        return Optional.ofNullable(this.eapReauth);
    }

    /**
     * whether to enable MAC Auth, uses the same auth_servers
     * 
     */
    @Import(name="enableMacAuth")
    private @Nullable Output<Boolean> enableMacAuth;

    /**
     * @return whether to enable MAC Auth, uses the same auth_servers
     * 
     */
    public Optional<Output<Boolean>> enableMacAuth() {
        return Optional.ofNullable(this.enableMacAuth);
    }

    /**
     * when `type`==`wep`
     * 
     */
    @Import(name="keyIdx")
    private @Nullable Output<Integer> keyIdx;

    /**
     * @return when `type`==`wep`
     * 
     */
    public Optional<Output<Integer>> keyIdx() {
        return Optional.ofNullable(this.keyIdx);
    }

    /**
     * when type=wep, four 10-character or 26-character hex string, null can be used. All keys, if provided, have to be in the same length
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<String>> keys;

    /**
     * @return when type=wep, four 10-character or 26-character hex string, null can be used. All keys, if provided, have to be in the same length
     * 
     */
    public Optional<Output<List<String>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * when `type`==`psk`, whether to only use multi_psk
     * 
     */
    @Import(name="multiPskOnly")
    private @Nullable Output<Boolean> multiPskOnly;

    /**
     * @return when `type`==`psk`, whether to only use multi_psk
     * 
     */
    public Optional<Output<Boolean>> multiPskOnly() {
        return Optional.ofNullable(this.multiPskOnly);
    }

    /**
     * if `type`==`open`. enum: `disabled`, `enabled` (means transition mode), `required`
     * 
     */
    @Import(name="owe")
    private @Nullable Output<String> owe;

    /**
     * @return if `type`==`open`. enum: `disabled`, `enabled` (means transition mode), `required`
     * 
     */
    public Optional<Output<String>> owe() {
        return Optional.ofNullable(this.owe);
    }

    /**
     * when `type`=`psk` or `type`=`eap`, one or more of `wpa1-ccmp`, `wpa1-tkip`, `wpa2-ccmp`, `wpa2-tkip`, `wpa3`
     * 
     */
    @Import(name="pairwises")
    private @Nullable Output<List<String>> pairwises;

    /**
     * @return when `type`=`psk` or `type`=`eap`, one or more of `wpa1-ccmp`, `wpa1-tkip`, `wpa2-ccmp`, `wpa2-tkip`, `wpa3`
     * 
     */
    public Optional<Output<List<String>>> pairwises() {
        return Optional.ofNullable(this.pairwises);
    }

    /**
     * when `multi_psk_only`==`true`, whether private wlan is enabled
     * 
     */
    @Import(name="privateWlan")
    private @Nullable Output<Boolean> privateWlan;

    /**
     * @return when `multi_psk_only`==`true`, whether private wlan is enabled
     * 
     */
    public Optional<Output<Boolean>> privateWlan() {
        return Optional.ofNullable(this.privateWlan);
    }

    /**
     * when `type`==`psk`, 8-64 characters, or 64 hex characters
     * 
     */
    @Import(name="psk")
    private @Nullable Output<String> psk;

    /**
     * @return when `type`==`psk`, 8-64 characters, or 64 hex characters
     * 
     */
    public Optional<Output<String>> psk() {
        return Optional.ofNullable(this.psk);
    }

    /**
     * enum: `eap`, `eap192`, `open`, `psk`, `psk-tkip`, `psk-wpa2-tkip`, `wep`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `eap`, `eap192`, `open`, `psk`, `psk-tkip`, `psk-wpa2-tkip`, `wep`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * enable WEP as secondary auth
     * 
     */
    @Import(name="wepAsSecondaryAuth")
    private @Nullable Output<Boolean> wepAsSecondaryAuth;

    /**
     * @return enable WEP as secondary auth
     * 
     */
    public Optional<Output<Boolean>> wepAsSecondaryAuth() {
        return Optional.ofNullable(this.wepAsSecondaryAuth);
    }

    private WlanAuthArgs() {}

    private WlanAuthArgs(WlanAuthArgs $) {
        this.anticlogThreshold = $.anticlogThreshold;
        this.eapReauth = $.eapReauth;
        this.enableMacAuth = $.enableMacAuth;
        this.keyIdx = $.keyIdx;
        this.keys = $.keys;
        this.multiPskOnly = $.multiPskOnly;
        this.owe = $.owe;
        this.pairwises = $.pairwises;
        this.privateWlan = $.privateWlan;
        this.psk = $.psk;
        this.type = $.type;
        this.wepAsSecondaryAuth = $.wepAsSecondaryAuth;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanAuthArgs $;

        public Builder() {
            $ = new WlanAuthArgs();
        }

        public Builder(WlanAuthArgs defaults) {
            $ = new WlanAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param anticlogThreshold SAE anti-clogging token threshold
         * 
         * @return builder
         * 
         */
        public Builder anticlogThreshold(@Nullable Output<Integer> anticlogThreshold) {
            $.anticlogThreshold = anticlogThreshold;
            return this;
        }

        /**
         * @param anticlogThreshold SAE anti-clogging token threshold
         * 
         * @return builder
         * 
         */
        public Builder anticlogThreshold(Integer anticlogThreshold) {
            return anticlogThreshold(Output.of(anticlogThreshold));
        }

        /**
         * @param eapReauth whether to trigger EAP reauth when the session ends
         * 
         * @return builder
         * 
         */
        public Builder eapReauth(@Nullable Output<Boolean> eapReauth) {
            $.eapReauth = eapReauth;
            return this;
        }

        /**
         * @param eapReauth whether to trigger EAP reauth when the session ends
         * 
         * @return builder
         * 
         */
        public Builder eapReauth(Boolean eapReauth) {
            return eapReauth(Output.of(eapReauth));
        }

        /**
         * @param enableMacAuth whether to enable MAC Auth, uses the same auth_servers
         * 
         * @return builder
         * 
         */
        public Builder enableMacAuth(@Nullable Output<Boolean> enableMacAuth) {
            $.enableMacAuth = enableMacAuth;
            return this;
        }

        /**
         * @param enableMacAuth whether to enable MAC Auth, uses the same auth_servers
         * 
         * @return builder
         * 
         */
        public Builder enableMacAuth(Boolean enableMacAuth) {
            return enableMacAuth(Output.of(enableMacAuth));
        }

        /**
         * @param keyIdx when `type`==`wep`
         * 
         * @return builder
         * 
         */
        public Builder keyIdx(@Nullable Output<Integer> keyIdx) {
            $.keyIdx = keyIdx;
            return this;
        }

        /**
         * @param keyIdx when `type`==`wep`
         * 
         * @return builder
         * 
         */
        public Builder keyIdx(Integer keyIdx) {
            return keyIdx(Output.of(keyIdx));
        }

        /**
         * @param keys when type=wep, four 10-character or 26-character hex string, null can be used. All keys, if provided, have to be in the same length
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<List<String>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys when type=wep, four 10-character or 26-character hex string, null can be used. All keys, if provided, have to be in the same length
         * 
         * @return builder
         * 
         */
        public Builder keys(List<String> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys when type=wep, four 10-character or 26-character hex string, null can be used. All keys, if provided, have to be in the same length
         * 
         * @return builder
         * 
         */
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }

        /**
         * @param multiPskOnly when `type`==`psk`, whether to only use multi_psk
         * 
         * @return builder
         * 
         */
        public Builder multiPskOnly(@Nullable Output<Boolean> multiPskOnly) {
            $.multiPskOnly = multiPskOnly;
            return this;
        }

        /**
         * @param multiPskOnly when `type`==`psk`, whether to only use multi_psk
         * 
         * @return builder
         * 
         */
        public Builder multiPskOnly(Boolean multiPskOnly) {
            return multiPskOnly(Output.of(multiPskOnly));
        }

        /**
         * @param owe if `type`==`open`. enum: `disabled`, `enabled` (means transition mode), `required`
         * 
         * @return builder
         * 
         */
        public Builder owe(@Nullable Output<String> owe) {
            $.owe = owe;
            return this;
        }

        /**
         * @param owe if `type`==`open`. enum: `disabled`, `enabled` (means transition mode), `required`
         * 
         * @return builder
         * 
         */
        public Builder owe(String owe) {
            return owe(Output.of(owe));
        }

        /**
         * @param pairwises when `type`=`psk` or `type`=`eap`, one or more of `wpa1-ccmp`, `wpa1-tkip`, `wpa2-ccmp`, `wpa2-tkip`, `wpa3`
         * 
         * @return builder
         * 
         */
        public Builder pairwises(@Nullable Output<List<String>> pairwises) {
            $.pairwises = pairwises;
            return this;
        }

        /**
         * @param pairwises when `type`=`psk` or `type`=`eap`, one or more of `wpa1-ccmp`, `wpa1-tkip`, `wpa2-ccmp`, `wpa2-tkip`, `wpa3`
         * 
         * @return builder
         * 
         */
        public Builder pairwises(List<String> pairwises) {
            return pairwises(Output.of(pairwises));
        }

        /**
         * @param pairwises when `type`=`psk` or `type`=`eap`, one or more of `wpa1-ccmp`, `wpa1-tkip`, `wpa2-ccmp`, `wpa2-tkip`, `wpa3`
         * 
         * @return builder
         * 
         */
        public Builder pairwises(String... pairwises) {
            return pairwises(List.of(pairwises));
        }

        /**
         * @param privateWlan when `multi_psk_only`==`true`, whether private wlan is enabled
         * 
         * @return builder
         * 
         */
        public Builder privateWlan(@Nullable Output<Boolean> privateWlan) {
            $.privateWlan = privateWlan;
            return this;
        }

        /**
         * @param privateWlan when `multi_psk_only`==`true`, whether private wlan is enabled
         * 
         * @return builder
         * 
         */
        public Builder privateWlan(Boolean privateWlan) {
            return privateWlan(Output.of(privateWlan));
        }

        /**
         * @param psk when `type`==`psk`, 8-64 characters, or 64 hex characters
         * 
         * @return builder
         * 
         */
        public Builder psk(@Nullable Output<String> psk) {
            $.psk = psk;
            return this;
        }

        /**
         * @param psk when `type`==`psk`, 8-64 characters, or 64 hex characters
         * 
         * @return builder
         * 
         */
        public Builder psk(String psk) {
            return psk(Output.of(psk));
        }

        /**
         * @param type enum: `eap`, `eap192`, `open`, `psk`, `psk-tkip`, `psk-wpa2-tkip`, `wep`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `eap`, `eap192`, `open`, `psk`, `psk-tkip`, `psk-wpa2-tkip`, `wep`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param wepAsSecondaryAuth enable WEP as secondary auth
         * 
         * @return builder
         * 
         */
        public Builder wepAsSecondaryAuth(@Nullable Output<Boolean> wepAsSecondaryAuth) {
            $.wepAsSecondaryAuth = wepAsSecondaryAuth;
            return this;
        }

        /**
         * @param wepAsSecondaryAuth enable WEP as secondary auth
         * 
         * @return builder
         * 
         */
        public Builder wepAsSecondaryAuth(Boolean wepAsSecondaryAuth) {
            return wepAsSecondaryAuth(Output.of(wepAsSecondaryAuth));
        }

        public WlanAuthArgs build() {
            return $;
        }
    }

}