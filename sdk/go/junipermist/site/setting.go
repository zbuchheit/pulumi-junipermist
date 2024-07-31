// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package site

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the Site Settings.The Site Settings can used to customize the Site configuration and assign Site Variables (Sites Variables can be reused in configuration templates)
type Setting struct {
	pulumi.CustomResourceState

	Analytic SettingAnalyticPtrOutput `pulumi:"analytic"`
	// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold pulumi.IntOutput `pulumi:"apUpdownThreshold"`
	// Auto Upgrade Settings
	AutoUpgrade  SettingAutoUpgradePtrOutput `pulumi:"autoUpgrade"`
	BlacklistUrl pulumi.StringOutput         `pulumi:"blacklistUrl"`
	// BLE AP settings
	BleConfig SettingBleConfigPtrOutput `pulumi:"bleConfig"`
	// whether to enable ap auto config revert
	ConfigAutoRevert pulumi.BoolOutput `pulumi:"configAutoRevert"`
	// mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy SettingConfigPushPolicyPtrOutput `pulumi:"configPushPolicy"`
	// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
	CriticalUrlMonitoring SettingCriticalUrlMonitoringPtrOutput `pulumi:"criticalUrlMonitoring"`
	// sending AP*DISCONNECTED event in device-updowns only if AP*CONNECTED is not seen within the threshold, in minutes
	DeviceUpdownThreshold pulumi.IntOutput `pulumi:"deviceUpdownThreshold"`
	// if some system-default port usages are not desired - namely, ap / iot / uplink
	DisabledSystemDefinedPortUsages pulumi.StringArrayOutput `pulumi:"disabledSystemDefinedPortUsages"`
	// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
	Engagement SettingEngagementPtrOutput `pulumi:"engagement"`
	// Gateway Site settings
	GatewayMgmt SettingGatewayMgmtPtrOutput `pulumi:"gatewayMgmt"`
	// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold pulumi.IntOutput `pulumi:"gatewayUpdownThreshold"`
	// LED AP settings
	Led SettingLedPtrOutput `pulumi:"led"`
	// Occupancy Analytics settings
	Occupancy SettingOccupancyPtrOutput `pulumi:"occupancy"`
	OrgId     pulumi.StringOutput       `pulumi:"orgId"`
	// whether to store the config on AP
	PersistConfigOnDevice pulumi.BoolOutput `pulumi:"persistConfigOnDevice"`
	// Proxy Configuration to talk to Mist
	Proxy SettingProxyPtrOutput `pulumi:"proxy"`
	// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt pulumi.BoolOutput `pulumi:"reportGatt"`
	// Rogue site settings
	Rogue SettingRoguePtrOutput `pulumi:"rogue"`
	// managed mobility
	Rtsa SettingRtsaPtrOutput `pulumi:"rtsa"`
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountring over X failures
	SimpleAlert SettingSimpleAlertPtrOutput `pulumi:"simpleAlert"`
	SiteId      pulumi.StringOutput         `pulumi:"siteId"`
	Skyatp      SettingSkyatpPtrOutput      `pulumi:"skyatp"`
	SrxApp      SettingSrxAppPtrOutput      `pulumi:"srxApp"`
	// when limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys pulumi.StringArrayOutput `pulumi:"sshKeys"`
	Ssr     SettingSsrPtrOutput      `pulumi:"ssr"`
	// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold pulumi.IntOutput              `pulumi:"switchUpdownThreshold"`
	SyntheticTest         SettingSyntheticTestPtrOutput `pulumi:"syntheticTest"`
	// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices pulumi.BoolOutput                `pulumi:"trackAnonymousDevices"`
	UplinkPortConfig      SettingUplinkPortConfigPtrOutput `pulumi:"uplinkPortConfig"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapOutput `pulumi:"vars"`
	Vna  SettingVnaPtrOutput    `pulumi:"vna"`
	// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
	VsInstance        SettingVsInstanceMapOutput `pulumi:"vsInstance"`
	WanVna            SettingWanVnaPtrOutput     `pulumi:"wanVna"`
	WatchedStationUrl pulumi.StringOutput        `pulumi:"watchedStationUrl"`
	WhitelistUrl      pulumi.StringOutput        `pulumi:"whitelistUrl"`
	// WIDS site settings
	Wids SettingWidsPtrOutput `pulumi:"wids"`
	// Wi-Fi site settings
	Wifi     SettingWifiPtrOutput     `pulumi:"wifi"`
	WiredVna SettingWiredVnaPtrOutput `pulumi:"wiredVna"`
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert SettingZoneOccupancyAlertPtrOutput `pulumi:"zoneOccupancyAlert"`
}

// NewSetting registers a new resource with the given unique name, arguments, and options.
func NewSetting(ctx *pulumi.Context,
	name string, args *SettingArgs, opts ...pulumi.ResourceOption) (*Setting, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Setting
	err := ctx.RegisterResource("junipermist:site/setting:Setting", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSetting gets an existing Setting resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSetting(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SettingState, opts ...pulumi.ResourceOption) (*Setting, error) {
	var resource Setting
	err := ctx.ReadResource("junipermist:site/setting:Setting", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Setting resources.
type settingState struct {
	Analytic *SettingAnalytic `pulumi:"analytic"`
	// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold *int `pulumi:"apUpdownThreshold"`
	// Auto Upgrade Settings
	AutoUpgrade  *SettingAutoUpgrade `pulumi:"autoUpgrade"`
	BlacklistUrl *string             `pulumi:"blacklistUrl"`
	// BLE AP settings
	BleConfig *SettingBleConfig `pulumi:"bleConfig"`
	// whether to enable ap auto config revert
	ConfigAutoRevert *bool `pulumi:"configAutoRevert"`
	// mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy *SettingConfigPushPolicy `pulumi:"configPushPolicy"`
	// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
	CriticalUrlMonitoring *SettingCriticalUrlMonitoring `pulumi:"criticalUrlMonitoring"`
	// sending AP*DISCONNECTED event in device-updowns only if AP*CONNECTED is not seen within the threshold, in minutes
	DeviceUpdownThreshold *int `pulumi:"deviceUpdownThreshold"`
	// if some system-default port usages are not desired - namely, ap / iot / uplink
	DisabledSystemDefinedPortUsages []string `pulumi:"disabledSystemDefinedPortUsages"`
	// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
	Engagement *SettingEngagement `pulumi:"engagement"`
	// Gateway Site settings
	GatewayMgmt *SettingGatewayMgmt `pulumi:"gatewayMgmt"`
	// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold *int `pulumi:"gatewayUpdownThreshold"`
	// LED AP settings
	Led *SettingLed `pulumi:"led"`
	// Occupancy Analytics settings
	Occupancy *SettingOccupancy `pulumi:"occupancy"`
	OrgId     *string           `pulumi:"orgId"`
	// whether to store the config on AP
	PersistConfigOnDevice *bool `pulumi:"persistConfigOnDevice"`
	// Proxy Configuration to talk to Mist
	Proxy *SettingProxy `pulumi:"proxy"`
	// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt *bool `pulumi:"reportGatt"`
	// Rogue site settings
	Rogue *SettingRogue `pulumi:"rogue"`
	// managed mobility
	Rtsa *SettingRtsa `pulumi:"rtsa"`
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountring over X failures
	SimpleAlert *SettingSimpleAlert `pulumi:"simpleAlert"`
	SiteId      *string             `pulumi:"siteId"`
	Skyatp      *SettingSkyatp      `pulumi:"skyatp"`
	SrxApp      *SettingSrxApp      `pulumi:"srxApp"`
	// when limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys []string    `pulumi:"sshKeys"`
	Ssr     *SettingSsr `pulumi:"ssr"`
	// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold *int                  `pulumi:"switchUpdownThreshold"`
	SyntheticTest         *SettingSyntheticTest `pulumi:"syntheticTest"`
	// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices *bool                    `pulumi:"trackAnonymousDevices"`
	UplinkPortConfig      *SettingUplinkPortConfig `pulumi:"uplinkPortConfig"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars map[string]string `pulumi:"vars"`
	Vna  *SettingVna       `pulumi:"vna"`
	// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
	VsInstance        map[string]SettingVsInstance `pulumi:"vsInstance"`
	WanVna            *SettingWanVna               `pulumi:"wanVna"`
	WatchedStationUrl *string                      `pulumi:"watchedStationUrl"`
	WhitelistUrl      *string                      `pulumi:"whitelistUrl"`
	// WIDS site settings
	Wids *SettingWids `pulumi:"wids"`
	// Wi-Fi site settings
	Wifi     *SettingWifi     `pulumi:"wifi"`
	WiredVna *SettingWiredVna `pulumi:"wiredVna"`
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert *SettingZoneOccupancyAlert `pulumi:"zoneOccupancyAlert"`
}

