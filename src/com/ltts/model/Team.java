package com.ltts.model;

public class Team {
	int teamid;
	String ownername;
public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTeamname() {
		return Teamname;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", ownername=" + ownername + ", Teamname=" + Teamname + ", Coachname="
				+ Coachname + "]";
	}

	public Team(int teamid, String ownername, String teamname, String coachname) {
		super();
		this.teamid = teamid;
		this.ownername = ownername;
		Teamname = teamname;
		Coachname = coachname;
	}

	public void setTeamname(String teamname) {
		Teamname = teamname;
	}

	public String getCoachname() {
		return Coachname;
	}

	public void setCoachname(String coachname) {
		Coachname = coachname;
	}

String Teamname;

	String Coachname;

}
