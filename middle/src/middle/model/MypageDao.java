package middle.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import middle.mapper.Mypagemapper;

public class MypageDao {
	private static MypageDao dao = new MypageDao();
	
	public static MypageDao getInstance() {
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
	
	public Member mypageprofile(int user_id) {
		System.out.println("dao");
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Member member = new Member();
		try {
			member = sqlSession.getMapper(Mypagemapper.class).mypageprofile(user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return member;
	}	//내 프로필 조회
	
	public int modifyprofile(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int suc = -1;
		try {
			suc = sqlSession.getMapper(Mypagemapper.class).modifyprofile(member);
			if(suc > 0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!=null)
			{sqlSession.close();}
		}
		return suc;
	}	//프로필 수정
	
	public int deletemember(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int suc = -1;
		try {
			suc = sqlSession.getMapper(Mypagemapper.class).deletemember(member);
			if(suc > 0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return suc;
	}//회원탈퇴
	
	
}
