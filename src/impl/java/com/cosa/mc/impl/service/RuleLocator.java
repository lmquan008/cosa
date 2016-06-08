package com.cosa.mc.impl.service;

import java.util.List;

import com.cosa.mc.api.core.RuleSet;

public class RuleLocator {
	
	List<RuleSet> ruleSets;
	
	public RuleLocator loadFromDatabase(){
		return this;
	}
	
	public List<RuleSet> getRuleSets() {
		return ruleSets;
	}
}
