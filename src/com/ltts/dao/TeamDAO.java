package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.connectionbuild.MyConnection;
import com.ltts.model.Team;

public class TeamDAO {
	public boolean insertTeam(Team T) throws Exception {
		//fill your code
		
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into Team values(?,?,?,?)");
		ps.setInt(1, T.getTeamid());
		ps.setString(2, T.getTeamname());
		ps.setString(3, T.getCoachname());
		ps.setString(4, T.getOwnername());
		
		return ps.execute();
		//return false;

		
	

}

}
