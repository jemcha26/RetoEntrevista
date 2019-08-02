/**
 * 
 */
package com.intercor.customer.Modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



/**
 * @author JMORALES
 *
 */
@Entity
@Table(name = "table_Customers")
public class Customers  {

	/**
	 * 
	 */
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customer_Id;
	@NotBlank
	private String customer_Names;
	@NotBlank
	private String customer_Apellidos;
	
	private LocalDate customer_Date_Of_Birth;
	private Long customer_Edad;
	
	public Customers() {
		super();
		
	}

	/**
	 * @return the customer_Id
	 */
	public Long getCustomer_Id() {
		return customer_Id;
	}

	/**
	 * @param customer_Id the customer_Id to set
	 */
	public void setCustomer_Id(Long customer_Id) {
		this.customer_Id = customer_Id;
	}

	/**
	 * @return the customer_Names
	 */
	public String getCustomer_Names() {
		return customer_Names;
	}

	/**
	 * @param customer_Names the customer_Names to set
	 */
	public void setCustomer_Names(String customer_Names) {
		this.customer_Names = customer_Names;
	}

	/**
	 * @return the customer_Apellidos
	 */
	public String getCustomer_Apellidos() {
		return customer_Apellidos;
	}

	/**
	 * @param customer_Apellidos the customer_Apellidos to set
	 */
	public void setCustomer_Apellidos(String customer_Apellidos) {
		this.customer_Apellidos = customer_Apellidos;
	}

	/**
	 * @return the customer_Date_Of_Birth
	 */
	public LocalDate getCustomer_Date_Of_Birth() {
		return customer_Date_Of_Birth;
	}

	/**
	 * @param customer_Date_Of_Birth the customer_Date_Of_Birth to set
	 */
	public void setCustomer_Date_Of_Birth(LocalDate customer_Date_Of_Birth) {
		this.customer_Date_Of_Birth = customer_Date_Of_Birth;
	}

	/**
	 * @return the customer_Edad
	 */
	public Long getCustomer_Edad() {
		return customer_Edad;
	}

	/**
	 * @param customer_Edad the customer_Edad to set
	 */
	public void setCustomer_Edad(Long customer_Edad) {
		this.customer_Edad = customer_Edad;
	}
	
	
}
