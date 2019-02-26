package com.ankit.spring.jpa.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Users {
	@Id
	@GeneratedValue
	private Long userId;
	private String userName;
	private Double salary;

}
