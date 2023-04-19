package com.userservice.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document ("eusers")
public class User {

    @Id
    private String id;


    private String name;



    private String email;

    private String about;
}