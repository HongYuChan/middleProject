package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.StreamService;


public class StreamAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		StreamService service = StreamService.getInstance();
		
	
		forward.setRedirect(false);
		forward.setPath("/views/videoTest.jsp");
		
		return forward;
	}

}
