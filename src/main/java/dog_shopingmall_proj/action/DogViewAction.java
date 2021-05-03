package dog_shopingmall_proj.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shopingmall_proj.dto.Dog;
import dog_shopingmall_proj.service.DogViewService;

public class DogViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		DogViewService dogViewService = new DogViewService();
		int id = Integer.parseInt(request.getParameter("id"));
		Dog dog=dogViewService.getDogView(id);
		request.setAttribute("dog",dog);
		Cookie todayImageCookie = new Cookie("today"+id,dog.getImage());
		response.addCookie(todayImageCookie);
		ActionForward forward = new  ActionForward("/dogshopping/dogView.jsp",false);
		return forward;
	}

}
