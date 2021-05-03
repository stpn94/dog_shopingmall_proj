package dog_shopingmall_proj.service;

import java.sql.Connection;
import java.sql.SQLException;

import dog_shopingmall_proj.dao.impl.DogDAOImpl;
import dog_shopingmall_proj.ds.JndiDS;
import dog_shopingmall_proj.dto.Dog;

public class DogRegistService {
	private DogDAOImpl dao = DogDAOImpl.getInstance();
	private Connection con = JndiDS.getConnection();

	public DogRegistService() {
	}
	
	public boolean registDog(Dog dog) {
		dao.setCon(con);
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		boolean isRegistSuccess=false;
		int insertCount = dao.insertDog(dog);
		
		if(insertCount>0) {
			JndiDS.commit(con);
			isRegistSuccess=true;
		}else {
			JndiDS.rollback(con);
		}
		return isRegistSuccess;
	}
}
