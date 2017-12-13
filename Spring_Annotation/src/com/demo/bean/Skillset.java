package com.demo.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Skillset {

	private String skill;

	public Skillset() {
		super();
	}
	public Skillset(String skill) {
		super();
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}
	@Required
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
