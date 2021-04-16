package middle.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import middle.model.Member;
import middle.model.MemberDAO;

public class MemberService {
	private static MemberService service = new MemberService();
    private static MemberDAO memberDao;
    
    public static MemberService getInstance() {
        memberDao = MemberDAO.getInstance();
        return service;
    }
    
    public int insertSignUpService(HttpServletRequest request)throws Exception {
        request.setCharacterEncoding("UTF-8");
        
        Member member = new Member();
        member.setId(request.getParameter("id"));
        member.setPassword(request.getParameter("password"));
        member.setEmail(request.getParameter("email"));
        member.setAddress(request.getParameter("address"));
        member.setNickname(request.getParameter("nickname"));
        member.setPhone_number(request.getParameter("phone_number"));
        member.setName(request.getParameter("name"));
        
        return memberDao.insertSignUp(member);
    }
    
    public Member loginCheckService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		
		Member member = (Member)memberDao.loginCheck(id);
		return member;
	}
    
}
