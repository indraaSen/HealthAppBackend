package com.collegeFestival.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collegeFestival.Entity.AdminClass;

public interface AdminRepository extends JpaRepository<AdminClass, Integer> {

}
