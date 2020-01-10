package com.glarimy.cmad;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends MongoRepository<Hello, String>{

}
