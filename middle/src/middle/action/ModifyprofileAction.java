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
		int user_id = Integer.getInteger(request.getParameter("user_id"));
		Member member = service.myprofileService(user_id);
		
		if(request.getParameter("pre_password").equals(member.getPassword()) 
				& request.getParameter("after_password").equals(request.getParameter("password_check"))) {
			member.setPassword(request.getParameter("after_password"));
		}//패스워드 변경
		
		/* else if(request.getParameter("nickname") != null) {
		 * member.setNickname(request.getParameter("nickname")); }//닉네임 변경 else
		 * if(request.getParameter("email") != null) {
		 * member.setEmail(request.getParameter("email")); }//이메일 변경
		 */		
		service.modifyService(member);
		forward.setRedirect(true);
		forward.setPath("myprofile.do");
		return forward;
	}

}
