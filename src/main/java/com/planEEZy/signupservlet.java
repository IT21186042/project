package com.planEEZy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("name");
		String uemail=request.getParameter("email");
		String address=request.getParameter("addr");
		String phnnumber=request.getParameter("contact");
		boolean check = false;
		
		
	    check=signupmodel.signupdetails(uname,address,phnnumber,uemail);
	    
	    
	
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
