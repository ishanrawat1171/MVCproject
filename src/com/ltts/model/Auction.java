package com.ltts.model;

public class Auction {
int playerid;
int teamid;
String Playername;
int amount;
public int getPlayerid() {
	return playerid;
}
public void setPlayerid(int playerid) {
	this.playerid = playerid;
}
public int getTeamid() {
	return teamid;
}
public void setTeamid(int teamid) {
	this.teamid = teamid;
}
public String getPlayername() {
	return Playername;
}
public void setPlayername(String playername) {
	Playername = playername;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public Auction(int playerid, int teamid, String playername, int amount) {
	super();
	this.playerid = playerid;
	this.teamid = teamid;
	Playername = playername;
	this.amount = amount;
}
public Auction() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Auction [playerid=" + playerid + ", teamid=" + teamid + ", Playername=" + Playername + ", amount=" + amount
			+ "]";
}

}
