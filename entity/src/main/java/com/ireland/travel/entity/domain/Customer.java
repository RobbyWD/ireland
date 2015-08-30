package com.ireland.travel.entity.domain;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "customers")
public class Customer extends User {

	private String firstName;

	private String lastName;

	@Size(max = 20)
	private String phone;

}
