package dog_shopingmall_proj.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shopingmall_proj.dto.Dog;
import dog_shopingmall_proj.service.DogListService;

public class DogListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<String> todayImageList = new ArrayList<String>(); //오늘 본 강아지 상품 목록
		Cookie[] cookieArray = request.getCookies(); 				//쿠키
		
		if(cookieArray != null) {									//쿠키가 비어있지 아니면
			for(int i=0;i<cookieArray.length; i++) {				//쿠키배열만큼 반복한다.
				if(cookieArray[i].getName().startsWith("today")) {  //만약 쿠키배열의 인덱스의 이름이 "today"라고 시작하면
					todayImageList.add(cookieArray[i].getValue());  //오늘 본 강아지 상품 목록에 쿠키배열i번째에 있는 값을 넣는다.
				}
			}
		}
		
		DogListService dogListService = new DogListService();		//DogListService 생성
		List<Dog> dogList = dogListService.getDogList();		//Service를 실행시켜 나온 값을 dogList에 넣는다.
		request.setAttribute("dogList", dogList);					//dogList를 속성으로
		request.setAttribute("todayImageList", todayImageList);     //todayImageList를 속성으로
		ActionForward forward = new ActionForward("/dogshopping/dogList.jsp",false); //dogList.jsp로 간다.
		
		return forward;
	}

}
