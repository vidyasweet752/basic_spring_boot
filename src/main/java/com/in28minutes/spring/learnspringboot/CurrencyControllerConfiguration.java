package com.in28minutes.spring.learnspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhosts:8000/courses

//[
// {
//	 "id": 1,
//	 "name": "Learn AWS",
//	 "author": "in28minutes"
// }
//]

@RestController
public class CurrencyControllerConfiguration{
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourse(){
		return configuration;
	}
}
