package com.regue.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.spring.model.SessionRegistration;
import com.regue.spring.repository.SessionRegistrationRepository;

@Service("SessionRegistrationServices")
public class SessionRegistrationServicesImpl implements SessionRegistrationServices{
	
	@Autowired
	SessionRegistrationRepository sessionRegistrationRepository;

	@Override
	public List<SessionRegistration> listar() {
		// TODO Auto-generated method stub
		return sessionRegistrationRepository.findAll();
	}

	@Override
	public void AddSessionRegistration(String user_code, String state, Date data_session) {
		// TODO Auto-generated method stub
		SessionRegistration s1 = new SessionRegistration(user_code,state,data_session);
		sessionRegistrationRepository.save(s1);
	}

}
