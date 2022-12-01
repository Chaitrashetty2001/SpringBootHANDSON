package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private long accNo = (long) (Math.floor(Math.random() * 98988998) + 787887878);;

	@Pattern(regexp = "^(?:Business|Current|Saving)$",message = "Enter Valid Account Type" )
	private String accType;

	private long custId;

	@Min(value = 499)
	private float balance;

}
