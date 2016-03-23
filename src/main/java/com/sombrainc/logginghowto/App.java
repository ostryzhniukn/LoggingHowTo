package com.sombrainc.logginghowto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.trace("Message");
		LOGGER.debug("Message");
		LOGGER.info("Message");
		LOGGER.warn("Message");
		LOGGER.error("Message");

		try {
			wrongMethod();
		} catch (RuntimeException e) {
			LOGGER.error("Some message.. ", e);
		}
	}

	private static void wrongMethod() {
		throw new RuntimeException("I'm a bad method");
	}

}
