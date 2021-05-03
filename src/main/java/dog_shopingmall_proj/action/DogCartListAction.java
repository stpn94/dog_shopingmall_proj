package dog_shopingmall_proj.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shopingmall_proj.dto.Cart;
import dog_shopingmall_proj.service.DogCartListService;

public class DogCartListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		DogCartListService dogCartListService = new DogCartListService();
		
		ArrayList<Cart> cartList = dogCartListService.getCartList(request);
		
		//총금액 계산
		int totalMoney = 0;
		int money = 0;
		
		for(int i =0; i<cartList.size();i++) {
			money = cartList.get(i).getPrice()*cartList.get(i).getQty();
			totalMoney += money;
		}
		
		request.setAttribute("totalMoney", totalMoney);
		request.setAttribute("cartList", cartList);
		ActionForward forward = new ActionForward("/dogshopping/dogCartList.jsp", false);
		
		return forward;
	}

}
