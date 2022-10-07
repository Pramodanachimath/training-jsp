package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisteredServlet
 */
@WebServlet("/register")
public class RegisteredServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisteredServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String Studentname=request.getParameter("studentname");
//		String StudentId=request.getParameter("studentid");
		int id=Integer.parseInt(request.getParameter("studentid"));
	
		String city=request.getParameter("city");
		String language=request.getParameter("language");
		String hobbies []=request.getParameterValues("hobbies");
		
		out.println("<html><body>");
		out.print("<strong>Welcome "+Studentname+"</strong> <br>");
		out.print("<strong>your ID is "+id+"</strong> <br>");
		out.print("<strong>your city is "+city+"</strong> <br>");
		out.print("<strong>your language is "+language+"</strong> <br>");
		Stream.of(hobbies).forEach(out::print);
//		out.print("<strong>your hobbies are  "+hobbies+"</strong> <br>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
