package dog_shopingmall_proj.ds;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JndiDS {
	private static DataSource ds;
	static { // 1이거 먼저 실행되고
		try {
			InitialContext ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/dog_shopingmall_proj");
			System.out.println("ds:" + ds);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JndiDS() {
	} // 2호출

	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//commit 성공시
	public static void commit(Connection con) {
		try {
			con.commit();
			System.out.println("commit success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//rollback 성공시
	public static void rollback(Connection con) {
		try {
			con.commit();
			System.out.println("rollback success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
