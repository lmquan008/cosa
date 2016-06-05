package com.cosa.mc.impl.ele;

import com.cosa.mc.api.ele.Control;
import com.cosa.mc.api.ele.RuleSet;

public abstract class AbstractControl implements Control{
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
