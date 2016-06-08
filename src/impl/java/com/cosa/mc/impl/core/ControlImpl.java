package com.cosa.mc.impl.core;

import java.util.Collections;
import java.util.List;

import com.cosa.mc.api.core.Control;
import com.cosa.mc.api.core.RuleSet;

public class ControlImpl implements Control{
	private String id;
	private String name;
	private String description;
	private RuleSet ruleSet = new RuleSetImpl();
	private RuleSet defaultRuleSet  = new RuleSetImpl();
	
	private int[] zones;
	private String[] requiredContextObjects;
	
	
	
	public ControlImpl(String id, String name, String description, int[] zones, String[] requiredContextObjects) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.zones = zones;
		this.requiredContextObjects = requiredContextObjects;
	}

	
	
	@Override
	public RuleSet getRuleSet() {
		if(ruleSet != null){
			return ruleSet;
		}
		return null;
	}
	
	@Override
	public RuleSet getDefaultRuleSet() {
		if(defaultRuleSet != null){
			return defaultRuleSet;
		}
		return null;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public int[] getZones() {
		return zones;
	}
}
