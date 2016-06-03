package com.cosa.mc.api.ele;

public interface ConditionalExpression {
	ContextVariable getVariable();
	Operator getOperator();
	Value getValue();
}
