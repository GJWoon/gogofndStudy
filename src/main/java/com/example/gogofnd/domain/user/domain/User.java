package com.example.gogofnd.domain.user.domain;


import com.example.gogofnd.domain.user.dto.UserSaveDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor
public class User {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String phone;

    private int age;

    public static User saveUser(UserSaveDto dto){

        return User.builder()
                .age(dto.getAge())
                .name(dto.getName())
                .phone(dto.getPhone())
                .build();

    }
}
