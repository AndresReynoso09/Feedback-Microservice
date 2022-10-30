package com.fasteducation.feedbackmicroservice.repository;

import com.fasteducation.feedbackmicroservice.entity.ResponseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResponseRepository extends MongoRepository <ResponseEntity, String>  {
}
