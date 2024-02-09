package com.collegeFestival.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.collegeFestival.Entity.DoctorClass;
import com.collegeFestival.Repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepo;

	// this method will save the new doctor.
	public ResponseEntity<DoctorClass> saveNewDoctor(DoctorClass doctor) {
		try {
			if(doctor.getDocname() == null || doctor.getDocemail() == null || doctor.getDocpassword() == null || doctor.getDocspeciality() == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}else {
				doctorRepo.save(doctor);
				return new ResponseEntity<>(doctor, HttpStatus.CREATED); 
			}
		} catch (Exception e) {
			throw new NullPointerException(e + "Value Required");
		}
	}
}
