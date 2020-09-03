package com.regue.spring.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.regue.spring.model.SessionRegistration;
import com.regue.spring.services.SessionRegistrationServices;

@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping(path = "/api")
public class AppController {
	
	@Autowired
	@Qualifier("SessionRegistrationServices")
	SessionRegistrationServices sessionRegistrationServices;
	
	

	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	

	@GetMapping(path= {"getAllSessionRegistration"})
	public List<SessionRegistration> getAllSessionRegistration (){
		System.err.println("getAllSessionRegistrationdfs");
		
		return sessionRegistrationServices.listar();
	}
	
	@PostMapping(path="AddSessionRegistration")
	public SessionRegistration AddSessionRegistration(@RequestBody SessionRegistration sessionRegistration) {
		
		
		String user_code = sessionRegistration.getUser_code();
		String state = sessionRegistration.getState();
		Date data_session= new Date();
				
		System.err.println("AddSessionRegistration user:"+user_code+" state:"+state+" Data:"+data_session);
		
		sessionRegistrationServices.AddSessionRegistration(user_code, state, data_session);
		
		
		return null;
		
	}
	
	
	
}
