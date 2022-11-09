package com.planEEZy;



import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;






public class Avenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		
		boolean isTrue;
		isTrue = AvenueUtil.DisplayAvenue(id);
		
		if(isTrue == true) {//if true
			  
			RequestDispatcher dis= request.getRequestDispatcher("Avenue.jsp");
			dis.forward(request, response);
			
		
	}

	}
	
}
