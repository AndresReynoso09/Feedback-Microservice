package com.fasteducation.feedbackmicroservice.repository;

import com.fasteducation.feedbackmicroservice.entity.ForumEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForumRepository extends MongoRepository <ForumEntity, String> {
}
