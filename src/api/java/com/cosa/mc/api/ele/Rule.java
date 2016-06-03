package com.cosa.mc.api.ele;

import java.time.LocalDate;

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
}
