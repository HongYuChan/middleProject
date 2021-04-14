package middle.mapper;

import java.util.List;

import middle.model.Deal;
import middle.model.Member;
import middle.model.Product;

public interface Mypagemapper {
	Member myprofile(int user_id);
	Product myproduct(int user_id);
	int modifyprofile(Member member);
	int deletemember(int user_id);
	List<Deal> sellList(int user_id);
	List<Deal> buyList(int buyer_id);
}
