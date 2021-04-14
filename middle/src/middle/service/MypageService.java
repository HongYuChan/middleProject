package middle.service;

import java.util.List;

import middle.model.Deal;
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
		return dao.myprofile(user_id);
	}
	
	public int modifyService(Member member) {
		return dao.modifyprofile(member);
	}
	
	public int deleteService(int user_id) {
		return dao.deletemember(user_id);
	}
	
	public List<Deal> sellhistoryService(int user_id){
		return dao.sellList(user_id);
	}
	
	public  List<Deal> buyhistoryService(int buyer_id){
		return dao.buyList(buyer_id);
	}
}
