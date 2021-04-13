package middle.mapper;

import middle.model.Member;

public interface Mypagemapper {
	Member mypageprofile(int user_id);
	int modifyprofile(Member member);
	int deletemember(Member memeber);
}
