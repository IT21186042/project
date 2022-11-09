package com.planEEZy;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class venueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		
			List<Venue> ven=venueUtil.displayvenue();
			request.setAttribute("venue",ven);
			
			
			RequestDispatcher dis=request.getRequestDispatcher("venueset.jsp");
			dis.include(request,response);
			
			
		
		
		
	}

}
