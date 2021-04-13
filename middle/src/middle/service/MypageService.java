package middle.service;

import middle.model.Member;
import middle.model.MypageDao;

public class MypageService {
	private static MypageService service = new MypageService();
	private static MypageDao dao;
	private static final int PAGE_SIZE = 2;
	
	public static MypageService getInstance() {
		dao = MypageDao.getInstance();
		return service;
	}
	
	public Member myprofileService(int user_id) {
		System.out.println("¼­ºñ½º");
		return dao.mypageprofile(user_id);
	}
	
	public int modifyService(Member member) {
		return dao.modifyprofile(member);
	}
}
