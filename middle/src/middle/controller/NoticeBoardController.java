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
import middle.action.NoticeDetailAction;
import middle.action.NoticeInsertAction;
import middle.action.NoticeInsertFormAction;
import middle.action.NoticeListAction;

@WebServlet("/noticeBoard/*")
public class NoticeBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public NoticeBoardController() {
    }
 
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String requestURI = request.getRequestURI();
    		System.out.println("requestURI: "+requestURI);
    	String contextPath = request.getContextPath();
    		System.out.println("contextPath: "+contextPath);
    	String command = requestURI.substring(contextPath.length()+13);
    		System.out.println("최종요청: " + command);
    	
    	Action action = null;
    	ActionForward forward = null;
    	
    	if(command.equals("noticeInsertForm.do")) {
    		action = new NoticeInsertFormAction();
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
    	}
    	
    	if(forward != null) {
    		if(forward.isRedirect()) {
    			response.sendRedirect(forward.getPath());
    		}else {
    			RequestDispatcher dispacher =
    					request.getRequestDispatcher(forward.getPath());
    			dispacher.forward(request, response);
    		}
    	}
    		
    		
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
