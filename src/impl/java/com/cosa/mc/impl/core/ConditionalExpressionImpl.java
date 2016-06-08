package com.cosa.mc.impl.core;

import com.cosa.mc.api.core.ConditionalExpression;
import com.cosa.mc.api.core.Context;
import com.cosa.mc.api.core.ContextVariable;
import com.cosa.mc.api.value.Value;
import com.cosa.mc.impl.operator.ComparableOperator;
import com.cosa.mc.impl.value.BooleanValue;

public abstract class ConditionalExpressionImpl implements ConditionalExpression {

	private ContextVariable variable;
	private ComparableOperator operator;
	private Value expectedValue;
	
	@Override
	public ContextVariable getVariable() {
		return variable;
	}

	@Override
	public ComparableOperator getOperator() {
		return operator;
	}

	@Override
	public Value getExpectedValue() {
		return expectedValue;
	}
	
	
	@Override
	public BooleanValue eval(Context context) {
		return operator.produce(expectedValue, variable.eval(context));
	}
	
	

}
