package com.cosa.mc.api.operator;

import com.cosa.mc.api.value.Value;

public interface Operator{
	Value produce(Value v1, Value v2);
	Value produce(Value v);
}
