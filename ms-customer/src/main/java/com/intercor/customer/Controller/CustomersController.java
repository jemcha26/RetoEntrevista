/**
 * 
 */
package com.intercor.customer.Controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.xml.bind.ParseConversionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intercor.customer.Dto.CustomerDto;
import com.intercor.customer.Modelo.Customers;
import com.intercor.customer.Service.CustomersService;

/**
 * @author JMORALES
 *
 */
@RestController
@RequestMapping("/ws-services")
public class CustomersController {
	@Autowired
	CustomersService customersService;

	@SuppressWarnings("unused")
	@PostMapping("/customers")
	public Customers updateOrSaveCustomer(@RequestBody CustomerDto customersDto) {
		Customers c =new Customers();
		
		
		if (customersDto != null) {
			c.setCustomer_Names(customersDto.getNames());
			c.setCustomer_Apellidos(customersDto.getApellidos());
			c.setCustomer_Date_Of_Birth(LocalDate.parse(customersDto.getFechaNacimiento()));
			c.setCustomer_Edad(getEdad(c.getCustomer_Date_Of_Birth()));
			customersService.save(c);
		}
		return c;
	}
	 @GetMapping("/customers/statistics")
	public String getDesviacionStandarAndPromedioByEdades() {
		List<Customers> listCustomer=customersService.getCustomers();
		double n=0.0,prom=0.0,dvs=0.0;
		for(int i=1; i<listCustomer.size();i++) {
			Customers c=listCustomer.get(i);
			n += c.getCustomer_Edad();
			
			
		}
		prom=n/listCustomer.size();
		dvs=(int)Math.sqrt(prom);
		return "El promedio y la Desviacion estandar de edades es: "+prom +"  --  "+dvs;
		
	}

	private Long getEdad(LocalDate dateOfBirth) {

		Period p = Period.between(dateOfBirth, LocalDate.now());
		System.out.printf("%d años, %d meses, %d días", p.getYears(), p.getMonths(), p.getDays());
		Long edad = (long) p.getYears();
		return edad;

	}
}
