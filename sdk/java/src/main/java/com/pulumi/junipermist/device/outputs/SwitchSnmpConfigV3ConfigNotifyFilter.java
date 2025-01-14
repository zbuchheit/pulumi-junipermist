// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.SwitchSnmpConfigV3ConfigNotifyFilterContent;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchSnmpConfigV3ConfigNotifyFilter {
    private @Nullable List<SwitchSnmpConfigV3ConfigNotifyFilterContent> contents;
    private @Nullable String profileName;

    private SwitchSnmpConfigV3ConfigNotifyFilter() {}
    public List<SwitchSnmpConfigV3ConfigNotifyFilterContent> contents() {
        return this.contents == null ? List.of() : this.contents;
    }
    public Optional<String> profileName() {
        return Optional.ofNullable(this.profileName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchSnmpConfigV3ConfigNotifyFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<SwitchSnmpConfigV3ConfigNotifyFilterContent> contents;
        private @Nullable String profileName;
        public Builder() {}
        public Builder(SwitchSnmpConfigV3ConfigNotifyFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.profileName = defaults.profileName;
        }

        @CustomType.Setter
        public Builder contents(@Nullable List<SwitchSnmpConfigV3ConfigNotifyFilterContent> contents) {

            this.contents = contents;
            return this;
        }
        public Builder contents(SwitchSnmpConfigV3ConfigNotifyFilterContent... contents) {
            return contents(List.of(contents));
        }
        @CustomType.Setter
        public Builder profileName(@Nullable String profileName) {

            this.profileName = profileName;
            return this;
        }
        public SwitchSnmpConfigV3ConfigNotifyFilter build() {
            final var _resultValue = new SwitchSnmpConfigV3ConfigNotifyFilter();
            _resultValue.contents = contents;
            _resultValue.profileName = profileName;
            return _resultValue;
        }
    }
}
