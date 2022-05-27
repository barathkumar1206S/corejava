package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionState
 */
public class SessionState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionState() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>HelloWorld</title></head><body>");
		String submitValue = request.getParameter("submit");
		HttpSession session=request.getSession(true);//create session id(token)
		System.out.println(session.getId());
		if(submitValue.equals("Result")) 
		{
	//	response.sendRedirect("Result");// Navigate one servlet to another
	//response.sendRedirect("http://www.google.com");//sendRedirect() can also be used to navigate to another web site
		RequestDispatcher rd=request.getRequestDispatcher("Result");
		rd.forward(request, response);
		//passsing the request response object received by the current servlet to the forwarded servlet.
		}
		else if (submitValue.equals("set")) {
			String salaryInput = request.getParameter("salary");
			session.setAttribute("salary", salaryInput);//Store data in session scope for each user
			//session.setAtrribute()stores the data in collection using key and value
			//salary=key, salaryInput= value.
			out.println("<h2>Value Set </h2>" + salaryInput);
		} else if (submitValue.equals("fetch")) {
			String sessionSalary=(String) session.getAttribute("salary");
			  if (sessionSalary == null) {
	                out.println("<h1> Session not yet set!!! </h1>");
	            } else {
	                out.println("<h1>Value Fetched </h1>" + sessionSalary);
	                // returning value from sessionAttribute to html
	            }
		
		out.println("</body></html>");
	}
	}
}
