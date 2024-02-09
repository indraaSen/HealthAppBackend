package com.collegeFestival.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collegeFestival.Entity.DoctorClass;
import com.collegeFestival.Service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorServ;
	
	// this method will save the new doctor.
	@PostMapping("doctor/newdoctor")
	public ResponseEntity<DoctorClass> addNewAdmin(@RequestBody DoctorClass doctor) {
		return doctorServ.saveNewDoctor(doctor);
		
	}
}
