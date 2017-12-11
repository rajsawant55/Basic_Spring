package com.demo.bean;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User {

	private String name;
	private int id;
	//Set<Skillset> skills = new HashSet<Skillset>();
	
	Skillset skilla;
	Skillset skillb;
	
	
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
	
	/*public User(Set<Skillset> skills) {
		super();
		this.skills = skills;
	}*/
	public User(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	/*public User(int id,String name,Set skill)
	{
		this.id = id;
		this.name = name;
		this.skills = skills;
	}
	
	*/
	/*public Set<Skillset> getSkills() {
		return skills;
	}
	public void setSkills(Set<Skillset> skills) {
		this.skills = skills;
	}*/
	public int getId() {
		
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		
		return name;
	}

	public Skillset getSkilla() {
		return skilla;
	}

	public void setSkilla(Skillset skilla) {
		this.skilla = skilla;
	}

	public Skillset getSkillb() {
		return skillb;
	}

	public void setSkillb(Skillset skillb) {
		this.skillb = skillb;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*public void display()
	{
		for(Skillset s:skills)
		{
			System.out.println(s.getSkill());
		}
	}*/
	
	public void display()
	{
		System.out.println(getSkilla().getSkill());
		System.out.println(getSkillb().getSkill());
	}
	
	
	/*public void display() {
		System.out.println(getId());
		System.out.println(getName());
	}*/

	/*@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy called from User");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init called from User");
	}*/
	
	
	public void myInit()
	{
		System.out.println("my init called");
	}
	
	public void myDestroy()
	{
		System.out.println("my destroy called");
	}
	
}
