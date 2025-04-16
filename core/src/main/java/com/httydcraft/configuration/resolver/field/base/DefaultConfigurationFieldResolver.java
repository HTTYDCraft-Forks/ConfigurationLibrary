package com.httydcraft.configuration.resolver.field.base;

import com.httydcraft.configuration.context.ConfigurationFieldResolverContext;
import com.httydcraft.configuration.resolver.field.ConfigurationFieldResolver;

public class DefaultConfigurationFieldResolver<T> implements ConfigurationFieldResolver<T> {

    @SuppressWarnings("unchecked")
    @Override
    public T resolveField(ConfigurationFieldResolverContext resolverContext) {
        return (T) resolverContext.getConfigurationObject();
    }
}
