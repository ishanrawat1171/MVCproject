package com.ltts.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.AuctionDAO;
import com.ltts.model.Auction;

/**
 * Servlet implementation class AuctionServlet
 */
@WebServlet("/AuctionServlet")
public class AuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuctionServlet() {
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
		String name=request.getParameter("name");
		
		int playerid=Integer.parseInt(request.getParameter("playerid"));
		String playername=request.getParameter("playername");
		int amount=Integer.parseInt(request.getParameter("price"));
		int teamid=Integer.parseInt(request.getParameter("teamid"));
	Auction p=new Auction(playerid,teamid,playername,amount);
	
	AuctionDAO pd=new AuctionDAO();
	boolean b=false;
	try {
		b=pd.insertAuction(p); // Control TRanfers to Dao file
		System.out.println("Successfully Inserted...");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	RequestDispatcher rs = request.getRequestDispatcher("sucess.html");
	rs.include(request,response);
	}

}
