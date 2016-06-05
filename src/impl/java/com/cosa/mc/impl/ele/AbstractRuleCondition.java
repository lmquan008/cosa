package com.cosa.mc.impl.ele;

import java.util.Collections;
import java.util.List;

import com.cosa.mc.api.ele.ConditionalExpression;
import com.cosa.mc.api.ele.RuleCondition;

public class AbstractRuleCondition implements RuleCondition{
	private List<ConditionalExpression> expressions;
	
	@Override
	public List<ConditionalExpression> getExpressions() {
		return Collections.unmodifiableList(expressions);
	}
}
