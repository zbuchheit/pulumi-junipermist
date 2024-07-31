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

__all__ = ['BaseArgs', 'Base']

@pulumi.input_type
class BaseArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 org_id: pulumi.Input[str],
                 alarmtemplate_id: Optional[pulumi.Input[str]] = None,
                 aptemplate_id: Optional[pulumi.Input[str]] = None,
                 country_code: Optional[pulumi.Input[str]] = None,
                 gatewaytemplate_id: Optional[pulumi.Input[str]] = None,
                 latlng: Optional[pulumi.Input['BaseLatlngArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networktemplate_id: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 rftemplate_id: Optional[pulumi.Input[str]] = None,
                 secpolicy_id: Optional[pulumi.Input[str]] = None,
                 sitegroup_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 sitetemplate_id: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Base resource.
        :param pulumi.Input[str] address: full address of the site
        :param pulumi.Input[str] alarmtemplate_id: Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        :param pulumi.Input[str] aptemplate_id: AP Template ID, used by APs
        :param pulumi.Input[str] country_code: country code for the site (for AP config generation), in two-character
        :param pulumi.Input[str] gatewaytemplate_id: Gateway Template ID, used by gateways
        :param pulumi.Input[str] networktemplate_id: Network Template ID, this takes precedence over Site Settings
        :param pulumi.Input[str] notes: optional, any notes about the site
        :param pulumi.Input[str] rftemplate_id: RF Template ID, this takes precedence over Site Settings
        :param pulumi.Input[str] secpolicy_id: SecPolicy ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] sitegroup_ids: sitegroups this site belongs to
        :param pulumi.Input[str] sitetemplate_id: Site Template ID
        :param pulumi.Input[str] timezone: Timezone the site is at
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "org_id", org_id)
        if alarmtemplate_id is not None:
            pulumi.set(__self__, "alarmtemplate_id", alarmtemplate_id)
        if aptemplate_id is not None:
            pulumi.set(__self__, "aptemplate_id", aptemplate_id)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if gatewaytemplate_id is not None:
            pulumi.set(__self__, "gatewaytemplate_id", gatewaytemplate_id)
        if latlng is not None:
            pulumi.set(__self__, "latlng", latlng)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networktemplate_id is not None:
            pulumi.set(__self__, "networktemplate_id", networktemplate_id)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)
        if rftemplate_id is not None:
            pulumi.set(__self__, "rftemplate_id", rftemplate_id)
        if secpolicy_id is not None:
            pulumi.set(__self__, "secpolicy_id", secpolicy_id)
        if sitegroup_ids is not None:
            pulumi.set(__self__, "sitegroup_ids", sitegroup_ids)
        if sitetemplate_id is not None:
            pulumi.set(__self__, "sitetemplate_id", sitetemplate_id)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        full address of the site
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="alarmtemplateId")
    def alarmtemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        """
        return pulumi.get(self, "alarmtemplate_id")

    @alarmtemplate_id.setter
    def alarmtemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alarmtemplate_id", value)

    @property
    @pulumi.getter(name="aptemplateId")
    def aptemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        AP Template ID, used by APs
        """
        return pulumi.get(self, "aptemplate_id")

    @aptemplate_id.setter
    def aptemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aptemplate_id", value)

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[str]]:
        """
        country code for the site (for AP config generation), in two-character
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "country_code", value)

    @property
    @pulumi.getter(name="gatewaytemplateId")
    def gatewaytemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        Gateway Template ID, used by gateways
        """
        return pulumi.get(self, "gatewaytemplate_id")

    @gatewaytemplate_id.setter
    def gatewaytemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gatewaytemplate_id", value)

    @property
    @pulumi.getter
    def latlng(self) -> Optional[pulumi.Input['BaseLatlngArgs']]:
        return pulumi.get(self, "latlng")

    @latlng.setter
    def latlng(self, value: Optional[pulumi.Input['BaseLatlngArgs']]):
        pulumi.set(self, "latlng", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="networktemplateId")
    def networktemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        Network Template ID, this takes precedence over Site Settings
        """
        return pulumi.get(self, "networktemplate_id")

    @networktemplate_id.setter
    def networktemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "networktemplate_id", value)

    @property
    @pulumi.getter
    def notes(self) -> Optional[pulumi.Input[str]]:
        """
        optional, any notes about the site
        """
        return pulumi.get(self, "notes")

    @notes.setter
    def notes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notes", value)

    @property
    @pulumi.getter(name="rftemplateId")
    def rftemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        RF Template ID, this takes precedence over Site Settings
        """
        return pulumi.get(self, "rftemplate_id")

    @rftemplate_id.setter
    def rftemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rftemplate_id", value)

    @property
    @pulumi.getter(name="secpolicyId")
    def secpolicy_id(self) -> Optional[pulumi.Input[str]]:
        """
        SecPolicy ID
        """
        return pulumi.get(self, "secpolicy_id")

    @secpolicy_id.setter
    def secpolicy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secpolicy_id", value)

    @property
    @pulumi.getter(name="sitegroupIds")
    def sitegroup_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        sitegroups this site belongs to
        """
        return pulumi.get(self, "sitegroup_ids")

    @sitegroup_ids.setter
    def sitegroup_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "sitegroup_ids", value)

    @property
    @pulumi.getter(name="sitetemplateId")
    def sitetemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        Site Template ID
        """
        return pulumi.get(self, "sitetemplate_id")

    @sitetemplate_id.setter
    def sitetemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sitetemplate_id", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Timezone the site is at
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)


