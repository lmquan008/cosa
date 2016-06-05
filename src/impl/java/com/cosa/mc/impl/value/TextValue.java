package com.cosa.mc.impl.value;

import com.cosa.mc.api.ele.Value;

/**
 * A value with string inside
 * 
 * @author QuanLe
 *
 */
public class TextValue extends AbstractValue {

	private String value;
	
	private TextValue(String val) {
		this.value = val;
	}
	
	@Override
	public int compareTo(Value o) {
		if(o == null){
			throw new IllegalArgumentException();
		}
		if(o instanceof TextValue){
			TextValue textVal = (TextValue)o;
			return this.value.compareTo(textVal.value);
		}
		throw new IllegalArgumentException();
	}
	
	public static TextValue create(String val){
		return new TextValue(val);
	}

}
