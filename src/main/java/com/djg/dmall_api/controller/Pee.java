package com.djg.dmall_api.controller;


import com.alibaba.druid.support.json.JSONUtils;
import com.djg.dmall_api.po.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Pee {

    @PostMapping(value = "/1")
    public String one(@RequestBody User user) {

        if (user == null) {
            return "传入的Student对象为null，请传值";
        }

        if (user.getUsername() == null || "".equals(user.getUsername())) {
            return "传入的学生姓名为空，请传值";
        }

        return "SUCCESS";

    }

    @GetMapping(value = "/2")
    public String two() {
        HashMap<String, String> ha = new HashMap<>();
        ha.put("name", "lilitwo");
        ha.put("age", "20");
        ha.put("birthday", "2020-05-05");
        return JSONUtils.toJSONString(ha);
    }

    @GetMapping(value = "/3")
    public String three() {
        HashMap<String, String> ha = new HashMap<>();
        ha.put("name", "lilithree");
        ha.put("age", "20");
        ha.put("birthday", "2020-05-05");
        return JSONUtils.toJSONString(ha);
    }

    @GetMapping(value = "/4")
    public String four() {
        HashMap<String, String> ha = new HashMap<>();
        ha.put("name", "lilifour");
        ha.put("age", "20");
        ha.put("birthday", "2020-05-05");
        return JSONUtils.toJSONString(ha);
    }

    @GetMapping(value = "/5")
    public String five() {
        HashMap<String, String> ha = new HashMap<>();
        ha.put("name", "lilifive");
        ha.put("age", "20");
        ha.put("birthday", "2020-05-05");
        return JSONUtils.toJSONString(ha);
    }
}
