
package com.demo.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.User;

public class Application {
	public static void main(String args[]) {
	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	context.registerShutdownHook();
	User user = (User) context.getBean("userbean");
	user.display();
	}
}
