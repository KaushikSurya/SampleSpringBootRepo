package com.verizon.adb.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="Contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long contactId;
	
	@NotEmpty(message="FirstName can not be Empty!")
	@Size(min=1,max=20,message="FirstName can not be more than 20 characters")
	private String fname;
	
	@NotEmpty(message="LastName can not be Empty!")
	@Size(min=1,max=20,message="LastName can not be more than 20 characters")
	private String lname;
	
	@DateTimeFormat(iso=ISO.DATE)
	@NotNull(message="Date of Birth can not be Empty!")
	@Column(name="dob")
	private LocalDate dob;
	
	@NotEmpty(message="Email address can not be Empty")
	@Email(message="Invalid Email Address")
	private String email;
	
	@NotEmpty(message="Mobile Number can not be Empty")
	@Pattern(regexp="\\d{10}",message="Mobile Number can be only 10 digits")
	@Column(name="mbno")
	private String mbno;
	
	@NotNull(message="Should have a Gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMbno() {
		return mbno;
	}
	public void setMbno(String mbno) {
		this.mbno = mbno;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
