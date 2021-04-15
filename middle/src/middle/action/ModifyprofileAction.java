package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.Member;
import middle.service.MypageService;

public class ModifyprofileAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MypageService service = MypageService.getInstance();
		System.out.println("123");
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		System.out.println("1234");
		Member member = service.myprofileService(user_id);
		System.out.println(member.getUser_id());
		
		if(request.getParameter("pre_password").equals(member.getPassword()) 
				& request.getParameter("after_password").equals(request.getParameter("password_check"))) {
			member.setPassword(request.getParameter("after_password"));
			member.setNickname(request.getParameter("nickname")); 
			member.setEmail(request.getParameter("email"));
		}
		
		service.modifyPassService(member);
		service.modifyNickService(member);
		service.modifyEmailService(member);
		forward.setRedirect(false);
		forward.setPath("modifyform.do");
		return forward;
	}

}
