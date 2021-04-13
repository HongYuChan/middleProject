package join.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import join.service.JoinService;

public class insertMemberInfoAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)throws Exception{
		ActionForward forward = new ActionForward();
		JoinService service = JoinService.getInstance();
		
		service.insertMemberInfoService(request);
		
		forward.setRedirect(false);
		forward.setPath("joinEnd.do");
		
		return forward;
		
	}

}
