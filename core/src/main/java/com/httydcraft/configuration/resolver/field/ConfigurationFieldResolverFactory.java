package com.httydcraft.configuration.resolver.field;

import com.httydcraft.configuration.resolver.field.base.ConfigurationCollectionFieldFactory;
import com.httydcraft.configuration.context.ConfigurationFieldFactoryContext;

public interface ConfigurationFieldResolverFactory {
	ConfigurationFieldResolver<?> createResolver(ConfigurationFieldFactoryContext context);

	/**
	 * Resolves can field resolver factory interact with another resolver factory.
	 * For example {@link ConfigurationCollectionFieldFactory} will call this method providing ConfigurationCollectionFieldFactory class
	 * and you can return false if you prefer resolve collection yourself.
	 */
	default boolean canInteract(Class<?> clazz) {
		return true;
	}
}
