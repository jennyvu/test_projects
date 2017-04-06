package CalendarPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 14);
		System.out.println(cal.getTime());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		String dateFormated = format.format(cal.getTime());
		System.out.println(dateFormated);
	}

}
