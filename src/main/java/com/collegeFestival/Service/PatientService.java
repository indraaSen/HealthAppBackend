package com.collegeFestival.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.collegeFestival.Entity.PatientClass;
import com.collegeFestival.Repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepo;

	//this method will save new patient.
	public ResponseEntity<PatientClass> saveNewPatient(PatientClass patient) {
		try {
			if(patient.getPatname() == null || patient.getPatemail() == null || patient.getPatpassword() == null || patient.getPatcity()==null) {
				
				return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
			}else {
				 patientRepo.save(patient);
				return new ResponseEntity<>(patient, HttpStatus.CREATED);
			}
		} catch (Exception e) {
			throw new NullPointerException(e + "Value Required");
		}
	}

}
