package Task;

public class Time {

	public int min;
	public int hour;

	public Time(int min, int hour) {
		if ((min >= 0 && min < 60) && (hour >= 0 && hour < 24)) {
			this.min = min;
			this.hour = hour;
		} else {
			System.err.println("Такого часу не існує");
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}


	@Override
	public String toString() {
		return "Time [min=" + min + ", hour=" + hour + "]";
	}

	public static Time sumTime(Time time1, Time time2) {
		int hour = time1.getHour() + time2.getHour();
		int min = time1.getMin() + time2.getMin();
		if (min > 60) {
			hour += 1;
			min = min - 60;
		}
		if (hour >= 24) {
			hour = hour - 24;
		}
		return new Time(hour, min);
	}

}
