package middle.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.ListModel;

import middle.model.NoticeBoard;
import middle.model.NoticeBoardDao;
import middle.model.NoticeListModel;
import middle.model.NoticeSearch;

public class NoticeBoardService {
	private static NoticeBoardService service = new NoticeBoardService();
	private static NoticeBoardDao dao;
	private static final int PAGE_SIZE = 5;//페이지당 글갯수

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
	
	public NoticeListModel noticeListBoardService(HttpServletRequest request)throws Exception{//페이징: List<NoticeBoard>-> ListModel
		request.setCharacterEncoding("UTF-8");
		NoticeSearch noticeSearch = new NoticeSearch();
		HttpSession session = request.getSession();
		
		// 검색할 경우
				if(request.getParameterValues("area") != null ) {
					session.removeAttribute("search");
					noticeSearch.setArea(request.getParameterValues("area"));
					noticeSearch.setSearchKey("%" + request.getParameter("searchKey") + "%");
					session.setAttribute("search", noticeSearch);
				}else if(session.getAttribute("search") != null) {	// 검색 후 페이지를 클릭 할 경우
					if(request.getParameter("pageNum") == null) {
						session.removeAttribute("search");
					}
					noticeSearch = (NoticeSearch)session.getAttribute("search");
					System.out.println(noticeSearch);
				}
		
		/////페이징////
		//총 글갯수 
		int totalCount = dao.noticeCountBoard(noticeSearch);
		//총 페이지 수
		int totalPageCount = totalCount/PAGE_SIZE;
		if(totalCount%PAGE_SIZE>0) {
			totalPageCount++;
		}
		//현재 페이지
		String pageNum = request.getParameter("pageNum");
		if (pageNum == null) {
			pageNum = "1";
		}
		int requestPage = Integer.parseInt(pageNum);
		
		//공식// startPage = 현재페이지 - (현재페이지-1) % 5 
		int startPage = requestPage - (requestPage - 1) % 5;
		
		//endPage
		int endPage = startPage + 4;
		if(endPage > totalPageCount) {
			endPage = totalPageCount;
		}
		
		//공식//startRow = (현재페이지 -1) * 페이지당 글 갯수
		int startRow = (requestPage -1) * PAGE_SIZE;
		
		
		
		List<NoticeBoard> noticeList = dao.noticeListBoard(noticeSearch, startRow); //페이징 매개변수 startRow
		NoticeListModel noticeListMoel = 
				new NoticeListModel(noticeList, requestPage, totalPageCount, startPage, endPage);
				//페이징 처리  return NoticeList -> noticeListMoel
 		
		return noticeListMoel;
	}

	public NoticeBoard noticeDetailBoardService(int notice_id)throws Exception{
		return dao.noticeDetailBoard(notice_id);
	}

	public int noticeUpdateBoardService(NoticeBoard noticeBoard)throws Exception{
		return dao.noticeUpdateBoard(noticeBoard);
	}
	
	public int noticeDeleteBoardService(int notice_id)throws Exception{
		return dao.noticeDeleteBoard(notice_id);	
	}
}
