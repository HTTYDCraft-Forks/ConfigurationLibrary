package com.httydcraft.configuration;

import com.httydcraft.configuration.holder.VelocityConfigurationHolder;
import com.httydcraft.configuration.processor.DefaultConfigurationProcessor;

import ninja.leaping.configurate.ConfigurationNode;

public class VelocityConfigurationProcessor extends DefaultConfigurationProcessor {
	public VelocityConfigurationProcessor() {
		registerConfigurationHolderWrapper(ConfigurationNode.class, VelocityConfigurationHolder::new);
	}
}
