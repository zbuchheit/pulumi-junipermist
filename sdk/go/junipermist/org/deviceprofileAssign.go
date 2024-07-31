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

// This resourceis used to assign/unassign a device profile to one or multiple devicesThe `org.DeviceprofileGateway` resource can be assigned to GatewaysThe `org.DeviceprofileAp` resource can be assigned the Wireless Access Points
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/org"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := org.NewDeviceprofileAssign(ctx, "deviceprofile_assign", &org.DeviceprofileAssignArgs{
//				OrgId:           pulumi.Any(terraformTest.Id),
//				DeviceprofileId: pulumi.Any(hubOne.Id),
//				Macs: pulumi.StringArray{
//					pulumi.String("4c9614000000"),
//					pulumi.String("4c9614000001"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type DeviceprofileAssign struct {
	pulumi.CustomResourceState

	DeviceprofileId pulumi.StringOutput      `pulumi:"deviceprofileId"`
	Macs            pulumi.StringArrayOutput `pulumi:"macs"`
	OrgId           pulumi.StringOutput      `pulumi:"orgId"`
}

// NewDeviceprofileAssign registers a new resource with the given unique name, arguments, and options.
func NewDeviceprofileAssign(ctx *pulumi.Context,
	name string, args *DeviceprofileAssignArgs, opts ...pulumi.ResourceOption) (*DeviceprofileAssign, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeviceprofileId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceprofileId'")
	}
	if args.Macs == nil {
		return nil, errors.New("invalid value for required argument 'Macs'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DeviceprofileAssign
	err := ctx.RegisterResource("junipermist:org/deviceprofileAssign:DeviceprofileAssign", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeviceprofileAssign gets an existing DeviceprofileAssign resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeviceprofileAssign(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeviceprofileAssignState, opts ...pulumi.ResourceOption) (*DeviceprofileAssign, error) {
	var resource DeviceprofileAssign
	err := ctx.ReadResource("junipermist:org/deviceprofileAssign:DeviceprofileAssign", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeviceprofileAssign resources.
type deviceprofileAssignState struct {
	DeviceprofileId *string  `pulumi:"deviceprofileId"`
	Macs            []string `pulumi:"macs"`
	OrgId           *string  `pulumi:"orgId"`
}

type DeviceprofileAssignState struct {
	DeviceprofileId pulumi.StringPtrInput
	Macs            pulumi.StringArrayInput
	OrgId           pulumi.StringPtrInput
}

func (DeviceprofileAssignState) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceprofileAssignState)(nil)).Elem()
}

type deviceprofileAssignArgs struct {
	DeviceprofileId string   `pulumi:"deviceprofileId"`
	Macs            []string `pulumi:"macs"`
	OrgId           string   `pulumi:"orgId"`
}

// The set of arguments for constructing a DeviceprofileAssign resource.
type DeviceprofileAssignArgs struct {
	DeviceprofileId pulumi.StringInput
	Macs            pulumi.StringArrayInput
	OrgId           pulumi.StringInput
}

func (DeviceprofileAssignArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceprofileAssignArgs)(nil)).Elem()
}

type DeviceprofileAssignInput interface {
	pulumi.Input

	ToDeviceprofileAssignOutput() DeviceprofileAssignOutput
	ToDeviceprofileAssignOutputWithContext(ctx context.Context) DeviceprofileAssignOutput
}

func (*DeviceprofileAssign) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceprofileAssign)(nil)).Elem()
}

func (i *DeviceprofileAssign) ToDeviceprofileAssignOutput() DeviceprofileAssignOutput {
	return i.ToDeviceprofileAssignOutputWithContext(context.Background())
}

func (i *DeviceprofileAssign) ToDeviceprofileAssignOutputWithContext(ctx context.Context) DeviceprofileAssignOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileAssignOutput)
}

// DeviceprofileAssignArrayInput is an input type that accepts DeviceprofileAssignArray and DeviceprofileAssignArrayOutput values.
// You can construct a concrete instance of `DeviceprofileAssignArrayInput` via:
//
//	DeviceprofileAssignArray{ DeviceprofileAssignArgs{...} }
type DeviceprofileAssignArrayInput interface {
	pulumi.Input

	ToDeviceprofileAssignArrayOutput() DeviceprofileAssignArrayOutput
	ToDeviceprofileAssignArrayOutputWithContext(context.Context) DeviceprofileAssignArrayOutput
}

type DeviceprofileAssignArray []DeviceprofileAssignInput

func (DeviceprofileAssignArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceprofileAssign)(nil)).Elem()
}

