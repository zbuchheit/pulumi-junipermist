// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.NetworktemplateRemoteSyslogFileArchive;
import com.pulumi.junipermist.org.outputs.NetworktemplateRemoteSyslogFileContent;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateRemoteSyslogFile {
    private @Nullable NetworktemplateRemoteSyslogFileArchive archive;
    private @Nullable List<NetworktemplateRemoteSyslogFileContent> contents;
    private @Nullable Boolean explicitPriority;
    private @Nullable String file;
    private @Nullable String match;
    private @Nullable Boolean structuredData;

    private NetworktemplateRemoteSyslogFile() {}
    public Optional<NetworktemplateRemoteSyslogFileArchive> archive() {
        return Optional.ofNullable(this.archive);
    }
    public List<NetworktemplateRemoteSyslogFileContent> contents() {
        return this.contents == null ? List.of() : this.contents;
    }
    public Optional<Boolean> explicitPriority() {
        return Optional.ofNullable(this.explicitPriority);
    }
    public Optional<String> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }
    public Optional<Boolean> structuredData() {
        return Optional.ofNullable(this.structuredData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateRemoteSyslogFile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NetworktemplateRemoteSyslogFileArchive archive;
        private @Nullable List<NetworktemplateRemoteSyslogFileContent> contents;
        private @Nullable Boolean explicitPriority;
        private @Nullable String file;
        private @Nullable String match;
        private @Nullable Boolean structuredData;
        public Builder() {}
        public Builder(NetworktemplateRemoteSyslogFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archive = defaults.archive;
    	      this.contents = defaults.contents;
    	      this.explicitPriority = defaults.explicitPriority;
    	      this.file = defaults.file;
    	      this.match = defaults.match;
    	      this.structuredData = defaults.structuredData;
        }

        @CustomType.Setter
        public Builder archive(@Nullable NetworktemplateRemoteSyslogFileArchive archive) {

            this.archive = archive;
            return this;
        }
        @CustomType.Setter
        public Builder contents(@Nullable List<NetworktemplateRemoteSyslogFileContent> contents) {

            this.contents = contents;
            return this;
        }
        public Builder contents(NetworktemplateRemoteSyslogFileContent... contents) {
            return contents(List.of(contents));
        }
        @CustomType.Setter
        public Builder explicitPriority(@Nullable Boolean explicitPriority) {

            this.explicitPriority = explicitPriority;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable String file) {

            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder match(@Nullable String match) {

            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder structuredData(@Nullable Boolean structuredData) {

            this.structuredData = structuredData;
            return this;
        }
        public NetworktemplateRemoteSyslogFile build() {
            final var _resultValue = new NetworktemplateRemoteSyslogFile();
            _resultValue.archive = archive;
            _resultValue.contents = contents;
            _resultValue.explicitPriority = explicitPriority;
            _resultValue.file = file;
            _resultValue.match = match;
            _resultValue.structuredData = structuredData;
            return _resultValue;
        }
    }
}
