package com.httydcraft.configuration.holder.factory;

import com.httydcraft.configuration.holder.ConfigurationSectionHolder;

public interface ConfigurationSectionHolderFactory<T> {
	ConfigurationSectionHolder wrap(T object);
}
