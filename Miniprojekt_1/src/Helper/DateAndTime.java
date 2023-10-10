package Helper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Interface.ClockDisplay;

public abstract class DateAndTime implements ClockDisplay {

	protected static LocalDateTime dateTime = LocalDateTime.now();

	protected static DateTimeFormatter formatDate = DateTimeFormatter
			.ofPattern("YYYY-MM-dd");
	protected static DateTimeFormatter formatTime = DateTimeFormatter
			.ofPattern("HH:mm:ss");
	
}
