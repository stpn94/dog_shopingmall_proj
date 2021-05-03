package dog_shopingmall_proj.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shopingmall_proj.service.DogCartQtyDownService;

public class DogCartQtyDownAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String kind=request.getParameter("kind");
		DogCartQtyDownService dogCartQtyDownService=new DogCartQtyDownService();
		dogCartQtyDownService.downCartQty(kind,request);
		ActionForward forward = new ActionForward("dogCartList.do",true);
		
		return forward;
	}

}
