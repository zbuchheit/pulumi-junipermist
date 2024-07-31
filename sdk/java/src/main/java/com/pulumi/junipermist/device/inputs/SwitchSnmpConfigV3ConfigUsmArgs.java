// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.SwitchSnmpConfigV3ConfigUsmUserArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchSnmpConfigV3ConfigUsmArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchSnmpConfigV3ConfigUsmArgs Empty = new SwitchSnmpConfigV3ConfigUsmArgs();

    /**
     * enum: `local_engine`, `remote_engine`
     * 
     */
    @Import(name="engineType")
    private @Nullable Output<String> engineType;

    /**
     * @return enum: `local_engine`, `remote_engine`
     * 
     */
    public Optional<Output<String>> engineType() {
        return Optional.ofNullable(this.engineType);
    }

    /**
     * required only if `engine_type`==`remote_engine`
     * 
     */
    @Import(name="engineid")
    private @Nullable Output<String> engineid;

    /**
     * @return required only if `engine_type`==`remote_engine`
     * 
     */
    public Optional<Output<String>> engineid() {
        return Optional.ofNullable(this.engineid);
    }

    @Import(name="users")
    private @Nullable Output<List<SwitchSnmpConfigV3ConfigUsmUserArgs>> users;

    public Optional<Output<List<SwitchSnmpConfigV3ConfigUsmUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private SwitchSnmpConfigV3ConfigUsmArgs() {}

    private SwitchSnmpConfigV3ConfigUsmArgs(SwitchSnmpConfigV3ConfigUsmArgs $) {
        this.engineType = $.engineType;
        this.engineid = $.engineid;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchSnmpConfigV3ConfigUsmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchSnmpConfigV3ConfigUsmArgs $;

        public Builder() {
            $ = new SwitchSnmpConfigV3ConfigUsmArgs();
        }

        public Builder(SwitchSnmpConfigV3ConfigUsmArgs defaults) {
            $ = new SwitchSnmpConfigV3ConfigUsmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param engineType enum: `local_engine`, `remote_engine`
         * 
         * @return builder
         * 
         */
        public Builder engineType(@Nullable Output<String> engineType) {
            $.engineType = engineType;
            return this;
        }

        /**
         * @param engineType enum: `local_engine`, `remote_engine`
         * 
         * @return builder
         * 
         */
        public Builder engineType(String engineType) {
            return engineType(Output.of(engineType));
        }

        /**
         * @param engineid required only if `engine_type`==`remote_engine`
         * 
         * @return builder
         * 
         */
        public Builder engineid(@Nullable Output<String> engineid) {
            $.engineid = engineid;
            return this;
        }

        /**
         * @param engineid required only if `engine_type`==`remote_engine`
         * 
         * @return builder
         * 
         */
        public Builder engineid(String engineid) {
            return engineid(Output.of(engineid));
        }

        public Builder users(@Nullable Output<List<SwitchSnmpConfigV3ConfigUsmUserArgs>> users) {
            $.users = users;
            return this;
        }

        public Builder users(List<SwitchSnmpConfigV3ConfigUsmUserArgs> users) {
            return users(Output.of(users));
        }

        public Builder users(SwitchSnmpConfigV3ConfigUsmUserArgs... users) {
            return users(List.of(users));
        }

        public SwitchSnmpConfigV3ConfigUsmArgs build() {
            return $;
        }
    }

}
