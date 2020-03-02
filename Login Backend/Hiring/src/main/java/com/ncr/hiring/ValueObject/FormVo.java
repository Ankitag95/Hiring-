package com.ncr.hiring.ValueObject;

public class FormVo {
	
	private long id;
	private String qlid;
	private String fName;
	private String lName;
	private String skills;
	public String getSkills2() {
		return skills2;
	}
	public void setSkills2(String skills2) {
		this.skills2 = skills2;
	}
	public String getSkills3() {
		return skills3;
	}
	public void setSkills3(String skills3) {
		this.skills3 = skills3;
	}
	public String getSkills4() {
		return skills4;
	}
	public void setSkills4(String skills4) {
		this.skills4 = skills4;
	}
	public String getSkills5() {
		return skills5;
	}
	public void setSkills5(String skills5) {
		this.skills5 = skills5;
	}
	private String skills2;
	private String skills3;
	private String skills4;
	private String skills5;
	private String email;
	private String password;
	private String cpassword;//Confirm Password
	private String number;//Contact Number
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getQlid() {
		return qlid;
	}
	public void setQlid(String qlid) {
		this.qlid = qlid;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

}
