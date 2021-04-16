package middle.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import middle.mapper.MemberMapper;
import middle.mapper.StreamMapper;

public class MemberDAO {
private static MemberDAO memberDao = new MemberDAO();
    
    public static MemberDAO getInstance() {
        return memberDao;
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
    
    public int insertSignUp(Member member) {
        int re = -1;
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        try {
            re = sqlSession.getMapper(MemberMapper.class).insertSignUp(member);
            if(re > 0) {
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
    
    public Member loginCheck(String id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Member member = null;
		
		try {
			member = sqlSession.getMapper(MemberMapper.class).loginCheck(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return member;
	}
    
    public int insertProduct(Product product) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(StreamMapper.class).insertProduct(product);
			if(re > 0) {
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
