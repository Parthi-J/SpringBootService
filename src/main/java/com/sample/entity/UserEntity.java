/**
 * 
 */
package com.sample.entity;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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
@Table(name="users")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="email", nullable=false)
	@NotEmpty(message = "Email is a required field.")
	@Email(message = "Email should be valid.")
	public String email;

	@Column(name="first_name", nullable=false)
	@NotEmpty(message = "First Name is a required field.")
	@Size(min = 2, max = 30)
	public String firstName;

	@Column(name="last_name", nullable=false)
	@NotEmpty(message = "Last Name is a required field.")
	@Size(min = 1, max = 30)
	public String lastName;

	@Column(name="phone_number", nullable=false)
	@NotEmpty(message = "Phone Number is a required field.")
	@Min(10)
	public String phoneNumber;
	
	@Column(name="is_active", nullable=false)
	public Boolean isActive = false;
}
