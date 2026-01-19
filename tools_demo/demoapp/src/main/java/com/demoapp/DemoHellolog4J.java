package com.demoapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoHellolog4J {
	private static Logger logger=LoggerFactory.getLogger(DemoHellolog4J.class);
	public static void main(String args[]) {
		logger.info("this is logging");
	}
}
