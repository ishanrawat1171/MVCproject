package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.connectionbuild.MyConnection;
import com.ltts.model.Player;

public class PlayerDAO {

	
		public boolean insertPlayer(Player p) throws Exception {
			//fill your code
			
			Connection mc=MyConnection.getConnection(); // TRanfers control to another 
			PreparedStatement ps=mc.prepareStatement("insert into Player values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, p.getid());
			ps.setString(2, p.getName());
			ps.setString(3, p.getDob());
			ps.setString(4, p.getFathername());
			ps.setString(5, p.getMothername());
			ps.setString(6, p.getHobby());
			
			ps.setString(7, p.getEmail());
			ps.setInt(8,p.getTeamid());
			return ps.execute();
			//return false;

			
		

	}

}
