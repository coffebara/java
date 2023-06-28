package utils;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

public class JSFunction { // 별도의 도우미 클래스 구현
	// 메세지 알림창을 띄운 후 명시한 URL로 이동합니다.
	public static void alertLocation(String msg, String url, JspWriter out) {
		try {
			String script = "" // 삽입할 자바스크립트 코드
					+ "<script>" + " alert('" + msg + "');" + " location.href='" + url + "';" + "</script>";
			out.println(script); // 자바스크립트 코드를 out 내장 객체로 출력(삽입)
		} catch (Exception e) {
		}
	}

	// 메시지 알림창을 띄운 후 이전 페이지로 돌아갑니다.
	public static void alertBack(String msg, JspWriter out) {
		try {
			String script = "" + "<script>" + " alert('" + msg + "');" + " history.back();" + "</script>";
			out.println(script);
		} catch (Exception e) {
		}
	}

	// 메세지 알림창을 띄운 후 명시한 URL로 이동합니다
	public static void alertLocation(HttpServletResponse resp, String msg, String url) {
		try {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			String script = "" + "<script>" + " alert('" + msg + "');" + " location.href='" + url + "';" + "</script>";
			writer.print(script);
		} catch (Exception e) {
		}
	}

	// 메세지 알림창을 띄운 후 이전 페이지로 돌아갑니다.
	public static void alertBack(HttpServletResponse resp, String msg) {
		try {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			String script = "" + "<script>" + " alert('" + msg + "');" + " history.back();" + "</script>";
			writer.print(script);
		} catch (Exception e) {
		}
	}
}
//JSFunction 클래스는 실행 가능한 클래스가 아닙니다
//import utils.JSFunction;
//JSFunction 클래스를 import 합니다. (<%@ page import=utils.JSFuction" %>)
//JSFunctiotn 클래스의 메서드를 호출하여 JavaScript 코드를 생성합니다.