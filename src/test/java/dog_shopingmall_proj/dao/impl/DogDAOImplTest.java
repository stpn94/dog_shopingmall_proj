package dog_shopingmall_proj.dao.impl;

import static org.junit.Assert.fail;

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dog_shopingmall_proj.JdbcUtil;

public class DogDAOImplTest {
	private static Connection con =JdbcUtil.getConnection();
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
	public void testGetInstance() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCon() {
		fail("Not yet implemented");
	}

	@Test
	public void testDogDAOImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectDoglist() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectDog() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertDog() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdataReadCount() {
		fail("Not yet implemented");
	}

}
