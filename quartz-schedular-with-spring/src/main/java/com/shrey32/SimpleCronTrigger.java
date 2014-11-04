package com.shrey32;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleCronTrigger {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"schedule-config.xml");
	}
}
