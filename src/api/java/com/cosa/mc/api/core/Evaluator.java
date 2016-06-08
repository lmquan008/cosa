package com.cosa.mc.api.core;

import com.cosa.mc.api.value.Value;

public interface Evaluator {
	Value eval(Control control, Context context);
}
