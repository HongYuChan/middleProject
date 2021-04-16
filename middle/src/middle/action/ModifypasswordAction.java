package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.Member;
import middle.model.Member_Product;
import middle.model.Member_img;
import middle.service.MypageService;

public class ModifypasswordAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MypageService service = MypageService.getInstance();
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		Member member = service.myprofileService(user_id);
		System.out.println(member.getUser_id());
		
		if(request.getParameter("pre_password").equals(member.getPassword()) 
				& request.getParameter("after_password").equals(request.getParameter("password_check"))) {
			
			System.out.println(request.getParameter("pre_password") + ", " + request.getParameter("after_password")
								+ ", " + request.getParameter("password_check"));
			System.out.println(user_id);
			member.setPassword(request.getParameter("after_password"));
		}
		System.out.println("수정 액션");
		service.modifyPassService(member);
		forward.setRedirect(false);
		forward.setPath("modifyform.do");
		System.out.println("수정 액션");
		return forward;
	}

}
