// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingAutoUpgradeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customVersions")]
        private InputMap<string>? _customVersions;

        /// <summary>
        /// custom versions for different models. Property key is the model name (e.g. "AP41")
        /// </summary>
        public InputMap<string> CustomVersions
        {
            get => _customVersions ?? (_customVersions = new InputMap<string>());
            set => _customVersions = value;
        }

        /// <summary>
        /// enum: `any`, `fri`, `mon`, `sat`, `sun`, `thu`, `tue`, `wed`
        /// </summary>
        [Input("dayOfWeek")]
        public Input<string>? DayOfWeek { get; set; }

        /// <summary>
        /// whether auto upgrade should happen (Note that Mist may auto-upgrade if the version is not supported)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// any / HH:MM (24-hour format), upgrade will happen within up to 1-hour from this time
        /// </summary>
        [Input("timeOfDay")]
        public Input<string>? TimeOfDay { get; set; }

        /// <summary>
        /// desired version. enum: `beta`, `custom`, `stable`
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public SettingAutoUpgradeGetArgs()
        {
        }
        public static new SettingAutoUpgradeGetArgs Empty => new SettingAutoUpgradeGetArgs();
    }
}
