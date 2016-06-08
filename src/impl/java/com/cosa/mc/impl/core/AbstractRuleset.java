package com.cosa.mc.impl.core;

import java.util.Collections;
import java.util.Set;

import com.cosa.mc.api.core.Control;
import com.cosa.mc.api.core.Rule;
import com.cosa.mc.api.core.RuleSet;

public abstract class AbstractRuleset implements RuleSet {
	
	private Set<Rule> rules;
	transient Control control;
	
	@Override
	public Set<Rule> getRules() {
		// TODO Auto-generated method stub
		return Collections.unmodifiableSet(rules);
	}

	@Override
	public Control getControl() {
		// TODO Auto-generated method stub
		return control;
	}

}
