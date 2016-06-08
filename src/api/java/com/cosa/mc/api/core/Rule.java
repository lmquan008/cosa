package com.cosa.mc.api.core;

import java.time.LocalDate;

import com.cosa.mc.api.value.Value;

/**
 * 
 * 
 * 
 * @author QuanLe
 *
 */
public interface Rule {
	Value getValue();
	Boolean isDefault();
	LocalDate getStartDate();
	LocalDate getEndDate();
	RuleCondition getRuleCondition();
	Control getControl();
}
