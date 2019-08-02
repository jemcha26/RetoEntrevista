/**
 * 
 */
package com.intercor.customer.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intercor.customer.Modelo.Customers;

/**
 * @author JMORALES
 *
 */
public interface CustomersRepostory extends JpaRepository<Customers, Long>{

}
