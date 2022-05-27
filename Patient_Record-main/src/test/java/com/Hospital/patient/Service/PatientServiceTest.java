package com.Hospital.patient.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Hospital.patient.Entity.person;
import com.Hospital.patient.Repository.PatientRepository;


@RunWith(MockitoJUnitRunner.class)
class PatientServiceTest {

	
	@Mock
    private PatientRepository patientRepository;
	
	@InjectMocks
	private PatientService patientservice;
	
	
	@Test
	public void findPatientList()
	{
	  
	   person patient=new person();
	   patient.setId(1);
	   patient.setName("MrityunjayTha");
	   patient.setAddress("Bapu Nagar Ujjain");
	   patient.setEmail("Mrity@gmail.com");
	   patient.setPassword("Mrit@123");
	   patient.setPhonNumber(843151081);
	   //patient.setDateCreated(new Date());
	   Mockito.when(patientRepository.save(patient)).thenReturn(patient);
	   assertThat(patientservice.createPatient(patient)).isEqualTo(patient);
	}

}
