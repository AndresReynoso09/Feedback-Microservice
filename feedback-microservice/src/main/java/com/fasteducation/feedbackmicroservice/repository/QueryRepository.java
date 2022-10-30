package com.fasteducation.feedbackmicroservice.repository;

import com.fasteducation.feedbackmicroservice.entity.QueryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QueryRepository extends MongoRepository <QueryEntity, String>  {
}
