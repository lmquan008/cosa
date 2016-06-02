package com.cosa.mc.api.com;

public interface ConditionalExpression {
	ContextVariable getVariable();
	Operator getOperator();
	Value getValue();
	
}
