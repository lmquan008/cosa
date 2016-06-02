package com.cosa.mc.api.com;

import com.cosa.mc.api.Context;

/**
 * 
 * A value is returned when evaluating an Control.
 * A value can be evaluated again and return a new value
 * until there is no value need to be replaced
 * 
 * @author QuanLe
 *
 */
public interface Value {
	
	Value getResolvedValue(Context context);
	Value getUnresolvedValue();
	Value getValue();
}
