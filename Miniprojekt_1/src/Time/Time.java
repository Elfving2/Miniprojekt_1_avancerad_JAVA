package Time;


import Helper.DateAndTime;

public class Time extends DateAndTime { 
	
	private String time = dateTime.format(formatTime);

	@Override
	public void setData(int hour, int minutes, int seconds) {
	
		time = dateTime
				.withHour(hour)
				.withMinute(minutes)
				.withSecond(seconds)
				.format(formatTime);
	}
	
	@Override
	public String getData() {
		return this.time;
	}	
	
	
}
