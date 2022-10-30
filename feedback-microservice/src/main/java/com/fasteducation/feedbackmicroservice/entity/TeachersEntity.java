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

public class TeachersEntity {
    @Id
    private int Users_C_user_id;
    private int Especialitys_C_especiality_id;
}
