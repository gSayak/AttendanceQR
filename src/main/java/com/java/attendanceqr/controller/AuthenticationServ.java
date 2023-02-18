package com.java.attendanceqr.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticationServ
 */
@WebServlet("/AuthenticationServ")
public class AuthenticationServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServ() {
        super();
        // TODO Auto-generated constructor stub
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
		String userid = request.getParameter("uname");
		String pwd = request.getParameter("pass");
		if(userid.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("pass123")) {
			RequestDispatcher rd = request.getRequestDispatcher("./admin/welcome.jsp");
			rd.forward(request, response);
		}
		else if(userid.equalsIgnoreCase("member") && pwd.equalsIgnoreCase("member")) {
			RequestDispatcher rd = request.getRequestDispatcher("./QR.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
			
		}
	}
}
