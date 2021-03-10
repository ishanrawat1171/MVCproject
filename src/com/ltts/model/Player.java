package com.ltts.model;



import java.util.Arrays;

public class Player {
String name;
String dob;

String fathername;
String mothername;
String hobby;
int id;
String email;
String skills[];
int teamid;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTeamid() {
	return teamid;
}
public void setTeamid(int teamid) {
	this.teamid = teamid;
}
public Player() {
	super();
	// TODO Auto-generated constructor stub
}


public Player(String name, String dob, String fathername, String mothername, String hobby, int id, String email,
		int teamid) {
	super();
	this.name = name;
	this.dob = dob;
	this.fathername = fathername;
	this.mothername = mothername;
	this.hobby = hobby;
	this.id = id;
	this.email = email;
	this.teamid = teamid;
}
@Override
public String toString() {
	return "Player [name=" + name + ", dob=" + dob + ", fathername=" + fathername + ", mothername=" + mothername
			+ ", hobby=" + hobby + ", id=" + id + ", email=" + email + ", skills=" + Arrays.toString(skills) + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getFathername() {
	return fathername;
}
public void setFathername(String fathername) {
	this.fathername = fathername;
}
public String getMothername() {
	return mothername;
}
public void setMothername(String mothername) {
	this.mothername = mothername;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


public void setSkills(String[] skills) {
	this.skills = skills;
}

}
