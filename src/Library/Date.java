package Library;

class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	
	public int daysBetween (Date date) {
		int totalDays=0;
		totalDays=totalDays+(date.getYear()-year)*360;
		totalDays=totalDays+(date.getMonth()-month)*30;
		totalDays=totalDays+(date.getDay()-day);
		return totalDays;
	}

	private int getDay() {
		return day;
	}

	private int getMonth() {
		return month;
	}

	private int getYear() {
		return year;
	}
	
}
