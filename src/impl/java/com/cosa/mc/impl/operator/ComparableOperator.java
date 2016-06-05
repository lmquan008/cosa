package com.cosa.mc.impl.operator;

import com.cosa.mc.api.ele.Operator;
import com.cosa.mc.api.ele.Value;
import com.cosa.mc.impl.value.BooleanValue;

public abstract class ComparableOperator implements Operator{
	
	@Override
	public BooleanValue produce(Value v1, Value v2) {
		return BooleanValue.create(v1.compareTo(v2) > 0);
	}

	@Override
	public Value produce(Value v) {
		throw new UnsupportedOperationException();
	}

}
