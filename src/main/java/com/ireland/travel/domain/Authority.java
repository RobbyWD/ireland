package com.ireland.travel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "authorities")
public class Authority {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private Long id;

	@NotNull
	@Size(max = 50, min = 2)
	private String username;

	@NotNull
	@Size(max = 50, min = 2)
	private String authority;
	
	public Authority(User user){
		this.username = user.getUsername();
		this.authority = "ROLE_USER";	
	}
	
	public Authority () {}


}
