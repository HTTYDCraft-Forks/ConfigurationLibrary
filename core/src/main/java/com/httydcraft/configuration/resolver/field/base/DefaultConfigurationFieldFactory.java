package com.httydcraft.configuration.resolver.field.base;

import com.httydcraft.configuration.ConfigurationProcessor;
import com.httydcraft.configuration.context.ConfigurationFieldFactoryContext;
import com.httydcraft.configuration.resolver.field.ConfigurationFieldResolver;
import com.httydcraft.configuration.resolver.field.ConfigurationFieldResolverFactory;
import com.httydcraft.configuration.util.ClassMap;

public class DefaultConfigurationFieldFactory implements ConfigurationFieldResolverFactory {

	private static final ConfigurationFieldResolver<?> DEFAULT_RESOLVER = new DefaultConfigurationFieldResolver<>();

	@Override
	public ConfigurationFieldResolver<?> createResolver(ConfigurationFieldFactoryContext context) {
		ConfigurationProcessor processor = context.processor();
		ClassMap<ConfigurationFieldResolver<?>> fieldResolvers = new ClassMap<>(processor.getFieldResolvers());
		return fieldResolvers.getOrDefault(context.valueType(),
				DEFAULT_RESOLVER);
	}
}
