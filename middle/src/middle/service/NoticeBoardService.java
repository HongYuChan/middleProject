package middle.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import middle.model.NoticeBoard;
import middle.model.NoticeBoardDao;

public class NoticeBoardService {
	private static NoticeBoardService service = new NoticeBoardService();
	private static NoticeBoardDao dao;
	private static final int PAGE_SIZE = 5;

	public static NoticeBoardService getInstance() {
		dao = NoticeBoardDao.getInstance();
		return service;
	}

	public int noticeInsertBoardService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		NoticeBoard board = new NoticeBoard();
		board.setNotice_writer(request.getParameter("notice_writer"));
		board.setNotice_title(request.getParameter("notice_title"));
		board.setNotice_contents(request.getParameter("notice_contents"));
		System.out.println(board.getNotice_writer());
		
		return dao.noticeInsertBoard(board);
	}
	
	public List<NoticeBoard> noticeListBoardService()throws Exception{
		List<NoticeBoard> NoticeList = dao.noticeListBoard();
		return NoticeList;
	}
	
	public NoticeBoard noticeDetailBoardService(int notice_id)throws Exception{
		return dao.noticeDetailBoard(notice_id);
	}
}
