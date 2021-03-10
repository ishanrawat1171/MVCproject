package com.ltts.controller;
import com.ltts.dao.PlayerDAO;

import com.ltts.model.Player;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newServlet
 */
@WebServlet("/newServlet")
public class newServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public newServlet() {
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
		String name=request.getParameter("name");
		String dob=request.getParameter("dob");
		int id=Integer.parseInt(request.getParameter("id"));
		int teamid=Integer.parseInt(request.getParameter("teamid"));
		String fathername=request.getParameter("fathername");
		String mothername=request.getParameter("mothername");
		String email=request.getParameter("email");
		String hobby=request.getParameter("hobby");
		
	Player p=new Player(name,dob,fathername,mothername,hobby,id,email,teamid);
	
	PlayerDAO pd=new PlayerDAO();
	boolean b=false;
	try {
		b=pd.insertPlayer(p); // Control TRanfers to Dao file
		System.out.println("Successfully Inserted...");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RequestDispatcher rs = request.getRequestDispatcher("Auction.html");
	rs.include(request,response);
	}
}