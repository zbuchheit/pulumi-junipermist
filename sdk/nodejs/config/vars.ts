// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("junipermist");

/**
 * Timeout in seconds for completing API transactions with the Mist Cloud. Omit for default value of 10 seconds. Value of 0
 * results in infinite timeout.
 */
export declare const apiTimeout: number | undefined;
Object.defineProperty(exports, "apiTimeout", {
    get() {
        return __config.getObject<number>("apiTimeout");
    },
    enumerable: true,
});

/**
 * For API Token authentication, the Mist API Token.
 */
export declare const apitoken: string | undefined;
Object.defineProperty(exports, "apitoken", {
    get() {
        return __config.get("apitoken");
    },
    enumerable: true,
});

/**
 * URL of the Mist Cloud, e.g. `api.mist.com`.
 */
export declare const host: string | undefined;
Object.defineProperty(exports, "host", {
    get() {
        return __config.get("host");
    },
    enumerable: true,
});

/**
 * For username/password authentication, the Mist Account password.
 */
export declare const password: string | undefined;
Object.defineProperty(exports, "password", {
    get() {
        return __config.get("password");
    },
    enumerable: true,
});

/**
 * Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
 * `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
 * are supported.
 */
export declare const proxy: string | undefined;
Object.defineProperty(exports, "proxy", {
    get() {
        return __config.get("proxy");
    },
    enumerable: true,
});

/**
 * For username/password authentication, the Mist Account username.
 */
export declare const username: string | undefined;
Object.defineProperty(exports, "username", {
    get() {
        return __config.get("username");
    },
    enumerable: true,
});

