package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.NoticeBoardService;

public class NoticeInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		NoticeBoardService service = NoticeBoardService.getInstance();
		
		//비지니스로직 호출
		service.noticeInsertBoardService(request);
		
		//새로운 요청
		forward.setRedirect(true);
		forward.setPath("noticeListAction.do");
		
		
		return forward;
	}

}
