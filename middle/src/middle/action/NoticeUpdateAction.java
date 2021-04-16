package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.NoticeBoard;
import middle.service.NoticeBoardService;
import sun.print.resources.serviceui;

public class NoticeUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		ActionForward forward = new ActionForward();
		NoticeBoardService service = NoticeBoardService.getInstance();
		
		NoticeBoard noticeBoard = new NoticeBoard();
		noticeBoard.setNotice_id(Integer.parseInt(request.getParameter("notice_id")));
		noticeBoard.setNotice_title(request.getParameter("notice_title"));
		noticeBoard.setNotice_contents(request.getParameter("notice_contents"));
		
		service.noticeUpdateBoardService(noticeBoard);
		
		forward.setRedirect(true);
		forward.setPath("noticeListAction.do");
		
		return forward;
	}

}
