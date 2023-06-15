package Ex10_practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = new Date(cal.getTimeInMillis());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(date));
	}
	
}
