package join.service;

import javax.servlet.http.HttpServletRequest;

import join.model.JoinDao;
import join.model.Member;

public class JoinService {
	private static JoinService service = new JoinService();
	private static JoinDao dao;
	
	public static JoinService getInstance() {
		dao = JoinDao.getInstance();
		return service;
	}
	
	public int insertMemberInfoService (HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		
		Member member = new Member();
		member.setId(request.getParameter("id"));
		member.setPassword(request.getParameter("password"));
		member.setNickname(request.getParameter("nickname"));
		member.setEmail(request.getParameter("email"));
		member.setPhone_number(request.getParameter("phone_number"));
		member.setAddress(request.getParameter("address"));	
		System.out.println("parameter in");
		
		return dao.insertMemberInfo(member);
		
	}
}
