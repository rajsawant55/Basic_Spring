package com.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.ShapeService;

public class MainAop {
	
	public static void main(String args[]) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
	ShapeService ss = ctx.getBean("shapeservice",ShapeService.class);
	//ss.getCircle().setreturnedName("Minal");
	ss.getCircle().setName("Rajesh");
	//System.out.println(ss.getCircle().getName());
	}
}
