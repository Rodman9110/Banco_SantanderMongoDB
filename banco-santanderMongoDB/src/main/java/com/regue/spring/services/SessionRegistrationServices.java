package com.regue.spring.services;

import java.util.Date;
import java.util.List;

import com.regue.spring.model.SessionRegistration;

public interface SessionRegistrationServices {
	
	List<SessionRegistration>listar();
	void AddSessionRegistration(String user_code,String state,Date data_session);

}
