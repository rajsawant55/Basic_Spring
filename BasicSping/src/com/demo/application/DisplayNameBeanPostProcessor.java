package com.demo.application;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName)
	{
		System.out.println("Bean name Befor initialization is "+ beanName);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName)
	{
		System.out.println("Bean name After initialization is "+ beanName);
		return bean;
	}
}
