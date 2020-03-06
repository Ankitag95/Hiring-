package com.ncr.hiring.Bean;

public class InterviewerLoginBean {
	private String email;
	private String fName;
	private String lName;
	private String password;
	private String role;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	private Long iD;
	private boolean isValid;
	
	public Long getiD() {
		return iD;
	}
	public void setiD(Long iD) {
		this.iD = iD;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getFirst_name() {
//		return first_name;
//	}
//	public void setFirst_name(String first_name) {
//		this.first_name = first_name;
//	}
//	public String getLast_name() {
//		return last_name;
//	}
//	public void setLast_name(String last_name) {
//		this.last_name = last_name;
//	}
	public String getRole() {
		return this.role;
}
	public void setRole(String role) {
		this.role = role;
	}
}
