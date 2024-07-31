// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateRemoteSyslogServerContentArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateRemoteSyslogServerContentArgs Empty = new NetworktemplateRemoteSyslogServerContentArgs();

    /**
     * enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
     * 
     */
    @Import(name="facility")
    private @Nullable Output<String> facility;

    /**
     * @return enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
     * 
     */
    public Optional<Output<String>> facility() {
        return Optional.ofNullable(this.facility);
    }

    /**
     * enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
     * 
     */
    @Import(name="severity")
    private @Nullable Output<String> severity;

    /**
     * @return enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
     * 
     */
    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    private NetworktemplateRemoteSyslogServerContentArgs() {}

    private NetworktemplateRemoteSyslogServerContentArgs(NetworktemplateRemoteSyslogServerContentArgs $) {
        this.facility = $.facility;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateRemoteSyslogServerContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateRemoteSyslogServerContentArgs $;

        public Builder() {
            $ = new NetworktemplateRemoteSyslogServerContentArgs();
        }

        public Builder(NetworktemplateRemoteSyslogServerContentArgs defaults) {
            $ = new NetworktemplateRemoteSyslogServerContentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facility enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
         * 
         * @return builder
         * 
         */
        public Builder facility(@Nullable Output<String> facility) {
            $.facility = facility;
            return this;
        }

        /**
         * @param facility enum: `any`, `authorization`, `change-log`, `config`, `conflict-log`, `daemon`, `dfc`, `external`, `firewall`, `ftp`, `interactive-commands`, `kernel`, `ntp`, `pfe`, `security`, `user`
         * 
         * @return builder
         * 
         */
        public Builder facility(String facility) {
            return facility(Output.of(facility));
        }

        /**
         * @param severity enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity enum: `alert`, `any`, `critical`, `emergency`, `error`, `info`, `notice`, `warning`
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        public NetworktemplateRemoteSyslogServerContentArgs build() {
            return $;
        }
    }

}