@pulumi.input_type
class _BaseState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 alarmtemplate_id: Optional[pulumi.Input[str]] = None,
                 aptemplate_id: Optional[pulumi.Input[str]] = None,
                 country_code: Optional[pulumi.Input[str]] = None,
                 gatewaytemplate_id: Optional[pulumi.Input[str]] = None,
                 latlng: Optional[pulumi.Input['BaseLatlngArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networktemplate_id: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 rftemplate_id: Optional[pulumi.Input[str]] = None,
                 secpolicy_id: Optional[pulumi.Input[str]] = None,
                 sitegroup_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 sitetemplate_id: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Base resources.
        :param pulumi.Input[str] address: full address of the site
        :param pulumi.Input[str] alarmtemplate_id: Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        :param pulumi.Input[str] aptemplate_id: AP Template ID, used by APs
        :param pulumi.Input[str] country_code: country code for the site (for AP config generation), in two-character
        :param pulumi.Input[str] gatewaytemplate_id: Gateway Template ID, used by gateways
        :param pulumi.Input[str] networktemplate_id: Network Template ID, this takes precedence over Site Settings
        :param pulumi.Input[str] notes: optional, any notes about the site
        :param pulumi.Input[str] rftemplate_id: RF Template ID, this takes precedence over Site Settings
        :param pulumi.Input[str] secpolicy_id: SecPolicy ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] sitegroup_ids: sitegroups this site belongs to
        :param pulumi.Input[str] sitetemplate_id: Site Template ID
        :param pulumi.Input[str] timezone: Timezone the site is at
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if alarmtemplate_id is not None:
            pulumi.set(__self__, "alarmtemplate_id", alarmtemplate_id)
        if aptemplate_id is not None:
            pulumi.set(__self__, "aptemplate_id", aptemplate_id)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if gatewaytemplate_id is not None:
            pulumi.set(__self__, "gatewaytemplate_id", gatewaytemplate_id)
        if latlng is not None:
            pulumi.set(__self__, "latlng", latlng)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if networktemplate_id is not None:
            pulumi.set(__self__, "networktemplate_id", networktemplate_id)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if rftemplate_id is not None:
            pulumi.set(__self__, "rftemplate_id", rftemplate_id)
        if secpolicy_id is not None:
            pulumi.set(__self__, "secpolicy_id", secpolicy_id)
        if sitegroup_ids is not None:
            pulumi.set(__self__, "sitegroup_ids", sitegroup_ids)
        if sitetemplate_id is not None:
            pulumi.set(__self__, "sitetemplate_id", sitetemplate_id)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        """
        full address of the site
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="alarmtemplateId")
    def alarmtemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        """
        return pulumi.get(self, "alarmtemplate_id")

    @alarmtemplate_id.setter
    def alarmtemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alarmtemplate_id", value)

    @property
    @pulumi.getter(name="aptemplateId")
    def aptemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        AP Template ID, used by APs
        """
        return pulumi.get(self, "aptemplate_id")

    @aptemplate_id.setter
    def aptemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aptemplate_id", value)

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[str]]:
        """
        country code for the site (for AP config generation), in two-character
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "country_code", value)

    @property
    @pulumi.getter(name="gatewaytemplateId")
    def gatewaytemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        Gateway Template ID, used by gateways
        """
        return pulumi.get(self, "gatewaytemplate_id")

    @gatewaytemplate_id.setter
    def gatewaytemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gatewaytemplate_id", value)

    @property
    @pulumi.getter
    def latlng(self) -> Optional[pulumi.Input['BaseLatlngArgs']]:
        return pulumi.get(self, "latlng")

    @latlng.setter
    def latlng(self, value: Optional[pulumi.Input['BaseLatlngArgs']]):
        pulumi.set(self, "latlng", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="networktemplateId")
    def networktemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        Network Template ID, this takes precedence over Site Settings
        """
        return pulumi.get(self, "networktemplate_id")

    @networktemplate_id.setter
    def networktemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "networktemplate_id", value)

    @property
    @pulumi.getter
    def notes(self) -> Optional[pulumi.Input[str]]:
        """
        optional, any notes about the site
        """
        return pulumi.get(self, "notes")

    @notes.setter
    def notes(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notes", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="rftemplateId")
    def rftemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        RF Template ID, this takes precedence over Site Settings
        """
        return pulumi.get(self, "rftemplate_id")

    @rftemplate_id.setter
    def rftemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rftemplate_id", value)

    @property
    @pulumi.getter(name="secpolicyId")
    def secpolicy_id(self) -> Optional[pulumi.Input[str]]:
        """
        SecPolicy ID
        """
        return pulumi.get(self, "secpolicy_id")

    @secpolicy_id.setter
    def secpolicy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secpolicy_id", value)

    @property
    @pulumi.getter(name="sitegroupIds")
    def sitegroup_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        sitegroups this site belongs to
        """
        return pulumi.get(self, "sitegroup_ids")

    @sitegroup_ids.setter
    def sitegroup_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "sitegroup_ids", value)

    @property
    @pulumi.getter(name="sitetemplateId")
    def sitetemplate_id(self) -> Optional[pulumi.Input[str]]:
        """
        Site Template ID
        """
        return pulumi.get(self, "sitetemplate_id")

    @sitetemplate_id.setter
    def sitetemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sitetemplate_id", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Timezone the site is at
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)


