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
import middle.action.DeleteMemberAction;
import middle.action.ModifyEmailAction;
import middle.action.ModifyNicknameAction;
import middle.action.ModifyformAction;
import middle.action.ModifypasswordAction;
import middle.action.MyprofileAction;
import middle.action.TradeHistoryAction;


@WebServlet("/Mypage/*")
public class MypageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MypageController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    	String requestURL = request.getRequestURI();  
    	
    	String contextPath = request.getContextPath();
    	String command = requestURL.substring(contextPath.length()+8);
    	System.out.println("요청  : " +command);
    	
    	Action action = null; 
    	ActionForward forward = null;
    	
    	if(command.equals("myprofile.do")) {
    		System.out.println("컨트롤러");
    		action = new MyprofileAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	else if(command.equals("modifyform.do")) {
    		action = new ModifyformAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	else if(command.equals("modifypassword.do")) {
    		System.out.println("컨트롤러");
    		action = new ModifypasswordAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	else if(command.equals("modifynickname.do")) {
    		System.out.println("컨트롤러");
    		action = new ModifyNicknameAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	else if(command.equals("modifyemail.do")) {
    		System.out.println("컨트롤러");
    		action = new ModifyEmailAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	else if(command.equals("deletemember.do")) {
    		System.out.println("컨트롤러");
    		action = new DeleteMemberAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	else if(command.equals("tradehistory.do")) {
    		action = new TradeHistoryAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	if(forward != null) {
    		if(forward.isRedirect()) {
    			response.sendRedirect(forward.getPath());
    		}
    		else {
    			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
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
