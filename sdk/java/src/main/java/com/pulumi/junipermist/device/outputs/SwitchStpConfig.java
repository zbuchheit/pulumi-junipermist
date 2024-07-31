// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchStpConfig {
    /**
     * @return enum: `rstp`, `vstp`
     * 
     */
    private @Nullable String type;

    private SwitchStpConfig() {}
    /**
     * @return enum: `rstp`, `vstp`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchStpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        public Builder() {}
        public Builder(SwitchStpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public SwitchStpConfig build() {
            final var _resultValue = new SwitchStpConfig();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}