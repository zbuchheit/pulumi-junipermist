// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class GatewaytemplateDhcpdConfigConfigOptions
    {
        /// <summary>
        /// enum: `boolean`, `hex`, `int16`, `int32`, `ip`, `string`, `uint16`, `uint32`
        /// </summary>
        public readonly string? Type;
        public readonly string? Value;

        [OutputConstructor]
        private GatewaytemplateDhcpdConfigConfigOptions(
            string? type,

            string? value)
        {
            Type = type;
            Value = value;
        }
    }
}
