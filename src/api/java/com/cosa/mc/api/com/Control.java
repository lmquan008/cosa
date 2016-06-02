package com.cosa.mc.api.com;

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
	RuleSet getRuleSet();
}
