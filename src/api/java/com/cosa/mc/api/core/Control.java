package com.cosa.mc.api.core;

import java.util.List;

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
	int[] getZones();
}
