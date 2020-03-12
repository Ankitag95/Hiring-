package com.ncr.hiring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="userList",schema="userdir")
public class HiringDao {


	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
   private Long ID;
    
    @Column(name= "first_name")
    private String fName;
    
    @Column(name= "last_name")
    private String lName;
    
    @Column(name= "qlid",unique=true)
    private String qlid;
      
    @Column(name= "password_extension")
    private byte[] salt;
    
    	@Column(name= "interviewer_skill1")
    private String interviewer_skill1;
    
    @Column(name= "interviewer_skill2")
    private String interviewer_skill2;
    
    @Column(name ="interviewer_skill3")
    private String interviewer_skill3;
    
    @Column(name= "interviewer_skill4")
    private String interviewer_skill4;
    
    @Column(name ="interviewer_skill5")
    private String interviewer_skill5; 
    
    @Column(name="interviewer_available_month")
    private String interviewer_available_month;
    
    @Column(name="interviewer_available_year")
    private String interviewer_available_year;
    
	
    @Column(name= "email")
	private String email;
    
    @Column(name= "password")
	private String password;
    
    @Column(name= "cpassword")
	private String cpassword;
    
    @Column(name= "number")
	private String number;
    
    @Column(name="role")
    private String role;

	public String getYear() {
		return interviewer_available_year;
	}
	
	public void setYear(String year) {
		this.interviewer_available_year = year;
	}

	public String getMonth() {
		return interviewer_available_month;
	}

	public void setMonth(String month) {
		this.interviewer_available_month = month;
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


	public String getQlid() {
		return qlid;
	}

	public void setQlid(String qlid) {
		this.qlid = qlid;
	}

	public String getInterviewer_skill1() {
		return interviewer_skill1;
	}

	public void setInterviewer_skill1(String skills) {
		this.interviewer_skill1 = skills;
	}

	public String getInterviewer_skill2() {
		return interviewer_skill2;
	}

	public void setInterviewer_skill2(String interviewer_skill2) {
		this.interviewer_skill2 = interviewer_skill2;
	}

	public String getInterviewer_skill3() {
		return interviewer_skill3;
	}

	public void setInterviewer_skill3(String skill3) {
		this.interviewer_skill3 = skill3;
	}

	public String getInterviewer_skill4() {
		return interviewer_skill4;
	}

	public void setInterviewer_skill4(String skill4) {
		this.interviewer_skill4 = skill4;
	}

	public String getInterviewer_skill5() {
		return interviewer_skill5;
	}

	public void setInterviewer_skill5(String skill5) {
		this.interviewer_skill5 = skill5;
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

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
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

	public String getRole() {
		return this.role;
	}

	public void setRole() {
		this.role = "Interviewer";
		
	}
	
	

    public byte[] getSalt() {
		return salt;
	}

	public void setSalt(byte[] salt) {
		this.salt = salt;
	}

	public String getInterviewer_available_month() {
		return interviewer_available_month;
	}

	public void setInterviewer_available_month(String interviewer_available_month) {
		this.interviewer_available_month = interviewer_available_month;
	}

	public String getInterviewer_available_year() {
		return interviewer_available_year;
	}

	public void setInterviewer_available_year(String interviewer_available_year) {
		this.interviewer_available_year = interviewer_available_year;
	}

	public void setRole(String role) {
		this.role = role;
	}


}

