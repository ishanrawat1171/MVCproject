package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.connectionbuild.MyConnection;
import com.ltts.model.Auction;

public class AuctionDAO {
	public boolean insertAuction(Auction a) throws Exception {
		//fill your code
		
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into Auction values(?,?,?,?)");
		ps.setInt(1, a.getPlayerid());
		ps.setInt(2, a.getTeamid());
		ps.setString(3, a.getPlayername());
		ps.setInt(4, a.getAmount());
		
		return ps.execute();
		//return false;

		
	

}
}
