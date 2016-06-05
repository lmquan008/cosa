package com.cosa.mc.api.ele;

import com.cosa.mc.api.Context;

public interface ConditionalExpression {
	ContextVariable getVariable();
	Operator getOperator();
	Value getExpectedValue();
	Value eval(Context context);
}
