package dog_shopingmall_proj.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DogRegistFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward("/dogshopping/dogRegistForm.jsp", false);
		return forward;
	}

}
