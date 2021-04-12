package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.NoticeBoard;
import middle.service.NoticeBoardService;

public class NoticeUpdateFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		NoticeBoardService service = NoticeBoardService.getInstance();
		
		int notice_id = Integer.parseInt(request.getParameter("notice_id"));
		NoticeBoard noticeBoard = service.noticeDetailBoardService(notice_id);		
		request.setAttribute("noticeBoard", noticeBoard);
		
		forward.setRedirect(false);
		forward.setPath("/views/noticeUpdateForm.jsp");
		
		return forward;
	}

}
