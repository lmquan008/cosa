package com.cosa.mc.api.core;

import com.cosa.mc.api.operator.Operator;
import com.cosa.mc.api.value.Value;

public interface ConditionalExpression {
	ContextVariable getVariable();
	Operator getOperator();
	Value getExpectedValue();
	Value eval(Context context);
}
