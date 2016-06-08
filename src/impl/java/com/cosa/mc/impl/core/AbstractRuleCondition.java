package com.cosa.mc.impl.core;

import java.util.Collections;
import java.util.List;

import com.cosa.mc.api.core.ConditionalExpression;
import com.cosa.mc.api.core.RuleCondition;

public class AbstractRuleCondition implements RuleCondition{
	private List<ConditionalExpression> expressions;
	
	@Override
	public List<ConditionalExpression> getExpressions() {
		return Collections.unmodifiableList(expressions);
	}
}
