package middle.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
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
	
	public List<NoticeBoard> noticeListBoard(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<NoticeBoard> NoticeList = null;
		try {
			NoticeList = sqlSession.getMapper(NoticeBoardMapper.class).noticeListBoard();
		} catch (Exception e) {
			e.printStackTrace();
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
}
