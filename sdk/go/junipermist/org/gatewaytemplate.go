// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the Gateway Templates.A Gateway template is used to define the static ip address and subnet mask of the hub device, along with the gateway. It also allows for the selection of options such as enabling source nat and overriding the public ip for the hub if needed. the endpoint selected in the gateway template ties the hub and spoke devices together and creates the auto-vpn tunnel.
type Gatewaytemplate struct {
	pulumi.CustomResourceState

	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayOutput            `pulumi:"additionalConfigCmds"`
	BgpConfig            GatewaytemplateBgpConfigMapOutput   `pulumi:"bgpConfig"`
	DhcpdConfig          GatewaytemplateDhcpdConfigPtrOutput `pulumi:"dhcpdConfig"`
	DnsOverride          pulumi.BoolOutput                   `pulumi:"dnsOverride"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayOutput `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayOutput `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes GatewaytemplateExtraRoutesMapOutput `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 GatewaytemplateExtraRoutes6MapOutput `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles GatewaytemplateIdpProfilesMapOutput `pulumi:"idpProfiles"`
	// Property key is the network name
	IpConfigs   GatewaytemplateIpConfigsMapOutput `pulumi:"ipConfigs"`
	Name        pulumi.StringOutput               `pulumi:"name"`
	Networks    GatewaytemplateNetworkArrayOutput `pulumi:"networks"`
	NtpOverride pulumi.BoolOutput                 `pulumi:"ntpOverride"`
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayOutput `pulumi:"ntpServers"`
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig GatewaytemplateOobIpConfigPtrOutput `pulumi:"oobIpConfig"`
	OrgId       pulumi.StringOutput                 `pulumi:"orgId"`
	// Property key is the path name
	PathPreferences GatewaytemplatePathPreferencesMapOutput `pulumi:"pathPreferences"`
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig GatewaytemplatePortConfigMapOutput `pulumi:"portConfig"`
	// auto assigned if not set
	RouterId pulumi.StringPtrOutput `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies GatewaytemplateRoutingPoliciesMapOutput `pulumi:"routingPolicies"`
	ServicePolicies GatewaytemplateServicePolicyArrayOutput `pulumi:"servicePolicies"`
	// Property key is the tunnel name
	TunnelConfigs         GatewaytemplateTunnelConfigsMapOutput         `pulumi:"tunnelConfigs"`
	TunnelProviderOptions GatewaytemplateTunnelProviderOptionsPtrOutput `pulumi:"tunnelProviderOptions"`
	// enum: `spoke`, `standalone`
	Type      pulumi.StringOutput               `pulumi:"type"`
	VrfConfig GatewaytemplateVrfConfigPtrOutput `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances GatewaytemplateVrfInstancesMapOutput `pulumi:"vrfInstances"`
}

// NewGatewaytemplate registers a new resource with the given unique name, arguments, and options.
func NewGatewaytemplate(ctx *pulumi.Context,
	name string, args *GatewaytemplateArgs, opts ...pulumi.ResourceOption) (*Gatewaytemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Gatewaytemplate
	err := ctx.RegisterResource("junipermist:org/gatewaytemplate:Gatewaytemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewaytemplate gets an existing Gatewaytemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewaytemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewaytemplateState, opts ...pulumi.ResourceOption) (*Gatewaytemplate, error) {
	var resource Gatewaytemplate
	err := ctx.ReadResource("junipermist:org/gatewaytemplate:Gatewaytemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Gatewaytemplate resources.
type gatewaytemplateState struct {
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds []string                            `pulumi:"additionalConfigCmds"`
	BgpConfig            map[string]GatewaytemplateBgpConfig `pulumi:"bgpConfig"`
	DhcpdConfig          *GatewaytemplateDhcpdConfig         `pulumi:"dhcpdConfig"`
	DnsOverride          *bool                               `pulumi:"dnsOverride"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers []string `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes []string `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes map[string]GatewaytemplateExtraRoutes `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 map[string]GatewaytemplateExtraRoutes6 `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles map[string]GatewaytemplateIdpProfiles `pulumi:"idpProfiles"`
	// Property key is the network name
	IpConfigs   map[string]GatewaytemplateIpConfigs `pulumi:"ipConfigs"`
	Name        *string                             `pulumi:"name"`
	Networks    []GatewaytemplateNetwork            `pulumi:"networks"`
	NtpOverride *bool                               `pulumi:"ntpOverride"`
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers []string `pulumi:"ntpServers"`
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig *GatewaytemplateOobIpConfig `pulumi:"oobIpConfig"`
	OrgId       *string                     `pulumi:"orgId"`
	// Property key is the path name
	PathPreferences map[string]GatewaytemplatePathPreferences `pulumi:"pathPreferences"`
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig map[string]GatewaytemplatePortConfig `pulumi:"portConfig"`
	// auto assigned if not set
	RouterId *string `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies map[string]GatewaytemplateRoutingPolicies `pulumi:"routingPolicies"`
	ServicePolicies []GatewaytemplateServicePolicy            `pulumi:"servicePolicies"`
	// Property key is the tunnel name
	TunnelConfigs         map[string]GatewaytemplateTunnelConfigs `pulumi:"tunnelConfigs"`
	TunnelProviderOptions *GatewaytemplateTunnelProviderOptions   `pulumi:"tunnelProviderOptions"`
	// enum: `spoke`, `standalone`
	Type      *string                   `pulumi:"type"`
	VrfConfig *GatewaytemplateVrfConfig `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances map[string]GatewaytemplateVrfInstances `pulumi:"vrfInstances"`
}

