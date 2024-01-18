package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

@Entity
public class Student {
	@Id
    private int sid;
	
	private String sname;
	
	private String saddress;
	
	private String gender;

	
	private String suname;
	
	
	private String spass;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	public String getSpass() {
		return spass;
	}

	public void setSpass(String spass) {
		this.spass = spass;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", gender=" + gender
				+ ", suname=" + suname + ", spass=" + spass + "]";
	}
	
	
}
