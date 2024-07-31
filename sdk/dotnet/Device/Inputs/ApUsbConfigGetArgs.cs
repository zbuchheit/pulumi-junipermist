// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class ApUsbConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// only if `type`==`imagotag`
        /// </summary>
        [Input("cacert")]
        public Input<string>? Cacert { get; set; }

        /// <summary>
        /// only if `type`==`imagotag`, channel selection, not needed by default, required for manual channel override only
        /// </summary>
        [Input("channel")]
        public Input<int>? Channel { get; set; }

        /// <summary>
        /// whether to enable any usb config
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// only if `type`==`imagotag`
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// only if `type`==`imagotag`
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// usb config type. enum: `hanshow`, `imagotag`, `solum`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// only if `type`==`imagotag`, whether to turn on SSL verification
        /// </summary>
        [Input("verifyCert")]
        public Input<bool>? VerifyCert { get; set; }

        /// <summary>
        /// only if `type`==`solum` or `type`==`hanshow`
        /// </summary>
        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public ApUsbConfigGetArgs()
        {
        }
        public static new ApUsbConfigGetArgs Empty => new ApUsbConfigGetArgs();
    }
}
