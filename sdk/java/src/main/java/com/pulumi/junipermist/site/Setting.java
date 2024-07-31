// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.site.SettingArgs;
import com.pulumi.junipermist.site.inputs.SettingState;
import com.pulumi.junipermist.site.outputs.SettingAnalytic;
import com.pulumi.junipermist.site.outputs.SettingAutoUpgrade;
import com.pulumi.junipermist.site.outputs.SettingBleConfig;
import com.pulumi.junipermist.site.outputs.SettingConfigPushPolicy;
import com.pulumi.junipermist.site.outputs.SettingCriticalUrlMonitoring;
import com.pulumi.junipermist.site.outputs.SettingEngagement;
import com.pulumi.junipermist.site.outputs.SettingGatewayMgmt;
import com.pulumi.junipermist.site.outputs.SettingLed;
import com.pulumi.junipermist.site.outputs.SettingOccupancy;
import com.pulumi.junipermist.site.outputs.SettingProxy;
import com.pulumi.junipermist.site.outputs.SettingRogue;
import com.pulumi.junipermist.site.outputs.SettingRtsa;
import com.pulumi.junipermist.site.outputs.SettingSimpleAlert;
import com.pulumi.junipermist.site.outputs.SettingSkyatp;
import com.pulumi.junipermist.site.outputs.SettingSrxApp;
import com.pulumi.junipermist.site.outputs.SettingSsr;
import com.pulumi.junipermist.site.outputs.SettingSyntheticTest;
import com.pulumi.junipermist.site.outputs.SettingUplinkPortConfig;
import com.pulumi.junipermist.site.outputs.SettingVna;
import com.pulumi.junipermist.site.outputs.SettingVsInstance;
import com.pulumi.junipermist.site.outputs.SettingWanVna;
import com.pulumi.junipermist.site.outputs.SettingWids;
import com.pulumi.junipermist.site.outputs.SettingWifi;
import com.pulumi.junipermist.site.outputs.SettingWiredVna;
import com.pulumi.junipermist.site.outputs.SettingZoneOccupancyAlert;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Site Settings.The Site Settings can used to customize the Site configuration and assign Site Variables (Sites Variables can be reused in configuration templates)
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.junipermist.site.Setting;
 * import com.pulumi.junipermist.site.SettingArgs;
 * import com.pulumi.junipermist.site.inputs.SettingAutoUpgradeArgs;
 * import com.pulumi.junipermist.site.inputs.SettingProxyArgs;
 * import com.pulumi.junipermist.site.inputs.SettingRogueArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var siteOne = new Setting("siteOne", SettingArgs.builder()
 *             .siteId(terraformSite.id())
 *             .apUpdownThreshold(5)
 *             .deviceUpdownThreshold(5)
 *             .autoUpgrade(SettingAutoUpgradeArgs.builder()
 *                 .enabled(true)
 *                 .day_of_week("tue")
 *                 .time_of_day("02:00")
 *                 .version("beta")
 *                 .build())
 *             .configAutoRevert(true)
 *             .persistConfigOnDevice(true)
 *             .proxy(SettingProxyArgs.builder()
 *                 .url("http://myproxy:3128")
 *                 .build())
 *             .rogue(SettingRogueArgs.builder()
 *                 .enabled(true)
 *                 .honeypot_enabled(true)
 *                 .min_duration(5)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="junipermist:site/setting:Setting")
public class Setting extends com.pulumi.resources.CustomResource {
    @Export(name="analytic", refs={SettingAnalytic.class}, tree="[0]")
    private Output</* @Nullable */ SettingAnalytic> analytic;

    public Output<Optional<SettingAnalytic>> analytic() {
        return Codegen.optional(this.analytic);
    }
    /**
     * enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `device_updown_threshold` is ignored.
     * 
     */
    @Export(name="apUpdownThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> apUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `device_updown_threshold` is ignored.
     * 
     */
    public Output<Integer> apUpdownThreshold() {
        return this.apUpdownThreshold;
    }
    /**
     * Auto Upgrade Settings
     * 
     */
    @Export(name="autoUpgrade", refs={SettingAutoUpgrade.class}, tree="[0]")
    private Output</* @Nullable */ SettingAutoUpgrade> autoUpgrade;

    /**
     * @return Auto Upgrade Settings
     * 
     */
    public Output<Optional<SettingAutoUpgrade>> autoUpgrade() {
        return Codegen.optional(this.autoUpgrade);
    }
    @Export(name="blacklistUrl", refs={String.class}, tree="[0]")
    private Output<String> blacklistUrl;

    public Output<String> blacklistUrl() {
        return this.blacklistUrl;
    }
    /**
     * BLE AP settings
     * 
     */
    @Export(name="bleConfig", refs={SettingBleConfig.class}, tree="[0]")
    private Output</* @Nullable */ SettingBleConfig> bleConfig;

    /**
     * @return BLE AP settings
     * 
     */
    public Output<Optional<SettingBleConfig>> bleConfig() {
        return Codegen.optional(this.bleConfig);
    }
    /**
     * whether to enable ap auto config revert
     * 
     */
    @Export(name="configAutoRevert", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> configAutoRevert;

    /**
     * @return whether to enable ap auto config revert
     * 
     */
    public Output<Boolean> configAutoRevert() {
        return this.configAutoRevert;
    }
    /**
     * mist also uses some heuristic rules to prevent destructive configs from being pushed
     * 
     */
    @Export(name="configPushPolicy", refs={SettingConfigPushPolicy.class}, tree="[0]")
    private Output</* @Nullable */ SettingConfigPushPolicy> configPushPolicy;

    /**
     * @return mist also uses some heuristic rules to prevent destructive configs from being pushed
     * 
     */
    public Output<Optional<SettingConfigPushPolicy>> configPushPolicy() {
        return Codegen.optional(this.configPushPolicy);
    }
    /**
     * you can define some URLs that&#39;s critical to site operaitons the latency will be captured and considered for site health
     * 
     */
    @Export(name="criticalUrlMonitoring", refs={SettingCriticalUrlMonitoring.class}, tree="[0]")
    private Output</* @Nullable */ SettingCriticalUrlMonitoring> criticalUrlMonitoring;

    /**
     * @return you can define some URLs that&#39;s critical to site operaitons the latency will be captured and considered for site health
     * 
     */
    public Output<Optional<SettingCriticalUrlMonitoring>> criticalUrlMonitoring() {
        return Codegen.optional(this.criticalUrlMonitoring);
    }
    /**
     * sending AP*DISCONNECTED event in device-updowns only if AP*CONNECTED is not seen within the threshold, in minutes
     * 
     */
    @Export(name="deviceUpdownThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> deviceUpdownThreshold;

    /**
     * @return sending AP*DISCONNECTED event in device-updowns only if AP*CONNECTED is not seen within the threshold, in minutes
     * 
     */
    public Output<Integer> deviceUpdownThreshold() {
        return this.deviceUpdownThreshold;
    }
    /**
     * if some system-default port usages are not desired - namely, ap / iot / uplink
     * 
     */
    @Export(name="disabledSystemDefinedPortUsages", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> disabledSystemDefinedPortUsages;

    /**
     * @return if some system-default port usages are not desired - namely, ap / iot / uplink
     * 
     */
    public Output<Optional<List<String>>> disabledSystemDefinedPortUsages() {
        return Codegen.optional(this.disabledSystemDefinedPortUsages);
    }
    /**
     * **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
     * 
     */
    @Export(name="engagement", refs={SettingEngagement.class}, tree="[0]")
    private Output</* @Nullable */ SettingEngagement> engagement;

    /**
     * @return **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
     * 
     */
    public Output<Optional<SettingEngagement>> engagement() {
        return Codegen.optional(this.engagement);
    }
    /**
     * Gateway Site settings
     * 
     */
    @Export(name="gatewayMgmt", refs={SettingGatewayMgmt.class}, tree="[0]")
    private Output</* @Nullable */ SettingGatewayMgmt> gatewayMgmt;

    /**
     * @return Gateway Site settings
     * 
     */
    public Output<Optional<SettingGatewayMgmt>> gatewayMgmt() {
        return Codegen.optional(this.gatewayMgmt);
    }
    /**
     * enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    @Export(name="gatewayUpdownThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> gatewayUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    public Output<Integer> gatewayUpdownThreshold() {
        return this.gatewayUpdownThreshold;
    }
    /**
     * LED AP settings
     * 
     */
    @Export(name="led", refs={SettingLed.class}, tree="[0]")
    private Output</* @Nullable */ SettingLed> led;

    /**
     * @return LED AP settings
     * 
     */
    public Output<Optional<SettingLed>> led() {
        return Codegen.optional(this.led);
    }
    /**
     * Occupancy Analytics settings
     * 
     */
    @Export(name="occupancy", refs={SettingOccupancy.class}, tree="[0]")
    private Output</* @Nullable */ SettingOccupancy> occupancy;

    /**
     * @return Occupancy Analytics settings
     * 
     */
    public Output<Optional<SettingOccupancy>> occupancy() {
        return Codegen.optional(this.occupancy);
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * whether to store the config on AP
     * 
     */
    @Export(name="persistConfigOnDevice", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> persistConfigOnDevice;

    /**
     * @return whether to store the config on AP
     * 
     */
    public Output<Boolean> persistConfigOnDevice() {
        return this.persistConfigOnDevice;
    }
    /**
     * Proxy Configuration to talk to Mist
     * 
     */
    @Export(name="proxy", refs={SettingProxy.class}, tree="[0]")
    private Output</* @Nullable */ SettingProxy> proxy;

    /**
     * @return Proxy Configuration to talk to Mist
     * 
     */
    public Output<Optional<SettingProxy>> proxy() {
        return Codegen.optional(this.proxy);
    }
    /**
     * whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
     * serial number, battery %, temperature, humidity)
     * 
     */
    @Export(name="reportGatt", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> reportGatt;

    /**
     * @return whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
     * serial number, battery %, temperature, humidity)
     * 
     */
    public Output<Boolean> reportGatt() {
        return this.reportGatt;
    }
    /**
     * Rogue site settings
     * 
     */
    @Export(name="rogue", refs={SettingRogue.class}, tree="[0]")
    private Output</* @Nullable */ SettingRogue> rogue;

    /**
     * @return Rogue site settings
     * 
     */
    public Output<Optional<SettingRogue>> rogue() {
        return Codegen.optional(this.rogue);
    }
    /**
     * managed mobility
     * 
     */
    @Export(name="rtsa", refs={SettingRtsa.class}, tree="[0]")
    private Output</* @Nullable */ SettingRtsa> rtsa;

    /**
     * @return managed mobility
     * 
     */
    public Output<Optional<SettingRtsa>> rtsa() {
        return Codegen.optional(this.rtsa);
    }
    /**
     * Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
     * window, there are more than Y distinct client encountring over X failures
     * 
     */
    @Export(name="simpleAlert", refs={SettingSimpleAlert.class}, tree="[0]")
    private Output</* @Nullable */ SettingSimpleAlert> simpleAlert;

    /**
     * @return Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
     * window, there are more than Y distinct client encountring over X failures
     * 
     */
    public Output<Optional<SettingSimpleAlert>> simpleAlert() {
        return Codegen.optional(this.simpleAlert);
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }
    @Export(name="skyatp", refs={SettingSkyatp.class}, tree="[0]")
    private Output</* @Nullable */ SettingSkyatp> skyatp;

    public Output<Optional<SettingSkyatp>> skyatp() {
        return Codegen.optional(this.skyatp);
    }
    @Export(name="srxApp", refs={SettingSrxApp.class}, tree="[0]")
    private Output</* @Nullable */ SettingSrxApp> srxApp;

    public Output<Optional<SettingSrxApp>> srxApp() {
        return Codegen.optional(this.srxApp);
    }
    /**
     * when limit_ssh_access = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
     * Org:Setting)
     * 
     */
    @Export(name="sshKeys", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sshKeys;

    /**
     * @return when limit_ssh_access = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
     * Org:Setting)
     * 
     */
    public Output<List<String>> sshKeys() {
        return this.sshKeys;
    }
    @Export(name="ssr", refs={SettingSsr.class}, tree="[0]")
    private Output</* @Nullable */ SettingSsr> ssr;

    public Output<Optional<SettingSsr>> ssr() {
        return Codegen.optional(this.ssr);
    }
    /**
     * enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    @Export(name="switchUpdownThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> switchUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    public Output<Integer> switchUpdownThreshold() {
        return this.switchUpdownThreshold;
    }
    @Export(name="syntheticTest", refs={SettingSyntheticTest.class}, tree="[0]")
    private Output</* @Nullable */ SettingSyntheticTest> syntheticTest;

    public Output<Optional<SettingSyntheticTest>> syntheticTest() {
        return Codegen.optional(this.syntheticTest);
    }
    /**
     * whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
     * 
     */
    @Export(name="trackAnonymousDevices", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> trackAnonymousDevices;

    /**
     * @return whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
     * 
     */
    public Output<Boolean> trackAnonymousDevices() {
        return this.trackAnonymousDevices;
    }
    @Export(name="uplinkPortConfig", refs={SettingUplinkPortConfig.class}, tree="[0]")
    private Output</* @Nullable */ SettingUplinkPortConfig> uplinkPortConfig;

    public Output<Optional<SettingUplinkPortConfig>> uplinkPortConfig() {
        return Codegen.optional(this.uplinkPortConfig);
    }
    /**
     * a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    @Export(name="vars", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> vars;

    /**
     * @return a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    public Output<Optional<Map<String,String>>> vars() {
        return Codegen.optional(this.vars);
    }
    @Export(name="vna", refs={SettingVna.class}, tree="[0]")
    private Output</* @Nullable */ SettingVna> vna;

    public Output<Optional<SettingVna>> vna() {
        return Codegen.optional(this.vna);
    }
    /**
     * optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
     * 
     */
    @Export(name="vsInstance", refs={Map.class,String.class,SettingVsInstance.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SettingVsInstance>> vsInstance;

    /**
     * @return optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
     * 
     */
    public Output<Optional<Map<String,SettingVsInstance>>> vsInstance() {
        return Codegen.optional(this.vsInstance);
    }
    @Export(name="wanVna", refs={SettingWanVna.class}, tree="[0]")
    private Output</* @Nullable */ SettingWanVna> wanVna;

    public Output<Optional<SettingWanVna>> wanVna() {
        return Codegen.optional(this.wanVna);
    }
    @Export(name="watchedStationUrl", refs={String.class}, tree="[0]")
    private Output<String> watchedStationUrl;

    public Output<String> watchedStationUrl() {
        return this.watchedStationUrl;
    }
    @Export(name="whitelistUrl", refs={String.class}, tree="[0]")
    private Output<String> whitelistUrl;

    public Output<String> whitelistUrl() {
        return this.whitelistUrl;
    }
    /**
     * WIDS site settings
     * 
     */
    @Export(name="wids", refs={SettingWids.class}, tree="[0]")
    private Output</* @Nullable */ SettingWids> wids;

    /**
     * @return WIDS site settings
     * 
     */
    public Output<Optional<SettingWids>> wids() {
        return Codegen.optional(this.wids);
    }
    /**
     * Wi-Fi site settings
     * 
     */
    @Export(name="wifi", refs={SettingWifi.class}, tree="[0]")
    private Output</* @Nullable */ SettingWifi> wifi;

    /**
     * @return Wi-Fi site settings
     * 
     */
    public Output<Optional<SettingWifi>> wifi() {
        return Codegen.optional(this.wifi);
    }
    @Export(name="wiredVna", refs={SettingWiredVna.class}, tree="[0]")
    private Output</* @Nullable */ SettingWiredVna> wiredVna;

    public Output<Optional<SettingWiredVna>> wiredVna() {
        return Codegen.optional(this.wiredVna);
    }
    /**
     * Zone Occupancy alert site settings
     * 
     */
    @Export(name="zoneOccupancyAlert", refs={SettingZoneOccupancyAlert.class}, tree="[0]")
    private Output</* @Nullable */ SettingZoneOccupancyAlert> zoneOccupancyAlert;

    /**
     * @return Zone Occupancy alert site settings
     * 
     */
    public Output<Optional<SettingZoneOccupancyAlert>> zoneOccupancyAlert() {
        return Codegen.optional(this.zoneOccupancyAlert);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Setting(String name) {
        this(name, SettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Setting(String name, SettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Setting(String name, SettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:site/setting:Setting", name, args == null ? SettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Setting(String name, Output<String> id, @Nullable SettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:site/setting:Setting", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Setting get(String name, Output<String> id, @Nullable SettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Setting(name, id, state, options);
    }
}
