package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.Member;
import middle.service.MypageService;

public class ModifyNicknameAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MypageService service = MypageService.getInstance();
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		Member member = service.memberService(user_id);
		System.out.println(member.getUser_id());
		
		if(request.getParameter("nickname") != null) {
			member.setNickname(request.getParameter("nickname"));
		}
		
		System.out.println("수정 액션");
		service.modifyNickService(member);
		forward.setRedirect(false);
		forward.setPath("modifyform.do");
		return forward;
	}

}
