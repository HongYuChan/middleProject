package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.model.Image;
import middle.model.Member;
import middle.model.Member_img;
import middle.model.Product;
import middle.service.MypageService;

public class MyprofileAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MypageService service = MypageService.getInstance();
		int user_id = 3;//Integer.parseInt(request.getParameter("user_id"));
		Member member = service.myprofileService(user_id);
		Member_img mimg = service.profileImgService(user_id);
		//Image pimg = service.productImgService(product_id);
		
		request.setAttribute("member", member);
		request.setAttribute("mimg", mimg);
		forward.setRedirect(false);
		forward.setPath("/views/my_profile.jsp");
		return forward;
	}

}
