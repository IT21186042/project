package com.planEEZy;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet("/test")
public class organizerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	     
	
		
		List<organizer> org=organizerUtil.displayOrganizer();
		request.setAttribute("organizer", org);
		

		
		
		RequestDispatcher dis=request.getRequestDispatcher("organizerProfilejsp.jsp");
		dis.include(request,response);
		
	}

}
