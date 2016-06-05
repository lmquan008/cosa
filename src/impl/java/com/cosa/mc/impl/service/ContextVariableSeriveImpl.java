package com.cosa.mc.impl.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cosa.mc.api.ele.ContextVariable;
import com.cosa.mc.api.service.ContextVariableService;


@Service
@Qualifier("contextVariableSeriveImpl")
public class ContextVariableSeriveImpl implements ContextVariableService{


	@Override
	public ContextVariable getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
