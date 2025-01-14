// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.SettingSyntheticTestVlanArgs;
import com.pulumi.junipermist.org.inputs.SettingSyntheticTestWanSpeedtestArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingSyntheticTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingSyntheticTestArgs Empty = new SettingSyntheticTestArgs();

    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    @Import(name="vlans")
    private @Nullable Output<List<SettingSyntheticTestVlanArgs>> vlans;

    public Optional<Output<List<SettingSyntheticTestVlanArgs>>> vlans() {
        return Optional.ofNullable(this.vlans);
    }

    @Import(name="wanSpeedtest")
    private @Nullable Output<SettingSyntheticTestWanSpeedtestArgs> wanSpeedtest;

    public Optional<Output<SettingSyntheticTestWanSpeedtestArgs>> wanSpeedtest() {
        return Optional.ofNullable(this.wanSpeedtest);
    }

    private SettingSyntheticTestArgs() {}

    private SettingSyntheticTestArgs(SettingSyntheticTestArgs $) {
        this.disabled = $.disabled;
        this.vlans = $.vlans;
        this.wanSpeedtest = $.wanSpeedtest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingSyntheticTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingSyntheticTestArgs $;

        public Builder() {
            $ = new SettingSyntheticTestArgs();
        }

        public Builder(SettingSyntheticTestArgs defaults) {
            $ = new SettingSyntheticTestArgs(Objects.requireNonNull(defaults));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder vlans(@Nullable Output<List<SettingSyntheticTestVlanArgs>> vlans) {
            $.vlans = vlans;
            return this;
        }

        public Builder vlans(List<SettingSyntheticTestVlanArgs> vlans) {
            return vlans(Output.of(vlans));
        }

        public Builder vlans(SettingSyntheticTestVlanArgs... vlans) {
            return vlans(List.of(vlans));
        }

        public Builder wanSpeedtest(@Nullable Output<SettingSyntheticTestWanSpeedtestArgs> wanSpeedtest) {
            $.wanSpeedtest = wanSpeedtest;
            return this;
        }

        public Builder wanSpeedtest(SettingSyntheticTestWanSpeedtestArgs wanSpeedtest) {
            return wanSpeedtest(Output.of(wanSpeedtest));
        }

        public SettingSyntheticTestArgs build() {
            return $;
        }
    }

}
