package java0609.rent.base;

import java.util.Calendar;

//자식 클래스에서 공통적으로 사용되는변수(속성)이나 기능을 구현한다.
public class Base {
	//조회한 데이터의 시간 정보를 제공하는 메서드
	public String showTime() {
		String date=null;
		String time=null;
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		
		date = year + "-" + month + "-" + day;
		time = hour + ":" + min + ":" + sec;
		
		return date + " " + time;
	}
}
