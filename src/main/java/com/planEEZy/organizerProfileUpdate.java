package com.planEEZy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.PlanEEZy.util.EventDBF;


public class organizerProfileUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// assign all the updated  inputs into variables which have entered through the form
				
				String Name = request.getParameter("Name");
				String Phone = request.getParameter("mobile");
				String address= request.getParameter("address");
				String email = request.getParameter("email");
				
				boolean isTrue;//variable for assign true or false if data has been send to the DB
				
				isTrue = EventDBF.updateEvent(up_eventid, up_date, up_Type, up_NoOfGuests);//call the method
				
				if(isTrue == true) {//if true
					RequestDispatcher dis1 = request.getRequestDispatcher("Events_CustomerPOV.jsp");//show success message
					dis1.forward(request, response);
				}
				else {//if false
					RequestDispatcher dis2 = request.getRequestDispatcher("createEventUnsuccess.jsp");//show unsuccess message
					dis2.forward(request, response);
				}
	}

}
