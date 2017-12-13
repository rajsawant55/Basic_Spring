package com.demo.bean;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;


public class User {

	private String name;
	private int id;
	//Set<Skillset> skills = new HashSet<Skillset>();
	
	Skillset skill;
	
	
	
	public User()
	{
		super();
	}
	
	public User(String name)
	{
		this.name = name;
	}
	
	
	public User(int id)
	{
		this.id = id;
	}
	
	public User(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		
		return name;
	}

	public Skillset getSkill() {
		return skill;
	}

	
	@Autowired
	//@Qualifier("skillb")
	@Resource(name="skilla")
	public void setSkill(Skillset skill) {
		this.skill = skill;
	}

	

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display()
	{
		System.out.println(getSkill().getSkill());
		
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("my init called");
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("my destroy called");
	}
}
