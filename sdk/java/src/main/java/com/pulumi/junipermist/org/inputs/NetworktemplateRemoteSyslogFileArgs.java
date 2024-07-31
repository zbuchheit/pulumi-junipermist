// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.NetworktemplateRemoteSyslogFileArchiveArgs;
import com.pulumi.junipermist.org.inputs.NetworktemplateRemoteSyslogFileContentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateRemoteSyslogFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateRemoteSyslogFileArgs Empty = new NetworktemplateRemoteSyslogFileArgs();

    @Import(name="archive")
    private @Nullable Output<NetworktemplateRemoteSyslogFileArchiveArgs> archive;

    public Optional<Output<NetworktemplateRemoteSyslogFileArchiveArgs>> archive() {
        return Optional.ofNullable(this.archive);
    }

    @Import(name="contents")
    private @Nullable Output<List<NetworktemplateRemoteSyslogFileContentArgs>> contents;

    public Optional<Output<List<NetworktemplateRemoteSyslogFileContentArgs>>> contents() {
        return Optional.ofNullable(this.contents);
    }

    @Import(name="explicitPriority")
    private @Nullable Output<Boolean> explicitPriority;

    public Optional<Output<Boolean>> explicitPriority() {
        return Optional.ofNullable(this.explicitPriority);
    }

    @Import(name="file")
    private @Nullable Output<String> file;

    public Optional<Output<String>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="structuredData")
    private @Nullable Output<Boolean> structuredData;

    public Optional<Output<Boolean>> structuredData() {
        return Optional.ofNullable(this.structuredData);
    }

    private NetworktemplateRemoteSyslogFileArgs() {}

    private NetworktemplateRemoteSyslogFileArgs(NetworktemplateRemoteSyslogFileArgs $) {
        this.archive = $.archive;
        this.contents = $.contents;
        this.explicitPriority = $.explicitPriority;
        this.file = $.file;
        this.match = $.match;
        this.structuredData = $.structuredData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateRemoteSyslogFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateRemoteSyslogFileArgs $;

        public Builder() {
            $ = new NetworktemplateRemoteSyslogFileArgs();
        }

        public Builder(NetworktemplateRemoteSyslogFileArgs defaults) {
            $ = new NetworktemplateRemoteSyslogFileArgs(Objects.requireNonNull(defaults));
        }

        public Builder archive(@Nullable Output<NetworktemplateRemoteSyslogFileArchiveArgs> archive) {
            $.archive = archive;
            return this;
        }

        public Builder archive(NetworktemplateRemoteSyslogFileArchiveArgs archive) {
            return archive(Output.of(archive));
        }

        public Builder contents(@Nullable Output<List<NetworktemplateRemoteSyslogFileContentArgs>> contents) {
            $.contents = contents;
            return this;
        }

        public Builder contents(List<NetworktemplateRemoteSyslogFileContentArgs> contents) {
            return contents(Output.of(contents));
        }

        public Builder contents(NetworktemplateRemoteSyslogFileContentArgs... contents) {
            return contents(List.of(contents));
        }

        public Builder explicitPriority(@Nullable Output<Boolean> explicitPriority) {
            $.explicitPriority = explicitPriority;
            return this;
        }

        public Builder explicitPriority(Boolean explicitPriority) {
            return explicitPriority(Output.of(explicitPriority));
        }

        public Builder file(@Nullable Output<String> file) {
            $.file = file;
            return this;
        }

        public Builder file(String file) {
            return file(Output.of(file));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder structuredData(@Nullable Output<Boolean> structuredData) {
            $.structuredData = structuredData;
            return this;
        }

        public Builder structuredData(Boolean structuredData) {
            return structuredData(Output.of(structuredData));
        }

        public NetworktemplateRemoteSyslogFileArgs build() {
            return $;
        }
    }

}
