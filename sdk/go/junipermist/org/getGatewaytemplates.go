// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of Gateway Templates.A Gateway template can be used to define generic gateway configuration at the org level andbe applied to one or multiple Sites. It works like a blueprint of the network of the site.
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
//			_, err := org.GetGatewaytemplates(ctx, &org.GetGatewaytemplatesArgs{
//				OrgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGatewaytemplates(ctx *pulumi.Context, args *GetGatewaytemplatesArgs, opts ...pulumi.InvokeOption) (*GetGatewaytemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewaytemplatesResult
	err := ctx.Invoke("junipermist:org/getGatewaytemplates:getGatewaytemplates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGatewaytemplates.
type GetGatewaytemplatesArgs struct {
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getGatewaytemplates.
type GetGatewaytemplatesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                  string                                  `pulumi:"id"`
	OrgGatewaytemplates []GetGatewaytemplatesOrgGatewaytemplate `pulumi:"orgGatewaytemplates"`
	OrgId               string                                  `pulumi:"orgId"`
}

func GetGatewaytemplatesOutput(ctx *pulumi.Context, args GetGatewaytemplatesOutputArgs, opts ...pulumi.InvokeOption) GetGatewaytemplatesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGatewaytemplatesResult, error) {
			args := v.(GetGatewaytemplatesArgs)
			r, err := GetGatewaytemplates(ctx, &args, opts...)
			var s GetGatewaytemplatesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGatewaytemplatesResultOutput)
}

// A collection of arguments for invoking getGatewaytemplates.
type GetGatewaytemplatesOutputArgs struct {
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetGatewaytemplatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaytemplatesArgs)(nil)).Elem()
}

// A collection of values returned by getGatewaytemplates.
type GetGatewaytemplatesResultOutput struct{ *pulumi.OutputState }

func (GetGatewaytemplatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaytemplatesResult)(nil)).Elem()
}

func (o GetGatewaytemplatesResultOutput) ToGetGatewaytemplatesResultOutput() GetGatewaytemplatesResultOutput {
	return o
}

func (o GetGatewaytemplatesResultOutput) ToGetGatewaytemplatesResultOutputWithContext(ctx context.Context) GetGatewaytemplatesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetGatewaytemplatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewaytemplatesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGatewaytemplatesResultOutput) OrgGatewaytemplates() GetGatewaytemplatesOrgGatewaytemplateArrayOutput {
	return o.ApplyT(func(v GetGatewaytemplatesResult) []GetGatewaytemplatesOrgGatewaytemplate {
		return v.OrgGatewaytemplates
	}).(GetGatewaytemplatesOrgGatewaytemplateArrayOutput)
}

func (o GetGatewaytemplatesResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewaytemplatesResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewaytemplatesResultOutput{})
}