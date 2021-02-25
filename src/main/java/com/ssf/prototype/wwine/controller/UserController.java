package com.ssf.prototype.wwine.controller;

import com.ssf.prototype.wwine.model.User;
import com.ssf.prototype.wwine.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @ResponseBody
    @RequestMapping(value = "join", method = RequestMethod.POST,produces = "application/json")
    public User join(@RequestBody User user){
        System.out.println(user.getUserId());
        return userService.join(user.getUserId(), user.getUserNickname() ,user.getUserName());
    }


}