type GatewaytemplateState struct {
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayInput
	BgpConfig            GatewaytemplateBgpConfigMapInput
	DhcpdConfig          GatewaytemplateDhcpdConfigPtrInput
	DnsOverride          pulumi.BoolPtrInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayInput
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes GatewaytemplateExtraRoutesMapInput
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 GatewaytemplateExtraRoutes6MapInput
	// Property key is the profile name
	IdpProfiles GatewaytemplateIdpProfilesMapInput
	// Property key is the network name
	IpConfigs   GatewaytemplateIpConfigsMapInput
	Name        pulumi.StringPtrInput
	Networks    GatewaytemplateNetworkArrayInput
	NtpOverride pulumi.BoolPtrInput
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayInput
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig GatewaytemplateOobIpConfigPtrInput
	OrgId       pulumi.StringPtrInput
	// Property key is the path name
	PathPreferences GatewaytemplatePathPreferencesMapInput
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig GatewaytemplatePortConfigMapInput
	// auto assigned if not set
	RouterId pulumi.StringPtrInput
	// Property key is the routing policy name
	RoutingPolicies GatewaytemplateRoutingPoliciesMapInput
	ServicePolicies GatewaytemplateServicePolicyArrayInput
	// Property key is the tunnel name
	TunnelConfigs         GatewaytemplateTunnelConfigsMapInput
	TunnelProviderOptions GatewaytemplateTunnelProviderOptionsPtrInput
	// enum: `spoke`, `standalone`
	Type      pulumi.StringPtrInput
	VrfConfig GatewaytemplateVrfConfigPtrInput
	// Property key is the network name
	VrfInstances GatewaytemplateVrfInstancesMapInput
}

func (GatewaytemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewaytemplateState)(nil)).Elem()
}

