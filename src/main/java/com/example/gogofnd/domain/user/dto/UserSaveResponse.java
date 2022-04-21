package com.example.gogofnd.domain.user.dto;


import com.example.gogofnd.domain.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserSaveResponse {

    private Long id;
    private String phone;
    private String name;
    private int adg;


    public UserSaveResponse(User user){
        this.id = user.getId();
        this.phone = user.getPhone();
        this.name = user.getName();
        this.adg = user.getAge();

    }

}
