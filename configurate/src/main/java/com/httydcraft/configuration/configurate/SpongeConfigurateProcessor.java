package com.httydcraft.configuration.configurate;

import com.httydcraft.configuration.configurate.holder.ConfigurationNodeHolder;
import com.httydcraft.configuration.processor.DefaultConfigurationProcessor;

import org.spongepowered.configurate.ConfigurationNode;

public class SpongeConfigurateProcessor extends DefaultConfigurationProcessor {
    public SpongeConfigurateProcessor() {
        registerConfigurationHolderWrapper(ConfigurationNode.class, ConfigurationNodeHolder::new);
    }
}
