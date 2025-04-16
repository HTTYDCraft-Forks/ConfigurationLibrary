package com.httydcraft.configuration;

import org.bukkit.configuration.ConfigurationSection;

import com.httydcraft.configuration.holders.BukkitConfigurationHolder;
import com.httydcraft.configuration.processor.DefaultConfigurationProcessor;

public class BukkitConfigurationProcessor extends DefaultConfigurationProcessor {
	public BukkitConfigurationProcessor() {
		registerConfigurationHolderWrapper(ConfigurationSection.class,
				BukkitConfigurationHolder::new);
	}
}
