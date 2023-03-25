package com.djg.dmall_api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private int num = 0;

    private final ThreadLocal<Integer> uniqueNum =
            new ThreadLocal<Integer>() {
                @Override
                protected Integer initialValue() {
                    return num;
                }
            };


    @GetMapping(value = "/b")
    @ResponseBody
    public String addNumb() {
        int unum = uniqueNum.get();
        uniqueNum.set(++unum);
        System.out.println(uniqueNum.get());
        return "sucess";
    }

}
