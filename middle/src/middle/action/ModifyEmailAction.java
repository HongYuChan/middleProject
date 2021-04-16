package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.Member;
import middle.service.MypageService;

public class ModifyEmailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MypageService service = MypageService.getInstance();
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		Member member = service.memberService(user_id);
		System.out.println(member.getUser_id());
		if(request.getParameter("email")!= null) {
			member.setEmail(request.getParameter("email"));
		}
		
		service.modifyEmailService(member);
		forward.setRedirect(false);
		forward.setPath("modifyform.do");
		System.out.println("수정 액션");
		return forward;
	}

}
