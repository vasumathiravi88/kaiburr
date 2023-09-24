package com.curd.mongo.repository;



import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curd.mongo.model.server;

public interface ServerRepository extends MongoRepository<server, Long> {

	boolean existsById(Long id);

	void deleteById(Long id);

	Optional<server> findById(Long id);
}