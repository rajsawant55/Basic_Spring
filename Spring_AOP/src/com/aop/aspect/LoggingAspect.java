package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	//@Before("execution(public String com.aop.model.Circle.getName())")
	//@Before("execution(public String getName())")
	
	@Before("getAllCircle()")
	public void loggingAdvice(JoinPoint jp)
	{
		System.out.println("Advice run ");
		System.out.println(jp.getTarget());
	}
		
	/*@After("getAllCircle()")
	public void SecondAdvice() {
		System.out.println("second advice run");
	}*/
	
	
	
	@Pointcut("execution(public * get*())")
	public void  getAll()
	{
		
	}
	@Pointcut("within(com.aop.model.Circle)")
	public void  getAllCircle()
	{
		
	}
	
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringParamMethod(String name, String returnString)
	{
		System.out.println("Paran name method called :" +name+ "the returned string is :" + returnString );
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionMethod(String name, RuntimeException ex)
	{
		System.out.println("An exception has been thrown"+ex);
	}
}
