package com.cosa.mc.api.core;

import java.util.Set;

/**
 * 
 * 
 * @author QuanLe
 *
 */
public interface RuleSet {
	Set<Rule> getRules();
	Control getControl();
}
