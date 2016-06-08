package com.cosa.mc.impl.core;

import java.time.LocalDate;

import com.cosa.mc.api.core.Control;
import com.cosa.mc.api.core.Rule;
import com.cosa.mc.api.core.RuleCondition;
import com.cosa.mc.api.core.RuleSet;
import com.cosa.mc.api.value.Value;

public abstract class AbstractRule implements Rule {

	transient private RuleSet ruleSet;
	private LocalDate startDate;
	private LocalDate endDate;

	@Override
	public Value getValue() {
		// TODO Auto-generated method stub
		return null;
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
		return null;
	}
	
	@Override
	public Control getControl() {
		// TODO Auto-generated method stub
		return this.ruleSet.getControl();
	}

}
