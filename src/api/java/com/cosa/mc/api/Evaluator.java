package com.cosa.mc.api;

import com.cosa.mc.api.ele.Control;
import com.cosa.mc.api.ele.Value;

public interface Evaluator {
	Value eval(Control control, Context context);
}
