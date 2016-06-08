package com.cosa.mc.impl.core;

import java.time.LocalDate;

import com.cosa.mc.api.core.Control;
import com.cosa.mc.api.core.Rule;
import com.cosa.mc.api.core.RuleCondition;
import com.cosa.mc.api.core.RuleSet;
import com.cosa.mc.api.value.Value;

public class RuleImpl implements Rule {

	transient private RuleSet ruleSet;
	private LocalDate startDate;
	private LocalDate endDate;
	private RuleCondition ruleCondition; 
	private Value value;

	@Override
	public Value getValue() {
		return value;
	}

	@Override
	public LocalDate getStartDate() {
		return startDate;
	}

	@Override
	public LocalDate getEndDate() {
		return endDate;
	}

	@Override
	public RuleCondition getRuleCondition() {
		return ruleCondition;
	}
	
	@Override
	public Control getControl() {
		return this.ruleSet.getControl();
	}
	
	

}
