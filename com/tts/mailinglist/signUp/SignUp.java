package com.tts.mailinglist.signUp;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class SignUp {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	
	
	
	@Column
	@CreationTimestamp 
	private Date signedUp;
	
	
	public SignUp(String firstName, String lastName, String email, Date signed) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.signedUp = signedUp;
	}
	
	
	
	public SignUp() {
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getSignedUp() {
		return signedUp;
	}
	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}
	public Long getId() {
		return id;
	}




	@Override
	public String toString() {
		return "SignUp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", signedUp=" + signedUp + "]";
	}
	
	
}
