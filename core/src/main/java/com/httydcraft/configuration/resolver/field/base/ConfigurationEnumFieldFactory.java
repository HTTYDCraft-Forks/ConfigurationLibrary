package com.httydcraft.configuration.resolver.field.base;

import com.httydcraft.configuration.context.ConfigurationFieldFactoryContext;
import com.httydcraft.configuration.resolver.field.ConfigurationFieldResolver;
import com.httydcraft.configuration.resolver.field.ConfigurationFieldResolverFactory;

public class ConfigurationEnumFieldFactory implements ConfigurationFieldResolverFactory {
	@Override
	public ConfigurationFieldResolver<?> createResolver(ConfigurationFieldFactoryContext factoryContext) {
		return (context) -> getEnum(context.valueType(), factoryContext.getString());
	}

	@SuppressWarnings("unchecked")
	private <T extends Enum<T>> Enum<T> getEnum(Class<?> clazz, String enumString) {
		if (enumString == null)
			return null;
		return Enum.valueOf((Class<T>) clazz, enumString);
	}
}
