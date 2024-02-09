package com.collegeFestival.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collegeFestival.Entity.PatientClass;

public interface PatientRepository extends JpaRepository<PatientClass, Integer> {

}
