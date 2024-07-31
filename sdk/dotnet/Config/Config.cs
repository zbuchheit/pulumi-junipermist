// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.JuniperMist
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("junipermist");

        private static readonly __Value<double?> _apiTimeout = new __Value<double?>(() => __config.GetDouble("apiTimeout"));
        /// <summary>
        /// Timeout in seconds for completing API transactions with the Mist Cloud. Omit for default value of 10 seconds. Value of 0
        /// results in infinite timeout.
        /// </summary>
        public static double? ApiTimeout
        {
            get => _apiTimeout.Get();
            set => _apiTimeout.Set(value);
        }

        private static readonly __Value<string?> _apitoken = new __Value<string?>(() => __config.Get("apitoken"));
        /// <summary>
        /// For API Token authentication, the Mist API Token.
        /// </summary>
        public static string? Apitoken
        {
            get => _apitoken.Get();
            set => _apitoken.Set(value);
        }

        private static readonly __Value<string?> _host = new __Value<string?>(() => __config.Get("host"));
        /// <summary>
        /// URL of the Mist Cloud, e.g. `api.mist.com`.
        /// </summary>
        public static string? Host
        {
            get => _host.Get();
            set => _host.Set(value);
        }

        private static readonly __Value<string?> _password = new __Value<string?>(() => __config.Get("password"));
        /// <summary>
        /// For username/password authentication, the Mist Account password.
        /// </summary>
        public static string? Password
        {
            get => _password.Get();
            set => _password.Set(value);
        }

        private static readonly __Value<string?> _proxy = new __Value<string?>(() => __config.Get("proxy"));
        /// <summary>
        /// Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
        /// `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
        /// are supported.
        /// </summary>
        public static string? Proxy
        {
            get => _proxy.Get();
            set => _proxy.Set(value);
        }

        private static readonly __Value<string?> _username = new __Value<string?>(() => __config.Get("username"));
        /// <summary>
        /// For username/password authentication, the Mist Account username.
        /// </summary>
        public static string? Username
        {
            get => _username.Get();
            set => _username.Set(value);
        }

    }
}
