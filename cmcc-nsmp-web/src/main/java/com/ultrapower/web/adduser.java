package com.ultrapower.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class adduser {

    @PostMapping("/adduser")
    public Map<String,Object> adduser(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        User user1 = new User();
        if(user1 != null){
            User user2 = new User("小","王"," 吧");
            User user3 = new User("小","酒"," 吧");
            map.put("user2",user2);
            map.put("user3",user3);
        }
        return map;
    }
}
