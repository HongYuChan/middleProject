package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.NoticeBoardService;

public class NoticeDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		NoticeBoardService service = NoticeBoardService.getInstance();
		
		int notice_id = Integer.parseInt(request.getParameter("notice_id"));
		service.noticeDeleteBoardService(notice_id);
		
		forward.setRedirect(true);
		forward.setPath("noticeListAction.do");
		
		return forward;
	}

}
