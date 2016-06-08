package com.cosa.mc.impl.value;

import com.cosa.mc.api.value.Value;

public class BooleanValue extends AbstractValue {
	private Boolean value;
	
	private BooleanValue(Boolean value){
		this.value = value;
	}
	
	public Boolean isTrue(){
		return value;
	}
	
	public static BooleanValue create(boolean value){
		return new BooleanValue(value);
	}
	
	@Override
	public int compareTo(Value o) {
		if(o == null){
			throw new IllegalArgumentException();
		}
		if(o instanceof BooleanValue){
			BooleanValue booleanVal = (BooleanValue)o;
			return this.value.compareTo(booleanVal.value);
		}
		throw new IllegalArgumentException();
		
	}


}
