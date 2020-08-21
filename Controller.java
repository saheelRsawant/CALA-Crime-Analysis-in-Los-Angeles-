package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Crime_Address;
import com.bean.Query_Output;
import com.bean.Victim_Details;
import com.service.Service;

/**
 * Servlet implementation class Controller
 */
//@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("In Constructor");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
		System.out.println("In get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		System.out.println("In post");
		System.out.println(action);
		

		Service s = new Service();
		
		if("Query1".equals(action)) {
			ArrayList<Query_Output> query1_array = new ArrayList<Query_Output>();
//			victim_array.add(new Victim_Details(123,10, 'M', 'B', 43));
//			System.out.println("length"+victim_array.size());
			query1_array = s.retrieve();
	        request.setAttribute("Query1", query1_array);
	        RequestDispatcher rd = request.getRequestDispatcher("Query1.jsp");
			rd.forward(request, response);
		}
		if("Query2".equals(action)) {
			System.out.println("Entering Query2 controller");
			ArrayList<Query_Output> query2_array = new ArrayList<Query_Output>();
			query2_array = s.retrieve2();
			request.setAttribute("Query2", query2_array);
	        RequestDispatcher rd = request.getRequestDispatcher("Query2.jsp");
	        rd.forward(request, response);
		}
		if("Query3".equals(action)) {
			System.out.println("Entering Query3 controller");
			ArrayList<Query_Output> query3_array = new ArrayList<Query_Output>();
			query3_array = s.retrieve3();
			request.setAttribute("Query3", query3_array);
	        RequestDispatcher rd = request.getRequestDispatcher("Query3.jsp");
	        rd.forward(request, response);
		}
		if("Query4".equals(action)) {
			System.out.println("Entering Query4 controller");
			ArrayList<Query_Output> query4_array = new ArrayList<Query_Output>();
			query4_array = s.retrieve4();
			request.setAttribute("Query4", query4_array);
	        RequestDispatcher rd = request.getRequestDispatcher("Query4.jsp");
	        rd.forward(request, response);
		}
		if("Query5".equals(action)) {
			System.out.println("Entering Query5 controller");
			ArrayList<Query_Output> query5_array = new ArrayList<Query_Output>();
			query5_array = s.retrieve5();
			request.setAttribute("Query5", query5_array);
	        RequestDispatcher rd = request.getRequestDispatcher("Query5.jsp");
	        rd.forward(request, response);
		}
	}

}
