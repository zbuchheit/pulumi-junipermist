// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingSimpleAlertDhcpFailure {
    private @Nullable Integer clientCount;
    /**
     * @return failing within minutes
     * 
     */
    private @Nullable Integer duration;
    private @Nullable Integer incidentCount;

    private SettingSimpleAlertDhcpFailure() {}
    public Optional<Integer> clientCount() {
        return Optional.ofNullable(this.clientCount);
    }
    /**
     * @return failing within minutes
     * 
     */
    public Optional<Integer> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<Integer> incidentCount() {
        return Optional.ofNullable(this.incidentCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingSimpleAlertDhcpFailure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer clientCount;
        private @Nullable Integer duration;
        private @Nullable Integer incidentCount;
        public Builder() {}
        public Builder(SettingSimpleAlertDhcpFailure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCount = defaults.clientCount;
    	      this.duration = defaults.duration;
    	      this.incidentCount = defaults.incidentCount;
        }

        @CustomType.Setter
        public Builder clientCount(@Nullable Integer clientCount) {

            this.clientCount = clientCount;
            return this;
        }
        @CustomType.Setter
        public Builder duration(@Nullable Integer duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder incidentCount(@Nullable Integer incidentCount) {

            this.incidentCount = incidentCount;
            return this;
        }
        public SettingSimpleAlertDhcpFailure build() {
            final var _resultValue = new SettingSimpleAlertDhcpFailure();
            _resultValue.clientCount = clientCount;
            _resultValue.duration = duration;
            _resultValue.incidentCount = incidentCount;
            return _resultValue;
        }
    }
}