type SettingState struct {
	Analytic SettingAnalyticPtrInput
	// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold pulumi.IntPtrInput
	// Auto Upgrade Settings
	AutoUpgrade  SettingAutoUpgradePtrInput
	BlacklistUrl pulumi.StringPtrInput
	// BLE AP settings
	BleConfig SettingBleConfigPtrInput
	// whether to enable ap auto config revert
	ConfigAutoRevert pulumi.BoolPtrInput
	// mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy SettingConfigPushPolicyPtrInput
	// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
	CriticalUrlMonitoring SettingCriticalUrlMonitoringPtrInput
	// sending AP*DISCONNECTED event in device-updowns only if AP*CONNECTED is not seen within the threshold, in minutes
	DeviceUpdownThreshold pulumi.IntPtrInput
	// if some system-default port usages are not desired - namely, ap / iot / uplink
	DisabledSystemDefinedPortUsages pulumi.StringArrayInput
	// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
	Engagement SettingEngagementPtrInput
	// Gateway Site settings
	GatewayMgmt SettingGatewayMgmtPtrInput
	// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold pulumi.IntPtrInput
	// LED AP settings
	Led SettingLedPtrInput
	// Occupancy Analytics settings
	Occupancy SettingOccupancyPtrInput
	OrgId     pulumi.StringPtrInput
	// whether to store the config on AP
	PersistConfigOnDevice pulumi.BoolPtrInput
	// Proxy Configuration to talk to Mist
	Proxy SettingProxyPtrInput
	// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt pulumi.BoolPtrInput
	// Rogue site settings
	Rogue SettingRoguePtrInput
	// managed mobility
	Rtsa SettingRtsaPtrInput
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountring over X failures
	SimpleAlert SettingSimpleAlertPtrInput
	SiteId      pulumi.StringPtrInput
	Skyatp      SettingSkyatpPtrInput
	SrxApp      SettingSrxAppPtrInput
	// when limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys pulumi.StringArrayInput
	Ssr     SettingSsrPtrInput
	// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold pulumi.IntPtrInput
	SyntheticTest         SettingSyntheticTestPtrInput
	// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices pulumi.BoolPtrInput
	UplinkPortConfig      SettingUplinkPortConfigPtrInput
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapInput
	Vna  SettingVnaPtrInput
	// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
	VsInstance        SettingVsInstanceMapInput
	WanVna            SettingWanVnaPtrInput
	WatchedStationUrl pulumi.StringPtrInput
	WhitelistUrl      pulumi.StringPtrInput
	// WIDS site settings
	Wids SettingWidsPtrInput
	// Wi-Fi site settings
	Wifi     SettingWifiPtrInput
	WiredVna SettingWiredVnaPtrInput
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert SettingZoneOccupancyAlertPtrInput
}

