package com.zhongcheng.oa.controller;

import com.zhongcheng.oa.common.utils.RestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/bbb")
    public RestResponse bbb(){
        return RestResponse.success("bbb");
    }

    @GetMapping("/aaa")
    public RestResponse aaa(){
        return RestResponse.success("aaa");
    }

}
