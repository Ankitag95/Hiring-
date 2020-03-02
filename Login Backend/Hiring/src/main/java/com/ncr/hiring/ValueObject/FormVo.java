package com.ncr.hiring.ValueObject;

public class FormVo {
	
	private long id;
	private String qlid;
	private String fName;
	private String lName;
	private String Skill_set;
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
	
	public String getSkill_set() {
		return Skill_set;
	}
	public void setSkill_set(String Skill_set) {
		this.Skill_set = Skill_set;
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

}
