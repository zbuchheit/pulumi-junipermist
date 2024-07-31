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
    'GetDeviceprofilesGatewayResult',
    'AwaitableGetDeviceprofilesGatewayResult',
    'get_deviceprofiles_gateway',
    'get_deviceprofiles_gateway_output',
]

@pulumi.output_type
class GetDeviceprofilesGatewayResult:
    """
    A collection of values returned by getDeviceprofilesGateway.
    """
    def __init__(__self__, deviceprofiles=None, id=None, org_id=None):
        if deviceprofiles and not isinstance(deviceprofiles, list):
            raise TypeError("Expected argument 'deviceprofiles' to be a list")
        pulumi.set(__self__, "deviceprofiles", deviceprofiles)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)

    @property
    @pulumi.getter
    def deviceprofiles(self) -> Sequence['outputs.GetDeviceprofilesGatewayDeviceprofileResult']:
        return pulumi.get(self, "deviceprofiles")

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


class AwaitableGetDeviceprofilesGatewayResult(GetDeviceprofilesGatewayResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeviceprofilesGatewayResult(
            deviceprofiles=self.deviceprofiles,
            id=self.id,
            org_id=self.org_id)


def get_deviceprofiles_gateway(org_id: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeviceprofilesGatewayResult:
    """
    This provides the list of Gateway Device Profiles (Hub Profile).A HUB profile is a configuration profile that automates the creation of overlay networks and defines the attributes of a hub device in a network. It includes settings for wan interfaces, lan interfaces, dns servers, traffic steering preferences, application policies, and routing options. HUB profiles are used to create consistent configurations for hub devices and ensure efficient connectivity between hubs and spokes in a network.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    deviceprofile = junipermist.org.get_deviceprofiles_gateway(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getDeviceprofilesGateway:getDeviceprofilesGateway', __args__, opts=opts, typ=GetDeviceprofilesGatewayResult).value

    return AwaitableGetDeviceprofilesGatewayResult(
        deviceprofiles=pulumi.get(__ret__, 'deviceprofiles'),
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'))


@_utilities.lift_output_func(get_deviceprofiles_gateway)
def get_deviceprofiles_gateway_output(org_id: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDeviceprofilesGatewayResult]:
    """
    This provides the list of Gateway Device Profiles (Hub Profile).A HUB profile is a configuration profile that automates the creation of overlay networks and defines the attributes of a hub device in a network. It includes settings for wan interfaces, lan interfaces, dns servers, traffic steering preferences, application policies, and routing options. HUB profiles are used to create consistent configurations for hub devices and ensure efficient connectivity between hubs and spokes in a network.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    deviceprofile = junipermist.org.get_deviceprofiles_gateway(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    ...