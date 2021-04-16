package middle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import middle.action.Action;
import middle.action.ActionForward;
import middle.action.InsertProductAction;
import middle.action.InsertProductFormAction;
import middle.action.InsertSignUpAction;
import middle.action.InsertSignUpForm;
import middle.action.LoginAction;
import middle.action.LoginFormAction;
import middle.action.MainPageAction;
import middle.action.NoticeDeleteAction;
import middle.action.NoticeDetailAction;
import middle.action.NoticeInsertAction;
import middle.action.NoticeInsertFormAction;
import middle.action.NoticeListAction;
import middle.action.NoticeUpdateAction;
import middle.action.NoticeUpdateFormAction;
import middle.action.StreamAction;

/**
 * 
 * - Servlet implementation class MemberController
 */
@WebServlet("/member/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberController() {
		super();
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length() + 8);

		Action action = null;
		ActionForward forward = null;

		if(command.equals("insertSignUpAction.do")) {
			action = new InsertSignUpAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("insertSignUpForm.do")) {
			action = new InsertSignUpForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(command.equals("loginAction.do")) {
			action = new LoginAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		} else if(command.equals("loginForm.do")) {
			action = new LoginFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("mainPage.do")) {
    		action = new MainPageAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("streamPage.do")) {
    		action = new StreamAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("noticeInsertAction.do")) {
    		action = new NoticeInsertAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("noticeListAction.do")) {
    		action = new NoticeListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("noticeDetailBoard.do")) {
    		action = new NoticeDetailAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("noticeUpdateAction.do")) {
			action = new NoticeUpdateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    	else if(command.equals("noticeUpdateFormAction.do")) {
			action = new NoticeUpdateFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	else if(command.equals("noticeDeleteAction.do")) {
			action = new NoticeDeleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("noticeInsertFormAction.do")) {
    		action = new NoticeInsertFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("insertProductAction.do")) {
    		action = new InsertProductAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("insertProductForm.do")) {
    		action = new InsertProductFormAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}

		if(forward != null) {
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dipDispatcher = request.getRequestDispatcher(forward.getPath());
				dipDispatcher.forward(request, response);
			}
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
    }
}