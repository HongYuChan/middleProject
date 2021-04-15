package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.Member;
import middle.service.MypageService;

public class DeleteMemberAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MypageService service = null;
		int user_id =1; //Integer.parseInt(request.getParameter("user_id"));
		service.deleteService(user_id);
		forward.setRedirect(true);
		forward.setPath("/views/main.jsp");
		return forward;
	}

}
