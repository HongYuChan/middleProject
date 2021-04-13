package login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.action.Action;
import login.action.ActionForward;
import login.action.SetLoginAction;
import login.action.LoginAction;
import login.model.UserModel;

@WebServlet("/login/*")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();

		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 7);
		System.out.println("최종요청:" + command);

		Action action = null;
		ActionForward forward = null;

		if (command.equals("loginForm.do")) {
			action = new LoginAction();
			
			try {
				forward = action.execute(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (command.equals("checkUser.do")) {
			action = new SetLoginAction();
			
			try {
				forward = action.execute(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispacher = request.getRequestDispatcher(forward.getPath());
				dispacher.forward(request, response);
			}
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
