/**
 * 
 */
package com.sample.model;

import org.springframework.beans.factory.annotation.Value;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author user
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity // This tells Hibernate to make a table out of this class
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty(message = "Email is a required field.")
	public String email;
	
	@NotEmpty(message = "First Name is a required field.")
	public String firstName;
	
	@NotEmpty(message = "Last Name is a required field.")
	public String lastName;
	
	@NotEmpty(message = "Phone Number is a required field.")
	public String phoneNumber;

	@Value("false")
	public Boolean isActive = false;
}
