package dog_shopingmall_proj.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shopingmall_proj.action.Action;
import dog_shopingmall_proj.action.ActionForward;
import dog_shopingmall_proj.service.DogCartQtyUpService;

public class DogCartQtyUpAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String kind=request.getParameter("kind");
		DogCartQtyUpService dogCartQtyUpService=new DogCartQtyUpService();
		dogCartQtyUpService.upCartQty(kind,request);
		ActionForward forward = new ActionForward("dogCartList.do",true);
		
		return forward;
	}

}
