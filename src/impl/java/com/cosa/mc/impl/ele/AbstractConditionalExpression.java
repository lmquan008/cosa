package com.cosa.mc.impl.ele;

import com.cosa.mc.api.Context;
import com.cosa.mc.api.ele.ConditionalExpression;
import com.cosa.mc.api.ele.ContextVariable;
import com.cosa.mc.api.ele.Value;
import com.cosa.mc.impl.operator.ComparableOperator;
import com.cosa.mc.impl.value.BooleanValue;

public abstract class AbstractConditionalExpression implements ConditionalExpression {

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
