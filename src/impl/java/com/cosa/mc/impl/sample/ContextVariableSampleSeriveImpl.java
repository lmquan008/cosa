package com.cosa.mc.impl.sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cosa.mc.api.core.ContextVariable;
import com.cosa.mc.api.core.Control;
import com.cosa.mc.api.service.ContextVariableService;
import com.cosa.mc.impl.service.ControlLocator;
import com.cosa.mc.impl.util.XMLStreamService;

@Service
@Qualifier("contextVariableSampleService")
public class ContextVariableSampleSeriveImpl implements ContextVariableService {
	Map<String, ContextVariable> contextVariableMap = new HashMap<>();

	public ContextVariableSampleSeriveImpl() {
		scan();
	}

	protected void scan() {
		/*
		 * ContextObject obj = Student.class.getAnnotation(ContextObject.class);
		 * String name = obj.name();
		 * 
		 * Method[] methods = Student.class.getMethods(); String pid =
		 * StringUtils.EMPTY; String pname = StringUtils.EMPTY; String
		 * assessPath = StringUtils.EMPTY; for(Method m : methods){
		 * ContextProperty contextProperty =
		 * m.getAnnotation(ContextProperty.class); if(contextProperty == null)
		 * continue; pid = contextProperty.id(); pname = contextProperty.name();
		 * assessPath = m.getName(); }
		 * 
		 * System.out.println("The Object Name is : "+ name);
		 * System.out.println("The Method ID is : "+ pid); System.out.println(
		 * "The Method Name is : "+ assessPath);
		 * 
		 * ContextVariable ctxVar = new ContextVariableImpl(pid, name,
		 * assessPath); System.out.println(ctxVar);
		 * 
		 * Map<String, ContextVariable> cm = new HashMap<>(); cm.put(pid,
		 * ctxVar);
		 * 
		 * this.contextVariableMap = Collections.unmodifiableMap(cm);
		 */

		Control control = ControlLocator.createControl("C00001", "StudentEnrol", "Control Enrol", new int[] { 1, 2 });

		String x = new XMLStreamService().toXml(control);
		System.out.println(x);

	}

	@Override
	public ContextVariable getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
