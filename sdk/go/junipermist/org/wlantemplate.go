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

// This resource manages the Org WLAN Templates.A WLAN template is a collection of WLANs, tunneling policies, and wxlan policies. It is used to create and manage wlan configurations at an organizational level. WLAN templates allow for modular, scalable, and easy-to-manage configuration of ssids and their application to specific sites, site groups, or ap device profiles. They are valuable for automating configuration across multiple sites and profiles, making it easier to scale efficiently.
type Wlantemplate struct {
	pulumi.CustomResourceState

	// where this template should be applied to, can be org*id, site*ids, sitegroup_ids
	Applies WlantemplateAppliesOutput `pulumi:"applies"`
	// list of Device Profile ids
	DeviceprofileIds pulumi.StringArrayOutput `pulumi:"deviceprofileIds"`
	// where this template should not be applied to (takes precedence)
	Exceptions WlantemplateExceptionsOutput `pulumi:"exceptions"`
	// whether to further filter by Device Profile
	FilterByDeviceprofile pulumi.BoolOutput   `pulumi:"filterByDeviceprofile"`
	Name                  pulumi.StringOutput `pulumi:"name"`
	OrgId                 pulumi.StringOutput `pulumi:"orgId"`
}

// NewWlantemplate registers a new resource with the given unique name, arguments, and options.
func NewWlantemplate(ctx *pulumi.Context,
	name string, args *WlantemplateArgs, opts ...pulumi.ResourceOption) (*Wlantemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Wlantemplate
	err := ctx.RegisterResource("junipermist:org/wlantemplate:Wlantemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWlantemplate gets an existing Wlantemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWlantemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WlantemplateState, opts ...pulumi.ResourceOption) (*Wlantemplate, error) {
	var resource Wlantemplate
	err := ctx.ReadResource("junipermist:org/wlantemplate:Wlantemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Wlantemplate resources.
type wlantemplateState struct {
	// where this template should be applied to, can be org*id, site*ids, sitegroup_ids
	Applies *WlantemplateApplies `pulumi:"applies"`
	// list of Device Profile ids
	DeviceprofileIds []string `pulumi:"deviceprofileIds"`
	// where this template should not be applied to (takes precedence)
	Exceptions *WlantemplateExceptions `pulumi:"exceptions"`
	// whether to further filter by Device Profile
	FilterByDeviceprofile *bool   `pulumi:"filterByDeviceprofile"`
	Name                  *string `pulumi:"name"`
	OrgId                 *string `pulumi:"orgId"`
}

type WlantemplateState struct {
	// where this template should be applied to, can be org*id, site*ids, sitegroup_ids
	Applies WlantemplateAppliesPtrInput
	// list of Device Profile ids
	DeviceprofileIds pulumi.StringArrayInput
	// where this template should not be applied to (takes precedence)
	Exceptions WlantemplateExceptionsPtrInput
	// whether to further filter by Device Profile
	FilterByDeviceprofile pulumi.BoolPtrInput
	Name                  pulumi.StringPtrInput
	OrgId                 pulumi.StringPtrInput
}

func (WlantemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*wlantemplateState)(nil)).Elem()
}

type wlantemplateArgs struct {
	// where this template should be applied to, can be org*id, site*ids, sitegroup_ids
	Applies *WlantemplateApplies `pulumi:"applies"`
	// list of Device Profile ids
	DeviceprofileIds []string `pulumi:"deviceprofileIds"`
	// where this template should not be applied to (takes precedence)
	Exceptions *WlantemplateExceptions `pulumi:"exceptions"`
	// whether to further filter by Device Profile
	FilterByDeviceprofile *bool   `pulumi:"filterByDeviceprofile"`
	Name                  *string `pulumi:"name"`
	OrgId                 string  `pulumi:"orgId"`
}

// The set of arguments for constructing a Wlantemplate resource.
type WlantemplateArgs struct {
	// where this template should be applied to, can be org*id, site*ids, sitegroup_ids
	Applies WlantemplateAppliesPtrInput
	// list of Device Profile ids
	DeviceprofileIds pulumi.StringArrayInput
	// where this template should not be applied to (takes precedence)
	Exceptions WlantemplateExceptionsPtrInput
	// whether to further filter by Device Profile
	FilterByDeviceprofile pulumi.BoolPtrInput
	Name                  pulumi.StringPtrInput
	OrgId                 pulumi.StringInput
}

func (WlantemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wlantemplateArgs)(nil)).Elem()
}

type WlantemplateInput interface {
	pulumi.Input

	ToWlantemplateOutput() WlantemplateOutput
	ToWlantemplateOutputWithContext(ctx context.Context) WlantemplateOutput
}

func (*Wlantemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**Wlantemplate)(nil)).Elem()
}

func (i *Wlantemplate) ToWlantemplateOutput() WlantemplateOutput {
	return i.ToWlantemplateOutputWithContext(context.Background())
}

func (i *Wlantemplate) ToWlantemplateOutputWithContext(ctx context.Context) WlantemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlantemplateOutput)
}

