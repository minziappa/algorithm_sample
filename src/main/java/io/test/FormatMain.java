package io.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// Set two hour
//		long currentMillis = System.currentTimeMillis();
//		Calendar calDay = Calendar.getInstance();
//		calDay.setTimeInMillis(currentMillis);


		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String aa = formatDate(timestamp, "%Y-%m");
		
		System.out.println(aa);
		
	}

	public static String formatDate(Date date, String format) {
		System.out.println("test >>> " + date);

		String defaultFormat = "yyyy-MM";
		SimpleDateFormat sdf = new SimpleDateFormat(defaultFormat);
		return sdf.format(date);
	}

}
