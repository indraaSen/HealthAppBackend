package com.collegeFestival.Service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.collegeFestival.Entity.AdminClass;
import com.collegeFestival.Entity.DoctorClass;
import com.collegeFestival.Entity.PatientClass;
import com.collegeFestival.Repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepo;

	// this method will save the new admin.
	public ResponseEntity<AdminClass> saveNewAdmin(AdminClass admin) {
		try {
			if(admin.getAdmname() == null || admin.getAdmemail() == null || admin.getAdmpassword() == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}else {
				adminRepo.save(admin);
				return new ResponseEntity<>(admin, HttpStatus.CREATED); 
			}
				
		} catch (Exception e) {
			throw new NullPointerException(e + "Value Required");
		}
	}

	public List<PatientClass> getPatientsForAdmin(int patentid) {
		 AdminClass admin = adminRepo.findById(patentid).orElse(null);
		 if (admin != null) {
			 return admin.getPatients();
		 }
		return Collections.emptyList();
		   
	}

	public List<DoctorClass> getDoctorsForAdmin(int doctorid) {
		AdminClass admin = adminRepo.findById(doctorid).orElse(null);
		 if (admin != null) {
			 return admin.getDoctors();
		 }
		return Collections.emptyList();
	}

}
