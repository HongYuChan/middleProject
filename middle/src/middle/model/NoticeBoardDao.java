package middle.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import middle.mapper.NoticeBoardMapper;

public class NoticeBoardDao {
	private static NoticeBoardDao dao = new NoticeBoardDao();

	public static NoticeBoardDao getInstance() {
		return dao;
	}

	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;

		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}


	public int noticeInsertBoard(NoticeBoard noticeBoard) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();

		try {
			re = sqlSession.getMapper(NoticeBoardMapper.class).noticeInsertBoard(noticeBoard);
			if (re > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

		return re;
	}
	
	public List<NoticeBoard> noticeListBoard(NoticeSearch noticeSearch, int startRow){//페이징: 매개변수 startRow
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<NoticeBoard> NoticeList = null;
		try {
			NoticeList = sqlSession.getMapper(NoticeBoardMapper.class).noticeListBoard(noticeSearch, new RowBounds(startRow, 5));
			//페이징: new RowBounds 객체로 가져올 행 입력 startRow부터 5개
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

		return NoticeList;
	}
	
	public NoticeBoard noticeDetailBoard(int notice_id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		NoticeBoard noticeBoard = null;
		
		try {
			noticeBoard = sqlSession.getMapper(NoticeBoardMapper.class).noticeDetailBoard(notice_id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return noticeBoard;
	}
	
	public int noticeUpdateBoard(NoticeBoard noticeBoard) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		
		try {
			re = sqlSession.getMapper(NoticeBoardMapper.class).noticeUpdateBoard(noticeBoard);
			if (re > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;
	}
	
	public int noticeDeleteBoard(int notice_id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		
		try {
			re = sqlSession.getMapper(NoticeBoardMapper.class).noticeDeleteBoard(notice_id);
			if (re > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;
	}
	
	public int noticeCountBoard(NoticeSearch noticeSearch) { // 총 글 갯수	// 검색한 글 갯수
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = 0;
		try {
			re = sqlSession.getMapper(NoticeBoardMapper.class).noticeCountBoard(noticeSearch);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;
	}
	
	
	
}
