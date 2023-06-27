package unit02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public RadioServlet(){
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		response.setContentType("text/html; charset=UTF-8");
//라디오버튼을 활용한 변수는 묶음 처리됨		
		String gender = request.getParameter("gender");
//request : 전송된 데이터 변수
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		PrintWriter out = response.getWriter();
//출력 객체 생성 response : 출력
		out.print("<html><body>");
		out.println("당신이 입력한 정보입니다.<br>");
		out.println("성별 : ");
		out.println(gender);
		out.println("<b><br> 메일 정보 수신 여부 : ");
		out.println(chk_mail);
		out.println("<b><br> 가입 인사 : <b><pre>");
		out.println(content);
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
//뒤로가기
		out.print("</body></html>");
		out.close();
	}
}
