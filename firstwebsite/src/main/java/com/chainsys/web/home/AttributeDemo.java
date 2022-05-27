package com.chainsys.web.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributeDemo
 */
public class AttributeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AttributeDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	public String salary = null;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>HelloWorld</title></head><body>");
		String submitValue = request.getParameter("submit");
		if (submitValue.equals("set")) {
			String salaryInput = request.getParameter("salary");
			salary = salaryInput;//Storing data in global variable
			out.println("<hl>Value Set</hl>" + salary);
		} else if (submitValue.equals("fetch")) {
			out.println("<hl>Value fetch</hl>" + salary);//returning value from global variable to html
		}
		
		out.println("</body></html>");

	}

}
