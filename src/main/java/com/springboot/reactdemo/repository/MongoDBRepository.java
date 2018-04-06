package com.springboot.reactdemo.repository;

import com.springboot.reactdemo.model.IwClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoDBRepository extends MongoRepository<IwClient, String> {
}
