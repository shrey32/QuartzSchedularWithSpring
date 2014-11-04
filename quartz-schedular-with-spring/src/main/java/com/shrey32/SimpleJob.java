package com.shrey32;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SimpleJob extends QuartzJobBean {
	protected final Log logger = LogFactory.getLog(getClass());
	private SimpleTask simpleTask;
	private String message;

	public void setSimpleTask(SimpleTask simpleTask) {
		this.simpleTask = simpleTask;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		logger.info("executing simple task");
		simpleTask.createSimpleTask(message);
	}

}
