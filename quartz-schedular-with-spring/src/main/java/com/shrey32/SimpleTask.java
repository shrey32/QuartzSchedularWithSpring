package com.shrey32;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SimpleTask {

	protected final Log logger = LogFactory.getLog(getClass());

	public void createSimpleTask(String message) {
		logger.info(message);
	}

}
