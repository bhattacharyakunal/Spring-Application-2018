package com.kunal.iobrains.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private static final Logger LOGGER=LoggerFactory.getLogger(TestController.class);
	@RequestMapping("/applicationTest")
	public String testMessage() {
		LOGGER.debug("This is a test message ::::::::::::::::::");
		LOGGER.info("This is a test message ::::::::::::::::::");
		LOGGER.warn("This is a test message ::::::::::::::::::");
		LOGGER.error("This is a test message ::::::::::::::::::");
		LOGGER.trace("This is a test message ::::::::::::::::::");
		return "Success";
	}
}
