package login.model;

import java.io.InputStream;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import login.action.Action;
import login.action.ActionForward;
import login.mapper.LoginMapper;

public class LoginDao {
	private static LoginDao dao = new LoginDao();

	public static LoginDao getInstance() {
		return dao;
	}

	public SqlSessionFactory getsqlsessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;

		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}

	
	
	
	public UserModel checkDBLogin(String id, String password)throws Exception {
		SqlSession sqlSession = getsqlsessionFactory().openSession();
		UserModel userModel = new UserModel();
		try {
			userModel = sqlSession.getMapper(LoginMapper.class).checkDBLogin(id);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		System.out.println(userModel);
		userModel.toString();
		return userModel;
	}

}
