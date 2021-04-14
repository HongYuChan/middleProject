package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.service.MemberService;

public class InsertSignUpAction implements Action {

    @Override
    public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ActionForward forward = new ActionForward();
        
        MemberService service = MemberService.getInstance();
        int para = service.insertSignUpService(request);
        request.setAttribute("loginCheck", para);
        forward.setRedirect(true);
        forward.setPath("insertSignUpForm.do");
        
        return forward;
    }

}
