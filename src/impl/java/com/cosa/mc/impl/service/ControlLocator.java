package com.cosa.mc.impl.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cosa.mc.api.core.Control;
import com.cosa.mc.impl.core.ControlImpl;

public class ControlLocator {
	
	private Map<Integer, Control> controlMap = new HashMap<>();
	
	//get xml path from properties
	public ControlLocator loadFromXml(String xmlPath){
		
		
		return this;
	}
	
	public ControlLocator loadFromDatabase(){
		return this;
	}
	
	public Map<Integer, Control> getControlMap(){
		return Collections.unmodifiableMap(controlMap);
	}
	
	
	public static ControlLocator create(){
		return new ControlLocator();
	}
	
	public static Control createControl(String id,String name,String description, int[] zones){
		return new ControlImpl(id, name, description, zones, new String[]{"student"});
	}
}
