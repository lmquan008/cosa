package com.cosa.mc.api.ele;

/**
 * 
 * A control has a set of rule
 * 
 * @author QuanLe
 *
 */
public interface Control {
	String getId();
	String getName();
	String getDescription();
	RuleSet getRuleSet();
	RuleSet getDefaultRuleSet();
}
