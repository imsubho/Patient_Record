package com.Hospital.patient.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.patient.Entity.person;
import com.Hospital.patient.Repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepo;
	
	
	public  person createPatient(person person) {
		return patientRepo.save(person);
	}
	
	

	public List<person> getAllpatients() {
		// TODO Auto-generated method stub
		System.out.print("enter");
        return patientRepo.findAll();
	}
	
	public Optional<person> deletePatient(person person)
	{
		
		Optional<person> result= patientRepo.findById(person.getId());
		if(result!=null)
		{
			patientRepo.delete(person);
			return result;
		}
		else {
			System.out.print("Person doesn't exist");
			return null;
		}
	}
	public person UpdatePatient(person person)
	{
		/*person updatePerson=null;
		Optional<com.Hospital.patient.Entity.person> result=patientRepo.findById(person.getId());
		if(result.isPresent())
		{
			//updatePerson.setId(person.getId());
			updatePerson.setName(person.getName());
			updatePerson.setAddress(person.getAddress());
			updatePerson.setEmail(person.getEmail());
			updatePerson.setPhonNumber(person.getPhonNumber());
			updatePerson.setDateCreated(new Date(0));
			patientRepo.save(updatePerson);
			
			
			return result;
		}
		else {
			System.out.print("Person doesn't exist");
			return null;
		}*/
		return patientRepo.save(person);
	     
	}
	
}
