// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.NetworktemplateRemoteSyslogUserContent;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateRemoteSyslogUser {
    private @Nullable List<NetworktemplateRemoteSyslogUserContent> contents;
    private @Nullable String match;
    private @Nullable String user;

    private NetworktemplateRemoteSyslogUser() {}
    public List<NetworktemplateRemoteSyslogUserContent> contents() {
        return this.contents == null ? List.of() : this.contents;
    }
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateRemoteSyslogUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NetworktemplateRemoteSyslogUserContent> contents;
        private @Nullable String match;
        private @Nullable String user;
        public Builder() {}
        public Builder(NetworktemplateRemoteSyslogUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.match = defaults.match;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder contents(@Nullable List<NetworktemplateRemoteSyslogUserContent> contents) {

            this.contents = contents;
            return this;
        }
        public Builder contents(NetworktemplateRemoteSyslogUserContent... contents) {
            return contents(List.of(contents));
        }
        @CustomType.Setter
        public Builder match(@Nullable String match) {

            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {

            this.user = user;
            return this;
        }
        public NetworktemplateRemoteSyslogUser build() {
            final var _resultValue = new NetworktemplateRemoteSyslogUser();
            _resultValue.contents = contents;
            _resultValue.match = match;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
