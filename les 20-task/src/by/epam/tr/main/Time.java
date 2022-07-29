package by.epam.tr.main;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private int secunda;

	public Time() {
		hour = 0;
		minute = 0;
		secunda = 0;
	}

	public Time(int hour, int minute, int secunda) {
		if (secunda >= 60) {
			while (secunda >= 60) {
				minute = minute + 1;
				secunda = secunda - 60;
			}
		}
		this.secunda = secunda;
		
		if (minute >= 60) {
			while (minute >= 60) {
				hour = hour + 1;
				minute = minute - 60;
			}
		}
		this.minute = minute;
		
		
		if (hour >= 24) {
			while (hour >= 24) {
				hour = hour - 24;
			}
		}
		this.hour = hour;
			
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecunda() {
		return secunda;
	}

	public void setSecunda(int secunda) {
		this.secunda = secunda;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, secunda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && secunda == other.secunda;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", secunda=" + secunda + "]";
	}

}
