package java0623B;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConn {
	private static Connection dbConn; //데이터베이스 연결
	
	public static Connection getConnection() {
		if(dbConn == null) {
			try {
				String url ="jdbc:oracle:thin:@localhost:1521:xe";
//				String url ="jdbc:mysql://localhost:3306/db_name";
				String user="scott";
				String pwd="tiger";
// Oracle JDBC 드라이버를 로드합니다
				Class.forName("oracle.jdbc.driver.OracleDriver");
//DriverManger를 사용하여 데이터베이스 연결을 수행				
				dbConn = DriverManager.getConnection(url, user, pwd);
				System.out.println("데이터베이스 연결성공");
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}//end of if
		return dbConn; //dbConn 객체가 반환되어 사용자에게 데이터베이스 연결을 제공
	}// getConnection()
	public static Connection getConnection(String url, String user, String pwd) {
		if(dbConn !=null) {
			try {//Oracle JDBC 드라이버를로드합니다
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn=DriverManager.getConnection(url,user,pwd);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dbConn;
	}
	public static void dbClose() {
		if(dbConn !=null) {
			try {
				if(dbConn.isClosed()) dbConn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}//if
		dbConn =null;
	}
	public static void dbClose(PreparedStatement ps, Connection conn) {
		try {
			if(conn !=null) conn.close();
			if(ps !=null) ps.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		conn =null;
		ps =null;
	}
	public static void dbClose(Statement st, Connection conn) {
		try {
			if(st !=null) st.close();
			if(conn !=null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		conn=null;
		st=null;
	}//Connection은 데이터베이스 연결 정보와 통신
	public static void dbClose(ResultSet rs, Statement st, Connection conn) {
		try {//Statement 은 정적인 SQL문을 실행을 처리한다
			if(st !=null)st.close();
			if(conn != null) conn.close();
			if(rs != null) rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		conn = null;
		st = null;
		rs =null;
	}//PreparedStatement는 동적인 SQL 문을 실행하고, 매개변수화된 쿼리를 처리
	public static void dbClose(ResultSet rs, PreparedStatement ps, Connection conn) {
		try {//ResultSet 데이터베이스에서 쿼리 결과
			if(rs !=null)rs.close();
			if(conn != null) conn.close();
			if(ps != null) ps.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		conn = null;
		rs = null;
		ps =null;
	}
}
