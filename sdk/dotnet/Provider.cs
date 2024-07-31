// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist
{
    /// <summary>
    /// The provider type for the mist package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [JuniperMistResourceType("pulumi:providers:junipermist")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// For API Token authentication, the Mist API Token.
        /// </summary>
        [Output("apitoken")]
        public Output<string?> Apitoken { get; private set; } = null!;

        /// <summary>
        /// URL of the Mist Cloud, e.g. `api.mist.com`.
        /// </summary>
        [Output("host")]
        public Output<string?> Host { get; private set; } = null!;

        /// <summary>
        /// For username/password authentication, the Mist Account password.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
        /// `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
        /// are supported.
        /// </summary>
        [Output("proxy")]
        public Output<string?> Proxy { get; private set; } = null!;

        /// <summary>
        /// For username/password authentication, the Mist Account username.
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("junipermist", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
                AdditionalSecretOutputs =
                {
                    "apitoken",
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timeout in seconds for completing API transactions with the Mist Cloud. Omit for default value of 10 seconds. Value of 0
        /// results in infinite timeout.
        /// </summary>
        [Input("apiTimeout", json: true)]
        public Input<double>? ApiTimeout { get; set; }

        [Input("apitoken")]
        private Input<string>? _apitoken;

        /// <summary>
        /// For API Token authentication, the Mist API Token.
        /// </summary>
        public Input<string>? Apitoken
        {
            get => _apitoken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apitoken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// URL of the Mist Cloud, e.g. `api.mist.com`.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// For username/password authentication, the Mist Account password.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
        /// `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
        /// are supported.
        /// </summary>
        [Input("proxy")]
        public Input<string>? Proxy { get; set; }

        /// <summary>
        /// For username/password authentication, the Mist Account username.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
