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
    
    
    @Column(name="month")
    private String month;
    
    @Column(name="year")
    private String year;
    
    @Column(name= "qlid",unique=true)
    private String qlid;
      
    @Column(name= "skills")
    private String skills;
    
    @Column(name= "skills2")
    private String skills2;
    
    @Column(name ="skills3")
    private String skills3;
    
    @Column(name= "skills4")
    private String skills4;
    
    @Column(name ="skills5")
    private String skills5; 
    
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
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
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

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}	

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

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getRole() 
	{
		return "interviwer";
	}
	public void setRole() {
		this.role = "interviwer";
	}
}

