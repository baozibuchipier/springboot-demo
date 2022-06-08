package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.UserService;
import com.example.user.vo.UserQueryVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/common/user/v1")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping("list")
    public List<User> list(@RequestParam("userName") String name){
        return userService.list(name);
    }
}
