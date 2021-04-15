package middle.mapper;

import java.util.List;

import middle.model.Member;

public interface MemberMapper {
    int insertSignUp(Member member);
    Member loginCheck(String id);
}