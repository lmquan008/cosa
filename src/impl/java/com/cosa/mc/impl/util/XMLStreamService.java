package com.cosa.mc.impl.util;

import org.springframework.stereotype.Component;

import com.cosa.mc.impl.core.ControlImpl;
import com.thoughtworks.xstream.XStream;

@Component
public class XMLStreamService {
	
	private final XStream xStream = new XStream();
	
	public XMLStreamService() {
		this.init();
	}
	
	private void init(){
		xStream.alias("Control", ControlImpl.class);
		//xStream.alias("Rule", AbstractR.class);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T fromXml(String xmlControl, Class<T> cls){
		return (T) xStream.fromXML(xmlControl);
	}
	
	public String toXml(Object object){
		return xStream.toXML(object);
	}
	
}
