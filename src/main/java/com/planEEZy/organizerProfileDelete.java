package com.planEEZy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.PlanEEZy.util.EventDBF;


public class organizerProfileDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int organizerID = Integer.parseInt(request.getParameter("organizerid"));//assign eventID through the form
		
		boolean isTrue;//variable for assign true or false if data has been send to the DB
		isTrue = EventDBF.deleteEvent(del_eventid);//call the method
		
		if(isTrue == true) {
			RequestDispatcher dis1 = request.getRequestDispatcher("Events_CustomerPOV.jsp");//show success message
			dis1.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("createEventUnsuccess.jsp");//show unsuccess message
			dis2.forward(request, response);
		}
    	
    	
	}

}
