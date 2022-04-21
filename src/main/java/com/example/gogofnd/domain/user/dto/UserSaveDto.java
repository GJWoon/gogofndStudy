package com.example.gogofnd.domain.user.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserSaveDto {

    private String name;

    private String phone;

    private int age;

}
