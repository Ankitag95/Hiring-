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
    
    @Column(name= "dob")
    private String dob;
    
    @Column(name= "gender")
	private String gender;
    
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		return "interviwer";
	}

	public void setRole() {
		this.role = "interviwer";
	}
	}
