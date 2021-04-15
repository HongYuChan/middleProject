package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import middle.model.Member;
import middle.service.MemberService;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		MemberService service = MemberService.getInstance();
		Member member = service.loginCheckService(request);
		
		if(member != null) {
			System.out.println("Ok");
			HttpSession session = request.getSession();
			System.out.println((String)member.getId());
			session.setAttribute("user", member.getId());
			forward.setRedirect(true);
			forward.setPath("mainPage.do");
		}else {
			System.out.println("Nope");
			forward.setRedirect(false);
			forward.setPath("loginForm.do");
		}
		
		return forward;
	}

}
