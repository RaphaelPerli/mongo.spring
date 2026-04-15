package com.raphael.mongo.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.raphael.mongo.spring.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
