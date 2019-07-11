package com.rfm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "Nombre obligatorio")
	private String name;

	@NotBlank(message = "Email obligatorio")
	private String email;

	public User() {

	}

	public User(@NotBlank(message = "Nombre obligatorio") String name,
			@NotBlank(message = "Email obligatorio") String email) {
		this.name = name;
		this.email = email;
	}

}
