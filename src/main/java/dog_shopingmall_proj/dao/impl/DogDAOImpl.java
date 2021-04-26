package dog_shopingmall_proj.dao.impl;

import java.sql.Connection;
import java.util.List;

import dog_shopingmall_proj.dao.DogDAO;
import dog_shopingmall_proj.dto.Dog;

public class DogDAOImpl implements DogDAO {
	private static final DogDAOImpl instance = new DogDAOImpl();

	public static DogDAOImpl getInstance() {
		return instance;
	}

	private Connection con;

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public DogDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<Dog> selectDoglist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dog selectDog(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertDog(Dog dog) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updataReadCount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
