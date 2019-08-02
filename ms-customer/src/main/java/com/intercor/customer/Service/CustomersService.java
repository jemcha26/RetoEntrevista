/**
 * 
 */
package com.intercor.customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intercor.customer.Dao.CustomersRepostory;
import com.intercor.customer.Modelo.Customers;

/**
 * @author JMORALES
 *
 */
@Service
public class CustomersService {
	
	@Autowired
	CustomersRepostory customersRepostory;
	public Customers save(Customers customers) {
		return customersRepostory.saveAndFlush(customers);
		
	}
	public List<Customers> getCustomers(){
		return customersRepostory.findAll();
	}

}
