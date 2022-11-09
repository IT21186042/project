package com.planEEZy;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;





public class signinservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("username");
		String upassword=request.getParameter("password");
		String type=request.getParameter("check");
		
		
		boolean check = false;
		
	     check=signinmodel.signindetails(uname,upassword,type);
	    
	    
	
	    if(check==true) {
	    
		RequestDispatcher req=request.getRequestDispatcher("index.jsp");
		req.forward(request,response);
		
	    }
	    else {
	    
		RequestDispatcher dis=request.getRequestDispatcher("login.jsp");
		dis.forward(request, response);
	    }
}

}
