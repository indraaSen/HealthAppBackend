package com.collegeFestival.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DoctorClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docid;
	private String docname;
	private String docemail;
	private String docpassword;
	public AdminClass getAdmin() {
		return admin;
	}
	public void setAdmin(AdminClass admin) {
		this.admin = admin;
	}
	private String docspeciality;
	private String docusertype;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private AdminClass admin;
	
	
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	public String getDocname() {
		return docname;
	}
	public void setDocname(String docname) {
		this.docname = docname;
	}
	public String getDocemail() {
		return docemail;
	}
	public void setDocemail(String docemail) {
		this.docemail = docemail;
	}
	public String getDocpassword() {
		return docpassword;
	}
	public void setDocpassword(String docpassword) {
		this.docpassword = docpassword;
	}
	public String getDocspeciality() {
		return docspeciality;
	}
	public void setDocspeciality(String docspeciality) {
		this.docspeciality = docspeciality;
	}
	public String getDocusertype() {
		return docusertype;
	}
	public void setDocusertype(String docusertype) {
		this.docusertype = docusertype;
	}
	
	
}
