package com.ireland.travel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
	
	public Authority(Customer customer){
		this.username = customer.getName();
		this.authority = "ROLE_USER";	
	}
	
	public Authority () {}

	public String getAuthority() {
		return authority;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

}
