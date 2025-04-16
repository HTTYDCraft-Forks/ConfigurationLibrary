package com.httydcraft.configuration.processor.exception;

import com.httydcraft.configuration.context.ConfigurationFieldFactoryContext;

public class ImportantFieldNotInitializedException extends Exception {

	private final ConfigurationFieldFactoryContext fieldContext;

	public ImportantFieldNotInitializedException(ConfigurationFieldFactoryContext fieldContext) {
		this.fieldContext = fieldContext;
	}

	public ConfigurationFieldFactoryContext getFieldContext() {
		return fieldContext;
	}

}
