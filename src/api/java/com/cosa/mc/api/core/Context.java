package com.cosa.mc.api.core;

import java.util.Map;

/**
 * 
 * Context interface uses for evaluator to retrieve the object Map
 * This is a data source for evaluator to query the value of context variable
 * 
 * @author QuanLe
 *
 */
public interface Context {
	Map<String, Object> getContextMap();
}
