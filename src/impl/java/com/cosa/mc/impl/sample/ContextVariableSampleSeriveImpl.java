package com.cosa.mc.impl.sample;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cosa.mc.api.anotated.ContextObject;
import com.cosa.mc.api.anotated.ContextProperty;
import com.cosa.mc.api.core.ContextVariable;
import com.cosa.mc.api.service.ContextVariableService;
import com.cosa.mc.impl.core.ContextVariableImpl;

@Service
@Qualifier("contextVariableSampleService")
public class ContextVariableSampleSeriveImpl implements ContextVariableService {
	Map<String, ContextVariable> contextVariableMap 
			= new HashMap<>();
	public ContextVariableSampleSeriveImpl() {
		scan();
	}
	
	protected void scan() {
		ContextObject obj = Student.class.getAnnotation(ContextObject.class);
		String name = obj.name();
		
		Method[] methods = Student.class.getMethods();
		String pid = StringUtils.EMPTY;
		String pname = StringUtils.EMPTY;
		String assessPath = StringUtils.EMPTY;
		for(Method m : methods){
			ContextProperty contextProperty = m.getAnnotation(ContextProperty.class);
			if(contextProperty == null) continue;
			pid = contextProperty.id();
			pname = contextProperty.name();
			assessPath = m.getName();
		}
		
		System.out.println("The Object Name is : "+ name);
		System.out.println("The Method ID is : "+ pid);
		System.out.println("The Method Name is : "+ assessPath);
		
		ContextVariable ctxVar = new ContextVariableImpl(pid, name, assessPath);
		System.out.println(ctxVar);
		
		Map<String, ContextVariable> cm = new HashMap<>();
		cm.put(pid, ctxVar);
		
		this.contextVariableMap = Collections.unmodifiableMap(cm); 
		
	}

	@Override
	public ContextVariable getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
