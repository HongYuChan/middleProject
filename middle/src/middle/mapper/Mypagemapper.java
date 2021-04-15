package middle.mapper;

import java.util.List;

import middle.model.Deal;
import middle.model.Image;
import middle.model.Member;
import middle.model.Member_img;
import middle.model.Product;

public interface Mypagemapper {
	Member myprofile(int user_id);
	Product myproduct(int user_id);
	Member_img memberImg(int user_id);
	Image productImg(int product_id);
	int modifypassword(Member member);
	int modifynickname(Member member);
	int modifyemail(Member member);
	int deletemember(int user_id);
	List<Deal> sellList(int user_id);
	List<Deal> buyList(int buyer_id);
}
