package dog_shopingmall_proj.dao.impl;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dog_shopingmall_proj.JdbcUtil;
import dog_shopingmall_proj.dto.Dog;

public class DogDAOImplTest {
	private static Connection con = JdbcUtil.getConnection();
	private DogDAOImpl dao = DogDAOImpl.getInstance();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// MemberDaoTest.java 가 수행되기 전 호출
		con = JdbcUtil.getConnection();
	}

	@Before
	public void setUp() throws Exception {
		dao.setCon(con);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectDoglist() {
		System.out.println("testSelectDoglist");
		List<Dog> list = dao.selectDoglist();
		Assert.assertNotEquals(null, list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void testSelectDog() {
		System.out.println("testSelectDoglist");
		int id = 3;
		Dog dog = dao.selectDog(id);
		Assert.assertNotEquals(null, dog);
		System.out.println(dog + "<<dog");
	}

	@Test
	public void testInsertDog() {
		System.out.println("testInsertDog");
		Dog newDog = new Dog("치와와", 3000, "chi.jpg", "영국", 1, 10, "사나워");
		int res = dao.insertDog(newDog);
		Assert.assertEquals(1, res);

		System.out.println(newDog + "<<새로운 강아지");
	}

	@Test
	public void testUpdataReadCount() {
		System.out.println("testUpdataReadCount");
		int id = 1;
		int res = dao.updateReadCount(id);
		Assert.assertEquals(1, res);

		System.out.println(res);
	}

}
