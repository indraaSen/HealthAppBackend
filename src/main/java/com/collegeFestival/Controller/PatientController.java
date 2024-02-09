package com.collegeFestival.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collegeFestival.Entity.PatientClass;
import com.collegeFestival.Service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientServ;
	
	//this method will save the new patient
	@PostMapping("patient/newpatient")
	public ResponseEntity<PatientClass> addNewAdmin(@RequestBody PatientClass patient) {
		return patientServ.saveNewPatient(patient);
		
	}
	
	
}
