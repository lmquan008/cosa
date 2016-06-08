package com.cosa.mc.impl.util;

import org.springframework.stereotype.Component;

import com.cosa.mc.impl.core.ControlImpl;
import com.cosa.mc.impl.core.RuleConditionImpl;
import com.cosa.mc.impl.core.RuleImpl;
import com.cosa.mc.impl.core.RuleSetImpl;
import com.cosa.mc.impl.value.BooleanValue;
import com.thoughtworks.xstream.XStream;

@Component
public class XMLStreamService {
	
	private final XStream xStream = new XStream();
	
	public XMLStreamService() {
		this.init();
	}
	
	private void init(){
		xStream.alias("Control", ControlImpl.class);
		xStream.alias("RuleSet", RuleSetImpl.class);
		xStream.alias("Rule", RuleImpl.class);
		xStream.alias("RuleCondition",RuleConditionImpl.class);
		
		xStream.alias("BooleanValue", BooleanValue.class);
		
	}
	
	@SuppressWarnings("unchecked")
	public <T> T fromXml(String xmlControl, Class<T> cls){
		return (T) xStream.fromXML(xmlControl);
	}
	
	public String toXml(Object object){
		return xStream.toXML(object);
	}
	
}
