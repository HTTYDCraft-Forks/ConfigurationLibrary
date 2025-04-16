package com.httydcraft.configuration.test;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

import com.httydcraft.configuration.ConfigurationProcessor;
import com.httydcraft.configuration.holders.BukkitConfigurationHolder;
import com.httydcraft.configuration.processor.DefaultConfigurationProcessor;
import com.httydcraft.configuration.test.PersonTestConfiguration.PersonId;

public class TestMain extends JavaPlugin {
	private static final ConfigurationProcessor CONFIGURATION_PROCESSOR = new DefaultConfigurationProcessor()
			.registerConfigurationHolderWrapper(ConfigurationSection.class, BukkitConfigurationHolder::new)
			.registerFieldResolver(PersonId.class, (context) -> new PersonId(context.getString()));

	@Override
	public void onEnable() {
		saveDefaultConfig();
		new PrimitiveTestConfiguration(getConfig().getConfigurationSection("primitive-test"));
		new ListTestConfiguration(getConfig().getConfigurationSection("list-test"));
		new PersonTestConfiguration(getConfig());
		new EnumTestConfiguration(getConfig().getConfigurationSection("enum-test"));
	}

	public static ConfigurationProcessor getConfigurationProcessor() {
		return CONFIGURATION_PROCESSOR;
	}
}