// WlantemplateArrayInput is an input type that accepts WlantemplateArray and WlantemplateArrayOutput values.
// You can construct a concrete instance of `WlantemplateArrayInput` via:
//
//	WlantemplateArray{ WlantemplateArgs{...} }
type WlantemplateArrayInput interface {
	pulumi.Input

	ToWlantemplateArrayOutput() WlantemplateArrayOutput
	ToWlantemplateArrayOutputWithContext(context.Context) WlantemplateArrayOutput
}

type WlantemplateArray []WlantemplateInput

func (WlantemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Wlantemplate)(nil)).Elem()
}

func (i WlantemplateArray) ToWlantemplateArrayOutput() WlantemplateArrayOutput {
	return i.ToWlantemplateArrayOutputWithContext(context.Background())
}

func (i WlantemplateArray) ToWlantemplateArrayOutputWithContext(ctx context.Context) WlantemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlantemplateArrayOutput)
}

// WlantemplateMapInput is an input type that accepts WlantemplateMap and WlantemplateMapOutput values.
// You can construct a concrete instance of `WlantemplateMapInput` via:
//
//	WlantemplateMap{ "key": WlantemplateArgs{...} }
type WlantemplateMapInput interface {
	pulumi.Input

	ToWlantemplateMapOutput() WlantemplateMapOutput
	ToWlantemplateMapOutputWithContext(context.Context) WlantemplateMapOutput
}

type WlantemplateMap map[string]WlantemplateInput

func (WlantemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Wlantemplate)(nil)).Elem()
}

func (i WlantemplateMap) ToWlantemplateMapOutput() WlantemplateMapOutput {
	return i.ToWlantemplateMapOutputWithContext(context.Background())
}

func (i WlantemplateMap) ToWlantemplateMapOutputWithContext(ctx context.Context) WlantemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlantemplateMapOutput)
}

type WlantemplateOutput struct{ *pulumi.OutputState }

func (WlantemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Wlantemplate)(nil)).Elem()
}

func (o WlantemplateOutput) ToWlantemplateOutput() WlantemplateOutput {
	return o
}

func (o WlantemplateOutput) ToWlantemplateOutputWithContext(ctx context.Context) WlantemplateOutput {
	return o
}

// where this template should be applied to, can be org*id, site*ids, sitegroup_ids
func (o WlantemplateOutput) Applies() WlantemplateAppliesOutput {
	return o.ApplyT(func(v *Wlantemplate) WlantemplateAppliesOutput { return v.Applies }).(WlantemplateAppliesOutput)
}

// list of Device Profile ids
func (o WlantemplateOutput) DeviceprofileIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Wlantemplate) pulumi.StringArrayOutput { return v.DeviceprofileIds }).(pulumi.StringArrayOutput)
}

// where this template should not be applied to (takes precedence)
func (o WlantemplateOutput) Exceptions() WlantemplateExceptionsOutput {
	return o.ApplyT(func(v *Wlantemplate) WlantemplateExceptionsOutput { return v.Exceptions }).(WlantemplateExceptionsOutput)
}

// whether to further filter by Device Profile
func (o WlantemplateOutput) FilterByDeviceprofile() pulumi.BoolOutput {
	return o.ApplyT(func(v *Wlantemplate) pulumi.BoolOutput { return v.FilterByDeviceprofile }).(pulumi.BoolOutput)
}

func (o WlantemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Wlantemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o WlantemplateOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Wlantemplate) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

type WlantemplateArrayOutput struct{ *pulumi.OutputState }

func (WlantemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Wlantemplate)(nil)).Elem()
}

func (o WlantemplateArrayOutput) ToWlantemplateArrayOutput() WlantemplateArrayOutput {
	return o
}

func (o WlantemplateArrayOutput) ToWlantemplateArrayOutputWithContext(ctx context.Context) WlantemplateArrayOutput {
	return o
}

func (o WlantemplateArrayOutput) Index(i pulumi.IntInput) WlantemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Wlantemplate {
		return vs[0].([]*Wlantemplate)[vs[1].(int)]
	}).(WlantemplateOutput)
}

type WlantemplateMapOutput struct{ *pulumi.OutputState }

func (WlantemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Wlantemplate)(nil)).Elem()
}

func (o WlantemplateMapOutput) ToWlantemplateMapOutput() WlantemplateMapOutput {
	return o
}

func (o WlantemplateMapOutput) ToWlantemplateMapOutputWithContext(ctx context.Context) WlantemplateMapOutput {
	return o
}

func (o WlantemplateMapOutput) MapIndex(k pulumi.StringInput) WlantemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Wlantemplate {
		return vs[0].(map[string]*Wlantemplate)[vs[1].(string)]
	}).(WlantemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WlantemplateInput)(nil)).Elem(), &Wlantemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*WlantemplateArrayInput)(nil)).Elem(), WlantemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WlantemplateMapInput)(nil)).Elem(), WlantemplateMap{})
	pulumi.RegisterOutputType(WlantemplateOutput{})
	pulumi.RegisterOutputType(WlantemplateArrayOutput{})
	pulumi.RegisterOutputType(WlantemplateMapOutput{})
}