class Base(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 alarmtemplate_id: Optional[pulumi.Input[str]] = None,
                 aptemplate_id: Optional[pulumi.Input[str]] = None,
                 country_code: Optional[pulumi.Input[str]] = None,
                 gatewaytemplate_id: Optional[pulumi.Input[str]] = None,
                 latlng: Optional[pulumi.Input[pulumi.InputType['BaseLatlngArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networktemplate_id: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 rftemplate_id: Optional[pulumi.Input[str]] = None,
                 secpolicy_id: Optional[pulumi.Input[str]] = None,
                 sitegroup_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 sitetemplate_id: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resources manages the Site basic information.This resource can be used to assign templates to a site, or to change basic information (e.g. Site Address)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        juniper_france = junipermist.device.Base("juniper_france",
            org_id=terraform_test["id"],
            name="JNP-FR-PAR",
            country_code="FR",
            timezone="Europe/Paris",
            address="41 Rue de Villiers, 92100 Neuilly sur Seine, France",
            notes="Created with Terraform, Updated with Terraform",
            latlng=junipermist.device.BaseLatlngArgs(
                lat=48.899268,
                lng=2.214447,
            ),
            sitegroup_ids=[
                test_group["id"],
                test_group2["id"],
            ],
            networktemplate_id=switch_template["id"],
            rftemplate_id=test_rf["id"],
            gatewaytemplate_id=test_api["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: full address of the site
        :param pulumi.Input[str] alarmtemplate_id: Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        :param pulumi.Input[str] aptemplate_id: AP Template ID, used by APs
        :param pulumi.Input[str] country_code: country code for the site (for AP config generation), in two-character
        :param pulumi.Input[str] gatewaytemplate_id: Gateway Template ID, used by gateways
        :param pulumi.Input[str] networktemplate_id: Network Template ID, this takes precedence over Site Settings
        :param pulumi.Input[str] notes: optional, any notes about the site
        :param pulumi.Input[str] rftemplate_id: RF Template ID, this takes precedence over Site Settings
        :param pulumi.Input[str] secpolicy_id: SecPolicy ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] sitegroup_ids: sitegroups this site belongs to
        :param pulumi.Input[str] sitetemplate_id: Site Template ID
        :param pulumi.Input[str] timezone: Timezone the site is at
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resources manages the Site basic information.This resource can be used to assign templates to a site, or to change basic information (e.g. Site Address)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        juniper_france = junipermist.device.Base("juniper_france",
            org_id=terraform_test["id"],
            name="JNP-FR-PAR",
            country_code="FR",
            timezone="Europe/Paris",
            address="41 Rue de Villiers, 92100 Neuilly sur Seine, France",
            notes="Created with Terraform, Updated with Terraform",
            latlng=junipermist.device.BaseLatlngArgs(
                lat=48.899268,
                lng=2.214447,
            ),
            sitegroup_ids=[
                test_group["id"],
                test_group2["id"],
            ],
            networktemplate_id=switch_template["id"],
            rftemplate_id=test_rf["id"],
            gatewaytemplate_id=test_api["id"])
        ```

        :param str resource_name: The name of the resource.
        :param BaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 alarmtemplate_id: Optional[pulumi.Input[str]] = None,
                 aptemplate_id: Optional[pulumi.Input[str]] = None,
                 country_code: Optional[pulumi.Input[str]] = None,
                 gatewaytemplate_id: Optional[pulumi.Input[str]] = None,
                 latlng: Optional[pulumi.Input[pulumi.InputType['BaseLatlngArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 networktemplate_id: Optional[pulumi.Input[str]] = None,
                 notes: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 rftemplate_id: Optional[pulumi.Input[str]] = None,
                 secpolicy_id: Optional[pulumi.Input[str]] = None,
                 sitegroup_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 sitetemplate_id: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BaseArgs.__new__(BaseArgs)

            if address is None and not opts.urn:
                raise TypeError("Missing required property 'address'")
            __props__.__dict__["address"] = address
            __props__.__dict__["alarmtemplate_id"] = alarmtemplate_id
            __props__.__dict__["aptemplate_id"] = aptemplate_id
            __props__.__dict__["country_code"] = country_code
            __props__.__dict__["gatewaytemplate_id"] = gatewaytemplate_id
            __props__.__dict__["latlng"] = latlng
            __props__.__dict__["name"] = name
            __props__.__dict__["networktemplate_id"] = networktemplate_id
            __props__.__dict__["notes"] = notes
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["rftemplate_id"] = rftemplate_id
            __props__.__dict__["secpolicy_id"] = secpolicy_id
            __props__.__dict__["sitegroup_ids"] = sitegroup_ids
            __props__.__dict__["sitetemplate_id"] = sitetemplate_id
            __props__.__dict__["timezone"] = timezone
        super(Base, __self__).__init__(
            'junipermist:device/base:base',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[str]] = None,
            alarmtemplate_id: Optional[pulumi.Input[str]] = None,
            aptemplate_id: Optional[pulumi.Input[str]] = None,
            country_code: Optional[pulumi.Input[str]] = None,
            gatewaytemplate_id: Optional[pulumi.Input[str]] = None,
            latlng: Optional[pulumi.Input[pulumi.InputType['BaseLatlngArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            networktemplate_id: Optional[pulumi.Input[str]] = None,
            notes: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            rftemplate_id: Optional[pulumi.Input[str]] = None,
            secpolicy_id: Optional[pulumi.Input[str]] = None,
            sitegroup_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            sitetemplate_id: Optional[pulumi.Input[str]] = None,
            timezone: Optional[pulumi.Input[str]] = None) -> 'Base':
        """
        Get an existing Base resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: full address of the site
        :param pulumi.Input[str] alarmtemplate_id: Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        :param pulumi.Input[str] aptemplate_id: AP Template ID, used by APs
        :param pulumi.Input[str] country_code: country code for the site (for AP config generation), in two-character
        :param pulumi.Input[str] gatewaytemplate_id: Gateway Template ID, used by gateways
        :param pulumi.Input[str] networktemplate_id: Network Template ID, this takes precedence over Site Settings
        :param pulumi.Input[str] notes: optional, any notes about the site
        :param pulumi.Input[str] rftemplate_id: RF Template ID, this takes precedence over Site Settings
        :param pulumi.Input[str] secpolicy_id: SecPolicy ID
        :param pulumi.Input[Sequence[pulumi.Input[str]]] sitegroup_ids: sitegroups this site belongs to
        :param pulumi.Input[str] sitetemplate_id: Site Template ID
        :param pulumi.Input[str] timezone: Timezone the site is at
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BaseState.__new__(_BaseState)

        __props__.__dict__["address"] = address
        __props__.__dict__["alarmtemplate_id"] = alarmtemplate_id
        __props__.__dict__["aptemplate_id"] = aptemplate_id
        __props__.__dict__["country_code"] = country_code
        __props__.__dict__["gatewaytemplate_id"] = gatewaytemplate_id
        __props__.__dict__["latlng"] = latlng
        __props__.__dict__["name"] = name
        __props__.__dict__["networktemplate_id"] = networktemplate_id
        __props__.__dict__["notes"] = notes
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["rftemplate_id"] = rftemplate_id
        __props__.__dict__["secpolicy_id"] = secpolicy_id
        __props__.__dict__["sitegroup_ids"] = sitegroup_ids
        __props__.__dict__["sitetemplate_id"] = sitetemplate_id
        __props__.__dict__["timezone"] = timezone
        return Base(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[str]:
        """
        full address of the site
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter(name="alarmtemplateId")
    def alarmtemplate_id(self) -> pulumi.Output[Optional[str]]:
        """
        Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        """
        return pulumi.get(self, "alarmtemplate_id")

    @property
    @pulumi.getter(name="aptemplateId")
    def aptemplate_id(self) -> pulumi.Output[Optional[str]]:
        """
        AP Template ID, used by APs
        """
        return pulumi.get(self, "aptemplate_id")

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> pulumi.Output[Optional[str]]:
        """
        country code for the site (for AP config generation), in two-character
        """
        return pulumi.get(self, "country_code")

    @property
    @pulumi.getter(name="gatewaytemplateId")
    def gatewaytemplate_id(self) -> pulumi.Output[Optional[str]]:
        """
        Gateway Template ID, used by gateways
        """
        return pulumi.get(self, "gatewaytemplate_id")

    @property
    @pulumi.getter
    def latlng(self) -> pulumi.Output[Optional['outputs.BaseLatlng']]:
        return pulumi.get(self, "latlng")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networktemplateId")
    def networktemplate_id(self) -> pulumi.Output[Optional[str]]:
        """
        Network Template ID, this takes precedence over Site Settings
        """
        return pulumi.get(self, "networktemplate_id")

    @property
    @pulumi.getter
    def notes(self) -> pulumi.Output[Optional[str]]:
        """
        optional, any notes about the site
        """
        return pulumi.get(self, "notes")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="rftemplateId")
    def rftemplate_id(self) -> pulumi.Output[Optional[str]]:
        """
        RF Template ID, this takes precedence over Site Settings
        """
        return pulumi.get(self, "rftemplate_id")

    @property
    @pulumi.getter(name="secpolicyId")
    def secpolicy_id(self) -> pulumi.Output[Optional[str]]:
        """
        SecPolicy ID
        """
        return pulumi.get(self, "secpolicy_id")

    @property
    @pulumi.getter(name="sitegroupIds")
    def sitegroup_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        sitegroups this site belongs to
        """
        return pulumi.get(self, "sitegroup_ids")

    @property
    @pulumi.getter(name="sitetemplateId")
    def sitetemplate_id(self) -> pulumi.Output[Optional[str]]:
        """
        Site Template ID
        """
        return pulumi.get(self, "sitetemplate_id")

    @property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[Optional[str]]:
        """
        Timezone the site is at
        """
        return pulumi.get(self, "timezone")

