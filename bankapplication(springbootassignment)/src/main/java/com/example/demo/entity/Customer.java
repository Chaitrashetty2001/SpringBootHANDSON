package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long custid;

	@NotBlank(message = "First name required")
	@Size(min = 2, max = 30)
	private String firstname;

	@Size(min = 2, max = 30)
	private String lastname;

	@Min(value = 18, message = "Age should not be less than 18")
	private int age;

	private String gender;

	private String panNo;

	@NotEmpty
	@Column(unique = true)
	private String email;

	@Column(unique = true)
	private int phone;

	private String city;

}
