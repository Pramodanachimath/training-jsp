package com.movies.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieapp.service.ILoginService;
import com.movieapp.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
		 String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 
		 ILoginService loginServer=new LoginServiceImpl();
		 
		boolean result=loginServer.validateUsername(username, password);
		HttpSession session=request.getSession();
		
		 if(result) {
//			 request.setAttribute("myusername", username);
			 session.setAttribute("myusername", username);
			 
			 session.invalidate();
				System.out.println("-----session iD----"+ session.getId());
				RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
				
				dispatcher.forward(request, response);
		 }else{
			 response.sendRedirect("index.jsp");
			 
		 }
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
