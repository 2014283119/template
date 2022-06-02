package com.tangshi.templatetest.controller;

import com.tangshi.common.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(methods = RequestMethod.POST)
@RequestMapping(value = "/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

//    查询办公地点对应的存在且启用的会议室名 cstatus=1 ifexist=1
    @RequestMapping("/test")
    public Result queryLocaltion(){
        return null;
    }
}