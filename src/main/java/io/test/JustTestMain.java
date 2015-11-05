package io.test;

import java.util.Calendar;
import java.util.Date;

public class JustTestMain {

	public static void main(String[] args) {
		long lngDiffTime = getDiffTime("19:00", "10:00");
		String resultTime = convertMilliToString(lngDiffTime);

		System.out.println("lngDiffTime >>>> " + lngDiffTime);
		System.out.println("resultTime >>>> " + resultTime);
		Date date = getDaySet(2015, 8, 31, 19, 10);
		System.out.println("date >>>> " + date);
	}

	private static String convertMilliToString(long diffTime) {

		long longHour = diffTime / (60 * 60 * 1000) % 24;
        long longMinutes = diffTime / (60 * 1000) % 60;

		return String.format("%02d:%02d", longHour,longMinutes);
	}

	private static long getDiffTime(String end, String start) {

		String [] endList = end.split(":");
		String [] startList = start.split(":");

		Calendar calDay = Calendar.getInstance();
		int year = calDay.get(Calendar.YEAR);
		int month = calDay.get(Calendar.MONTH);
		int day = calDay.get(Calendar.DAY_OF_MONTH);

		Date endDate = getDaySet(year, month, day ,Integer.parseInt(endList[0]), Integer.parseInt(endList[1]));
		Date startDate = getDaySet(year, month, day ,Integer.parseInt(startList[0]), Integer.parseInt(startList[1]));

		long lngEndTime = endDate.getTime();
		long lngStartDate = startDate.getTime();

		return lngEndTime - lngStartDate;
	}

	private static Date getDaySet(int year, int month, int day, int hour, int minute) {

		Calendar calDay = Calendar.getInstance();
		calDay.set(year, month-1, day);
		calDay.set(Calendar.HOUR_OF_DAY, hour);
		calDay.set(Calendar.MINUTE, minute);
		calDay.set(Calendar.SECOND, 0);

		return calDay.getTime();
	}

}
