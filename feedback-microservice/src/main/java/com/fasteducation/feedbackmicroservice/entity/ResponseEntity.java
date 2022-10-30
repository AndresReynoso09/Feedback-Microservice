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

public class ResponseEntity {
    @Id
    private int C_response_id;
    private int D_description;
    private int Teachers_Users_C_user_id;
    private int Student_Users_C_user_id;
    private int Querys_c_query_id;
    private int Forum_C_forum_id;
}
