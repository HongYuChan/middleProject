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
		Member member = new Member();
		
		if(request.getParameter("password") != null) {
			member.setPassword(request.getParameter("password"));
		}//�н����� ����
		else if(request.getParameter("nickname") != null) {
			member.setNickname(request.getParameter("nickname"));
		}//�г��� ����
		else if(request.getParameter("email") != null) {
			member.setEmail(request.getParameter("email"));
		}//�̸��� ����
		
		service.modifyService(member);
		forward.setRedirect(false);
		forward.setPath("myprofile.do");
		return forward;
	}

}
