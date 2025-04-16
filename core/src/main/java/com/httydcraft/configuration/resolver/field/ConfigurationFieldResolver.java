package com.httydcraft.configuration.resolver.field;

import com.httydcraft.configuration.resolver.field.base.ConfigurationCollectionFieldFactory;
import com.httydcraft.configuration.context.ConfigurationFieldResolverContext;

public interface ConfigurationFieldResolver<T> {
    T resolveField(ConfigurationFieldResolverContext resolverContext);

    /**
     * Resolves can field resolver interact with another resolver.
     * For example {@link ConfigurationCollectionFieldFactory} will call this method providing ConfigurationCollectionFieldFactory class
     * and you can return false if you prefer resolve collection yourself.
     */
    default boolean canInteract(Class<?> clazz) {
        return true;
    }
}
