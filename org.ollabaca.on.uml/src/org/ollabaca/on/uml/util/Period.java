package org.ollabaca.on.uml.util;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Period {

	static final Pattern PATTERN = Pattern
			.compile("([0-9]{4})-([0-9]{2})-([0-9]{2})\\s+-\\s+([0-9]{4})-([0-9]{2})-([0-9]{2})");

	Date start;

	Date end;

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public int getWorkingDays() {
		Calendar s = Calendar.getInstance();
		s.setTime(this.start);
		Calendar e = Calendar.getInstance();
		e.setTime(this.end);

		int workingDays = 0;
		while (s.before(e) || s.equals(e)) {

			if (s.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
					&& s.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				workingDays++;
			}
			s.add(Calendar.DAY_OF_MONTH, 1);
		}
		return workingDays;
	}

	public static Period parse(String s) {
		Matcher matcher = PATTERN.matcher(s);
		if (!matcher.matches()) {
			throw new RuntimeException(String.format(
					"[%s] does not match [%s]", s, PATTERN.pattern()));
		}

		Period period = new Period();
		Calendar calendar = Calendar.getInstance();

		calendar.set(Integer.parseInt(matcher.group(1)),
				Integer.parseInt(matcher.group(2)) - 1,
				Integer.parseInt(matcher.group(3)));
		period.setStart(calendar.getTime());

		calendar.set(Integer.parseInt(matcher.group(4)),
				Integer.parseInt(matcher.group(5)) - 1,
				Integer.parseInt(matcher.group(6)));
		period.setEnd(calendar.getTime());

		return period;
	}

	public Period union(Period period) {
		Period union = new Period();

		union.setStart(this.start.before(period.start) ? this.start
				: period.start);
		union.setEnd(this.end.after(period.end) ? this.end : period.end);

		return union;
	}

	@Override
	public String toString() {
		return String.format("%tF - %tF", this.start, this.end);
	}

}