type gatewaytemplateArgs struct {
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds []string                            `pulumi:"additionalConfigCmds"`
	BgpConfig            map[string]GatewaytemplateBgpConfig `pulumi:"bgpConfig"`
	DhcpdConfig          *GatewaytemplateDhcpdConfig         `pulumi:"dhcpdConfig"`
	DnsOverride          *bool                               `pulumi:"dnsOverride"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers []string `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes []string `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes map[string]GatewaytemplateExtraRoutes `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 map[string]GatewaytemplateExtraRoutes6 `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles map[string]GatewaytemplateIdpProfiles `pulumi:"idpProfiles"`
	// Property key is the network name
	IpConfigs   map[string]GatewaytemplateIpConfigs `pulumi:"ipConfigs"`
	Name        *string                             `pulumi:"name"`
	Networks    []GatewaytemplateNetwork            `pulumi:"networks"`
	NtpOverride *bool                               `pulumi:"ntpOverride"`
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers []string `pulumi:"ntpServers"`
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig *GatewaytemplateOobIpConfig `pulumi:"oobIpConfig"`
	OrgId       string                      `pulumi:"orgId"`
	// Property key is the path name
	PathPreferences map[string]GatewaytemplatePathPreferences `pulumi:"pathPreferences"`
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig map[string]GatewaytemplatePortConfig `pulumi:"portConfig"`
	// auto assigned if not set
	RouterId *string `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies map[string]GatewaytemplateRoutingPolicies `pulumi:"routingPolicies"`
	ServicePolicies []GatewaytemplateServicePolicy            `pulumi:"servicePolicies"`
	// Property key is the tunnel name
	TunnelConfigs         map[string]GatewaytemplateTunnelConfigs `pulumi:"tunnelConfigs"`
	TunnelProviderOptions *GatewaytemplateTunnelProviderOptions   `pulumi:"tunnelProviderOptions"`
	// enum: `spoke`, `standalone`
	Type      *string                   `pulumi:"type"`
	VrfConfig *GatewaytemplateVrfConfig `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances map[string]GatewaytemplateVrfInstances `pulumi:"vrfInstances"`
}

// The set of arguments for constructing a Gatewaytemplate resource.
type GatewaytemplateArgs struct {
	// additional CLI commands to append to the generated Junos config **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayInput
	BgpConfig            GatewaytemplateBgpConfigMapInput
	DhcpdConfig          GatewaytemplateDhcpdConfigPtrInput
	DnsOverride          pulumi.BoolPtrInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayInput
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes GatewaytemplateExtraRoutesMapInput
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 GatewaytemplateExtraRoutes6MapInput
	// Property key is the profile name
	IdpProfiles GatewaytemplateIdpProfilesMapInput
	// Property key is the network name
	IpConfigs   GatewaytemplateIpConfigsMapInput
	Name        pulumi.StringPtrInput
	Networks    GatewaytemplateNetworkArrayInput
	NtpOverride pulumi.BoolPtrInput
	// list of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayInput
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig GatewaytemplateOobIpConfigPtrInput
	OrgId       pulumi.StringInput
	// Property key is the path name
	PathPreferences GatewaytemplatePathPreferencesMapInput
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig GatewaytemplatePortConfigMapInput
	// auto assigned if not set
	RouterId pulumi.StringPtrInput
	// Property key is the routing policy name
	RoutingPolicies GatewaytemplateRoutingPoliciesMapInput
	ServicePolicies GatewaytemplateServicePolicyArrayInput
	// Property key is the tunnel name
	TunnelConfigs         GatewaytemplateTunnelConfigsMapInput
	TunnelProviderOptions GatewaytemplateTunnelProviderOptionsPtrInput
	// enum: `spoke`, `standalone`
	Type      pulumi.StringPtrInput
	VrfConfig GatewaytemplateVrfConfigPtrInput
	// Property key is the network name
	VrfInstances GatewaytemplateVrfInstancesMapInput
}

func (GatewaytemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewaytemplateArgs)(nil)).Elem()
}

type GatewaytemplateInput interface {
	pulumi.Input

	ToGatewaytemplateOutput() GatewaytemplateOutput
	ToGatewaytemplateOutputWithContext(ctx context.Context) GatewaytemplateOutput
}

func (*Gatewaytemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**Gatewaytemplate)(nil)).Elem()
}

func (i *Gatewaytemplate) ToGatewaytemplateOutput() GatewaytemplateOutput {
	return i.ToGatewaytemplateOutputWithContext(context.Background())
}

func (i *Gatewaytemplate) ToGatewaytemplateOutputWithContext(ctx context.Context) GatewaytemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewaytemplateOutput)
}

// GatewaytemplateArrayInput is an input type that accepts GatewaytemplateArray and GatewaytemplateArrayOutput values.
// You can construct a concrete instance of `GatewaytemplateArrayInput` via:
//
//	GatewaytemplateArray{ GatewaytemplateArgs{...} }
type GatewaytemplateArrayInput interface {
	pulumi.Input

	ToGatewaytemplateArrayOutput() GatewaytemplateArrayOutput
	ToGatewaytemplateArrayOutputWithContext(context.Context) GatewaytemplateArrayOutput
}

type GatewaytemplateArray []GatewaytemplateInput

func (GatewaytemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gatewaytemplate)(nil)).Elem()
}

func (i GatewaytemplateArray) ToGatewaytemplateArrayOutput() GatewaytemplateArrayOutput {
	return i.ToGatewaytemplateArrayOutputWithContext(context.Background())
}

func (i GatewaytemplateArray) ToGatewaytemplateArrayOutputWithContext(ctx context.Context) GatewaytemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewaytemplateArrayOutput)
}

// GatewaytemplateMapInput is an input type that accepts GatewaytemplateMap and GatewaytemplateMapOutput values.
// You can construct a concrete instance of `GatewaytemplateMapInput` via:
//
//	GatewaytemplateMap{ "key": GatewaytemplateArgs{...} }
type GatewaytemplateMapInput interface {
	pulumi.Input

	ToGatewaytemplateMapOutput() GatewaytemplateMapOutput
	ToGatewaytemplateMapOutputWithContext(context.Context) GatewaytemplateMapOutput
}

type GatewaytemplateMap map[string]GatewaytemplateInput

func (GatewaytemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gatewaytemplate)(nil)).Elem()
}

func (i GatewaytemplateMap) ToGatewaytemplateMapOutput() GatewaytemplateMapOutput {
	return i.ToGatewaytemplateMapOutputWithContext(context.Background())
}

func (i GatewaytemplateMap) ToGatewaytemplateMapOutputWithContext(ctx context.Context) GatewaytemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewaytemplateMapOutput)
}

type GatewaytemplateOutput struct{ *pulumi.OutputState }

func (GatewaytemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Gatewaytemplate)(nil)).Elem()
}

func (o GatewaytemplateOutput) ToGatewaytemplateOutput() GatewaytemplateOutput {
	return o
}

func (o GatewaytemplateOutput) ToGatewaytemplateOutputWithContext(ctx context.Context) GatewaytemplateOutput {
	return o
}

// additional CLI commands to append to the generated Junos config **Note**: no check is done
func (o GatewaytemplateOutput) AdditionalConfigCmds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.StringArrayOutput { return v.AdditionalConfigCmds }).(pulumi.StringArrayOutput)
}

func (o GatewaytemplateOutput) BgpConfig() GatewaytemplateBgpConfigMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateBgpConfigMapOutput { return v.BgpConfig }).(GatewaytemplateBgpConfigMapOutput)
}

func (o GatewaytemplateOutput) DhcpdConfig() GatewaytemplateDhcpdConfigPtrOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateDhcpdConfigPtrOutput { return v.DhcpdConfig }).(GatewaytemplateDhcpdConfigPtrOutput)
}

func (o GatewaytemplateOutput) DnsOverride() pulumi.BoolOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.BoolOutput { return v.DnsOverride }).(pulumi.BoolOutput)
}

// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
func (o GatewaytemplateOutput) DnsServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.StringArrayOutput { return v.DnsServers }).(pulumi.StringArrayOutput)
}

// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
func (o GatewaytemplateOutput) DnsSuffixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.StringArrayOutput { return v.DnsSuffixes }).(pulumi.StringArrayOutput)
}

// Property key is the destination CIDR (e.g. "10.0.0.0/8")
func (o GatewaytemplateOutput) ExtraRoutes() GatewaytemplateExtraRoutesMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateExtraRoutesMapOutput { return v.ExtraRoutes }).(GatewaytemplateExtraRoutesMapOutput)
}

// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
func (o GatewaytemplateOutput) ExtraRoutes6() GatewaytemplateExtraRoutes6MapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateExtraRoutes6MapOutput { return v.ExtraRoutes6 }).(GatewaytemplateExtraRoutes6MapOutput)
}

// Property key is the profile name
func (o GatewaytemplateOutput) IdpProfiles() GatewaytemplateIdpProfilesMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateIdpProfilesMapOutput { return v.IdpProfiles }).(GatewaytemplateIdpProfilesMapOutput)
}

// Property key is the network name
func (o GatewaytemplateOutput) IpConfigs() GatewaytemplateIpConfigsMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateIpConfigsMapOutput { return v.IpConfigs }).(GatewaytemplateIpConfigsMapOutput)
}

func (o GatewaytemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o GatewaytemplateOutput) Networks() GatewaytemplateNetworkArrayOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateNetworkArrayOutput { return v.Networks }).(GatewaytemplateNetworkArrayOutput)
}

func (o GatewaytemplateOutput) NtpOverride() pulumi.BoolOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.BoolOutput { return v.NtpOverride }).(pulumi.BoolOutput)
}

// list of NTP servers specific to this device. By default, those in Site Settings will be used
func (o GatewaytemplateOutput) NtpServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.StringArrayOutput { return v.NtpServers }).(pulumi.StringArrayOutput)
}

// out-of-band (vme/em0/fxp0) IP config
func (o GatewaytemplateOutput) OobIpConfig() GatewaytemplateOobIpConfigPtrOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateOobIpConfigPtrOutput { return v.OobIpConfig }).(GatewaytemplateOobIpConfigPtrOutput)
}

func (o GatewaytemplateOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Property key is the path name
func (o GatewaytemplateOutput) PathPreferences() GatewaytemplatePathPreferencesMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplatePathPreferencesMapOutput { return v.PathPreferences }).(GatewaytemplatePathPreferencesMapOutput)
}

// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
func (o GatewaytemplateOutput) PortConfig() GatewaytemplatePortConfigMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplatePortConfigMapOutput { return v.PortConfig }).(GatewaytemplatePortConfigMapOutput)
}

// auto assigned if not set
func (o GatewaytemplateOutput) RouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.StringPtrOutput { return v.RouterId }).(pulumi.StringPtrOutput)
}

// Property key is the routing policy name
func (o GatewaytemplateOutput) RoutingPolicies() GatewaytemplateRoutingPoliciesMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateRoutingPoliciesMapOutput { return v.RoutingPolicies }).(GatewaytemplateRoutingPoliciesMapOutput)
}

func (o GatewaytemplateOutput) ServicePolicies() GatewaytemplateServicePolicyArrayOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateServicePolicyArrayOutput { return v.ServicePolicies }).(GatewaytemplateServicePolicyArrayOutput)
}

// Property key is the tunnel name
func (o GatewaytemplateOutput) TunnelConfigs() GatewaytemplateTunnelConfigsMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateTunnelConfigsMapOutput { return v.TunnelConfigs }).(GatewaytemplateTunnelConfigsMapOutput)
}

func (o GatewaytemplateOutput) TunnelProviderOptions() GatewaytemplateTunnelProviderOptionsPtrOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateTunnelProviderOptionsPtrOutput { return v.TunnelProviderOptions }).(GatewaytemplateTunnelProviderOptionsPtrOutput)
}

// enum: `spoke`, `standalone`
func (o GatewaytemplateOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Gatewaytemplate) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o GatewaytemplateOutput) VrfConfig() GatewaytemplateVrfConfigPtrOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateVrfConfigPtrOutput { return v.VrfConfig }).(GatewaytemplateVrfConfigPtrOutput)
}

// Property key is the network name
func (o GatewaytemplateOutput) VrfInstances() GatewaytemplateVrfInstancesMapOutput {
	return o.ApplyT(func(v *Gatewaytemplate) GatewaytemplateVrfInstancesMapOutput { return v.VrfInstances }).(GatewaytemplateVrfInstancesMapOutput)
}

type GatewaytemplateArrayOutput struct{ *pulumi.OutputState }

func (GatewaytemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gatewaytemplate)(nil)).Elem()
}

func (o GatewaytemplateArrayOutput) ToGatewaytemplateArrayOutput() GatewaytemplateArrayOutput {
	return o
}

func (o GatewaytemplateArrayOutput) ToGatewaytemplateArrayOutputWithContext(ctx context.Context) GatewaytemplateArrayOutput {
	return o
}

func (o GatewaytemplateArrayOutput) Index(i pulumi.IntInput) GatewaytemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Gatewaytemplate {
		return vs[0].([]*Gatewaytemplate)[vs[1].(int)]
	}).(GatewaytemplateOutput)
}

type GatewaytemplateMapOutput struct{ *pulumi.OutputState }

func (GatewaytemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gatewaytemplate)(nil)).Elem()
}

func (o GatewaytemplateMapOutput) ToGatewaytemplateMapOutput() GatewaytemplateMapOutput {
	return o
}

func (o GatewaytemplateMapOutput) ToGatewaytemplateMapOutputWithContext(ctx context.Context) GatewaytemplateMapOutput {
	return o
}

func (o GatewaytemplateMapOutput) MapIndex(k pulumi.StringInput) GatewaytemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Gatewaytemplate {
		return vs[0].(map[string]*Gatewaytemplate)[vs[1].(string)]
	}).(GatewaytemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewaytemplateInput)(nil)).Elem(), &Gatewaytemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewaytemplateArrayInput)(nil)).Elem(), GatewaytemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewaytemplateMapInput)(nil)).Elem(), GatewaytemplateMap{})
	pulumi.RegisterOutputType(GatewaytemplateOutput{})
	pulumi.RegisterOutputType(GatewaytemplateArrayOutput{})
	pulumi.RegisterOutputType(GatewaytemplateMapOutput{})
}