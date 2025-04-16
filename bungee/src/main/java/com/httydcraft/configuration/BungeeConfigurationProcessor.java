package com.httydcraft.configuration;

import com.httydcraft.configuration.holders.BungeeConfigurationHolder;
import com.httydcraft.configuration.processor.DefaultConfigurationProcessor;

import net.md_5.bungee.config.Configuration;

public class BungeeConfigurationProcessor extends DefaultConfigurationProcessor {
	public BungeeConfigurationProcessor() {
		registerConfigurationHolderWrapper(Configuration.class,
				BungeeConfigurationHolder::new);
	}
}
