package com.tio.app.biz.controllers;

import com.tio.app.common.utils.ResultUtil;
import com.tio.app.contents.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pcweb/mm-kk-pp")
public class MTestController {
    @Autowired
    private TestService testService;

    @PostMapping("/tt")
    public ResultUtil test() {
        return ResultUtil.ok("aaaaa" + testService.test());
    }
}
