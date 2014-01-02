package org.ollabaca.on.gtbr.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
	
	public static final String ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss.SSXXX";

	public static Date fromString(String s) {
		try {
			SimpleDateFormat format = new SimpleDateFormat(ISO_8601);
			return format.parse(s);
		} catch (ParseException e) {
			System.out.println("cannot parse: " + s);
			e.printStackTrace();
			return null;
		}
	}
	
	public static String toString(Date date) {
		return new SimpleDateFormat(ISO_8601).format(date);
	}

}