func (SettingState) ElementType() reflect.Type {
	return reflect.TypeOf((*settingState)(nil)).Elem()
}

type settingArgs struct {
	Analytic *SettingAnalytic `pulumi:"analytic"`
	// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold *int `pulumi:"apUpdownThreshold"`
	// Auto Upgrade Settings
	AutoUpgrade *SettingAutoUpgrade `pulumi:"autoUpgrade"`
	// BLE AP settings
	BleConfig *SettingBleConfig `pulumi:"bleConfig"`
	// whether to enable ap auto config revert
	ConfigAutoRevert *bool `pulumi:"configAutoRevert"`
	// mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy *SettingConfigPushPolicy `pulumi:"configPushPolicy"`
	// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
	CriticalUrlMonitoring *SettingCriticalUrlMonitoring `pulumi:"criticalUrlMonitoring"`
	// sending AP*DISCONNECTED event in device-updowns only if AP*CONNECTED is not seen within the threshold, in minutes
	DeviceUpdownThreshold *int `pulumi:"deviceUpdownThreshold"`
	// if some system-default port usages are not desired - namely, ap / iot / uplink
	DisabledSystemDefinedPortUsages []string `pulumi:"disabledSystemDefinedPortUsages"`
	// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
	Engagement *SettingEngagement `pulumi:"engagement"`
	// Gateway Site settings
	GatewayMgmt *SettingGatewayMgmt `pulumi:"gatewayMgmt"`
	// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold *int `pulumi:"gatewayUpdownThreshold"`
	// LED AP settings
	Led *SettingLed `pulumi:"led"`
	// Occupancy Analytics settings
	Occupancy *SettingOccupancy `pulumi:"occupancy"`
	// whether to store the config on AP
	PersistConfigOnDevice *bool `pulumi:"persistConfigOnDevice"`
	// Proxy Configuration to talk to Mist
	Proxy *SettingProxy `pulumi:"proxy"`
	// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt *bool `pulumi:"reportGatt"`
	// Rogue site settings
	Rogue *SettingRogue `pulumi:"rogue"`
	// managed mobility
	Rtsa *SettingRtsa `pulumi:"rtsa"`
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountring over X failures
	SimpleAlert *SettingSimpleAlert `pulumi:"simpleAlert"`
	SiteId      string              `pulumi:"siteId"`
	Skyatp      *SettingSkyatp      `pulumi:"skyatp"`
	SrxApp      *SettingSrxApp      `pulumi:"srxApp"`
	// when limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys []string    `pulumi:"sshKeys"`
	Ssr     *SettingSsr `pulumi:"ssr"`
	// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold *int                  `pulumi:"switchUpdownThreshold"`
	SyntheticTest         *SettingSyntheticTest `pulumi:"syntheticTest"`
	// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices *bool                    `pulumi:"trackAnonymousDevices"`
	UplinkPortConfig      *SettingUplinkPortConfig `pulumi:"uplinkPortConfig"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars map[string]string `pulumi:"vars"`
	Vna  *SettingVna       `pulumi:"vna"`
	// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
	VsInstance map[string]SettingVsInstance `pulumi:"vsInstance"`
	WanVna     *SettingWanVna               `pulumi:"wanVna"`
	// WIDS site settings
	Wids *SettingWids `pulumi:"wids"`
	// Wi-Fi site settings
	Wifi     *SettingWifi     `pulumi:"wifi"`
	WiredVna *SettingWiredVna `pulumi:"wiredVna"`
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert *SettingZoneOccupancyAlert `pulumi:"zoneOccupancyAlert"`
}

// The set of arguments for constructing a Setting resource.
type SettingArgs struct {
	Analytic SettingAnalyticPtrInput
	// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold pulumi.IntPtrInput
	// Auto Upgrade Settings
	AutoUpgrade SettingAutoUpgradePtrInput
	// BLE AP settings
	BleConfig SettingBleConfigPtrInput
	// whether to enable ap auto config revert
	ConfigAutoRevert pulumi.BoolPtrInput
	// mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy SettingConfigPushPolicyPtrInput
	// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
	CriticalUrlMonitoring SettingCriticalUrlMonitoringPtrInput
	// sending AP*DISCONNECTED event in device-updowns only if AP*CONNECTED is not seen within the threshold, in minutes
	DeviceUpdownThreshold pulumi.IntPtrInput
	// if some system-default port usages are not desired - namely, ap / iot / uplink
	DisabledSystemDefinedPortUsages pulumi.StringArrayInput
	// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
	Engagement SettingEngagementPtrInput
	// Gateway Site settings
	GatewayMgmt SettingGatewayMgmtPtrInput
	// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold pulumi.IntPtrInput
	// LED AP settings
	Led SettingLedPtrInput
	// Occupancy Analytics settings
	Occupancy SettingOccupancyPtrInput
	// whether to store the config on AP
	PersistConfigOnDevice pulumi.BoolPtrInput
	// Proxy Configuration to talk to Mist
	Proxy SettingProxyPtrInput
	// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt pulumi.BoolPtrInput
	// Rogue site settings
	Rogue SettingRoguePtrInput
	// managed mobility
	Rtsa SettingRtsaPtrInput
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountring over X failures
	SimpleAlert SettingSimpleAlertPtrInput
	SiteId      pulumi.StringInput
	Skyatp      SettingSkyatpPtrInput
	SrxApp      SettingSrxAppPtrInput
	// when limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys pulumi.StringArrayInput
	Ssr     SettingSsrPtrInput
	// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold pulumi.IntPtrInput
	SyntheticTest         SettingSyntheticTestPtrInput
	// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices pulumi.BoolPtrInput
	UplinkPortConfig      SettingUplinkPortConfigPtrInput
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapInput
	Vna  SettingVnaPtrInput
	// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
	VsInstance SettingVsInstanceMapInput
	WanVna     SettingWanVnaPtrInput
	// WIDS site settings
	Wids SettingWidsPtrInput
	// Wi-Fi site settings
	Wifi     SettingWifiPtrInput
	WiredVna SettingWiredVnaPtrInput
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert SettingZoneOccupancyAlertPtrInput
}

func (SettingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*settingArgs)(nil)).Elem()
}

type SettingInput interface {
	pulumi.Input

	ToSettingOutput() SettingOutput
	ToSettingOutputWithContext(ctx context.Context) SettingOutput
}

func (*Setting) ElementType() reflect.Type {
	return reflect.TypeOf((**Setting)(nil)).Elem()
}

func (i *Setting) ToSettingOutput() SettingOutput {
	return i.ToSettingOutputWithContext(context.Background())
}

func (i *Setting) ToSettingOutputWithContext(ctx context.Context) SettingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SettingOutput)
}

// SettingArrayInput is an input type that accepts SettingArray and SettingArrayOutput values.
// You can construct a concrete instance of `SettingArrayInput` via:
//
//	SettingArray{ SettingArgs{...} }
type SettingArrayInput interface {
	pulumi.Input

	ToSettingArrayOutput() SettingArrayOutput
	ToSettingArrayOutputWithContext(context.Context) SettingArrayOutput
}

type SettingArray []SettingInput

func (SettingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Setting)(nil)).Elem()
}

func (i SettingArray) ToSettingArrayOutput() SettingArrayOutput {
	return i.ToSettingArrayOutputWithContext(context.Background())
}

func (i SettingArray) ToSettingArrayOutputWithContext(ctx context.Context) SettingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SettingArrayOutput)
}

// SettingMapInput is an input type that accepts SettingMap and SettingMapOutput values.
// You can construct a concrete instance of `SettingMapInput` via:
//
//	SettingMap{ "key": SettingArgs{...} }
type SettingMapInput interface {
	pulumi.Input

	ToSettingMapOutput() SettingMapOutput
	ToSettingMapOutputWithContext(context.Context) SettingMapOutput
}

type SettingMap map[string]SettingInput

func (SettingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Setting)(nil)).Elem()
}

func (i SettingMap) ToSettingMapOutput() SettingMapOutput {
	return i.ToSettingMapOutputWithContext(context.Background())
}

func (i SettingMap) ToSettingMapOutputWithContext(ctx context.Context) SettingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SettingMapOutput)
}

type SettingOutput struct{ *pulumi.OutputState }

func (SettingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Setting)(nil)).Elem()
}

func (o SettingOutput) ToSettingOutput() SettingOutput {
	return o
}

func (o SettingOutput) ToSettingOutputWithContext(ctx context.Context) SettingOutput {
	return o
}

func (o SettingOutput) Analytic() SettingAnalyticPtrOutput {
	return o.ApplyT(func(v *Setting) SettingAnalyticPtrOutput { return v.Analytic }).(SettingAnalyticPtrOutput)
}

// enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and `deviceUpdownThreshold` is ignored.
func (o SettingOutput) ApUpdownThreshold() pulumi.IntOutput {
	return o.ApplyT(func(v *Setting) pulumi.IntOutput { return v.ApUpdownThreshold }).(pulumi.IntOutput)
}

// Auto Upgrade Settings
func (o SettingOutput) AutoUpgrade() SettingAutoUpgradePtrOutput {
	return o.ApplyT(func(v *Setting) SettingAutoUpgradePtrOutput { return v.AutoUpgrade }).(SettingAutoUpgradePtrOutput)
}

func (o SettingOutput) BlacklistUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.BlacklistUrl }).(pulumi.StringOutput)
}

// BLE AP settings
func (o SettingOutput) BleConfig() SettingBleConfigPtrOutput {
	return o.ApplyT(func(v *Setting) SettingBleConfigPtrOutput { return v.BleConfig }).(SettingBleConfigPtrOutput)
}

// whether to enable ap auto config revert
func (o SettingOutput) ConfigAutoRevert() pulumi.BoolOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolOutput { return v.ConfigAutoRevert }).(pulumi.BoolOutput)
}

// mist also uses some heuristic rules to prevent destructive configs from being pushed
func (o SettingOutput) ConfigPushPolicy() SettingConfigPushPolicyPtrOutput {
	return o.ApplyT(func(v *Setting) SettingConfigPushPolicyPtrOutput { return v.ConfigPushPolicy }).(SettingConfigPushPolicyPtrOutput)
}

// you can define some URLs that's critical to site operaitons the latency will be captured and considered for site health
func (o SettingOutput) CriticalUrlMonitoring() SettingCriticalUrlMonitoringPtrOutput {
	return o.ApplyT(func(v *Setting) SettingCriticalUrlMonitoringPtrOutput { return v.CriticalUrlMonitoring }).(SettingCriticalUrlMonitoringPtrOutput)
}

// sending AP*DISCONNECTED event in device-updowns only if AP*CONNECTED is not seen within the threshold, in minutes
func (o SettingOutput) DeviceUpdownThreshold() pulumi.IntOutput {
	return o.ApplyT(func(v *Setting) pulumi.IntOutput { return v.DeviceUpdownThreshold }).(pulumi.IntOutput)
}

// if some system-default port usages are not desired - namely, ap / iot / uplink
func (o SettingOutput) DisabledSystemDefinedPortUsages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringArrayOutput { return v.DisabledSystemDefinedPortUsages }).(pulumi.StringArrayOutput)
}

// **Note**: if hours does not exist, it’s treated as everyday of the week, 00:00-23:59. Currently we don’t allow multiple ranges for the same day
func (o SettingOutput) Engagement() SettingEngagementPtrOutput {
	return o.ApplyT(func(v *Setting) SettingEngagementPtrOutput { return v.Engagement }).(SettingEngagementPtrOutput)
}

// Gateway Site settings
func (o SettingOutput) GatewayMgmt() SettingGatewayMgmtPtrOutput {
	return o.ApplyT(func(v *Setting) SettingGatewayMgmtPtrOutput { return v.GatewayMgmt }).(SettingGatewayMgmtPtrOutput)
}

// enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
// `deviceUpdownThreshold` is ignored.
func (o SettingOutput) GatewayUpdownThreshold() pulumi.IntOutput {
	return o.ApplyT(func(v *Setting) pulumi.IntOutput { return v.GatewayUpdownThreshold }).(pulumi.IntOutput)
}

// LED AP settings
func (o SettingOutput) Led() SettingLedPtrOutput {
	return o.ApplyT(func(v *Setting) SettingLedPtrOutput { return v.Led }).(SettingLedPtrOutput)
}

// Occupancy Analytics settings
func (o SettingOutput) Occupancy() SettingOccupancyPtrOutput {
	return o.ApplyT(func(v *Setting) SettingOccupancyPtrOutput { return v.Occupancy }).(SettingOccupancyPtrOutput)
}

func (o SettingOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// whether to store the config on AP
func (o SettingOutput) PersistConfigOnDevice() pulumi.BoolOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolOutput { return v.PersistConfigOnDevice }).(pulumi.BoolOutput)
}

// Proxy Configuration to talk to Mist
func (o SettingOutput) Proxy() SettingProxyPtrOutput {
	return o.ApplyT(func(v *Setting) SettingProxyPtrOutput { return v.Proxy }).(SettingProxyPtrOutput)
}

// whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
// serial number, battery %, temperature, humidity)
func (o SettingOutput) ReportGatt() pulumi.BoolOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolOutput { return v.ReportGatt }).(pulumi.BoolOutput)
}

// Rogue site settings
func (o SettingOutput) Rogue() SettingRoguePtrOutput {
	return o.ApplyT(func(v *Setting) SettingRoguePtrOutput { return v.Rogue }).(SettingRoguePtrOutput)
}

// managed mobility
func (o SettingOutput) Rtsa() SettingRtsaPtrOutput {
	return o.ApplyT(func(v *Setting) SettingRtsaPtrOutput { return v.Rtsa }).(SettingRtsaPtrOutput)
}

// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
// window, there are more than Y distinct client encountring over X failures
func (o SettingOutput) SimpleAlert() SettingSimpleAlertPtrOutput {
	return o.ApplyT(func(v *Setting) SettingSimpleAlertPtrOutput { return v.SimpleAlert }).(SettingSimpleAlertPtrOutput)
}

func (o SettingOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

func (o SettingOutput) Skyatp() SettingSkyatpPtrOutput {
	return o.ApplyT(func(v *Setting) SettingSkyatpPtrOutput { return v.Skyatp }).(SettingSkyatpPtrOutput)
}

func (o SettingOutput) SrxApp() SettingSrxAppPtrOutput {
	return o.ApplyT(func(v *Setting) SettingSrxAppPtrOutput { return v.SrxApp }).(SettingSrxAppPtrOutput)
}

// when limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
// Org:Setting)
func (o SettingOutput) SshKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringArrayOutput { return v.SshKeys }).(pulumi.StringArrayOutput)
}

func (o SettingOutput) Ssr() SettingSsrPtrOutput {
	return o.ApplyT(func(v *Setting) SettingSsrPtrOutput { return v.Ssr }).(SettingSsrPtrOutput)
}

// enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
// `deviceUpdownThreshold` is ignored.
func (o SettingOutput) SwitchUpdownThreshold() pulumi.IntOutput {
	return o.ApplyT(func(v *Setting) pulumi.IntOutput { return v.SwitchUpdownThreshold }).(pulumi.IntOutput)
}

func (o SettingOutput) SyntheticTest() SettingSyntheticTestPtrOutput {
	return o.ApplyT(func(v *Setting) SettingSyntheticTestPtrOutput { return v.SyntheticTest }).(SettingSyntheticTestPtrOutput)
}

// whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
func (o SettingOutput) TrackAnonymousDevices() pulumi.BoolOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolOutput { return v.TrackAnonymousDevices }).(pulumi.BoolOutput)
}

func (o SettingOutput) UplinkPortConfig() SettingUplinkPortConfigPtrOutput {
	return o.ApplyT(func(v *Setting) SettingUplinkPortConfigPtrOutput { return v.UplinkPortConfig }).(SettingUplinkPortConfigPtrOutput)
}

// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
func (o SettingOutput) Vars() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringMapOutput { return v.Vars }).(pulumi.StringMapOutput)
}

func (o SettingOutput) Vna() SettingVnaPtrOutput {
	return o.ApplyT(func(v *Setting) SettingVnaPtrOutput { return v.Vna }).(SettingVnaPtrOutput)
}

// optional, for EX9200 only to seggregate virtual-switches. Property key is the instance name
func (o SettingOutput) VsInstance() SettingVsInstanceMapOutput {
	return o.ApplyT(func(v *Setting) SettingVsInstanceMapOutput { return v.VsInstance }).(SettingVsInstanceMapOutput)
}

func (o SettingOutput) WanVna() SettingWanVnaPtrOutput {
	return o.ApplyT(func(v *Setting) SettingWanVnaPtrOutput { return v.WanVna }).(SettingWanVnaPtrOutput)
}

func (o SettingOutput) WatchedStationUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.WatchedStationUrl }).(pulumi.StringOutput)
}

func (o SettingOutput) WhitelistUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.WhitelistUrl }).(pulumi.StringOutput)
}

// WIDS site settings
func (o SettingOutput) Wids() SettingWidsPtrOutput {
	return o.ApplyT(func(v *Setting) SettingWidsPtrOutput { return v.Wids }).(SettingWidsPtrOutput)
}

// Wi-Fi site settings
func (o SettingOutput) Wifi() SettingWifiPtrOutput {
	return o.ApplyT(func(v *Setting) SettingWifiPtrOutput { return v.Wifi }).(SettingWifiPtrOutput)
}

func (o SettingOutput) WiredVna() SettingWiredVnaPtrOutput {
	return o.ApplyT(func(v *Setting) SettingWiredVnaPtrOutput { return v.WiredVna }).(SettingWiredVnaPtrOutput)
}

// Zone Occupancy alert site settings
func (o SettingOutput) ZoneOccupancyAlert() SettingZoneOccupancyAlertPtrOutput {
	return o.ApplyT(func(v *Setting) SettingZoneOccupancyAlertPtrOutput { return v.ZoneOccupancyAlert }).(SettingZoneOccupancyAlertPtrOutput)
}

type SettingArrayOutput struct{ *pulumi.OutputState }

func (SettingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Setting)(nil)).Elem()
}

func (o SettingArrayOutput) ToSettingArrayOutput() SettingArrayOutput {
	return o
}

func (o SettingArrayOutput) ToSettingArrayOutputWithContext(ctx context.Context) SettingArrayOutput {
	return o
}

func (o SettingArrayOutput) Index(i pulumi.IntInput) SettingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Setting {
		return vs[0].([]*Setting)[vs[1].(int)]
	}).(SettingOutput)
}

type SettingMapOutput struct{ *pulumi.OutputState }

func (SettingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Setting)(nil)).Elem()
}

func (o SettingMapOutput) ToSettingMapOutput() SettingMapOutput {
	return o
}

func (o SettingMapOutput) ToSettingMapOutputWithContext(ctx context.Context) SettingMapOutput {
	return o
}

func (o SettingMapOutput) MapIndex(k pulumi.StringInput) SettingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Setting {
		return vs[0].(map[string]*Setting)[vs[1].(string)]
	}).(SettingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SettingInput)(nil)).Elem(), &Setting{})
	pulumi.RegisterInputType(reflect.TypeOf((*SettingArrayInput)(nil)).Elem(), SettingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SettingMapInput)(nil)).Elem(), SettingMap{})
	pulumi.RegisterOutputType(SettingOutput{})
	pulumi.RegisterOutputType(SettingArrayOutput{})
	pulumi.RegisterOutputType(SettingMapOutput{})
}
