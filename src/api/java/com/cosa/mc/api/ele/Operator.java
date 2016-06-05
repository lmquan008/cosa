package com.cosa.mc.api.ele;

public interface Operator{
	Value produce(Value v1, Value v2);
	Value produce(Value v);
}
