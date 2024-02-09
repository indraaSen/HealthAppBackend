package com.collegeFestival.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PatientClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patid;
	private String patname;
	private String patemail;
	private String patpassword;
	private String patcity;
	private String patusertype;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private AdminClass admin;
	
	public AdminClass getAdmin() {
		return admin;
	}
	public void setAdmin(AdminClass admin) {
		this.admin = admin;
	}
	public int getPatid() {
		return patid;
	}
	public void setPatid(int patid) {
		this.patid = patid;
	}
	public String getPatname() {
		return patname;
	}
	public void setPatname(String patname) {
		this.patname = patname;
	}
	public String getPatemail() {
		return patemail;
	}
	public void setPatemail(String patemail) {
		this.patemail = patemail;
	}
	public String getPatpassword() {
		return patpassword;
	}
	public void setPatpassword(String patpassword) {
		this.patpassword = patpassword;
	}
	public String getPatcity() {
		return patcity;
	}
	public void setPatcity(String patcity) {
		this.patcity = patcity;
	}
	public String getPatusertype() {
		return patusertype;
	}
	public void setPatusertype(String patusertype) {
		this.patusertype = patusertype;
	}
	
	

	
	
}
