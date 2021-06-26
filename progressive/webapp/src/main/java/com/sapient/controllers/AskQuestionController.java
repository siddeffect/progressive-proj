package com.sapient.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sapient.services.AskQuestionService;

@WebServlet("/askQuestion")
public class AskQuestionController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(); 
//		session.setAttribute("questionCount", (Integer)1);
//		session.setAttribute("userId", (Integer)100);
		
		
		if(new AskQuestionService().uploadQuestion(req, session)) {
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();   
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Question could not be posted');");
			out.println("location='index.jsp';");
			out.println("</script>"); 
			
			req.getRequestDispatcher("/ask-question.jsp").include(req, resp);
		}		
		 
	}
	
}