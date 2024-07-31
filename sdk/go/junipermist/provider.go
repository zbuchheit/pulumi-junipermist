// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package junipermist

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the mist package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// For API Token authentication, the Mist API Token.
	Apitoken pulumi.StringPtrOutput `pulumi:"apitoken"`
	// URL of the Mist Cloud, e.g. `api.mist.com`.
	Host pulumi.StringPtrOutput `pulumi:"host"`
	// For username/password authentication, the Mist Account password.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
	// `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
	// are supported.
	Proxy pulumi.StringPtrOutput `pulumi:"proxy"`
	// For username/password authentication, the Mist Account username.
	Username pulumi.StringPtrOutput `pulumi:"username"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.Apitoken != nil {
		args.Apitoken = pulumi.ToSecret(args.Apitoken).(pulumi.StringPtrInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apitoken",
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:junipermist", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Timeout in seconds for completing API transactions with the Mist Cloud. Omit for default value of 10 seconds. Value of 0
	// results in infinite timeout.
	ApiTimeout *float64 `pulumi:"apiTimeout"`
	// For API Token authentication, the Mist API Token.
	Apitoken *string `pulumi:"apitoken"`
	// URL of the Mist Cloud, e.g. `api.mist.com`.
	Host *string `pulumi:"host"`
	// For username/password authentication, the Mist Account password.
	Password *string `pulumi:"password"`
	// Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
	// `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
	// are supported.
	Proxy *string `pulumi:"proxy"`
	// For username/password authentication, the Mist Account username.
	Username *string `pulumi:"username"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Timeout in seconds for completing API transactions with the Mist Cloud. Omit for default value of 10 seconds. Value of 0
	// results in infinite timeout.
	ApiTimeout pulumi.Float64PtrInput
	// For API Token authentication, the Mist API Token.
	Apitoken pulumi.StringPtrInput
	// URL of the Mist Cloud, e.g. `api.mist.com`.
	Host pulumi.StringPtrInput
	// For username/password authentication, the Mist Account password.
	Password pulumi.StringPtrInput
	// Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
	// `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
	// are supported.
	Proxy pulumi.StringPtrInput
	// For username/password authentication, the Mist Account username.
	Username pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// For API Token authentication, the Mist API Token.
func (o ProviderOutput) Apitoken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Apitoken }).(pulumi.StringPtrOutput)
}

// URL of the Mist Cloud, e.g. `api.mist.com`.
func (o ProviderOutput) Host() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Host }).(pulumi.StringPtrOutput)
}

// For username/password authentication, the Mist Account password.
func (o ProviderOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
// `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
// are supported.
func (o ProviderOutput) Proxy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Proxy }).(pulumi.StringPtrOutput)
}

// For username/password authentication, the Mist Account username.
func (o ProviderOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}