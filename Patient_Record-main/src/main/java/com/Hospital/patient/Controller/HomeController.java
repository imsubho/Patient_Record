package com.Hospital.patient.Controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.validation.Valid;

//import java.util.logging.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import javax.validation.Valid;

//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.patient.Entity.person;
import com.Hospital.patient.Service.PatientService;





@CrossOrigin(origins = "*")
@RestController
public class HomeController {

	// private static final Logger LOG = (Logger) LogManager.getLogger(HomeController.class);	
  private final org.slf4j.Logger logger =  LoggerFactory.getLogger(HomeController.class);
	   
	@Autowired
	private PatientService allservice;
	
	@GetMapping("/")
	public void Home()
	{
	logger.info("Welcome");
		
	  System.out.print("Welcome to Patient Managment System");
	}
	
	  @PostMapping("/patient")
	    public person createPatient(@Valid @RequestBody person person) {
		  logger.info("save new patient");
	        return allservice.createPatient(person);
	    }
	  
	  @GetMapping("/patient")
	    public List<person> getAllPatient(){
	        return allservice.getAllpatients();
	    }
	    
	  @PutMapping("/patient")
	  public person updatePatient(@Valid @RequestBody person person)
	  {
		 logger.debug("Update patient");
		  return allservice.UpdatePatient(person);
	  }
	  @DeleteMapping("/patient")
	  public Optional<person> DeletePatient(@Valid @RequestBody person person)
	  {
		  logger.trace("Deleted patient");
		  return allservice.deletePatient(person);
	  }
}
