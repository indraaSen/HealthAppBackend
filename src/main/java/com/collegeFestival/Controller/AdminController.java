package com.collegeFestival.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collegeFestival.Entity.AdminClass;
import com.collegeFestival.Entity.DoctorClass;
import com.collegeFestival.Entity.PatientClass;
import com.collegeFestival.Service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminServ;
	
	// this method will save the new admin.
	@PostMapping("/newadmin")
	public ResponseEntity<AdminClass> addNewAdmin(@RequestBody AdminClass admin) {
		return adminServ.saveNewAdmin(admin);
	}
	
	//this method will return all data of patients from admin.
	@GetMapping("/get/patient/{patentid}")
	public ResponseEntity<List<PatientClass>> getDataofPatients(@PathVariable ("patentid") int patentid){
		 List<PatientClass> patients = adminServ.getPatientsForAdmin(patentid);
		 return ResponseEntity.ok(patients);
	}
	
	//this method will return all data of doctors from admin.
	@GetMapping("/get/doctor/{doctorid}")
	public ResponseEntity<List<DoctorClass>> getDataofDoctors(@PathVariable ("doctorid") int doctorid){
		 List<DoctorClass> doctors = adminServ.getDoctorsForAdmin(doctorid);
		 return ResponseEntity.ok(doctors);
	}
}
