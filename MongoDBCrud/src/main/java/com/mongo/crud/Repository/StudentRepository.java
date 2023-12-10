package com.mongo.crud.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.crud.model.StudentModel;
@Repository
public interface StudentRepository extends MongoRepository<StudentModel, Integer>{

}
