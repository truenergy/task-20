package by.epam.tr.main;

public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time (25, 59, 70);
		
		TimePrint view = new TimePrint();
		view.printTimeFirst(time);
		
	}

}
