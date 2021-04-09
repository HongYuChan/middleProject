package middle.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.NoticeBoard;
import middle.service.NoticeBoardService;

public class NoticeListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		NoticeBoardService service = NoticeBoardService.getInstance();
		
		List<NoticeBoard> list = service.noticeListBoardService();
		request.setAttribute("NoticeList", list);
		
		forward.setRedirect(false);
		forward.setPath("/views/noticeList.jsp");
		 
		return forward;
	}

}
