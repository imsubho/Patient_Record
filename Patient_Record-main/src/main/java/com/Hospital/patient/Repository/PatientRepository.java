package com.Hospital.patient.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.patient.Entity.person;

@Repository
public interface PatientRepository  extends JpaRepository<person,Long>{

}
