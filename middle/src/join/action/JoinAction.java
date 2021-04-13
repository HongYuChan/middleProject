package join.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)throws Exception{
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("/views/join/joinForm.jsp");
		return forward;
	}
}
