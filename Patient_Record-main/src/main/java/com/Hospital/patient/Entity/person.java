package com.Hospital.patient.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.NonNull;

import com.sun.istack.NotNull;

import lombok.*;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class person {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    
   
@NotNull
    @Size(min = 3, message = "Name must have at least 2 characters")
    private String Name;
    
   @NotNull
    @Size(min = 10, message = "Address must have at least 10 characters")
    private String Address;
    
   @javax.validation.constraints.Email(message = "Email should be valid")
    private String Email;
   
//    @NotNull
//   @Size(min = 7, message = "Name must have at least 2 characters")
    private long PhonNumber;
    
     public person()
     {
    	 
     }
     public person(long id, @Size(min = 3, message = "Name must have at least 2 characters") String name,
 			@Size(min = 10, message = "Address must have at least 10 characters") String address,
 			@javax.validation.constraints.Email(message = "Email should be valid") String email, long phonNumber,
 			@NotBlank(message = " password is mandatory") String password, Date dateCreated) {
 		super();
 		this.id = id;
 		Name = name;
 		Address = address;
 		Email = email;
 		PhonNumber = phonNumber;
 		Password = password;
 		this.dateCreated = dateCreated;
 	}

	

	@NotNull 
    @NotBlank(message = " password is mandatory")
    private String Password;
    
    @CreationTimestamp
    private Date dateCreated;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getPhonNumber() {
		return PhonNumber;
	}

	public void setPhonNumber(long phonNumber) {
		PhonNumber = phonNumber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	


}
