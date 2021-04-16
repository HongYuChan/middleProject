package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.StreamService;



public class InsertProductAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		StreamService service = StreamService.getInstance();
		service.insertProductService(request);
		forward.setRedirect(true);
		forward.setPath("mainPage.do");
		return forward;
	}

}
