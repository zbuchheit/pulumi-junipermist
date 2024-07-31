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
    'GetServicesResult',
    'AwaitableGetServicesResult',
    'get_services',
    'get_services_output',
]

@pulumi.output_type
class GetServicesResult:
    """
    A collection of values returned by getServices.
    """
    def __init__(__self__, id=None, org_id=None, org_services=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_services and not isinstance(org_services, list):
            raise TypeError("Expected argument 'org_services' to be a list")
        pulumi.set(__self__, "org_services", org_services)

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
    @pulumi.getter(name="orgServices")
    def org_services(self) -> Sequence['outputs.GetServicesOrgServiceResult']:
        return pulumi.get(self, "org_services")


class AwaitableGetServicesResult(GetServicesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServicesResult(
            id=self.id,
            org_id=self.org_id,
            org_services=self.org_services)


def get_services(org_id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServicesResult:
    """
    This data source provides the list of WAN Assurance Services (Applications).The Services are used in the `service_policies` from the Gateway configuration and Gateway templates

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    services = junipermist.org.get_services(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getServices:getServices', __args__, opts=opts, typ=GetServicesResult).value

    return AwaitableGetServicesResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_services=pulumi.get(__ret__, 'org_services'))


@_utilities.lift_output_func(get_services)
def get_services_output(org_id: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServicesResult]:
    """
    This data source provides the list of WAN Assurance Services (Applications).The Services are used in the `service_policies` from the Gateway configuration and Gateway templates

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    services = junipermist.org.get_services(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    ...