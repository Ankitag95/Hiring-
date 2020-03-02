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
    
    @Column(name= "Skill_set")
	private String Skill_set;
    
    @Column(name= "email")
	private String email;
    
    @Column(name= "password")
	private String password;
    
    @Column(name= "cpassword")
	private String cpassword;
    
    @Column(name= "number")
	private String number;
    
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
}
