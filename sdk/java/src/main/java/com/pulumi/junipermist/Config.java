// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist;

import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("junipermist");
/**
 * Timeout in seconds for completing API transactions with the Mist Cloud. Omit for default value of 10 seconds. Value of 0
 * results in infinite timeout.
 * 
 */
    public Optional<Double> apiTimeout() {
        return Codegen.doubleProp("apiTimeout").config(config).get();
    }
/**
 * For API Token authentication, the Mist API Token.
 * 
 */
    public Optional<String> apitoken() {
        return Codegen.stringProp("apitoken").config(config).get();
    }
/**
 * URL of the Mist Cloud, e.g. `api.mist.com`.
 * 
 */
    public Optional<String> host() {
        return Codegen.stringProp("host").config(config).get();
    }
/**
 * For username/password authentication, the Mist Account password.
 * 
 */
    public Optional<String> password() {
        return Codegen.stringProp("password").config(config).get();
    }
/**
 * Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
 * `[username:password{@literal @}]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
 * are supported.
 * 
 */
    public Optional<String> proxy() {
        return Codegen.stringProp("proxy").config(config).get();
    }
/**
 * For username/password authentication, the Mist Account username.
 * 
 */
    public Optional<String> username() {
        return Codegen.stringProp("username").config(config).get();
    }
}
