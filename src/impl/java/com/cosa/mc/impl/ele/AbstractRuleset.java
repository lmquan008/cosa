package com.cosa.mc.impl.ele;

import java.util.Collections;
import java.util.Set;

import com.cosa.mc.api.ele.Control;
import com.cosa.mc.api.ele.Rule;
import com.cosa.mc.api.ele.RuleSet;

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
