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

__all__ = [
    'GetVpnsResult',
    'AwaitableGetVpnsResult',
    'get_vpns',
    'get_vpns_output',
]

@pulumi.output_type
class GetVpnsResult:
    """
    A collection of values returned by getVpns.
    """
    def __init__(__self__, id=None, org_id=None, org_vpns=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_vpns and not isinstance(org_vpns, list):
            raise TypeError("Expected argument 'org_vpns' to be a list")
        pulumi.set(__self__, "org_vpns", org_vpns)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="orgVpns")
    def org_vpns(self) -> Sequence['outputs.GetVpnsOrgVpnResult']:
        return pulumi.get(self, "org_vpns")


class AwaitableGetVpnsResult(GetVpnsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpnsResult(
            id=self.id,
            org_id=self.org_id,
            org_vpns=self.org_vpns)


def get_vpns(org_id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpnsResult:
    """
    This data source provide the list of the Org VPNs.
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getVpns:getVpns', __args__, opts=opts, typ=GetVpnsResult).value

    return AwaitableGetVpnsResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_vpns=pulumi.get(__ret__, 'org_vpns'))


@_utilities.lift_output_func(get_vpns)
def get_vpns_output(org_id: Optional[pulumi.Input[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpnsResult]:
    """
    This data source provide the list of the Org VPNs.
    """
    ...
