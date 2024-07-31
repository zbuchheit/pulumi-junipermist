// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.NetworktemplateRemoteSyslogArchiveArgs;
import com.pulumi.junipermist.org.inputs.NetworktemplateRemoteSyslogConsoleArgs;
import com.pulumi.junipermist.org.inputs.NetworktemplateRemoteSyslogFileArgs;
import com.pulumi.junipermist.org.inputs.NetworktemplateRemoteSyslogServerArgs;
import com.pulumi.junipermist.org.inputs.NetworktemplateRemoteSyslogUserArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateRemoteSyslogArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateRemoteSyslogArgs Empty = new NetworktemplateRemoteSyslogArgs();

    @Import(name="archive")
    private @Nullable Output<NetworktemplateRemoteSyslogArchiveArgs> archive;

    public Optional<Output<NetworktemplateRemoteSyslogArchiveArgs>> archive() {
        return Optional.ofNullable(this.archive);
    }

    @Import(name="console")
    private @Nullable Output<NetworktemplateRemoteSyslogConsoleArgs> console;

    public Optional<Output<NetworktemplateRemoteSyslogConsoleArgs>> console() {
        return Optional.ofNullable(this.console);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="files")
    private @Nullable Output<List<NetworktemplateRemoteSyslogFileArgs>> files;

    public Optional<Output<List<NetworktemplateRemoteSyslogFileArgs>>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * if source_address is configured, will use the vlan firstly otherwise use source_ip
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return if source_address is configured, will use the vlan firstly otherwise use source_ip
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="sendToAllServers")
    private @Nullable Output<Boolean> sendToAllServers;

    public Optional<Output<Boolean>> sendToAllServers() {
        return Optional.ofNullable(this.sendToAllServers);
    }

    @Import(name="servers")
    private @Nullable Output<List<NetworktemplateRemoteSyslogServerArgs>> servers;

    public Optional<Output<List<NetworktemplateRemoteSyslogServerArgs>>> servers() {
        return Optional.ofNullable(this.servers);
    }

    /**
     * enum: `millisecond`, `year`, `year millisecond`
     * 
     */
    @Import(name="timeFormat")
    private @Nullable Output<String> timeFormat;

    /**
     * @return enum: `millisecond`, `year`, `year millisecond`
     * 
     */
    public Optional<Output<String>> timeFormat() {
        return Optional.ofNullable(this.timeFormat);
    }

    @Import(name="users")
    private @Nullable Output<List<NetworktemplateRemoteSyslogUserArgs>> users;

    public Optional<Output<List<NetworktemplateRemoteSyslogUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private NetworktemplateRemoteSyslogArgs() {}

    private NetworktemplateRemoteSyslogArgs(NetworktemplateRemoteSyslogArgs $) {
        this.archive = $.archive;
        this.console = $.console;
        this.enabled = $.enabled;
        this.files = $.files;
        this.network = $.network;
        this.sendToAllServers = $.sendToAllServers;
        this.servers = $.servers;
        this.timeFormat = $.timeFormat;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateRemoteSyslogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateRemoteSyslogArgs $;

        public Builder() {
            $ = new NetworktemplateRemoteSyslogArgs();
        }

        public Builder(NetworktemplateRemoteSyslogArgs defaults) {
            $ = new NetworktemplateRemoteSyslogArgs(Objects.requireNonNull(defaults));
        }

        public Builder archive(@Nullable Output<NetworktemplateRemoteSyslogArchiveArgs> archive) {
            $.archive = archive;
            return this;
        }

        public Builder archive(NetworktemplateRemoteSyslogArchiveArgs archive) {
            return archive(Output.of(archive));
        }

        public Builder console(@Nullable Output<NetworktemplateRemoteSyslogConsoleArgs> console) {
            $.console = console;
            return this;
        }

        public Builder console(NetworktemplateRemoteSyslogConsoleArgs console) {
            return console(Output.of(console));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder files(@Nullable Output<List<NetworktemplateRemoteSyslogFileArgs>> files) {
            $.files = files;
            return this;
        }

        public Builder files(List<NetworktemplateRemoteSyslogFileArgs> files) {
            return files(Output.of(files));
        }

        public Builder files(NetworktemplateRemoteSyslogFileArgs... files) {
            return files(List.of(files));
        }

        /**
         * @param network if source_address is configured, will use the vlan firstly otherwise use source_ip
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network if source_address is configured, will use the vlan firstly otherwise use source_ip
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder sendToAllServers(@Nullable Output<Boolean> sendToAllServers) {
            $.sendToAllServers = sendToAllServers;
            return this;
        }

        public Builder sendToAllServers(Boolean sendToAllServers) {
            return sendToAllServers(Output.of(sendToAllServers));
        }

        public Builder servers(@Nullable Output<List<NetworktemplateRemoteSyslogServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        public Builder servers(List<NetworktemplateRemoteSyslogServerArgs> servers) {
            return servers(Output.of(servers));
        }

        public Builder servers(NetworktemplateRemoteSyslogServerArgs... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param timeFormat enum: `millisecond`, `year`, `year millisecond`
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(@Nullable Output<String> timeFormat) {
            $.timeFormat = timeFormat;
            return this;
        }

        /**
         * @param timeFormat enum: `millisecond`, `year`, `year millisecond`
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(String timeFormat) {
            return timeFormat(Output.of(timeFormat));
        }

        public Builder users(@Nullable Output<List<NetworktemplateRemoteSyslogUserArgs>> users) {
            $.users = users;
            return this;
        }

        public Builder users(List<NetworktemplateRemoteSyslogUserArgs> users) {
            return users(Output.of(users));
        }

        public Builder users(NetworktemplateRemoteSyslogUserArgs... users) {
            return users(List.of(users));
        }

        public NetworktemplateRemoteSyslogArgs build() {
            return $;
        }
    }

}
