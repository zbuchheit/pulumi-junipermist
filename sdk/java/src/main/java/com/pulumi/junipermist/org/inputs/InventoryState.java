// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.InventoryDeviceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryState extends com.pulumi.resources.ResourceArgs {

    public static final InventoryState Empty = new InventoryState();

    @Import(name="devices")
    private @Nullable Output<List<InventoryDeviceArgs>> devices;

    public Optional<Output<List<InventoryDeviceArgs>>> devices() {
        return Optional.ofNullable(this.devices);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    private InventoryState() {}

    private InventoryState(InventoryState $) {
        this.devices = $.devices;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryState $;

        public Builder() {
            $ = new InventoryState();
        }

        public Builder(InventoryState defaults) {
            $ = new InventoryState(Objects.requireNonNull(defaults));
        }

        public Builder devices(@Nullable Output<List<InventoryDeviceArgs>> devices) {
            $.devices = devices;
            return this;
        }

        public Builder devices(List<InventoryDeviceArgs> devices) {
            return devices(Output.of(devices));
        }

        public Builder devices(InventoryDeviceArgs... devices) {
            return devices(List.of(devices));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public InventoryState build() {
            return $;
        }
    }

}
