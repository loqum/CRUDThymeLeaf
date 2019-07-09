package com.rfm.pojo;

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
	private String mail;

	public User() {

	}

	public User(@NotBlank(message = "Nombre obligatorio") String name,
			@NotBlank(message = "Email obligatorio") String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}

}
