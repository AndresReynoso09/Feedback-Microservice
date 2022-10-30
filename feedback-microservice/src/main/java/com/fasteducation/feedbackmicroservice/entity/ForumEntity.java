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

public class ForumEntity {
    @Id
    private int C_forum_id;
    private int D_description;
    private int F_date;
    private int Student_Users_C_user_id;
}
