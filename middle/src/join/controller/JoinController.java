package join.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import join.action.Action;
import join.action.ActionForward;
import join.action.JoinAction;
import join.action.JoinEndAction;
import join.action.insertMemberInfoAction;

@WebServlet("/join/*")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JoinController() {
		super();
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();

		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 6);
		System.out.println("최종요청:" + command);

		Action action = null;
		ActionForward forward = null;

		if (command.equals("joinForm.do")) {
			action = new JoinAction();
			try {
				forward = action.execute(request, response);
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("insertMemberInfo.do")) {
			action = new insertMemberInfoAction();
			try {
				forward = action.execute(request, response);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(command.equals("joinEnd.do")) {
			action = new JoinEndAction();
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
