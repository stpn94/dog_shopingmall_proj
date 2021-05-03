package dog_shopingmall_proj.service;

import java.sql.Connection;
import java.sql.SQLException;

import dog_shopingmall_proj.dao.impl.DogDAOImpl;
import dog_shopingmall_proj.ds.JndiDS;
import dog_shopingmall_proj.dto.Dog;

public class DogViewService {
	private DogDAOImpl dao = DogDAOImpl.getInstance();
	private Connection con = JndiDS.getConnection();

	public DogViewService() {
	}

	public Dog getDogView(int id) {
		dao.setCon(con);
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int updateCount= dao.updateReadCount(id);
		if(updateCount>0) {
			JndiDS.commit(con);
		}else {
			JndiDS.rollback(con);
		}
		Dog dog = dao.selectDog(id);
		
		return dog;
	}

}
