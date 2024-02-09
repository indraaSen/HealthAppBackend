package com.collegeFestival.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class AdminClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admid;
	private String admname;
	private String admemail;
	private String admpassword;
	private String admusertype;
	
	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	private List<PatientClass> patients = new ArrayList<>();;
	
	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	private List<DoctorClass> doctors  = new ArrayList<>(); ;
	
	
	public List<PatientClass> getPatients() {
		return patients;
	}
	public void setPatients(List<PatientClass> patients) {
		this.patients = patients;
	}
	public List<DoctorClass> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<DoctorClass> doctors) {
		this.doctors = doctors;
	}
	public int getAdmid() {
		return admid;
	}
	public void setAdmid(int admid) {
		this.admid = admid;
	}
	public String getAdmname() {
		return admname;
	}
	public void setAdmname(String admname) {
		this.admname = admname;
	}
	public String getAdmemail() {
		return admemail;
	}
	public void setAdmemail(String admemail) {
		this.admemail = admemail;
	}
	public String getAdmpassword() {
		return admpassword;
	}
	public void setAdmpassword(String admpassword) {
		this.admpassword = admpassword;
	}
	public String getAdmusertype() {
		return admusertype;
	}
	public void setAdmusertype(String admusertype) {
		this.admusertype = admusertype;
	}
	
	
	
}
