package com.cosa.mc.impl.value;

import com.cosa.mc.api.core.Context;
import com.cosa.mc.api.value.Value;

public abstract class AbstractValue implements Value{

	
	@Override
	public Value getResolvedValue(Context context) {
		return this;
	}

	@Override
	public Value getUnresolvedValue() {
		return this;
	}

	@Override
	public Value getValue() {
		return this;
	}

}
