package middle.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import middle.service.MemberService;

public class InsertSignUpAction implements Action {

    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ActionForward forward = new ActionForward();
        HttpSession session = request.getSession();
        if(session != null) {
        	session.invalidate();
        }
        
        MemberService service = MemberService.getInstance();
        int para = service.insertSignUpService(request);
        request.setAttribute("loginCheck", para);
        forward.setRedirect(true);
        forward.setPath("mainPage.do");
        
        
        return forward;
    }

}
