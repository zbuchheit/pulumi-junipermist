// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigClientList {
    private @Nullable String clientListName;
    private @Nullable List<String> clients;

    private NetworktemplateSnmpConfigClientList() {}
    public Optional<String> clientListName() {
        return Optional.ofNullable(this.clientListName);
    }
    public List<String> clients() {
        return this.clients == null ? List.of() : this.clients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigClientList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientListName;
        private @Nullable List<String> clients;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigClientList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientListName = defaults.clientListName;
    	      this.clients = defaults.clients;
        }

        @CustomType.Setter
        public Builder clientListName(@Nullable String clientListName) {

            this.clientListName = clientListName;
            return this;
        }
        @CustomType.Setter
        public Builder clients(@Nullable List<String> clients) {

            this.clients = clients;
            return this;
        }
        public Builder clients(String... clients) {
            return clients(List.of(clients));
        }
        public NetworktemplateSnmpConfigClientList build() {
            final var _resultValue = new NetworktemplateSnmpConfigClientList();
            _resultValue.clientListName = clientListName;
            _resultValue.clients = clients;
            return _resultValue;
        }
    }
}
