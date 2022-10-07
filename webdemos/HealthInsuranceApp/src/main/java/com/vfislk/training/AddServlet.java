package com.vfislk.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vfislk.model.Plan;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addservlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String planName=request.getParameter("planName");
		String category=request.getParameter("category");
		String brand=request.getParameter("brand");
		String coverage=request.getParameter("coverage");
		double sumInsured=Double.parseDouble(request.getParameter("sumInsured"));
		Plan plan=new Plan(); 
		plan.setPlanName(planName);
		plan.setCategory(category);
        plan.setBrand(brand);
        plan.setCoverage(coverage);
        plan.setSumInsured(sumInsured);
        request.setAttribute("plan", plan);
        RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
//		List<Plan> addList=new ArrayList<>();
//		addList.add(planName);
//		addList.add(category);
//		addList.add(brand);
//		addList.add(coverage);
//		addList.add(sumInsured);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
