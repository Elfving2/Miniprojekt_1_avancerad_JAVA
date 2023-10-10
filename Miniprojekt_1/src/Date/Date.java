package Date;

import Helper.DateAndTime;

public class Date extends DateAndTime {
	
	private String date = dateTime.format(formatDate);

	@Override
	public void setData(int years, int months, int days) {
		date = dateTime
				.withYear(years)
				.withMonth(months)
				.withDayOfMonth(days)
				.format(formatDate);

	}

	@Override
	public String getData() {
		return this.date;
	}

}
