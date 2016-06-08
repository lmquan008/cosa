package com.cosa.mc.impl.core;

import com.cosa.mc.api.core.Control;
import com.cosa.mc.api.core.RuleSet;

public abstract class ControlImpl implements Control{
	private String id;
	private String name;
	private String description;
	private RuleSet ruleSet;
	private RuleSet defaultRuleSet;
	
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
}
