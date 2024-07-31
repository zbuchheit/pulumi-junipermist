// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of WAN Assurance Service Policies (Application Policiess).The Service Policies are used in the `servicepolicyPolicies` from the Gateway configuration and Gateway templates.They can be used to manage common policies betweeen multiples configurations
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
//			_, err := org.GetServicepolicies(ctx, &org.GetServicepoliciesArgs{
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
func GetServicepolicies(ctx *pulumi.Context, args *GetServicepoliciesArgs, opts ...pulumi.InvokeOption) (*GetServicepoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServicepoliciesResult
	err := ctx.Invoke("junipermist:org/getServicepolicies:getServicepolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServicepolicies.
type GetServicepoliciesArgs struct {
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getServicepolicies.
type GetServicepoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                 string                               `pulumi:"id"`
	OrgId              string                               `pulumi:"orgId"`
	OrgServicepolicies []GetServicepoliciesOrgServicepolicy `pulumi:"orgServicepolicies"`
}

func GetServicepoliciesOutput(ctx *pulumi.Context, args GetServicepoliciesOutputArgs, opts ...pulumi.InvokeOption) GetServicepoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServicepoliciesResult, error) {
			args := v.(GetServicepoliciesArgs)
			r, err := GetServicepolicies(ctx, &args, opts...)
			var s GetServicepoliciesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServicepoliciesResultOutput)
}

// A collection of arguments for invoking getServicepolicies.
type GetServicepoliciesOutputArgs struct {
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetServicepoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicepoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getServicepolicies.
type GetServicepoliciesResultOutput struct{ *pulumi.OutputState }

func (GetServicepoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicepoliciesResult)(nil)).Elem()
}

func (o GetServicepoliciesResultOutput) ToGetServicepoliciesResultOutput() GetServicepoliciesResultOutput {
	return o
}

func (o GetServicepoliciesResultOutput) ToGetServicepoliciesResultOutputWithContext(ctx context.Context) GetServicepoliciesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetServicepoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServicepoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServicepoliciesResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetServicepoliciesResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetServicepoliciesResultOutput) OrgServicepolicies() GetServicepoliciesOrgServicepolicyArrayOutput {
	return o.ApplyT(func(v GetServicepoliciesResult) []GetServicepoliciesOrgServicepolicy { return v.OrgServicepolicies }).(GetServicepoliciesOrgServicepolicyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServicepoliciesResultOutput{})
}