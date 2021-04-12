package middle.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import middle.model.NoticeBoard;


public interface NoticeBoardMapper {
	int noticeInsertBoard(NoticeBoard noticeBoard);
	List<NoticeBoard> noticeListBoard(RowBounds rowBounds);//페이징 매개변수 RowBounds
	NoticeBoard noticeDetailBoard(int notice_id);
	int noticeUpdateBoard(NoticeBoard noticeBoard);
	int noticeDeleteBoard(int notice_id);
	int noticeCountBoard();//총 글갯수
}
