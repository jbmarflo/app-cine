package net.cine.app.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Util {
	/**
	 * Return string list with next dates accorder to count paramenter
	 * @param count
	 * @return
	 */
	public static List<String> getNextDays(int count) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//Today´s Date
		Date start = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, count); // Next N days from now
		Date endDate = cal.getTime();
	
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.setTime(start);
		List<String> nextDays = new ArrayList<String>();
		while (!gCal.getTime().after(endDate)) {
			Date d = gCal.getTime();
			gCal.add(Calendar.DATE, 1);
			nextDays.add(sdf.format(d));
		}
		
		return nextDays;
	}
}
