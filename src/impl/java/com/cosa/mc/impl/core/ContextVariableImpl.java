package com.cosa.mc.impl.core;

import com.cosa.mc.api.core.Context;
import com.cosa.mc.api.core.ContextVariable;
import com.cosa.mc.api.value.Value;

public class ContextVariableImpl implements ContextVariable {

	public ContextVariableImpl(String id, String objectName, String accessPath) {
		super();
		this.id = id;
		this.objectName = objectName;
		this.accessPath = accessPath;
	}

	String id;
	String objectName;
	String accessPath;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getObjectName() {
		return objectName;
	}

	@Override
	public String getAccessPath() {
		// TODO Auto-generated method stub
		return accessPath;
	}

	@Override
	public Value eval(Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "ContextVariableImpl [id=" + id + ", objectName=" + objectName + ", accessPath=" + accessPath + "]";
	}

}
