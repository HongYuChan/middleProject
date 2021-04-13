package join.model;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import join.mapper.JoinMapper;

public class JoinDao {
	private static JoinDao dao = new JoinDao();

	public static JoinDao getInstance() {
		return dao;
	}

	public SqlSessionFactory getSqlsessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;

		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}

	public int insertMemberInfo(Member member) {
		SqlSession sqlSession = getSqlsessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(JoinMapper.class).insertMemberInfo(member);
			if(re>0) {
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
		return re;
	}

}
