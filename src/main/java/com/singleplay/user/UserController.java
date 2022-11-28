package com.singleplay.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/test")
    public void test(){
        User user = new User();

        user.setUserId("sang_ik");
        user.setNickName("072072");
        user.setPassword("123123");

        userRepository.save(user);

        System.out.println("user = " + user);
    }
}
