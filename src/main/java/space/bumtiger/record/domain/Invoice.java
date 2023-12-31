package space.bumtiger.record.domain;

import java.util.Calendar;

import org.apache.commons.lang3.StringUtils;

public record Invoice(String id, float amount) {

	static Calendar instance = Calendar.getInstance();
	static String monStr = String.valueOf(instance.get(Calendar.MONTH) + 1);
	static String monStrPadded = StringUtils.leftPad(monStr, 2, "0");

	static String prefix = String.valueOf(instance.get(Calendar.YEAR))
			+ monStrPadded;

	public Invoice {
		id = prefix + id.trim();
		if (amount < 0) {
			throw new IllegalArgumentException("-ve values not allowed");
			// -ve : negative, +ve : positive
		}
		// amount=amount; // 효과 없는 문장
	}
	
	public Invoice(String id) {
		this(id, 0.f);
	}
}
