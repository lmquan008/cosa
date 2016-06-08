package com.cosa.mc.api.core;

import com.cosa.mc.api.value.Value;

/**
 * A variable is configured so that the Evaluator can get the value 
 * based on the context.
 * 
 * @author QuanLe
 *
 */
public interface ContextVariable  {
	String getId();
	String getObjectName();
	String getAccessPath();
	Value eval(Context context);
}
