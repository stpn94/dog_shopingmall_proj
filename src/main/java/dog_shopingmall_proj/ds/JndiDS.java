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
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/shoppingmall");
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
}