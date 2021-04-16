package middle.service;

import java.util.List;

import middle.model.Deal;
import middle.model.Image;
import middle.model.Member;
import middle.model.Member_Product;
import middle.model.Member_img;
import middle.model.MypageDao;

public class MypageService {
	private static MypageService service = new MypageService();
	private static MypageDao dao;
	private static final int PAGE_SIZE = 2;
	
	public static MypageService getInstance() {
		dao = MypageDao.getInstance();
		return service;
	}
	
	public Member memberService(int user_id) {
		return dao.member(user_id);
	}
	
	public Member_Product myprofileService(int user_id) {
		return dao.myprofile(user_id);
	}
	
	public Member_img profileImgService(int user_id) {
		return dao.memberImg(user_id);
	}
	
	public Image productImgService(int product_id) {
		return dao.productImg(product_id);
	}
	
	public int modifyPassService(Member member) {
		System.out.println("패스워드 서비스");
		return dao.modifypassword(member);
	}
	
	public int modifyNickService(Member member) {
		return dao.modifynickname(member);
	}
	
	public int modifyEmailService(Member member) {
		return dao.modifyemail(member);
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
