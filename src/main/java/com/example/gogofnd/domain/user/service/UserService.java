package com.example.gogofnd.domain.user.service;


import com.example.gogofnd.domain.user.domain.User;
import com.example.gogofnd.domain.user.dto.UserSaveDto;
import com.example.gogofnd.domain.user.dto.UserSaveResponse;
import com.example.gogofnd.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;


    public UserSaveResponse saveUser(UserSaveDto dto){

        User user = User.saveUser(dto);
        userRepository.save(user);
        return new UserSaveResponse(user);

    }


}
