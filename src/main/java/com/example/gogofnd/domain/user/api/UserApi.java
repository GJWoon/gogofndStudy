package com.example.gogofnd.domain.user.api;


import com.example.gogofnd.domain.user.dto.UserSaveDto;
import com.example.gogofnd.domain.user.dto.UserSaveResponse;
import com.example.gogofnd.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserApi {

    private final UserService userService;

    @PostMapping("/user")
    public UserSaveResponse saveUser(@RequestBody UserSaveDto dto){
        return userService.saveUser(dto);

    }

    @GetMapping("/user")
    public UserSaveResponse saveUser3(@RequestBody UserSaveDto dto){

        return userService.saveUser(dto);

    }

}
