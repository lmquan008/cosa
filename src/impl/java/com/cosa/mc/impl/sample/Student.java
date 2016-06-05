package com.cosa.mc.impl.sample;

import com.cosa.mc.api.anotated.ContextObject;
import com.cosa.mc.api.anotated.ContextProperty;

@ContextObject(name="student")
public class Student {
	private String name;
	
	@ContextProperty(id="student.name", name="name")
	public String getName() {
		return name;
	}
}	
