package com.ninja.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "demo")
public class DemoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long customerId;
	
	@NotBlank(message = "Customer Name is mandatory")
	String customerName;
	String customerEmail;
	String customerCity;

}
