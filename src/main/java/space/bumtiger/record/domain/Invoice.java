package space.bumtiger.record.domain;

import java.util.Calendar;

import org.apache.commons.lang3.StringUtils;

public record Invoice(String id, float amount) {

	static Calendar instance = Calendar.getInstance();
	static String monStr = String.valueOf(instance.get(Calendar.MONTH) + 1);
	static String monStrPadded = StringUtils.leftPad(monStr, 2, "0");
	
	static String prefix = String
			.valueOf(instance.get(Calendar.YEAR))
			+ monStrPadded;

	public Invoice(String id, float amount) {
		this.id = prefix + "_" + id.trim();
		this.amount = amount;
	}

}
