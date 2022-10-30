package com.fasteducation.feedbackmicroservice.repository;

import com.fasteducation.feedbackmicroservice.entity.CourseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository <CourseEntity, String> {
}
