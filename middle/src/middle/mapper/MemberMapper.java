package middle.mapper;


import middle.model.Member;
import middle.model.Product;

public interface MemberMapper {
    int insertSignUp(Member member);
    Member loginCheck(String id);
    int insertProduct(Product product);
}