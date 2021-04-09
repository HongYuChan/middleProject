package middle.mapper;

import java.util.List;

import middle.model.NoticeBoard;


public interface NoticeBoardMapper {
	int noticeInsertBoard(NoticeBoard noticeboard);
	List<NoticeBoard> noticeListBoard();
	NoticeBoard noticeDetailBoard(int notice_id);
	
}
