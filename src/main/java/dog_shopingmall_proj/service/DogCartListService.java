package dog_shopingmall_proj.service;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dog_shopingmall_proj.dao.impl.DogDAOImpl;
import dog_shopingmall_proj.ds.JndiDS;
import dog_shopingmall_proj.dto.Cart;

public class DogCartListService {
	private DogDAOImpl dao = DogDAOImpl.getInstance();
	private Connection con = JndiDS.getConnection();

	public DogCartListService() {
		dao.setCon(con);
	}

	public ArrayList<Cart> getCartList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession();
		ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
		
		return cartList;
	}

}
