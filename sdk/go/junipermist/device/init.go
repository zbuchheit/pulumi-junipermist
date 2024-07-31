// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package device

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "junipermist:device/ap:Ap":
		r = &Ap{}
	case "junipermist:device/base:base":
		r = &Base{}
	case "junipermist:device/gateway:Gateway":
		r = &Gateway{}
	case "junipermist:device/gatewayCluster:GatewayCluster":
		r = &GatewayCluster{}
	case "junipermist:device/switch:Switch":
		r = &Switch{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"junipermist",
		"device/ap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"junipermist",
		"device/base",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"junipermist",
		"device/gateway",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"junipermist",
		"device/gatewayCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"junipermist",
		"device/switch",
		&module{version},
	)
}
