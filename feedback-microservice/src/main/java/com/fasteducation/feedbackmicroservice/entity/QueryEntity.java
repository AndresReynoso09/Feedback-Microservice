package com.fasteducation.feedbackmicroservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "course")
@Getter
@Setter
@NoArgsConstructor

public class QueryEntity {
    @Id
    private int c_query_id;
    private String D_description;
    private String D_title;
    private int Teachers_Users_C_user_id;
    private int Courses_C_course_id;
    private int Courses_Routes_C_route_id;
}
