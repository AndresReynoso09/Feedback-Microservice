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

public class StudentEntity {
    @Id
    private int Users_C_user_id;
    private String D_password;
    private String B_student_type;
    private int Grade_C_grade_id;
    private int University_C_university_id;
}
