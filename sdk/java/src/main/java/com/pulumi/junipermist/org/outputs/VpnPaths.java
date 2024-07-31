// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnPaths {
    /**
     * @return enum: `broadband`, `lte`
     * 
     */
    private @Nullable String bfdProfile;
    /**
     * @return if different from the wan port
     * 
     */
    private @Nullable String ip;
    private @Nullable Integer pod;

    private VpnPaths() {}
    /**
     * @return enum: `broadband`, `lte`
     * 
     */
    public Optional<String> bfdProfile() {
        return Optional.ofNullable(this.bfdProfile);
    }
    /**
     * @return if different from the wan port
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<Integer> pod() {
        return Optional.ofNullable(this.pod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnPaths defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bfdProfile;
        private @Nullable String ip;
        private @Nullable Integer pod;
        public Builder() {}
        public Builder(VpnPaths defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bfdProfile = defaults.bfdProfile;
    	      this.ip = defaults.ip;
    	      this.pod = defaults.pod;
        }

        @CustomType.Setter
        public Builder bfdProfile(@Nullable String bfdProfile) {

            this.bfdProfile = bfdProfile;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder pod(@Nullable Integer pod) {

            this.pod = pod;
            return this;
        }
        public VpnPaths build() {
            final var _resultValue = new VpnPaths();
            _resultValue.bfdProfile = bfdProfile;
            _resultValue.ip = ip;
            _resultValue.pod = pod;
            return _resultValue;
        }
    }
}