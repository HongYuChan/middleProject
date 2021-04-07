package middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/questionBoard/*")
public class QuestionBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public QuestionBoardController() {
    }
 
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String requestURI = request.getRequestURI();
    		System.out.println("requestURI: "+requestURI);
    	String contextPath = request.getContextPath();
    		System.out.println("contextPath: "+contextPath);
    	String command = requestURI.substring(contextPath.length()+15);
    		System.out.println("command: "+command);
    		
    		
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
