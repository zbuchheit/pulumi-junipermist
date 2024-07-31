# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['GatewayClusterArgs', 'GatewayCluster']

@pulumi.input_type
class GatewayClusterArgs:
    def __init__(__self__, *,
                 device_id: pulumi.Input[str],
                 nodes: pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]],
                 site_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a GatewayCluster resource.
        """
        pulumi.set(__self__, "device_id", device_id)
        pulumi.set(__self__, "nodes", nodes)
        pulumi.set(__self__, "site_id", site_id)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "device_id")

    @device_id.setter
    def device_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "device_id", value)

    @property
    @pulumi.getter
    def nodes(self) -> pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]:
        return pulumi.get(self, "nodes")

    @nodes.setter
    def nodes(self, value: pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]):
        pulumi.set(self, "nodes", value)

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "site_id", value)


@pulumi.input_type
class _GatewayClusterState:
    def __init__(__self__, *,
                 device_id: Optional[pulumi.Input[str]] = None,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]] = None,
                 site_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GatewayCluster resources.
        """
        if device_id is not None:
            pulumi.set(__self__, "device_id", device_id)
        if nodes is not None:
            pulumi.set(__self__, "nodes", nodes)
        if site_id is not None:
            pulumi.set(__self__, "site_id", site_id)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "device_id")

    @device_id.setter
    def device_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_id", value)

    @property
    @pulumi.getter
    def nodes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]]:
        return pulumi.get(self, "nodes")

    @nodes.setter
    def nodes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]]):
        pulumi.set(self, "nodes", value)

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "site_id", value)


class GatewayCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_id: Optional[pulumi.Input[str]] = None,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GatewayClusterNodeArgs']]]]] = None,
                 site_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource manages the Gateway Clusters.It can be used to form or unset a cluster with two Gateways assigned to the same site.Please check the Juniper Documentation first to validate the cabling between the Gateways

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        cluster_one = junipermist.device.GatewayCluster("cluster_one",
            site_id=terraform_site2["id"],
            device_id="00000000-0000-0000-1000-4c96143de700",
            nodes=[
                junipermist.device.GatewayClusterNodeArgs(
                    mac="4c961000000",
                ),
                junipermist.device.GatewayClusterNodeArgs(
                    mac="4c961000001",
                ),
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the Gateway Clusters.It can be used to form or unset a cluster with two Gateways assigned to the same site.Please check the Juniper Documentation first to validate the cabling between the Gateways

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        cluster_one = junipermist.device.GatewayCluster("cluster_one",
            site_id=terraform_site2["id"],
            device_id="00000000-0000-0000-1000-4c96143de700",
            nodes=[
                junipermist.device.GatewayClusterNodeArgs(
                    mac="4c961000000",
                ),
                junipermist.device.GatewayClusterNodeArgs(
                    mac="4c961000001",
                ),
            ])
        ```

        :param str resource_name: The name of the resource.
        :param GatewayClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_id: Optional[pulumi.Input[str]] = None,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GatewayClusterNodeArgs']]]]] = None,
                 site_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewayClusterArgs.__new__(GatewayClusterArgs)

            if device_id is None and not opts.urn:
                raise TypeError("Missing required property 'device_id'")
            __props__.__dict__["device_id"] = device_id
            if nodes is None and not opts.urn:
                raise TypeError("Missing required property 'nodes'")
            __props__.__dict__["nodes"] = nodes
            if site_id is None and not opts.urn:
                raise TypeError("Missing required property 'site_id'")
            __props__.__dict__["site_id"] = site_id
        super(GatewayCluster, __self__).__init__(
            'junipermist:device/gatewayCluster:GatewayCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device_id: Optional[pulumi.Input[str]] = None,
            nodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GatewayClusterNodeArgs']]]]] = None,
            site_id: Optional[pulumi.Input[str]] = None) -> 'GatewayCluster':
        """
        Get an existing GatewayCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewayClusterState.__new__(_GatewayClusterState)

        __props__.__dict__["device_id"] = device_id
        __props__.__dict__["nodes"] = nodes
        __props__.__dict__["site_id"] = site_id
        return GatewayCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "device_id")

    @property
    @pulumi.getter
    def nodes(self) -> pulumi.Output[Sequence['outputs.GatewayClusterNode']]:
        return pulumi.get(self, "nodes")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "site_id")

