package com.cosa.mc.api.core;

import java.util.List;

public interface RuleCondition {
	List<ConditionalExpression> getExpressions();
}
