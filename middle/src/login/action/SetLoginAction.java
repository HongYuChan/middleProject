package login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import login.model.UserModel;
import login.service.LoginService;

public class SetLoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		LoginService service = LoginService.getInstance();

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		UserModel userCheck = service.SetLoginService(id, password);
		System.out.println("CheckUserAction/Parameter");

		request.setAttribute("userCheck", userCheck);
		System.out.println("CheckUserAction/Parameter in");
		
		service.NextPageCheck(id, password);
		
		return forward;
	}
}
