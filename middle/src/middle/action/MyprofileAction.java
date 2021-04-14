package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.Member;
import middle.service.MypageService;

public class MyprofileAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MypageService service = MypageService.getInstance();
		int user_id = 3;//Integer.parseInt(request.getParameter("user_id"));
		System.out.println("액션");
		Member member = service.myprofileService(user_id);
		
		System.out.println("액션");
		System.out.println(user_id);
		
		request.setAttribute("member", member);
		forward.setRedirect(false);
		forward.setPath("/views/my_profile.jsp");
		return forward;
	}

}
