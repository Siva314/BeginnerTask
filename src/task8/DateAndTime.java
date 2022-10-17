package task8;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateAndTime {
	
	private ZonedDateTime getZonedTime(long miliSecond,String zoneName) {
		Instant local=Instant.ofEpochMilli(miliSecond);
    	ZoneId zoneId=ZoneId.of(zoneName);
    	return local.atZone(zoneId);
	}
	 
	public String getLocalDate(String dateFormat) {
		LocalDateTime time=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern(dateFormat);
		String formattedDate=time.format(format);
		return formattedDate; 
	}
	public Long getMilliSecond() {
		long milliSecond=System.currentTimeMillis();
		return milliSecond;
	}
	public String getTimeWithTimeZone(String zoneName,String dateFormat) {
		ZoneId zone=ZoneId.of(zoneName);
		LocalTime local=LocalTime.now(zone);
		DateTimeFormatter format=DateTimeFormatter.ofPattern(dateFormat);
		String formattedDate=local.format(format);
		return formattedDate;
		
	}
	public DayOfWeek getDateOfDay(long miliSecond,String zoneName)  {
		ZonedDateTime local=getZonedTime(miliSecond,zoneName);
    	return local.getDayOfWeek();
	}
	public Month getMonth(long miliSecond,String zoneName){
		ZonedDateTime local=getZonedTime(miliSecond,zoneName);
    	return local.getMonth();
	}
	public int getYear(long miliSecond,String zoneName){
		ZonedDateTime local=getZonedTime(miliSecond,zoneName);
		return local.getYear();
	}
}
