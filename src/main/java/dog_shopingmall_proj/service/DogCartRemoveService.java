package dog_shopingmall_proj.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dog_shopingmall_proj.dto.Cart;

public class DogCartRemoveService {

	public void cartRemove(HttpServletRequest request, String[] kindArray) {
		HttpSession session=request.getSession();
		ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
		
		for(int i = 0; i<kindArray.length;i++) {
			
			for(int j = 0;j<cartList.size();j++) {
				
				if(cartList.get(j).getKind().equals(kindArray[i])) {
					cartList.remove(cartList.get(j));
				}
			}
		}
	}

}
