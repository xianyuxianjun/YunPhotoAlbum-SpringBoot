package com.kejilouf3.Contorller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.kejilouf3.Mapper.userMapper;
import com.kejilouf3.Pojo.Result;
import com.kejilouf3.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/users")
public class userContorller {
    @Autowired
    private userMapper userMapper;
    @GetMapping("/login")
    //登录
    public Result Login(@RequestParam String username,@RequestParam String password){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        User user = userMapper.selectOne(queryWrapper);
        if (user!=null && user.getPassword().equals(password)) {
            return Result.success();
        } else {
            return Result.error("登录失败");
        }
    }
    @PostMapping("/addUser")
    //注册
    public Result addUser(@RequestBody User user){
        QueryWrapper<User> queryWrapper =new QueryWrapper<>();
        queryWrapper.eq("username",user.getUsername());
        User user1 =userMapper.selectOne(queryWrapper);
        System.out.println(user1);
        if (user1 == null){
            userMapper.insert(user);
            return Result.success();
        }else {
            return Result.error("注册失败，该用户名已存在");
        }
    }

}
