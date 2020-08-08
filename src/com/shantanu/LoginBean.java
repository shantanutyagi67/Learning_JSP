package com.shantanu;

public class LoginBean {
private String fname,lname,password,emailid;


public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getEmailid() {
	return emailid;
}


public void setEmailid(String emailid) {
	this.emailid = emailid;
}


public boolean validate(String fn, String pass){
	if(password.equals(pass)&&(fname.equals(fn))){
		return true;
	}
	else{
		return false;
	}
}
}

