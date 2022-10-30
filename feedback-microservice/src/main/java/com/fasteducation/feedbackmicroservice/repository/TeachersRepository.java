package com.fasteducation.feedbackmicroservice.repository;

import com.fasteducation.feedbackmicroservice.entity.TeachersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeachersRepository extends MongoRepository <TeachersEntity, String>  {
}
