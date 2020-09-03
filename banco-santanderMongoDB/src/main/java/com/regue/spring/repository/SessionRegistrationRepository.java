package com.regue.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.regue.spring.model.SessionRegistration;

public interface SessionRegistrationRepository extends MongoRepository<SessionRegistration, String>{

}
