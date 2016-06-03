package com.cosa.mc.api.ele;

/**
 * A variable is configured so that the Evaluator can get the values 
 * based on the condition and context.
 * 
 * @author QuanLe
 *
 */
public interface ContextVariable  {
	Integer getId();
	String getClassName();
	String getAccessPath();
}