func (i DeviceprofileAssignArray) ToDeviceprofileAssignArrayOutput() DeviceprofileAssignArrayOutput {
	return i.ToDeviceprofileAssignArrayOutputWithContext(context.Background())
}

func (i DeviceprofileAssignArray) ToDeviceprofileAssignArrayOutputWithContext(ctx context.Context) DeviceprofileAssignArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileAssignArrayOutput)
}

// DeviceprofileAssignMapInput is an input type that accepts DeviceprofileAssignMap and DeviceprofileAssignMapOutput values.
// You can construct a concrete instance of `DeviceprofileAssignMapInput` via:
//
//	DeviceprofileAssignMap{ "key": DeviceprofileAssignArgs{...} }
type DeviceprofileAssignMapInput interface {
	pulumi.Input

	ToDeviceprofileAssignMapOutput() DeviceprofileAssignMapOutput
	ToDeviceprofileAssignMapOutputWithContext(context.Context) DeviceprofileAssignMapOutput
}

type DeviceprofileAssignMap map[string]DeviceprofileAssignInput

func (DeviceprofileAssignMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceprofileAssign)(nil)).Elem()
}

func (i DeviceprofileAssignMap) ToDeviceprofileAssignMapOutput() DeviceprofileAssignMapOutput {
	return i.ToDeviceprofileAssignMapOutputWithContext(context.Background())
}

func (i DeviceprofileAssignMap) ToDeviceprofileAssignMapOutputWithContext(ctx context.Context) DeviceprofileAssignMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileAssignMapOutput)
}

type DeviceprofileAssignOutput struct{ *pulumi.OutputState }

func (DeviceprofileAssignOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceprofileAssign)(nil)).Elem()
}

func (o DeviceprofileAssignOutput) ToDeviceprofileAssignOutput() DeviceprofileAssignOutput {
	return o
}

func (o DeviceprofileAssignOutput) ToDeviceprofileAssignOutputWithContext(ctx context.Context) DeviceprofileAssignOutput {
	return o
}

func (o DeviceprofileAssignOutput) DeviceprofileId() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceprofileAssign) pulumi.StringOutput { return v.DeviceprofileId }).(pulumi.StringOutput)
}

func (o DeviceprofileAssignOutput) Macs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DeviceprofileAssign) pulumi.StringArrayOutput { return v.Macs }).(pulumi.StringArrayOutput)
}

func (o DeviceprofileAssignOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceprofileAssign) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

type DeviceprofileAssignArrayOutput struct{ *pulumi.OutputState }

func (DeviceprofileAssignArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceprofileAssign)(nil)).Elem()
}

func (o DeviceprofileAssignArrayOutput) ToDeviceprofileAssignArrayOutput() DeviceprofileAssignArrayOutput {
	return o
}

func (o DeviceprofileAssignArrayOutput) ToDeviceprofileAssignArrayOutputWithContext(ctx context.Context) DeviceprofileAssignArrayOutput {
	return o
}

func (o DeviceprofileAssignArrayOutput) Index(i pulumi.IntInput) DeviceprofileAssignOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeviceprofileAssign {
		return vs[0].([]*DeviceprofileAssign)[vs[1].(int)]
	}).(DeviceprofileAssignOutput)
}

type DeviceprofileAssignMapOutput struct{ *pulumi.OutputState }

func (DeviceprofileAssignMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceprofileAssign)(nil)).Elem()
}

func (o DeviceprofileAssignMapOutput) ToDeviceprofileAssignMapOutput() DeviceprofileAssignMapOutput {
	return o
}

func (o DeviceprofileAssignMapOutput) ToDeviceprofileAssignMapOutputWithContext(ctx context.Context) DeviceprofileAssignMapOutput {
	return o
}

func (o DeviceprofileAssignMapOutput) MapIndex(k pulumi.StringInput) DeviceprofileAssignOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeviceprofileAssign {
		return vs[0].(map[string]*DeviceprofileAssign)[vs[1].(string)]
	}).(DeviceprofileAssignOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileAssignInput)(nil)).Elem(), &DeviceprofileAssign{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileAssignArrayInput)(nil)).Elem(), DeviceprofileAssignArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileAssignMapInput)(nil)).Elem(), DeviceprofileAssignMap{})
	pulumi.RegisterOutputType(DeviceprofileAssignOutput{})
	pulumi.RegisterOutputType(DeviceprofileAssignArrayOutput{})
	pulumi.RegisterOutputType(DeviceprofileAssignMapOutput{})
}
