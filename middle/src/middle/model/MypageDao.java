package middle.model;

import java.io.InputStream;
import java.util.List;

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
	
	public Member myprofile(int user_id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Member member = new Member();
		try {
			member = sqlSession.getMapper(Mypagemapper.class).myprofile(user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return member;
	}	//내 프로필 조회
	
	public Product myproduct(int user_id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Product product = new Product();
		try {
			product = sqlSession.getMapper(Mypagemapper.class).myproduct(user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return product;
	}	//user_id에 따른 상품 조회
	
	public Member_img memberImg(int user_id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Member_img mimg = new Member_img();
		try {
			mimg = sqlSession.getMapper(Mypagemapper.class).memberImg(user_id);
			System.out.println(mimg.getUrl());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return mimg;
	}	//user_id로 멤버 이미지 조회
	
	public Image productImg(int product_id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Image image = new Image();
		try {
			image = sqlSession.getMapper(Mypagemapper.class).productImg(product_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return image;
	}	//product_id로 상품 이미지 조회
	
	public int modifypassword(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int suc = -1;
		try {
			suc = sqlSession.getMapper(Mypagemapper.class).modifypassword(member);
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
	}	//패스워드 수정
	
	public int modifynickname(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int suc = -1;
		try {
			suc = sqlSession.getMapper(Mypagemapper.class).modifynickname(member);
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
	}	//닉네임 수정
	
	public int modifyemail(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int suc = -1;
		try {
			suc = sqlSession.getMapper(Mypagemapper.class).modifyemail(member);
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
	}	//이메일 수정
	
	public int deletemember(int user_id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int suc = -1;
		try {
			suc = sqlSession.delete("middle.mapper.Mypagemapper.deletemember",user_id);
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
	
	public List<Deal> sellList(int user_id){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Deal> list = null;
		try {
			list = sqlSession.getMapper(Mypagemapper.class).sellList(user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
	
	public List<Deal> buyList(int buyer_id){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Deal> list = null;
		try {
			list = sqlSession.getMapper(Mypagemapper.class).buyList(buyer_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
}
