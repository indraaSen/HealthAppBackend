package com.collegeFestival.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collegeFestival.Entity.DoctorClass;

public interface DoctorRepository extends JpaRepository<DoctorClass, Integer> {

}
